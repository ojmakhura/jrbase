// license-header java merge-point
package com.jrsystems.jrbase.clearancelevel.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ClearanceLevelManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ClearanceLevelManageableDao
{
    private com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao dao;

    public void setDao(com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.user.UserDao clearedUsersDao = null;

    public void setClearedUsersDao(com.jrsystems.jrbase.user.UserDao clearedUsersDao)
    {
        this.clearedUsersDao = clearedUsersDao;
    }

    protected com.jrsystems.jrbase.user.UserDao getClearedUsersDao()
    {
        return this.clearedUsersDao;
    }

    private com.jrsystems.jrbase.role.RoleDao clearedRolesDao = null;

    public void setClearedRolesDao(com.jrsystems.jrbase.role.RoleDao clearedRolesDao)
    {
        this.clearedRolesDao = clearedRolesDao;
    }

    protected com.jrsystems.jrbase.role.RoleDao getClearedRolesDao()
    {
        return this.clearedRolesDao;
    }

    private com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao lowerLevelDao = null;

    public void setLowerLevelDao(com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao lowerLevelDao)
    {
        this.lowerLevelDao = lowerLevelDao;
    }

    protected com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao getLowerLevelDao()
    {
        return this.lowerLevelDao;
    }

    private com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao upperLevelDao = null;

    public void setUpperLevelDao(com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao upperLevelDao)
    {
        this.upperLevelDao = upperLevelDao;
    }

    protected com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao getUpperLevelDao()
    {
        return this.upperLevelDao;
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

    private java.util.Set findRoleByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.role.RoleImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findClearanceLevelByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel create(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
    {
        final com.jrsystems.jrbase.clearancelevel.ClearanceLevel entity = new com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl();
        entity.setLevelCode(levelCode);
        entity.setLevelDescription(levelDescription);
        entity.setId(id);
        final java.util.Set clearedUsersEntities = (clearedUsers != null && clearedUsers.length > 0)
            ? this.findUserByIds(clearedUsers)
            : java.util.Collections.EMPTY_SET;

        entity.setClearedUsers(clearedUsersEntities);

        final java.util.Set clearedRolesEntities = (clearedRoles != null && clearedRoles.length > 0)
            ? this.findRoleByIds(clearedRoles)
            : java.util.Collections.EMPTY_SET;

        entity.setClearedRoles(clearedRolesEntities);

        com.jrsystems.jrbase.clearancelevel.ClearanceLevel lowerLevelEntity = null;
        if (lowerLevel != null)
        {
            lowerLevelEntity = (com.jrsystems.jrbase.clearancelevel.ClearanceLevel)getLowerLevelDao().load(lowerLevel);
        }

        entity.setLowerLevel(lowerLevelEntity);

        com.jrsystems.jrbase.clearancelevel.ClearanceLevel upperLevelEntity = null;
        if (upperLevel != null)
        {
            upperLevelEntity = (com.jrsystems.jrbase.clearancelevel.ClearanceLevel)getUpperLevelDao().load(upperLevel);
        }

        entity.setUpperLevel(upperLevelEntity);


        return (com.jrsystems.jrbase.clearancelevel.ClearanceLevel)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class);

            if (levelCode != null)
                criteria.add(Expression.ilike("levelCode", levelCode, MatchMode.START));
            if (levelDescription != null)
                criteria.add(Expression.ilike("levelDescription", levelDescription, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (clearedUsers != null && clearedUsers.length > 0) criteria.createCriteria("clearedUsers").add(Expression.in("id", clearedUsers));
            if (clearedRoles != null && clearedRoles.length > 0) criteria.createCriteria("clearedRoles").add(Expression.in("id", clearedRoles));
            if (lowerLevel != null) criteria.createCriteria("lowerLevel").add(Expression.eq("id", lowerLevel));
            if (upperLevel != null) criteria.createCriteria("upperLevel").add(Expression.eq("id", upperLevel));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class);
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
            lists.put("clearedUsers", session.createQuery("select item.id, item.username from com.jrsystems.jrbase.user.User item order by item.username").list());
            lists.put("clearedRoles", session.createQuery("select item.id, item.roleCode from com.jrsystems.jrbase.role.Role item order by item.roleCode").list());
            lists.put("lowerLevel", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.clearancelevel.ClearanceLevel item order by item.levelCode").list());
            lists.put("upperLevel", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.clearancelevel.ClearanceLevel item order by item.levelCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
    {
        final com.jrsystems.jrbase.clearancelevel.ClearanceLevel entity = this.getDao().load(id);

        entity.setLevelCode(levelCode);
        entity.setLevelDescription(levelDescription);
        final java.util.Set clearedUsersEntities = (clearedUsers != null && clearedUsers.length > 0)
            ? this.findUserByIds(clearedUsers)
            : java.util.Collections.EMPTY_SET;

        entity.setClearedUsers(clearedUsersEntities);

        final java.util.Set clearedRolesEntities = (clearedRoles != null && clearedRoles.length > 0)
            ? this.findRoleByIds(clearedRoles)
            : java.util.Collections.EMPTY_SET;

        entity.setClearedRoles(clearedRolesEntities);

        com.jrsystems.jrbase.clearancelevel.ClearanceLevel lowerLevelEntity = null;
        if (lowerLevel != null)
        {
            lowerLevelEntity = getLowerLevelDao().load(lowerLevel);
        }

        entity.setLowerLevel(lowerLevelEntity);

        com.jrsystems.jrbase.clearancelevel.ClearanceLevel upperLevelEntity = null;
        if (upperLevel != null)
        {
            upperLevelEntity = getUpperLevelDao().load(upperLevel);
        }

        entity.setUpperLevel(upperLevelEntity);


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