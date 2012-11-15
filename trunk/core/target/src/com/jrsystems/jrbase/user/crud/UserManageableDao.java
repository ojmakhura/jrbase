// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public interface UserManageableDao
{
    public com.jrsystems.jrbase.user.User create(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions);

    public com.jrsystems.jrbase.user.User readById(java.lang.Long id);

    public java.util.List read(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions);

    public java.util.List readAll();

    public byte[] getPhoto(java.lang.Long id);

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.user.User update(byte[] photo, com.jrsystems.jrbase.user.UserStatus status, java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.Long id, java.lang.Long individual, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] userLocations, java.lang.Long[] userRoles, java.lang.Long[] userClearanceLevels, java.lang.Long[] loginSessions);

    public void delete(java.lang.Long[] ids);

}