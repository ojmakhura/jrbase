// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.workbench.program.service;

import java.util.List;

import com.jrsystems.jrbase.workbench.program.Program;
import com.jrsystems.jrbase.workbench.program.ProgramDao;
import com.jrsystems.jrbase.workbench.program.vo.ProgramVO;

import java.util.Arrays;

/**
 * @see com.jrsystems.jrbase.workbench.program.service.ProgramService
 */
public class ProgramServiceImpl
    extends com.jrsystems.jrbase.workbench.program.service.ProgramServiceBase
{

    /**
     * @see com.jrsystems.jrbase.workbench.program.service.ProgramService#getAllPrograms()
     */
    protected  List<ProgramVO> handleGetAllPrograms()
        throws java.lang.Exception
    {
    	return Arrays.asList((ProgramVO[])getProgramDao().loadAll(ProgramDao.TRANSFORM_PROGRAMVO).toArray());
    }

	@Override
	protected ProgramVO handleSaveProgram(ProgramVO programVO) throws Exception {
		
		Program program = getProgramDao().programVOToEntity(programVO);
		
		if(program.getId() == null){
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

}