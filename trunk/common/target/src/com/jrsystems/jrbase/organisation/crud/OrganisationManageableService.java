// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public interface OrganisationManageableService
{
    public com.jrsystems.jrbase.organisation.crud.OrganisationValueObject create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
        throws Exception;

    public com.jrsystems.jrbase.organisation.crud.OrganisationValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.organisation.crud.OrganisationValueObject update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
