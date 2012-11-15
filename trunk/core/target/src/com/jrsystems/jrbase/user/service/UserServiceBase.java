// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package com.jrsystems.jrbase.user.service;

/**
 * <p>
 * Spring Service base class for <code>com.jrsystems.jrbase.user.service.UserService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see com.jrsystems.jrbase.user.service.UserService
 */
public abstract class UserServiceBase
    implements com.jrsystems.jrbase.user.service.UserService
{

    private com.jrsystems.jrbase.user.UserDao userDao;

    /**
     * Sets the reference to <code>user</code>'s DAO.
     */
    public void setUserDao(com.jrsystems.jrbase.user.UserDao userDao)
    {
        this.userDao = userDao;
    }

    /**
     * Gets the reference to <code>user</code>'s DAO.
     */
    protected com.jrsystems.jrbase.user.UserDao getUserDao()
    {
        return this.userDao;
    }

    private com.jrsystems.jrbase.user.UserLocationDao userLocationDao;

    /**
     * Sets the reference to <code>userLocation</code>'s DAO.
     */
    public void setUserLocationDao(com.jrsystems.jrbase.user.UserLocationDao userLocationDao)
    {
        this.userLocationDao = userLocationDao;
    }

    /**
     * Gets the reference to <code>userLocation</code>'s DAO.
     */
    protected com.jrsystems.jrbase.user.UserLocationDao getUserLocationDao()
    {
        return this.userLocationDao;
    }

    private com.jrsystems.jrbase.location.LocationDao locationDao;

    /**
     * Sets the reference to <code>location</code>'s DAO.
     */
    public void setLocationDao(com.jrsystems.jrbase.location.LocationDao locationDao)
    {
        this.locationDao = locationDao;
    }

    /**
     * Gets the reference to <code>location</code>'s DAO.
     */
    protected com.jrsystems.jrbase.location.LocationDao getLocationDao()
    {
        return this.locationDao;
    }

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#saveUser(com.jrsystems.jrbase.user.vo.UserVO)
     */
    public com.jrsystems.jrbase.user.vo.UserVO saveUser(final com.jrsystems.jrbase.user.vo.UserVO userVO)
    {
        if (userVO == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO' can not be null");
        }
        if (userVO.getStatus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.status' can not be null");
        }
        if (userVO.getName() == null || userVO.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.name' can not be null or empty");
        }
        if (userVO.getPassword() == null || userVO.getPassword().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.password' can not be null or empty");
        }
        if (userVO.getUserId() == null || userVO.getUserId().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userId' can not be null or empty");
        }
        if (userVO.getUsername() == null || userVO.getUsername().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.username' can not be null or empty");
        }
        if (userVO.getIndividualRecord() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.individualRecord' can not be null");
        }
        if (userVO.getUserClearanceLevels() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userClearanceLevels' can not be null");
        }
        if (userVO.getUserLocations() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userLocations' can not be null");
        }
        if (userVO.getUserPrograms() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userPrograms' can not be null");
        }
        if (userVO.getUserMenus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userMenus' can not be null");
        }
        try
        {
            return this.handleSaveUser(userVO);
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.saveUser(com.jrsystems.jrbase.user.vo.UserVO userVO)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #saveUser(com.jrsystems.jrbase.user.vo.UserVO)}
      */
    protected abstract com.jrsystems.jrbase.user.vo.UserVO handleSaveUser(com.jrsystems.jrbase.user.vo.UserVO userVO)
        throws java.lang.Exception;

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#removeUser(com.jrsystems.jrbase.user.vo.UserVO)
     */
    public void removeUser(final com.jrsystems.jrbase.user.vo.UserVO userVO)
    {
        if (userVO == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO' can not be null");
        }
        if (userVO.getStatus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.status' can not be null");
        }
        if (userVO.getName() == null || userVO.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.name' can not be null or empty");
        }
        if (userVO.getPassword() == null || userVO.getPassword().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.password' can not be null or empty");
        }
        if (userVO.getUserId() == null || userVO.getUserId().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userId' can not be null or empty");
        }
        if (userVO.getUsername() == null || userVO.getUsername().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.username' can not be null or empty");
        }
        if (userVO.getIndividualRecord() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.individualRecord' can not be null");
        }
        if (userVO.getUserClearanceLevels() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userClearanceLevels' can not be null");
        }
        if (userVO.getUserLocations() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userLocations' can not be null");
        }
        if (userVO.getUserPrograms() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userPrograms' can not be null");
        }
        if (userVO.getUserMenus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userMenus' can not be null");
        }
        try
        {
            this.handleRemoveUser(userVO);
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.removeUser(com.jrsystems.jrbase.user.vo.UserVO userVO)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #removeUser(com.jrsystems.jrbase.user.vo.UserVO)}
      */
    protected abstract void handleRemoveUser(com.jrsystems.jrbase.user.vo.UserVO userVO)
        throws java.lang.Exception;

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#getAllUsers()
     */
    public java.util.List getAllUsers()
    {
        try
        {
            return this.handleGetAllUsers();
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.getAllUsers()' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getAllUsers()}
      */
    protected abstract java.util.List handleGetAllUsers()
        throws java.lang.Exception;

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#getUsersByStatus(com.jrsystems.jrbase.user.UserStatus)
     */
    public java.util.List getUsersByStatus(final com.jrsystems.jrbase.user.UserStatus status)
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUsersByStatus(com.jrsystems.jrbase.user.UserStatus status) - 'status' can not be null");
        }
        try
        {
            return this.handleGetUsersByStatus(status);
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.getUsersByStatus(com.jrsystems.jrbase.user.UserStatus status)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getUsersByStatus(com.jrsystems.jrbase.user.UserStatus)}
      */
    protected abstract java.util.List handleGetUsersByStatus(com.jrsystems.jrbase.user.UserStatus status)
        throws java.lang.Exception;

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#getUserDetails(java.lang.String)
     */
    public com.jrsystems.jrbase.user.vo.UserVO getUserDetails(final java.lang.String username)
    {
        if (username == null || username.trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserDetails(java.lang.String username) - 'username' can not be null or empty");
        }
        try
        {
            return this.handleGetUserDetails(username);
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.getUserDetails(java.lang.String username)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getUserDetails(java.lang.String)}
      */
    protected abstract com.jrsystems.jrbase.user.vo.UserVO handleGetUserDetails(java.lang.String username)
        throws java.lang.Exception;

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#getUserLocations(com.jrsystems.jrbase.user.vo.UserVO)
     */
    public java.util.List getUserLocations(final com.jrsystems.jrbase.user.vo.UserVO userVO)
    {
        if (userVO == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO' can not be null");
        }
        if (userVO.getStatus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.status' can not be null");
        }
        if (userVO.getName() == null || userVO.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.name' can not be null or empty");
        }
        if (userVO.getPassword() == null || userVO.getPassword().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.password' can not be null or empty");
        }
        if (userVO.getUserId() == null || userVO.getUserId().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userId' can not be null or empty");
        }
        if (userVO.getUsername() == null || userVO.getUsername().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.username' can not be null or empty");
        }
        if (userVO.getIndividualRecord() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.individualRecord' can not be null");
        }
        if (userVO.getUserClearanceLevels() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userClearanceLevels' can not be null");
        }
        if (userVO.getUserLocations() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userLocations' can not be null");
        }
        if (userVO.getUserPrograms() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userPrograms' can not be null");
        }
        if (userVO.getUserMenus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userMenus' can not be null");
        }
        try
        {
            return this.handleGetUserLocations(userVO);
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.getUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getUserLocations(com.jrsystems.jrbase.user.vo.UserVO)}
      */
    protected abstract java.util.List handleGetUserLocations(com.jrsystems.jrbase.user.vo.UserVO userVO)
        throws java.lang.Exception;

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO)
     */
    public com.jrsystems.jrbase.user.vo.UserVO getUserCurrentLocation(final com.jrsystems.jrbase.user.vo.UserVO userVO)
    {
        if (userVO == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO' can not be null");
        }
        if (userVO.getStatus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.status' can not be null");
        }
        if (userVO.getName() == null || userVO.getName().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.name' can not be null or empty");
        }
        if (userVO.getPassword() == null || userVO.getPassword().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.password' can not be null or empty");
        }
        if (userVO.getUserId() == null || userVO.getUserId().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userId' can not be null or empty");
        }
        if (userVO.getUsername() == null || userVO.getUsername().trim().length() == 0)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.username' can not be null or empty");
        }
        if (userVO.getIndividualRecord() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.individualRecord' can not be null");
        }
        if (userVO.getUserClearanceLevels() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userClearanceLevels' can not be null");
        }
        if (userVO.getUserLocations() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userLocations' can not be null");
        }
        if (userVO.getUserPrograms() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userPrograms' can not be null");
        }
        if (userVO.getUserMenus() == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO) - 'userVO.userMenus' can not be null");
        }
        try
        {
            return this.handleGetUserCurrentLocation(userVO);
        }
        catch (Throwable th)
        {
            throw new com.jrsystems.jrbase.user.service.UserServiceException(
                "Error performing 'com.jrsystems.jrbase.user.service.UserService.getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #getUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO)}
      */
    protected abstract com.jrsystems.jrbase.user.vo.UserVO handleGetUserCurrentLocation(com.jrsystems.jrbase.user.vo.UserVO userVO)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return com.jrsystems.jrbase.PrincipalStore.get();
    }

    /**
     * Gets the message source available to this service.
     */
    protected org.springframework.context.MessageSource getMessages()
    {
        return (org.springframework.context.MessageSource)
            com.jrsystems.jrbase.BeanLocator.instance().getBean("messageSource");
    }

    /**
     * Gets the message having the given <code>key</code> in the underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     */
    protected String getMessage(final String key)
    {
        return this.getMessages().getMessage(key, null, null);
    }

    /**
     * Gets the message having the given <code>key</code> and <code>arguments</code> in the
     * underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     */
    protected String getMessage(final String key, final Object[] arguments)
    {
        return this.getMessages().getMessage(key, arguments, null);
    }

    /**
     * Gets the message having the given <code>key</code> using the given <code>arguments</code>
     * for the given <code>locale</code>.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @param locale the locale of the messages to retrieve.
     */
    protected String getMessage(
        final java.lang.String key, final java.lang.Object[] arguments,
        final java.util.Locale locale)
    {
        return this.getMessages().getMessage(key, arguments, locale);
    }

}