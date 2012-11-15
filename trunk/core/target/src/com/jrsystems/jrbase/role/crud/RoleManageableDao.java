// license-header java merge-point
package com.jrsystems.jrbase.role.crud;

public interface RoleManageableDao
{
    public com.jrsystems.jrbase.role.Role create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels);

    public com.jrsystems.jrbase.role.Role readById(java.lang.Long id);

    public java.util.List read(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.role.Role update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels);

    public void delete(java.lang.Long[] ids);

}