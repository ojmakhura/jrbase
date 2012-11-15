// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public interface OrganisationTypeManageableService
{
    public com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject create(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
        throws Exception;

    public com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
