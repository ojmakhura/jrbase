// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public interface OrganisationTypeManageableDao
{
    public com.jrsystems.jrbase.organisation.OrganisationType create(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations);

    public com.jrsystems.jrbase.organisation.OrganisationType readById(java.lang.Long id);

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.organisation.OrganisationType update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations);

    public void delete(java.lang.Long[] ids);

}