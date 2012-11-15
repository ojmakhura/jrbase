// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public interface OrganisationManageableDao
{
    public com.jrsystems.jrbase.organisation.Organisation create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations);

    public com.jrsystems.jrbase.organisation.Organisation readById(java.lang.Long id);

    public java.util.List read(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.organisation.Organisation update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations);

    public void delete(java.lang.Long[] ids);

}