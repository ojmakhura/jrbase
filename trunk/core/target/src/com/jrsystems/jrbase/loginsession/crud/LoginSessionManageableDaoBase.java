// license-header java merge-point
package com.jrsystems.jrbase.loginsession.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class LoginSessionManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements LoginSessionManageableDao
{
    private com.jrsystems.jrbase.loginsession.LoginSessionDao dao;

    public void setDao(com.jrsystems.jrbase.loginsession.LoginSessionDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.loginsession.LoginSessionDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.user.UserDao userDao = null;

    public void setUserDao(com.jrsystems.jrbase.user.UserDao userDao)
    {
        this.userDao = userDao;
    }

    protected com.jrsystems.jrbase.user.UserDao getUserDao()
    {
        return this.userDao;
    }

    private com.jrsystems.jrbase.location.LocationDao areaDao = null;

    public void setAreaDao(com.jrsystems.jrbase.location.LocationDao areaDao)
    {
        this.areaDao = areaDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getAreaDao()
    {
        return this.areaDao;
    }

    private java.util.Set findUserByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserImpl.class);
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

    public com.jrsystems.jrbase.loginsession.LoginSession create(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
    {
        final com.jrsystems.jrbase.loginsession.LoginSession entity = new com.jrsystems.jrbase.loginsession.LoginSessionImpl();
        entity.setActive(active);
        entity.setId(id);
        com.jrsystems.jrbase.user.User userEntity = null;
        if (user != null)
        {
            userEntity = (com.jrsystems.jrbase.user.User)getUserDao().load(user);
        }

        entity.setUser(userEntity);

        com.jrsystems.jrbase.location.Location areaEntity = null;
        if (area != null)
        {
            areaEntity = (com.jrsystems.jrbase.location.Location)getAreaDao().load(area);
        }

        entity.setArea(areaEntity);


        return (com.jrsystems.jrbase.loginsession.LoginSession)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.loginsession.LoginSession readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.loginsession.LoginSessionImpl.class);

            if (active) criteria.add(Expression.eq("active", java.lang.Boolean.TRUE));
                if (id != null)
            criteria.add(Expression.eq("id", id));
            if (user != null) criteria.createCriteria("user").add(Expression.eq("id", user));
            if (area != null) criteria.createCriteria("area").add(Expression.eq("id", area));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.loginsession.LoginSessionImpl.class);
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
            lists.put("user", session.createQuery("select item.id, item.username from com.jrsystems.jrbase.user.User item order by item.username").list());
            lists.put("area", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.loginsession.LoginSession update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
    {
        final com.jrsystems.jrbase.loginsession.LoginSession entity = this.getDao().load(id);

        entity.setActive(active);
        com.jrsystems.jrbase.user.User userEntity = null;
        if (user != null)
        {
            userEntity = getUserDao().load(user);
        }

        entity.setUser(userEntity);

        com.jrsystems.jrbase.location.Location areaEntity = null;
        if (area != null)
        {
            areaEntity = getAreaDao().load(area);
        }

        entity.setArea(areaEntity);


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