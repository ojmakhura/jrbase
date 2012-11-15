// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class UserManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements UserManageableDao
{
    private com.jrsystems.jrbase.user.UserDao dao;

    public void setDao(com.jrsystems.jrbase.user.UserDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.user.UserDao getDao()
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

    private com.jrsystems.jrbase.user.UserLocationDao userLocationsDao = null;

    public void setUserLocationsDao(com.jrsystems.jrbase.user.UserLocationDao userLocationsDao)
    {
        this.userLocationsDao = userLocationsDao;
    }

    protected com.jrsystems.jrbase.user.UserLocationDao getUserLocationsDao()
    {
        return this.userLocationsDao;
    }

    private com.jrsystems.jrbase.role.RoleDao userRolesDao = null;

    public void setUserRolesDao(com.jrsystems.jrbase.role.RoleDao userRolesDao)
    {
        this.userRolesDao = userRolesDao;
    }

    protected com.jrsystems.jrbase.role.RoleDao getUserRolesDao()
    {
        return this.userRolesDao;
    }

    private com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao userClearanceLevelsDao = null;

    public void setUserClearanceLevelsDao(com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao userClearanceLevelsDao)
    {
        this.userClearanceLevelsDao = userClearanceLevelsDao;
    }

    protected com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao getUserClearanceLevelsDao()
    {
        return this.userClearanceLevelsDao;
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

    public com.jrsystems.jrbase.user.User create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
    {
        final com.jrsystems.jrbase.user.User entity = new com.jrsystems.jrbase.user.UserImpl();
        entity.setPhoto(photo);
        entity.setStatus(status);
        entity.setUsername(username);
        entity.setPassword(password);
        entity.setName(name);
        entity.setEmail(email);
        entity.setId(id);
        com.jrsystems.jrbase.individual.Individual individualEntity = null;
        if (individual != null)
        {
            individualEntity = (com.jrsystems.jrbase.individual.Individual)getIndividualDao().load(individual);
        }

        entity.setIndividual(individualEntity);

        final java.util.Set menusEntities = (menus != null && menus.length > 0)
            ? this.findMenuByIds(menus)
            : java.util.Collections.EMPTY_SET;

        entity.setMenus(menusEntities);

        final java.util.Set programsEntities = (programs != null && programs.length > 0)
            ? this.findProgramByIds(programs)
            : java.util.Collections.EMPTY_SET;

        entity.setPrograms(programsEntities);

        final java.util.Set userLocationsEntities = (userLocations != null && userLocations.length > 0)
            ? this.findUserLocationByIds(userLocations)
            : java.util.Collections.EMPTY_SET;

        entity.setUserLocations(userLocationsEntities);

        final java.util.Set userRolesEntities = (userRoles != null && userRoles.length > 0)
            ? this.findRoleByIds(userRoles)
            : java.util.Collections.EMPTY_SET;

        entity.setUserRoles(userRolesEntities);

        final java.util.Set userClearanceLevelsEntities = (userClearanceLevels != null && userClearanceLevels.length > 0)
            ? this.findClearanceLevelByIds(userClearanceLevels)
            : java.util.Collections.EMPTY_SET;

        entity.setUserClearanceLevels(userClearanceLevelsEntities);

        final java.util.Set loginSessionsEntities = (loginSessions != null && loginSessions.length > 0)
            ? this.findLoginSessionByIds(loginSessions)
            : java.util.Collections.EMPTY_SET;

        entity.setLoginSessions(loginSessionsEntities);


        return (com.jrsystems.jrbase.user.User)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.user.User readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserImpl.class);

            if (photo != null)
            criteria.add(Expression.eq("photo", photo));
            if (status != null)
            criteria.add(Expression.eq("status", status));
            if (username != null)
                criteria.add(Expression.ilike("username", username, MatchMode.START));
            if (password != null)
                criteria.add(Expression.ilike("password", password, MatchMode.START));
            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (email != null)
                criteria.add(Expression.ilike("email", email, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (individual != null) criteria.createCriteria("individual").add(Expression.eq("id", individual));
            if (menus != null && menus.length > 0) criteria.createCriteria("menus").add(Expression.in("id", menus));
            if (programs != null && programs.length > 0) criteria.createCriteria("programs").add(Expression.in("id", programs));
            if (userLocations != null && userLocations.length > 0) criteria.createCriteria("userLocations").add(Expression.in("id", userLocations));
            if (userRoles != null && userRoles.length > 0) criteria.createCriteria("userRoles").add(Expression.in("id", userRoles));
            if (userClearanceLevels != null && userClearanceLevels.length > 0) criteria.createCriteria("userClearanceLevels").add(Expression.in("id", userClearanceLevels));
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
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public byte[] getPhoto(java.lang.Long id)
    {
        try
        {
            byte[] value = null;

            final org.hibernate.Query queryObject = super.getSession(false).createQuery("select entity.photo from com.jrsystems.jrbase.user.User as entity where entity.id = :id");
            queryObject.setParameter("id", id);
            final java.util.Iterator iterator = queryObject.iterate();
            if (iterator.hasNext())
            {
                value = (byte[])iterator.next();
            }

            return value;
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
            lists.put("menus", session.createQuery("select item.id, item.id from com.jrsystems.jrbase.workbench.menu.Menu item order by item.id").list());
            lists.put("programs", session.createQuery("select item.id, item.programId from com.jrsystems.jrbase.workbench.program.Program item order by item.programId").list());
            lists.put("userLocations", session.createQuery("select item.id, item.id from com.jrsystems.jrbase.user.UserLocation item order by item.id").list());
            lists.put("userRoles", session.createQuery("select item.id, item.roleCode from com.jrsystems.jrbase.role.Role item order by item.roleCode").list());
            lists.put("userClearanceLevels", session.createQuery("select item.id, item.levelCode from com.jrsystems.jrbase.clearancelevel.ClearanceLevel item order by item.levelCode").list());
            lists.put("loginSessions", session.createQuery("select item.id, item.id from com.jrsystems.jrbase.loginsession.LoginSession item order by item.id").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.user.User update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
    {
        final com.jrsystems.jrbase.user.User entity = this.getDao().load(id);

        entity.setPhoto(photo);
        entity.setStatus(status);
        entity.setUsername(username);
        entity.setPassword(password);
        entity.setName(name);
        entity.setEmail(email);
        com.jrsystems.jrbase.individual.Individual individualEntity = null;
        if (individual != null)
        {
            individualEntity = getIndividualDao().load(individual);
        }

        entity.setIndividual(individualEntity);

        final java.util.Set menusEntities = (menus != null && menus.length > 0)
            ? this.findMenuByIds(menus)
            : java.util.Collections.EMPTY_SET;

        entity.setMenus(menusEntities);

        final java.util.Set programsEntities = (programs != null && programs.length > 0)
            ? this.findProgramByIds(programs)
            : java.util.Collections.EMPTY_SET;

        entity.setPrograms(programsEntities);

        final java.util.Set userLocationsEntities = (userLocations != null && userLocations.length > 0)
            ? this.findUserLocationByIds(userLocations)
            : java.util.Collections.EMPTY_SET;

        entity.setUserLocations(userLocationsEntities);

        final java.util.Set userRolesEntities = (userRoles != null && userRoles.length > 0)
            ? this.findRoleByIds(userRoles)
            : java.util.Collections.EMPTY_SET;

        entity.setUserRoles(userRolesEntities);

        final java.util.Set userClearanceLevelsEntities = (userClearanceLevels != null && userClearanceLevels.length > 0)
            ? this.findClearanceLevelByIds(userClearanceLevels)
            : java.util.Collections.EMPTY_SET;

        entity.setUserClearanceLevels(userClearanceLevelsEntities);

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