// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public interface LocationManageableService
{
    public com.jrsystems.jrbase.location.crud.LocationValueObject create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
        throws Exception;

    public com.jrsystems.jrbase.location.crud.LocationValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.location.crud.LocationValueObject update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
