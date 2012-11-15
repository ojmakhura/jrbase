// license-header java merge-point
package com.jrsystems.jrbase.loginsession.crud;

public final class LoginSessionManageableServiceBase
    implements LoginSessionManageableService
{
    private com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableDao dao;

    public void setDao(com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject create(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
        throws Exception
    {
        if (user == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableService.create(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area) - 'user' can not be null");
        }

        if (area == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableService.create(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area) - 'area' can not be null");
        }

        return toValueObject(dao.create(active, id, user, area));
    }

    public com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
        throws Exception
    {
        return toValueObjects(dao.read(active, id, user, area));
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

    public com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
        throws Exception
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableService.update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area) - 'id' can not be null");
        }

        if (user == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableService.update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area) - 'user' can not be null");
        }

        if (area == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableService.update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area) - 'area' can not be null");
        }

        return toValueObject(dao.update(active, id, user, area));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.loginsession.crud.LoginSessionManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.loginsession.LoginSession)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject toValueObject(com.jrsystems.jrbase.loginsession.LoginSession entity)
    {
        final com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject valueObject = new com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject();

        valueObject.setActive(entity.isActive());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.user.User user = entity.getUser();
        if (user != null)
        {
            valueObject.setUser(user.getId());
            valueObject.setUserLabel(user.getUsername());
        }

        final com.jrsystems.jrbase.location.Location area = entity.getArea();
        if (area != null)
        {
            valueObject.setArea(area.getId());
            valueObject.setAreaLabel(area.getUniqueCode());
        }

        return valueObject;
    }
}
