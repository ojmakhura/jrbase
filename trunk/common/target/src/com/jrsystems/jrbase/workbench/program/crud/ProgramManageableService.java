// license-header java merge-point
package com.jrsystems.jrbase.workbench.program.crud;

public interface ProgramManageableService
{
    public com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
        throws Exception;

    public com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
