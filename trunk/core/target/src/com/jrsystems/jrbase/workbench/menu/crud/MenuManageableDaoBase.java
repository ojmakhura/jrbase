// license-header java merge-point
package com.jrsystems.jrbase.workbench.menu.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class MenuManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements MenuManageableDao
{
    private com.jrsystems.jrbase.workbench.menu.MenuDao dao;

    public void setDao(com.jrsystems.jrbase.workbench.menu.MenuDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.workbench.menu.MenuDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.workbench.program.ProgramDao programsDao = null;

    public void setProgramsDao(com.jrsystems.jrbase.workbench.program.ProgramDao programsDao)
    {
        this.programsDao = programsDao;
    }

    protected com.jrsystems.jrbase.workbench.program.ProgramDao getProgramsDao()
    {
        return this.programsDao;
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

    private java.util.Set findProgramByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.workbench.program.ProgramImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.workbench.menu.Menu create(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
    {
        final com.jrsystems.jrbase.workbench.menu.Menu entity = new com.jrsystems.jrbase.workbench.menu.MenuImpl();
        entity.setMenuCode(menuCode);
        entity.setMenuName(menuName);
        entity.setMenuDescription(menuDescription);
        entity.setId(id);
        final java.util.Set programsEntities = (programs != null && programs.length > 0)
            ? this.findProgramByIds(programs)
            : java.util.Collections.EMPTY_SET;

        entity.setPrograms(programsEntities);


        return (com.jrsystems.jrbase.workbench.menu.Menu)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.workbench.menu.Menu readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.workbench.menu.MenuImpl.class);

            if (menuCode != null)
                criteria.add(Expression.ilike("menuCode", menuCode, MatchMode.START));
            if (menuName != null)
                criteria.add(Expression.ilike("menuName", menuName, MatchMode.START));
            if (menuDescription != null)
                criteria.add(Expression.ilike("menuDescription", menuDescription, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (programs != null && programs.length > 0) criteria.createCriteria("programs").add(Expression.in("id", programs));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.workbench.menu.MenuImpl.class);
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
            lists.put("programs", session.createQuery("select item.id, item.programId from com.jrsystems.jrbase.workbench.program.Program item order by item.programId").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.workbench.menu.Menu update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
    {
        final com.jrsystems.jrbase.workbench.menu.Menu entity = this.getDao().load(id);

        entity.setMenuCode(menuCode);
        entity.setMenuName(menuName);
        entity.setMenuDescription(menuDescription);
        final java.util.Set programsEntities = (programs != null && programs.length > 0)
            ? this.findProgramByIds(programs)
            : java.util.Collections.EMPTY_SET;

        entity.setPrograms(programsEntities);


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