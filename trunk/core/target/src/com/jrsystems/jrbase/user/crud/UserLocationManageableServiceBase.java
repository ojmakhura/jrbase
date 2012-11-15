// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public final class UserLocationManageableServiceBase
    implements UserLocationManageableService
{
    private com.jrsystems.jrbase.user.crud.UserLocationManageableDao dao;

    public void setDao(com.jrsystems.jrbase.user.crud.UserLocationManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.user.crud.UserLocationManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.user.crud.UserLocationValueObject create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
        throws Exception
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'status' can not be null");
        }

        if (user == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'user' can not be null");
        }

        if (location == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'location' can not be null");
        }

        return toValueObject(dao.create(status, fromDate, toDate, id, user, location));
    }

    public com.jrsystems.jrbase.user.crud.UserLocationValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
        throws Exception
    {
        return toValueObjects(dao.read(status, fromDate, toDate, id, user, location));
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

    public com.jrsystems.jrbase.user.crud.UserLocationValueObject update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
        throws Exception
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'status' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'id' can not be null");
        }

        if (user == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'user' can not be null");
        }

        if (location == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location) - 'location' can not be null");
        }

        return toValueObject(dao.update(status, fromDate, toDate, id, user, location));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.crud.UserLocationManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.user.UserLocation)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.user.crud.UserLocationValueObject toValueObject(com.jrsystems.jrbase.user.UserLocation entity)
    {
        final com.jrsystems.jrbase.user.crud.UserLocationValueObject valueObject = new com.jrsystems.jrbase.user.crud.UserLocationValueObject();

        valueObject.setStatus(entity.getStatus());
        valueObject.setFromDate(entity.getFromDate());
        valueObject.setToDate(entity.getToDate());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.user.User user = entity.getUser();
        if (user != null)
        {
            valueObject.setUser(user.getId());
            valueObject.setUserLabel(user.getUsername());
        }

        final com.jrsystems.jrbase.location.Location location = entity.getLocation();
        if (location != null)
        {
            valueObject.setLocation(location.getId());
            valueObject.setLocationLabel(location.getUniqueCode());
        }

        return valueObject;
    }
}
