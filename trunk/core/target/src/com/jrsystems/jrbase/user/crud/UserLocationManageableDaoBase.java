// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class UserLocationManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements UserLocationManageableDao
{
    private com.jrsystems.jrbase.user.UserLocationDao dao;

    public void setDao(com.jrsystems.jrbase.user.UserLocationDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.user.UserLocationDao getDao()
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

    private com.jrsystems.jrbase.location.LocationDao locationDao = null;

    public void setLocationDao(com.jrsystems.jrbase.location.LocationDao locationDao)
    {
        this.locationDao = locationDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getLocationDao()
    {
        return this.locationDao;
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

    public com.jrsystems.jrbase.user.UserLocation create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
    {
        final com.jrsystems.jrbase.user.UserLocation entity = new com.jrsystems.jrbase.user.UserLocationImpl();
        entity.setStatus(status);
        entity.setFromDate(fromDate);
        entity.setToDate(toDate);
        entity.setId(id);
        com.jrsystems.jrbase.user.User userEntity = null;
        if (user != null)
        {
            userEntity = (com.jrsystems.jrbase.user.User)getUserDao().load(user);
        }

        entity.setUser(userEntity);

        com.jrsystems.jrbase.location.Location locationEntity = null;
        if (location != null)
        {
            locationEntity = (com.jrsystems.jrbase.location.Location)getLocationDao().load(location);
        }

        entity.setLocation(locationEntity);


        return (com.jrsystems.jrbase.user.UserLocation)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.user.UserLocation readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserLocationImpl.class);

            if (status != null)
            criteria.add(Expression.eq("status", status));
            if (fromDate != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(fromDate);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("fromDate", fromDate));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("fromDate", fromDate, calendar.getTime()));
                }
            }
            if (toDate != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(toDate);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("toDate", toDate));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("toDate", toDate, calendar.getTime()));
                }
            }
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (user != null) criteria.createCriteria("user").add(Expression.eq("id", user));
            if (location != null) criteria.createCriteria("location").add(Expression.eq("id", location));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserLocationImpl.class);
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
            lists.put("location", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.user.UserLocation update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
    {
        final com.jrsystems.jrbase.user.UserLocation entity = this.getDao().load(id);

        entity.setStatus(status);
        entity.setFromDate(fromDate);
        entity.setToDate(toDate);
        com.jrsystems.jrbase.user.User userEntity = null;
        if (user != null)
        {
            userEntity = getUserDao().load(user);
        }

        entity.setUser(userEntity);

        com.jrsystems.jrbase.location.Location locationEntity = null;
        if (location != null)
        {
            locationEntity = getLocationDao().load(location);
        }

        entity.setLocation(locationEntity);


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