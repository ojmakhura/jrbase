// license-header java merge-point
package com.jrsystems.jrbase.clearancelevel.crud;

public interface ClearanceLevelManageableDao
{
    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel create(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel);

    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel readById(java.lang.Long id);

    public java.util.List read(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel);

    public void delete(java.lang.Long[] ids);

}