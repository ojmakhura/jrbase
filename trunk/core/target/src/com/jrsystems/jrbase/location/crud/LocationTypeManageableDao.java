// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public interface LocationTypeManageableDao
{
    public com.jrsystems.jrbase.location.LocationType create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations);

    public com.jrsystems.jrbase.location.LocationType readById(java.lang.Long id);

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.location.LocationType update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations);

    public void delete(java.lang.Long[] ids);

}