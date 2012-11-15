// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class OrganisationManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements OrganisationManageableDao
{
    private com.jrsystems.jrbase.organisation.OrganisationDao dao;

    public void setDao(com.jrsystems.jrbase.organisation.OrganisationDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.organisation.OrganisationDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.organisation.OrganisationDao organisationDao = null;

    public void setOrganisationDao(com.jrsystems.jrbase.organisation.OrganisationDao organisationDao)
    {
        this.organisationDao = organisationDao;
    }

    protected com.jrsystems.jrbase.organisation.OrganisationDao getOrganisationDao()
    {
        return this.organisationDao;
    }

    private com.jrsystems.jrbase.organisation.OrganisationDao organisationsDao = null;

    public void setOrganisationsDao(com.jrsystems.jrbase.organisation.OrganisationDao organisationsDao)
    {
        this.organisationsDao = organisationsDao;
    }

    protected com.jrsystems.jrbase.organisation.OrganisationDao getOrganisationsDao()
    {
        return this.organisationsDao;
    }

    private com.jrsystems.jrbase.organisation.OrganisationTypeDao organisationTypeDao = null;

    public void setOrganisationTypeDao(com.jrsystems.jrbase.organisation.OrganisationTypeDao organisationTypeDao)
    {
        this.organisationTypeDao = organisationTypeDao;
    }

    protected com.jrsystems.jrbase.organisation.OrganisationTypeDao getOrganisationTypeDao()
    {
        return this.organisationTypeDao;
    }

    private com.jrsystems.jrbase.location.LocationDao organisationLocationsDao = null;

    public void setOrganisationLocationsDao(com.jrsystems.jrbase.location.LocationDao organisationLocationsDao)
    {
        this.organisationLocationsDao = organisationLocationsDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getOrganisationLocationsDao()
    {
        return this.organisationLocationsDao;
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

    private java.util.Set findOrganisationTypeByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class);
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

    public com.jrsystems.jrbase.organisation.Organisation create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
    {
        final com.jrsystems.jrbase.organisation.Organisation entity = new com.jrsystems.jrbase.organisation.OrganisationImpl();
        entity.setRegistrationRef(registrationRef);
        entity.setName(name);
        entity.setDescription(description);
        entity.setId(id);
        com.jrsystems.jrbase.organisation.Organisation organisationEntity = null;
        if (organisation != null)
        {
            organisationEntity = (com.jrsystems.jrbase.organisation.Organisation)getOrganisationDao().load(organisation);
        }

        entity.setOrganisation(organisationEntity);

        final java.util.Set organisationsEntities = (organisations != null && organisations.length > 0)
            ? this.findOrganisationByIds(organisations)
            : java.util.Collections.EMPTY_SET;

        entity.setOrganisations(organisationsEntities);

        com.jrsystems.jrbase.organisation.OrganisationType organisationTypeEntity = null;
        if (organisationType != null)
        {
            organisationTypeEntity = (com.jrsystems.jrbase.organisation.OrganisationType)getOrganisationTypeDao().load(organisationType);
        }

        entity.setOrganisationType(organisationTypeEntity);

        final java.util.Set organisationLocationsEntities = (organisationLocations != null && organisationLocations.length > 0)
            ? this.findLocationByIds(organisationLocations)
            : java.util.Collections.EMPTY_SET;

        entity.setOrganisationLocations(organisationLocationsEntities);


        return (com.jrsystems.jrbase.organisation.Organisation)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.organisation.Organisation readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.organisation.OrganisationImpl.class);

            if (registrationRef != null)
                criteria.add(Expression.ilike("registrationRef", registrationRef, MatchMode.START));
            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (description != null)
                criteria.add(Expression.ilike("description", description, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (organisation != null) criteria.createCriteria("organisation").add(Expression.eq("id", organisation));
            if (organisations != null && organisations.length > 0) criteria.createCriteria("organisations").add(Expression.in("id", organisations));
            if (organisationType != null) criteria.createCriteria("organisationType").add(Expression.eq("id", organisationType));
            if (organisationLocations != null && organisationLocations.length > 0) criteria.createCriteria("organisationLocations").add(Expression.in("id", organisationLocations));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.organisation.OrganisationImpl.class);
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
            lists.put("organisation", session.createQuery("select item.id, item.registrationRef from com.jrsystems.jrbase.organisation.Organisation item order by item.registrationRef").list());
            lists.put("organisations", session.createQuery("select item.id, item.registrationRef from com.jrsystems.jrbase.organisation.Organisation item order by item.registrationRef").list());
            lists.put("organisationType", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.organisation.OrganisationType item order by item.levelCode").list());
            lists.put("organisationLocations", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.organisation.Organisation update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
    {
        final com.jrsystems.jrbase.organisation.Organisation entity = this.getDao().load(id);

        entity.setRegistrationRef(registrationRef);
        entity.setName(name);
        entity.setDescription(description);
        com.jrsystems.jrbase.organisation.Organisation organisationEntity = null;
        if (organisation != null)
        {
            organisationEntity = getOrganisationDao().load(organisation);
        }

        entity.setOrganisation(organisationEntity);

        final java.util.Set organisationsEntities = (organisations != null && organisations.length > 0)
            ? this.findOrganisationByIds(organisations)
            : java.util.Collections.EMPTY_SET;

        entity.setOrganisations(organisationsEntities);

        com.jrsystems.jrbase.organisation.OrganisationType organisationTypeEntity = null;
        if (organisationType != null)
        {
            organisationTypeEntity = getOrganisationTypeDao().load(organisationType);
        }

        entity.setOrganisationType(organisationTypeEntity);

        final java.util.Set organisationLocationsEntities = (organisationLocations != null && organisationLocations.length > 0)
            ? this.findLocationByIds(organisationLocations)
            : java.util.Collections.EMPTY_SET;

        entity.setOrganisationLocations(organisationLocationsEntities);


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