// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public final class UserManageableServiceBase
    implements UserManageableService
{
    private com.jrsystems.jrbase.user.crud.UserManageableDao dao;

    public void setDao(com.jrsystems.jrbase.user.crud.UserManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.user.crud.UserManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.user.crud.UserValueObject create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
        throws Exception
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'status' can not be null");
        }

        if (username == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'username' can not be null");
        }

        if (password == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'password' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'name' can not be null");
        }

        if (individual == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'individual' can not be null");
        }

        if (userClearanceLevels == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'userClearanceLevels' can not be null");
        }

        return toValueObject(dao.create(photo, status, username, password, name, email, id, individual, menus, programs, userLocations, userRoles, userClearanceLevels, loginSessions));
    }

    public com.jrsystems.jrbase.user.crud.UserValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
        throws Exception
    {
        return toValueObjects(dao.read(photo, status, username, password, name, email, id, individual, menus, programs, userLocations, userRoles, userClearanceLevels, loginSessions));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public byte[] getPhoto(java.lang.Long id)
        throws Exception
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.getPhoto(java.lang.Long id) - 'id' can not be null");
        }

        return dao.getPhoto(id);
    }

    public java.util.Map readBackingLists()
        throws Exception
    {
        return getDao().readBackingLists();
    }

    public com.jrsystems.jrbase.user.crud.UserValueObject update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
        throws Exception
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'status' can not be null");
        }

        if (username == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'username' can not be null");
        }

        if (password == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'password' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'id' can not be null");
        }

        if (individual == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'individual' can not be null");
        }

        if (userClearanceLevels == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions) - 'userClearanceLevels' can not be null");
        }

        return toValueObject(dao.update(photo, status, username, password, name, email, id, individual, menus, programs, userLocations, userRoles, userClearanceLevels, loginSessions));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.user.User)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.user.crud.UserValueObject toValueObject(com.jrsystems.jrbase.user.User entity)
    {
        final com.jrsystems.jrbase.user.crud.UserValueObject valueObject = new com.jrsystems.jrbase.user.crud.UserValueObject();

        valueObject.setPhoto(entity.getPhoto());
        valueObject.setStatus(entity.getStatus());
        valueObject.setUsername(entity.getUsername());
        valueObject.setPassword(entity.getPassword());
        valueObject.setName(entity.getName());
        valueObject.setEmail(entity.getEmail());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.individual.Individual individual = entity.getIndividual();
        if (individual != null)
        {
            valueObject.setIndividual(individual.getId());
            valueObject.setIndividualLabel(individual.getIndividualId());
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

        final java.util.Collection userLocations = entity.getUserLocations();
        if (userLocations == null || userLocations.isEmpty())
        {
            valueObject.setUserLocations(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[userLocations.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = userLocations.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.user.UserLocation element = (com.jrsystems.jrbase.user.UserLocation)iterator.next();
                values[counter] = element.getId();
            }
            valueObject.setUserLocations(values);
        }

        final java.util.Collection userRoles = entity.getUserRoles();
        if (userRoles == null || userRoles.isEmpty())
        {
            valueObject.setUserRoles(null);
            valueObject.setUserRolesLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[userRoles.size()];
            final java.lang.String[] labels = new java.lang.String[userRoles.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = userRoles.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.role.Role element = (com.jrsystems.jrbase.role.Role)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getRoleCode();
            }
            valueObject.setUserRoles(values);
            valueObject.setUserRolesLabels(labels);
        }

        final java.util.Collection userClearanceLevels = entity.getUserClearanceLevels();
        if (userClearanceLevels == null || userClearanceLevels.isEmpty())
        {
            valueObject.setUserClearanceLevels(null);
            valueObject.setUserClearanceLevelsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[userClearanceLevels.size()];
            final java.lang.String[] labels = new java.lang.String[userClearanceLevels.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = userClearanceLevels.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.clearancelevel.ClearanceLevel element = (com.jrsystems.jrbase.clearancelevel.ClearanceLevel)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getLevelCode();
            }
            valueObject.setUserClearanceLevels(values);
            valueObject.setUserClearanceLevelsLabels(labels);
        }

        final java.util.Collection loginSessions = entity.getLoginSessions();
        if (loginSessions == null || loginSessions.isEmpty())
        {
            valueObject.setLoginSessions(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[loginSessions.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = loginSessions.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.loginsession.LoginSession element = (com.jrsystems.jrbase.loginsession.LoginSession)iterator.next();
                values[counter] = element.getId();
            }
            valueObject.setLoginSessions(values);
        }

        return valueObject;
    }
}
