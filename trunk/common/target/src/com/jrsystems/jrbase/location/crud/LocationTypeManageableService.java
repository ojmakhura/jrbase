// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public interface LocationTypeManageableService
{
    public com.jrsystems.jrbase.location.crud.LocationTypeValueObject create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
        throws Exception;

    public com.jrsystems.jrbase.location.crud.LocationTypeValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.location.crud.LocationTypeValueObject update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
