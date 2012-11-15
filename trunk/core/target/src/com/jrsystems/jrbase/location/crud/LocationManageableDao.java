// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public interface LocationManageableDao
{
    public com.jrsystems.jrbase.location.Location create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions);

    public com.jrsystems.jrbase.location.Location readById(java.lang.Long id);

    public java.util.List read(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.location.Location update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions);

    public void delete(java.lang.Long[] ids);

}