// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public final class OrganisationTypeManageableServiceBase
    implements OrganisationTypeManageableService
{
    private com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableDao dao;

    public void setDao(com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject create(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
        throws Exception
    {
        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableService.create(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations) - 'levelCode' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableService.create(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations) - 'name' can not be null");
        }

        return toValueObject(dao.create(levelCode, name, description, id, organisations));
    }

    public com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
        throws Exception
    {
        return toValueObjects(dao.read(levelCode, name, description, id, organisations));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public java.util.Map readBackingLists()
        throws Exception
    {
        return getDao().readBackingLists();
    }

    public com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations)
        throws Exception
    {
        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations) - 'levelCode' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long[] organisations) - 'id' can not be null");
        }

        return toValueObject(dao.update(levelCode, name, description, id, organisations));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationTypeManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.organisation.OrganisationType)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject toValueObject(com.jrsystems.jrbase.organisation.OrganisationType entity)
    {
        final com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject valueObject = new com.jrsystems.jrbase.organisation.crud.OrganisationTypeValueObject();

        valueObject.setLevelCode(entity.getLevelCode());
        valueObject.setName(entity.getName());
        valueObject.setDescription(entity.getDescription());
        valueObject.setId(entity.getId());

        final java.util.Collection organisations = entity.getOrganisations();
        if (organisations == null || organisations.isEmpty())
        {
            valueObject.setOrganisations(null);
            valueObject.setOrganisationsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[organisations.size()];
            final java.lang.String[] labels = new java.lang.String[organisations.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = organisations.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.organisation.Organisation element = (com.jrsystems.jrbase.organisation.Organisation)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getRegistrationRef();
            }
            valueObject.setOrganisations(values);
            valueObject.setOrganisationsLabels(labels);
        }

        return valueObject;
    }
}
