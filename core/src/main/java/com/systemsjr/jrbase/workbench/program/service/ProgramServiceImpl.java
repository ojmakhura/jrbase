// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.workbench.program.service;

import java.util.Collection;

import com.systemsjr.jrbase.workbench.program.Program;
import com.systemsjr.jrbase.workbench.program.vo.ProgramSearchCriteria;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

/**
 * @see com.systemsjr.jrbase.workbench.program.service.ProgramService
 */
public class ProgramServiceImpl
    extends com.systemsjr.jrbase.workbench.program.service.ProgramServiceBase
{

    /**
     * @see com.systemsjr.jrbase.workbench.program.service.ProgramService#getAllPrograms()
     */
    @Override
	protected  ProgramVO[] handleGetAllPrograms()
        throws java.lang.Exception
    {
    	Collection roles = getProgramDao().loadAll();
    	return getProgramDao().toProgramVOArray(roles);
    }

	@Override
	protected ProgramVO handleSaveProgram(ProgramVO programVO) throws Exception {
		
		Program program = getProgramDao().programVOToEntity(programVO);
		
		if(programVO.getId() == null){
			//program = getProgramDao().programVOToEntity(programVO);
			program = getProgramDao().create(program);
		} else{
			getProgramDao().update(program);
		}
		
		return getProgramDao().toProgramVO(program);
	}

	@Override
	protected void handleRemoveProgram(ProgramVO programVO) throws Exception {
		
		if(programVO.getId() != null){
			getProgramDao().remove(getProgramDao().programVOToEntity(programVO));
		}
		
	}

	@Override
	protected ProgramVO[] handleSearchPrograms(
			ProgramSearchCriteria searchCriteria) throws Exception {
		
		if(searchCriteria == null){
			return new ProgramVO[]{};
		}
		return getProgramDao().toProgramVOArray(getProgramDao().findByCriteria(searchCriteria));
	}

}