// license-header java merge-point
package com.jrsystems.jrbase.clearancelevel.crud;

public interface ClearanceLevelManageableService
{
    public com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject create(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
        throws Exception;

    public com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
