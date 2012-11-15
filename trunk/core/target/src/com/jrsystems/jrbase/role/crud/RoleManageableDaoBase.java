// license-header java merge-point
package com.jrsystems.jrbase.role.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class RoleManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements RoleManageableDao
{
    private com.jrsystems.jrbase.role.RoleDao dao;

    public void setDao(com.jrsystems.jrbase.role.RoleDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.role.RoleDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.user.UserDao usersDao = null;

    public void setUsersDao(com.jrsystems.jrbase.user.UserDao usersDao)
    {
        this.usersDao = usersDao;
    }

    protected com.jrsystems.jrbase.user.UserDao getUsersDao()
    {
        return this.usersDao;
    }

    private com.jrsystems.jrbase.workbench.menu.MenuDao menusDao = null;

    public void setMenusDao(com.jrsystems.jrbase.workbench.menu.MenuDao menusDao)
    {
        this.menusDao = menusDao;
    }

    protected com.jrsystems.jrbase.workbench.menu.MenuDao getMenusDao()
    {
        return this.menusDao;
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

    private com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao roleClearanceLevelsDao = null;

    public void setRoleClearanceLevelsDao(com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao roleClearanceLevelsDao)
    {
        this.roleClearanceLevelsDao = roleClearanceLevelsDao;
    }

    protected com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao getRoleClearanceLevelsDao()
    {
        return this.roleClearanceLevelsDao;
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

    public com.jrsystems.jrbase.role.Role create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
    {
        final com.jrsystems.jrbase.role.Role entity = new com.jrsystems.jrbase.role.RoleImpl();
        entity.setRoleCode(roleCode);
        entity.setRole(role);
        entity.setRoleDescription(roleDescription);
        entity.setId(id);
        final java.util.Set usersEntities = (users != null && users.length > 0)
            ? this.findUserByIds(users)
            : java.util.Collections.EMPTY_SET;

        entity.setUsers(usersEntities);

        final java.util.Set menusEntities = (menus != null && menus.length > 0)
            ? this.findMenuByIds(menus)
            : java.util.Collections.EMPTY_SET;

        entity.setMenus(menusEntities);

        final java.util.Set programsEntities = (programs != null && programs.length > 0)
            ? this.findProgramByIds(programs)
            : java.util.Collections.EMPTY_SET;

        entity.setPrograms(programsEntities);

        final java.util.Set roleClearanceLevelsEntities = (roleClearanceLevels != null && roleClearanceLevels.length > 0)
            ? this.findClearanceLevelByIds(roleClearanceLevels)
            : java.util.Collections.EMPTY_SET;

        entity.setRoleClearanceLevels(roleClearanceLevelsEntities);


        return (com.jrsystems.jrbase.role.Role)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.role.Role readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.role.RoleImpl.class);

            if (roleCode != null)
                criteria.add(Expression.ilike("roleCode", roleCode, MatchMode.START));
            if (role != null)
                criteria.add(Expression.ilike("role", role, MatchMode.START));
            if (roleDescription != null)
                criteria.add(Expression.ilike("roleDescription", roleDescription, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (users != null && users.length > 0) criteria.createCriteria("users").add(Expression.in("id", users));
            if (menus != null && menus.length > 0) criteria.createCriteria("menus").add(Expression.in("id", menus));
            if (programs != null && programs.length > 0) criteria.createCriteria("programs").add(Expression.in("id", programs));
            if (roleClearanceLevels != null && roleClearanceLevels.length > 0) criteria.createCriteria("roleClearanceLevels").add(Expression.in("id", roleClearanceLevels));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.role.RoleImpl.class);
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
            lists.put("users", session.createQuery("select item.id, item.username from com.jrsystems.jrbase.user.User item order by item.username").list());
            lists.put("menus", session.createQuery("select item.id, item.id from com.jrsystems.jrbase.workbench.menu.Menu item order by item.id").list());
            lists.put("programs", session.createQuery("select item.id, item.programId from com.jrsystems.jrbase.workbench.program.Program item order by item.programId").list());
            lists.put("roleClearanceLevels", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.clearancelevel.ClearanceLevel item order by item.levelCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.role.Role update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
    {
        final com.jrsystems.jrbase.role.Role entity = this.getDao().load(id);

        entity.setRoleCode(roleCode);
        entity.setRole(role);
        entity.setRoleDescription(roleDescription);
        final java.util.Set usersEntities = (users != null && users.length > 0)
            ? this.findUserByIds(users)
            : java.util.Collections.EMPTY_SET;

        entity.setUsers(usersEntities);

        final java.util.Set menusEntities = (menus != null && menus.length > 0)
            ? this.findMenuByIds(menus)
            : java.util.Collections.EMPTY_SET;

        entity.setMenus(menusEntities);

        final java.util.Set programsEntities = (programs != null && programs.length > 0)
            ? this.findProgramByIds(programs)
            : java.util.Collections.EMPTY_SET;

        entity.setPrograms(programsEntities);

        final java.util.Set roleClearanceLevelsEntities = (roleClearanceLevels != null && roleClearanceLevels.length > 0)
            ? this.findClearanceLevelByIds(roleClearanceLevels)
            : java.util.Collections.EMPTY_SET;

        entity.setRoleClearanceLevels(roleClearanceLevelsEntities);


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