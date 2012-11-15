// license-header java merge-point
package com.jrsystems.jrbase.workbench.menu.crud;

public final class MenuManageableServiceBase
    implements MenuManageableService
{
    private com.jrsystems.jrbase.workbench.menu.crud.MenuManageableDao dao;

    public void setDao(com.jrsystems.jrbase.workbench.menu.crud.MenuManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.workbench.menu.crud.MenuManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject create(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
        throws Exception
    {
        if (menuCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.menu.crud.MenuManageableService.create(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs) - 'menuCode' can not be null");
        }

        if (menuName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.menu.crud.MenuManageableService.create(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs) - 'menuName' can not be null");
        }

        return toValueObject(dao.create(menuCode, menuName, menuDescription, id, programs));
    }

    public com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
        throws Exception
    {
        return toValueObjects(dao.read(menuCode, menuName, menuDescription, id, programs));
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

    public com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
        throws Exception
    {
        if (menuCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.menu.crud.MenuManageableService.update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs) - 'menuCode' can not be null");
        }

        if (menuName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.menu.crud.MenuManageableService.update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs) - 'menuName' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.menu.crud.MenuManageableService.update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs) - 'id' can not be null");
        }

        return toValueObject(dao.update(menuCode, menuName, menuDescription, id, programs));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.workbench.menu.crud.MenuManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.workbench.menu.Menu)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject toValueObject(com.jrsystems.jrbase.workbench.menu.Menu entity)
    {
        final com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject valueObject = new com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject();

        valueObject.setMenuCode(entity.getMenuCode());
        valueObject.setMenuName(entity.getMenuName());
        valueObject.setMenuDescription(entity.getMenuDescription());
        valueObject.setId(entity.getId());

        final java.util.Collection programs = entity.getPrograms();
        if (programs == null || programs.isEmpty())
        {
            valueObject.setPrograms(null);
            valueObject.setProgramsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[programs.size()];
            final java.lang.String[] labels = new java.lang.String[programs.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = programs.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.workbench.program.Program element = (com.jrsystems.jrbase.workbench.program.Program)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getProgramId();
            }
            valueObject.setPrograms(values);
            valueObject.setProgramsLabels(labels);
        }

        return valueObject;
    }
}
