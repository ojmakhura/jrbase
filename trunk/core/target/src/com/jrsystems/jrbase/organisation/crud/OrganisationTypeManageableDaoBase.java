// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class OrganisationTypeManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements OrganisationTypeManageableDao
{
    private com.jrsystems.jrbase.organisation.OrganisationTypeDao dao;

    public void setDao(com.jrsystems.jrbase.organisation.OrganisationTypeDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.organisation.OrganisationTypeDao getDao()
    {
        return this.dao;
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

    public com.jrsystems.jrbase.organisation.OrganisationType create(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
    {
        final com.jrsystems.jrbase.organisation.OrganisationType entity = new com.jrsystems.jrbase.organisation.OrganisationTypeImpl();
        entity.setLevelCode(levelCode);
        entity.setName(name);
        entity.setDescription(description);
        entity.setId(id);
        final java.util.Set organisationsEntities = (organisations != null && organisations.length > 0)
            ? this.findOrganisationByIds(organisations)
            : java.util.Collections.EMPTY_SET;

        entity.setOrganisations(organisationsEntities);


        return (com.jrsystems.jrbase.organisation.OrganisationType)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.organisation.OrganisationType readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class);

            if (levelCode != null)
                criteria.add(Expression.ilike("levelCode", levelCode, MatchMode.START));
            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (description != null)
                criteria.add(Expression.ilike("description", description, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (organisations != null && organisations.length > 0) criteria.createCriteria("organisations").add(Expression.in("id", organisations));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class);
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
            lists.put("organisations", session.createQuery("select item.id, item.registrationRef from com.jrsystems.jrbase.organisation.Organisation item order by item.registrationRef").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.organisation.OrganisationType update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
    {
        final com.jrsystems.jrbase.organisation.OrganisationType entity = this.getDao().load(id);

        entity.setLevelCode(levelCode);
        entity.setName(name);
        entity.setDescription(description);
        final java.util.Set organisationsEntities = (organisations != null && organisations.length > 0)
            ? this.findOrganisationByIds(organisations)
            : java.util.Collections.EMPTY_SET;

        entity.setOrganisations(organisationsEntities);


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