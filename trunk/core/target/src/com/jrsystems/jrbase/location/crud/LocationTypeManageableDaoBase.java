// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class LocationTypeManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements LocationTypeManageableDao
{
    private com.jrsystems.jrbase.location.LocationTypeDao dao;

    public void setDao(com.jrsystems.jrbase.location.LocationTypeDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.location.LocationTypeDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.location.LocationTypeDao fallsWithinLocationTypeDao = null;

    public void setFallsWithinLocationTypeDao(com.jrsystems.jrbase.location.LocationTypeDao fallsWithinLocationTypeDao)
    {
        this.fallsWithinLocationTypeDao = fallsWithinLocationTypeDao;
    }

    protected com.jrsystems.jrbase.location.LocationTypeDao getFallsWithinLocationTypeDao()
    {
        return this.fallsWithinLocationTypeDao;
    }

    private com.jrsystems.jrbase.location.LocationTypeDao locationTypesDao = null;

    public void setLocationTypesDao(com.jrsystems.jrbase.location.LocationTypeDao locationTypesDao)
    {
        this.locationTypesDao = locationTypesDao;
    }

    protected com.jrsystems.jrbase.location.LocationTypeDao getLocationTypesDao()
    {
        return this.locationTypesDao;
    }

    private com.jrsystems.jrbase.location.LocationDao locationsDao = null;

    public void setLocationsDao(com.jrsystems.jrbase.location.LocationDao locationsDao)
    {
        this.locationsDao = locationsDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getLocationsDao()
    {
        return this.locationsDao;
    }

    private java.util.Set findLocationTypeByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationTypeImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findLocationByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.location.LocationType create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
    {
        final com.jrsystems.jrbase.location.LocationType entity = new com.jrsystems.jrbase.location.LocationTypeImpl();
        entity.setLevelCode(levelCode);
        entity.setName(name);
        entity.setDescription(description);
        entity.setStatus(status);
        entity.setType(type);
        entity.setId(id);
        com.jrsystems.jrbase.location.LocationType fallsWithinLocationTypeEntity = null;
        if (fallsWithinLocationType != null)
        {
            fallsWithinLocationTypeEntity = (com.jrsystems.jrbase.location.LocationType)getFallsWithinLocationTypeDao().load(fallsWithinLocationType);
        }

        entity.setFallsWithinLocationType(fallsWithinLocationTypeEntity);

        final java.util.Set locationTypesEntities = (locationTypes != null && locationTypes.length > 0)
            ? this.findLocationTypeByIds(locationTypes)
            : java.util.Collections.EMPTY_SET;

        entity.setLocationTypes(locationTypesEntities);

        final java.util.Set locationsEntities = (locations != null && locations.length > 0)
            ? this.findLocationByIds(locations)
            : java.util.Collections.EMPTY_SET;

        entity.setLocations(locationsEntities);


        return (com.jrsystems.jrbase.location.LocationType)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.location.LocationType readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationTypeImpl.class);

            if (levelCode != null)
                criteria.add(Expression.ilike("levelCode", levelCode, MatchMode.START));
            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (description != null)
                criteria.add(Expression.ilike("description", description, MatchMode.START));
            if (status != null)
            criteria.add(Expression.eq("status", status));
            if (type != null)
            criteria.add(Expression.eq("type", type));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (fallsWithinLocationType != null) criteria.createCriteria("fallsWithinLocationType").add(Expression.eq("id", fallsWithinLocationType));
            if (locationTypes != null && locationTypes.length > 0) criteria.createCriteria("locationTypes").add(Expression.in("id", locationTypes));
            if (locations != null && locations.length > 0) criteria.createCriteria("locations").add(Expression.in("id", locations));
            criteria.setMaxResults(250);

            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public java.util.List readAll()
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationTypeImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public java.util.Map readBackingLists()
    {
        final java.util.Map lists = new java.util.HashMap();
        final Session session = this.getSession();

        try
        {
            lists.put("fallsWithinLocationType", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.location.LocationType item order by item.levelCode").list());
            lists.put("locationTypes", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.location.LocationType item order by item.levelCode").list());
            lists.put("locations", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.location.LocationType update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
    {
        final com.jrsystems.jrbase.location.LocationType entity = this.getDao().load(id);

        entity.setLevelCode(levelCode);
        entity.setName(name);
        entity.setDescription(description);
        entity.setStatus(status);
        entity.setType(type);
        com.jrsystems.jrbase.location.LocationType fallsWithinLocationTypeEntity = null;
        if (fallsWithinLocationType != null)
        {
            fallsWithinLocationTypeEntity = getFallsWithinLocationTypeDao().load(fallsWithinLocationType);
        }

        entity.setFallsWithinLocationType(fallsWithinLocationTypeEntity);

        final java.util.Set locationTypesEntities = (locationTypes != null && locationTypes.length > 0)
            ? this.findLocationTypeByIds(locationTypes)
            : java.util.Collections.EMPTY_SET;

        entity.setLocationTypes(locationTypesEntities);

        final java.util.Set locationsEntities = (locations != null && locations.length > 0)
            ? this.findLocationByIds(locations)
            : java.util.Collections.EMPTY_SET;

        entity.setLocations(locationsEntities);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete $manageable.generalizationRoot.fullyQualifiedEntityImplementationName where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}