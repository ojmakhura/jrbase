// license-header java merge-point
package com.jrsystems.jrbase.workbench.program.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ProgramManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ProgramManageableDao
{
    private com.jrsystems.jrbase.workbench.program.ProgramDao dao;

    public void setDao(com.jrsystems.jrbase.workbench.program.ProgramDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.workbench.program.ProgramDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.workbench.menu.MenuDao menuDao = null;

    public void setMenuDao(com.jrsystems.jrbase.workbench.menu.MenuDao menuDao)
    {
        this.menuDao = menuDao;
    }

    protected com.jrsystems.jrbase.workbench.menu.MenuDao getMenuDao()
    {
        return this.menuDao;
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

    private java.util.Set findMenuByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.workbench.menu.MenuImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.workbench.program.Program create(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
    {
        final com.jrsystems.jrbase.workbench.program.Program entity = new com.jrsystems.jrbase.workbench.program.ProgramImpl();
        entity.setProgramId(programId);
        entity.setProgramName(programName);
        entity.setProgramDescription(programDescription);
        entity.setId(id);
        com.jrsystems.jrbase.workbench.menu.Menu menuEntity = null;
        if (menu != null)
        {
            menuEntity = (com.jrsystems.jrbase.workbench.menu.Menu)getMenuDao().load(menu);
        }

        entity.setMenu(menuEntity);


        return (com.jrsystems.jrbase.workbench.program.Program)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.workbench.program.Program readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.workbench.program.ProgramImpl.class);

            if (programId != null)
                criteria.add(Expression.ilike("programId", programId, MatchMode.START));
            if (programName != null)
                criteria.add(Expression.ilike("programName", programName, MatchMode.START));
            if (programDescription != null)
                criteria.add(Expression.ilike("programDescription", programDescription, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (menu != null) criteria.createCriteria("menu").add(Expression.eq("id", menu));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.workbench.program.ProgramImpl.class);
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
            lists.put("menu", session.createQuery("select item.id, item.id from com.jrsystems.jrbase.workbench.menu.Menu item order by item.id").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.workbench.program.Program update(java.lang.String programId, java.lang.String programName, java.lang.String programDescription, java.lang.Long id, java.lang.Long menu)
    {
        final com.jrsystems.jrbase.workbench.program.Program entity = this.getDao().load(id);

        entity.setProgramId(programId);
        entity.setProgramName(programName);
        entity.setProgramDescription(programDescription);
        com.jrsystems.jrbase.workbench.menu.Menu menuEntity = null;
        if (menu != null)
        {
            menuEntity = getMenuDao().load(menu);
        }

        entity.setMenu(menuEntity);


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