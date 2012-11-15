// license-header java merge-point
package com.jrsystems.jrbase.counter.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class CounterManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements CounterManageableDao
{
    private com.jrsystems.jrbase.counter.CounterDao dao;

    public void setDao(com.jrsystems.jrbase.counter.CounterDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.counter.CounterDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.counter.Counter create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
    {
        final com.jrsystems.jrbase.counter.Counter entity = new com.jrsystems.jrbase.counter.CounterImpl();
        entity.setCounterName(counterName);
        entity.setFormat(format);
        entity.setCurrentCount(currentCount);
        entity.setId(id);

        return (com.jrsystems.jrbase.counter.Counter)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.counter.Counter readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.counter.CounterImpl.class);

            if (counterName != null)
                criteria.add(Expression.ilike("counterName", counterName, MatchMode.START));
            if (format != null)
                criteria.add(Expression.ilike("format", format, MatchMode.START));
            if (currentCount != null)
            criteria.add(Expression.eq("currentCount", currentCount));
            if (id != null)
            criteria.add(Expression.eq("id", id));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.counter.CounterImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.counter.Counter update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
    {
        final com.jrsystems.jrbase.counter.Counter entity = this.getDao().load(id);

        entity.setCounterName(counterName);
        entity.setFormat(format);
        entity.setCurrentCount(currentCount);

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