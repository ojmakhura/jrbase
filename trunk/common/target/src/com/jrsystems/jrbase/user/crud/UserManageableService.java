// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public interface UserManageableService
{
    public com.jrsystems.jrbase.user.crud.UserValueObject create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
        throws Exception;

    public com.jrsystems.jrbase.user.crud.UserValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public byte[] getPhoto(java.lang.Long id)
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.user.crud.UserValueObject update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
