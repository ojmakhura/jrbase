// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.workbench.program;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.systemsjr.jrbase.workbench.program.Program
 */
public class ProgramDaoImpl
    extends com.systemsjr.jrbase.workbench.program.ProgramDaoBase
{
    /**
     * @see com.systemsjr.jrbase.workbench.program.ProgramDao#findByCriteria(com.systemsjr.jrbase.workbench.program.vo.ProgramSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.workbench.program.vo.ProgramSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Program.class);
    	
    	if(searchCriteria.getProgramId() != null){
    		criteria.add(Restrictions.ilike("programId", searchCriteria.getProgramId()));
    	}
    	
    	if(searchCriteria.getProgramName() != null){
    		criteria.add(Restrictions.ilike("programName", searchCriteria.getProgramName()));
    	}
    	
    	if(searchCriteria.getProgramDescription() != null){
    		criteria.add(Restrictions.ilike("programDescription", searchCriteria.getProgramDescription()));
    	}
    	
        // @todo implement public com.systemsjr.jrbase.workbench.program.vo.ProgramVO[] handleFindByCriteria(com.systemsjr.jrbase.workbench.program.vo.ProgramSearchCriteria criteria)
        return criteria.list();
    }

    /**
     * @see com.systemsjr.jrbase.workbench.program.ProgramDao#toProgramVO(com.systemsjr.jrbase.workbench.program.Program, com.systemsjr.jrbase.workbench.program.vo.ProgramVO)
     */
    @Override
	public void toProgramVO(
        com.systemsjr.jrbase.workbench.program.Program source,
        com.systemsjr.jrbase.workbench.program.vo.ProgramVO target)
    {
        // @todo verify behavior of toProgramVO
        super.toProgramVO(source, target);
        // WARNING! No conversion for target.menu (can't convert source.getMenu():com.systemsjr.jrbase.workbench.menu.Menu to com.systemsjr.jrbase.workbench.menu.vo.MenuVO
    }


    /**
     * @see com.systemsjr.jrbase.workbench.program.ProgramDao#toProgramVO(com.systemsjr.jrbase.workbench.program.Program)
     */
    @Override
	public com.systemsjr.jrbase.workbench.program.vo.ProgramVO toProgramVO(final com.systemsjr.jrbase.workbench.program.Program entity)
    {
        // @todo verify behavior of toProgramVO
        return super.toProgramVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.workbench.program.Program loadProgramFromProgramVO(com.systemsjr.jrbase.workbench.program.vo.ProgramVO programVO)
    {
        // @todo implement loadProgramFromProgramVO
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.workbench.program.loadProgramFromProgramVO(com.systemsjr.jrbase.workbench.program.vo.ProgramVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.systemsjr.jrbase.workbench.program.Program program = this.load(programVO.getId());
        if (program == null)
        {
            program = com.systemsjr.jrbase.workbench.program.Program.Factory.newInstance();
        }
        return program;
        */
    }

    
    /**
     * @see com.systemsjr.jrbase.workbench.program.ProgramDao#programVOToEntity(com.systemsjr.jrbase.workbench.program.vo.ProgramVO)
     */
    @Override
	public com.systemsjr.jrbase.workbench.program.Program programVOToEntity(com.systemsjr.jrbase.workbench.program.vo.ProgramVO programVO)
    {
        // @todo verify behavior of programVOToEntity
        com.systemsjr.jrbase.workbench.program.Program entity = this.loadProgramFromProgramVO(programVO);
        this.programVOToEntity(programVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.workbench.program.ProgramDao#programVOToEntity(com.systemsjr.jrbase.workbench.program.vo.ProgramVO, com.systemsjr.jrbase.workbench.program.Program)
     */
    @Override
	public void programVOToEntity(
        com.systemsjr.jrbase.workbench.program.vo.ProgramVO source,
        com.systemsjr.jrbase.workbench.program.Program target,
        boolean copyIfNull)
    {
        // @todo verify behavior of programVOToEntity
        super.programVOToEntity(source, target, copyIfNull);
    }

}