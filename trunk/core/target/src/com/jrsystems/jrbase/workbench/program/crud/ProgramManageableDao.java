// license-header java merge-point
package com.jrsystems.jrbase.workbench.program.crud;

public interface ProgramManageableDao
{
    public com.jrsystems.jrbase.workbench.program.Program create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu);

    public com.jrsystems.jrbase.workbench.program.Program readById(java.lang.Long id);

    public java.util.List read(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.workbench.program.Program update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu);

    public void delete(java.lang.Long[] ids);

}