// license-header java merge-point
package com.jrsystems.jrbase.role.crud;

public interface RoleManageableService
{
    public com.jrsystems.jrbase.role.crud.RoleValueObject create(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
        throws Exception;

    public com.jrsystems.jrbase.role.crud.RoleValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.role.crud.RoleValueObject update(java.lang.String roleCode, java.lang.String role, java.lang.String roleDescription, java.lang.Long id, java.lang.Long[] users, java.lang.Long[] menus, java.lang.Long[] programs, java.lang.Long[] roleClearanceLevels)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
