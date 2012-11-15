// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public final class OrganisationManageableServiceBase
    implements OrganisationManageableService
{
    private com.jrsystems.jrbase.organisation.crud.OrganisationManageableDao dao;

    public void setDao(com.jrsystems.jrbase.organisation.crud.OrganisationManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.organisation.crud.OrganisationManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.organisation.crud.OrganisationValueObject create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
        throws Exception
    {
        if (registrationRef == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'registrationRef' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'name' can not be null");
        }

        if (organisationType == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.create(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'organisationType' can not be null");
        }

        return toValueObject(dao.create(registrationRef, name, description, id, organisation, organisations, organisationType, organisationLocations));
    }

    public com.jrsystems.jrbase.organisation.crud.OrganisationValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
        throws Exception
    {
        return toValueObjects(dao.read(registrationRef, name, description, id, organisation, organisations, organisationType, organisationLocations));
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

    public com.jrsystems.jrbase.organisation.crud.OrganisationValueObject update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations)
        throws Exception
    {
        if (registrationRef == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'registrationRef' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'id' can not be null");
        }

        if (organisationType == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.update(java.lang.String registrationRef, java.lang.String name, java.lang.String description, java.lang.Long id, java.lang.Long organisation, java.lang.Long[] organisations, java.lang.Long organisationType, java.lang.Long[] organisationLocations) - 'organisationType' can not be null");
        }

        return toValueObject(dao.update(registrationRef, name, description, id, organisation, organisations, organisationType, organisationLocations));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.organisation.crud.OrganisationManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.organisation.Organisation)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.organisation.crud.OrganisationValueObject toValueObject(com.jrsystems.jrbase.organisation.Organisation entity)
    {
        final com.jrsystems.jrbase.organisation.crud.OrganisationValueObject valueObject = new com.jrsystems.jrbase.organisation.crud.OrganisationValueObject();

        valueObject.setRegistrationRef(entity.getRegistrationRef());
        valueObject.setName(entity.getName());
        valueObject.setDescription(entity.getDescription());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.organisation.Organisation organisation = entity.getOrganisation();
        if (organisation != null)
        {
            valueObject.setOrganisation(organisation.getId());
            valueObject.setOrganisationLabel(organisation.getRegistrationRef());
        }

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

        final com.jrsystems.jrbase.organisation.OrganisationType organisationType = entity.getOrganisationType();
        if (organisationType != null)
        {
            valueObject.setOrganisationType(organisationType.getId());
            valueObject.setOrganisationTypeLabel(organisationType.getLevelCode());
        }

        final java.util.Collection organisationLocations = entity.getOrganisationLocations();
        if (organisationLocations == null || organisationLocations.isEmpty())
        {
            valueObject.setOrganisationLocations(null);
            valueObject.setOrganisationLocationsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[organisationLocations.size()];
            final java.lang.String[] labels = new java.lang.String[organisationLocations.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = organisationLocations.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.location.Location element = (com.jrsystems.jrbase.location.Location)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getUniqueCode();
            }
            valueObject.setOrganisationLocations(values);
            valueObject.setOrganisationLocationsLabels(labels);
        }

        return valueObject;
    }
}
