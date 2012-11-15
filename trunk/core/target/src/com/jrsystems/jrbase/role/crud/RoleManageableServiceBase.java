// license-header java merge-point
package com.jrsystems.jrbase.role.crud;

public final class RoleManageableServiceBase
    implements RoleManageableService
{
    private com.jrsystems.jrbase.role.crud.RoleManageableDao dao;

    public void setDao(com.jrsystems.jrbase.role.crud.RoleManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.role.crud.RoleManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.role.crud.RoleValueObject create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
        throws Exception
    {
        if (roleCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'roleCode' can not be null");
        }

        if (role == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'role' can not be null");
        }

        if (roleDescription == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'roleDescription' can not be null");
        }

        return toValueObject(dao.create(roleCode, role, roleDescription, id, users, menus, programs, roleClearanceLevels));
    }

    public com.jrsystems.jrbase.role.crud.RoleValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
        throws Exception
    {
        return toValueObjects(dao.read(roleCode, role, roleDescription, id, users, menus, programs, roleClearanceLevels));
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

    public com.jrsystems.jrbase.role.crud.RoleValueObject update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
        throws Exception
    {
        if (roleCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'roleCode' can not be null");
        }

        if (role == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'role' can not be null");
        }

        if (roleDescription == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'roleDescription' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels) - 'id' can not be null");
        }

        return toValueObject(dao.update(roleCode, role, roleDescription, id, users, menus, programs, roleClearanceLevels));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.role.crud.RoleManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.role.Role)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.role.crud.RoleValueObject toValueObject(com.jrsystems.jrbase.role.Role entity)
    {
        final com.jrsystems.jrbase.role.crud.RoleValueObject valueObject = new com.jrsystems.jrbase.role.crud.RoleValueObject();

        valueObject.setRoleCode(entity.getRoleCode());
        valueObject.setRole(entity.getRole());
        valueObject.setRoleDescription(entity.getRoleDescription());
        valueObject.setId(entity.getId());

        final java.util.Collection users = entity.getUsers();
        if (users == null || users.isEmpty())
        {
            valueObject.setUsers(null);
            valueObject.setUsersLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[users.size()];
            final java.lang.String[] labels = new java.lang.String[users.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = users.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.user.User element = (com.jrsystems.jrbase.user.User)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getUsername();
            }
            valueObject.setUsers(values);
            valueObject.setUsersLabels(labels);
        }

        final java.util.Collection menus = entity.getMenus();
        if (menus == null || menus.isEmpty())
        {
            valueObject.setMenus(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[menus.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = menus.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.workbench.menu.Menu element = (com.jrsystems.jrbase.workbench.menu.Menu)iterator.next();
                values[counter] = element.getId();
            }
            valueObject.setMenus(values);
        }

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

        final java.util.Collection roleClearanceLevels = entity.getRoleClearanceLevels();
        if (roleClearanceLevels == null || roleClearanceLevels.isEmpty())
        {
            valueObject.setRoleClearanceLevels(null);
            valueObject.setRoleClearanceLevelsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[roleClearanceLevels.size()];
            final java.lang.String[] labels = new java.lang.String[roleClearanceLevels.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = roleClearanceLevels.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.clearancelevel.ClearanceLevel element = (com.jrsystems.jrbase.clearancelevel.ClearanceLevel)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getLevelCode();
            }
            valueObject.setRoleClearanceLevels(values);
            valueObject.setRoleClearanceLevelsLabels(labels);
        }

        return valueObject;
    }
}
