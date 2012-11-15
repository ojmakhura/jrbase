// license-header java merge-point
package com.jrsystems.jrbase.workbench.program.crud;

public final class ProgramManageableServiceBase
    implements ProgramManageableService
{
    private com.jrsystems.jrbase.workbench.program.crud.ProgramManageableDao dao;

    public void setDao(com.jrsystems.jrbase.workbench.program.crud.ProgramManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.workbench.program.crud.ProgramManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
        throws Exception
    {
        if (programId == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'programId' can not be null");
        }

        if (programName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'programName' can not be null");
        }

        if (menu == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'menu' can not be null");
        }

        return toValueObject(dao.create(programId, programName, programDescription, id, menu));
    }

    public com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
        throws Exception
    {
        return toValueObjects(dao.read(programId, programName, programDescription, id, menu));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public java.util.Map readBackingLists()
        throws Exception
    {
        return getDao().readBackingLists();
    }

    public com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
        throws Exception
    {
        if (programId == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'programId' can not be null");
        }

        if (programName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'programName' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'id' can not be null");
        }

        if (menu == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu) - 'menu' can not be null");
        }

        return toValueObject(dao.update(programId, programName, programDescription, id, menu));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.program.crud.ProgramManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.workbench.program.Program)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject toValueObject(com.jrsystems.jrbase.workbench.program.Program entity)
    {
        final com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject valueObject = new com.jrsystems.jrbase.workbench.program.crud.ProgramValueObject();

        valueObject.setProgramId(entity.getProgramId());
        valueObject.setProgramName(entity.getProgramName());
        valueObject.setProgramDescription(entity.getProgramDescription());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.workbench.menu.Menu menu = entity.getMenu();
        if (menu != null)
        {
            valueObject.setMenu(menu.getId());
        }

        return valueObject;
    }
}
