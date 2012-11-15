// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class LocationManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements LocationManageableDao
{
    private com.jrsystems.jrbase.location.LocationDao dao;

    public void setDao(com.jrsystems.jrbase.location.LocationDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.individual.IndividualDao individualDao = null;

    public void setIndividualDao(com.jrsystems.jrbase.individual.IndividualDao individualDao)
    {
        this.individualDao = individualDao;
    }

    protected com.jrsystems.jrbase.individual.IndividualDao getIndividualDao()
    {
        return this.individualDao;
    }

    private com.jrsystems.jrbase.individual.IndividualDao individualOwnersDao = null;

    public void setIndividualOwnersDao(com.jrsystems.jrbase.individual.IndividualDao individualOwnersDao)
    {
        this.individualOwnersDao = individualOwnersDao;
    }

    protected com.jrsystems.jrbase.individual.IndividualDao getIndividualOwnersDao()
    {
        return this.individualOwnersDao;
    }

    private com.jrsystems.jrbase.organisation.OrganisationDao locationOrganisationsDao = null;

    public void setLocationOrganisationsDao(com.jrsystems.jrbase.organisation.OrganisationDao locationOrganisationsDao)
    {
        this.locationOrganisationsDao = locationOrganisationsDao;
    }

    protected com.jrsystems.jrbase.organisation.OrganisationDao getLocationOrganisationsDao()
    {
        return this.locationOrganisationsDao;
    }

    private com.jrsystems.jrbase.location.LocationTypeDao locationTypeDao = null;

    public void setLocationTypeDao(com.jrsystems.jrbase.location.LocationTypeDao locationTypeDao)
    {
        this.locationTypeDao = locationTypeDao;
    }

    protected com.jrsystems.jrbase.location.LocationTypeDao getLocationTypeDao()
    {
        return this.locationTypeDao;
    }

    private com.jrsystems.jrbase.location.LocationDao fallsWithinAreaDao = null;

    public void setFallsWithinAreaDao(com.jrsystems.jrbase.location.LocationDao fallsWithinAreaDao)
    {
        this.fallsWithinAreaDao = fallsWithinAreaDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getFallsWithinAreaDao()
    {
        return this.fallsWithinAreaDao;
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

    private com.jrsystems.jrbase.loginsession.LoginSessionDao loginSessionsDao = null;

    public void setLoginSessionsDao(com.jrsystems.jrbase.loginsession.LoginSessionDao loginSessionsDao)
    {
        this.loginSessionsDao = loginSessionsDao;
    }

    protected com.jrsystems.jrbase.loginsession.LoginSessionDao getLoginSessionsDao()
    {
        return this.loginSessionsDao;
    }

    private java.util.Set findIndividualByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.individual.IndividualImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findUserLocationByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserLocationImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findOrganisationByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.organisation.OrganisationImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
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

    private java.util.Set findLoginSessionByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.loginsession.LoginSessionImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.location.Location create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
    {
        final com.jrsystems.jrbase.location.Location entity = new com.jrsystems.jrbase.location.LocationImpl();
        entity.setStatus(status);
        entity.setType(type);
        entity.setUniqueCode(uniqueCode);
        entity.setLevelCode(levelCode);
        entity.setLocationName(locationName);
        entity.setDescription(description);
        entity.setId(id);
        com.jrsystems.jrbase.individual.Individual individualEntity = null;
        if (individual != null)
        {
            individualEntity = (com.jrsystems.jrbase.individual.Individual)getIndividualDao().load(individual);
        }

        entity.setIndividual(individualEntity);

        final java.util.Set individualOwnersEntities = (individualOwners != null && individualOwners.length > 0)
            ? this.findIndividualByIds(individualOwners)
            : java.util.Collections.EMPTY_SET;

        entity.setIndividualOwners(individualOwnersEntities);

        final java.util.Set locationOrganisationsEntities = (locationOrganisations != null && locationOrganisations.length > 0)
            ? this.findOrganisationByIds(locationOrganisations)
            : java.util.Collections.EMPTY_SET;

        entity.setLocationOrganisations(locationOrganisationsEntities);

        com.jrsystems.jrbase.location.LocationType locationTypeEntity = null;
        if (locationType != null)
        {
            locationTypeEntity = (com.jrsystems.jrbase.location.LocationType)getLocationTypeDao().load(locationType);
        }

        entity.setLocationType(locationTypeEntity);

        com.jrsystems.jrbase.location.Location fallsWithinAreaEntity = null;
        if (fallsWithinArea != null)
        {
            fallsWithinAreaEntity = (com.jrsystems.jrbase.location.Location)getFallsWithinAreaDao().load(fallsWithinArea);
        }

        entity.setFallsWithinArea(fallsWithinAreaEntity);

        final java.util.Set locationsEntities = (locations != null && locations.length > 0)
            ? this.findLocationByIds(locations)
            : java.util.Collections.EMPTY_SET;

        entity.setLocations(locationsEntities);

        final java.util.Set loginSessionsEntities = (loginSessions != null && loginSessions.length > 0)
            ? this.findLoginSessionByIds(loginSessions)
            : java.util.Collections.EMPTY_SET;

        entity.setLoginSessions(loginSessionsEntities);


        return (com.jrsystems.jrbase.location.Location)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.location.Location readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationImpl.class);

            if (status != null)
            criteria.add(Expression.eq("status", status));
            if (type != null)
            criteria.add(Expression.eq("type", type));
            if (uniqueCode != null)
                criteria.add(Expression.ilike("uniqueCode", uniqueCode, MatchMode.START));
            if (levelCode != null)
                criteria.add(Expression.ilike("levelCode", levelCode, MatchMode.START));
            if (locationName != null)
                criteria.add(Expression.ilike("locationName", locationName, MatchMode.START));
            if (description != null)
                criteria.add(Expression.ilike("description", description, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (individual != null) criteria.createCriteria("individual").add(Expression.eq("id", individual));
            if (individualOwners != null && individualOwners.length > 0) criteria.createCriteria("individualOwners").add(Expression.in("id", individualOwners));
            if (locationOrganisations != null && locationOrganisations.length > 0) criteria.createCriteria("locationOrganisations").add(Expression.in("id", locationOrganisations));
            if (locationType != null) criteria.createCriteria("locationType").add(Expression.eq("id", locationType));
            if (fallsWithinArea != null) criteria.createCriteria("fallsWithinArea").add(Expression.eq("id", fallsWithinArea));
            if (locations != null && locations.length > 0) criteria.createCriteria("locations").add(Expression.in("id", locations));
            if (loginSessions != null && loginSessions.length > 0) criteria.createCriteria("loginSessions").add(Expression.in("id", loginSessions));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationImpl.class);
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
            lists.put("individual", session.createQuery("select item.id, item.individualId from com.jrsystems.jrbase.individual.Individual item order by item.individualId").list());
            lists.put("individualOwners", session.createQuery("select item.id, item.individualId from com.jrsystems.jrbase.individual.Individual item order by item.individualId").list());
            lists.put("locationOrganisations", session.createQuery("select item.id, item.registrationRef from com.jrsystems.jrbase.organisation.Organisation item order by item.registrationRef").list());
            lists.put("locationType", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.location.LocationType item order by item.levelCode").list());
            lists.put("fallsWithinArea", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
            lists.put("locations", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
            lists.put("loginSessions", session.createQuery("select item.id, item.id from com.jrsystems.jrbase.loginsession.LoginSession item order by item.id").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.location.Location update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
    {
        final com.jrsystems.jrbase.location.Location entity = this.getDao().load(id);

        entity.setStatus(status);
        entity.setType(type);
        entity.setUniqueCode(uniqueCode);
        entity.setLevelCode(levelCode);
        entity.setLocationName(locationName);
        entity.setDescription(description);
        com.jrsystems.jrbase.individual.Individual individualEntity = null;
        if (individual != null)
        {
            individualEntity = getIndividualDao().load(individual);
        }

        entity.setIndividual(individualEntity);

        final java.util.Set individualOwnersEntities = (individualOwners != null && individualOwners.length > 0)
            ? this.findIndividualByIds(individualOwners)
            : java.util.Collections.EMPTY_SET;

        entity.setIndividualOwners(individualOwnersEntities);

        final java.util.Set locationOrganisationsEntities = (locationOrganisations != null && locationOrganisations.length > 0)
            ? this.findOrganisationByIds(locationOrganisations)
            : java.util.Collections.EMPTY_SET;

        entity.setLocationOrganisations(locationOrganisationsEntities);

        com.jrsystems.jrbase.location.LocationType locationTypeEntity = null;
        if (locationType != null)
        {
            locationTypeEntity = getLocationTypeDao().load(locationType);
        }

        entity.setLocationType(locationTypeEntity);

        com.jrsystems.jrbase.location.Location fallsWithinAreaEntity = null;
        if (fallsWithinArea != null)
        {
            fallsWithinAreaEntity = getFallsWithinAreaDao().load(fallsWithinArea);
        }

        entity.setFallsWithinArea(fallsWithinAreaEntity);

        final java.util.Set locationsEntities = (locations != null && locations.length > 0)
            ? this.findLocationByIds(locations)
            : java.util.Collections.EMPTY_SET;

        entity.setLocations(locationsEntities);

        final java.util.Set loginSessionsEntities = (loginSessions != null && loginSessions.length > 0)
            ? this.findLoginSessionByIds(loginSessions)
            : java.util.Collections.EMPTY_SET;

        entity.setLoginSessions(loginSessionsEntities);


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