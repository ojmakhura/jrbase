// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public final class LocationManageableServiceBase
    implements LocationManageableService
{
    private com.jrsystems.jrbase.location.crud.LocationManageableDao dao;

    public void setDao(com.jrsystems.jrbase.location.crud.LocationManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.location.crud.LocationManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.location.crud.LocationValueObject create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
        throws Exception
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'status' can not be null");
        }

        if (type == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'type' can not be null");
        }

        if (uniqueCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'uniqueCode' can not be null");
        }

        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'levelCode' can not be null");
        }

        if (locationName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'locationName' can not be null");
        }

        if (individual == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'individual' can not be null");
        }

        if (locationType == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.create(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'locationType' can not be null");
        }

        return toValueObject(dao.create(status, type, uniqueCode, levelCode, locationName, description, id, individual, individualOwners, locationOrganisations, locationType, fallsWithinArea, locations, loginSessions));
    }

    public com.jrsystems.jrbase.location.crud.LocationValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
        throws Exception
    {
        return toValueObjects(dao.read(status, type, uniqueCode, levelCode, locationName, description, id, individual, individualOwners, locationOrganisations, locationType, fallsWithinArea, locations, loginSessions));
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

    public com.jrsystems.jrbase.location.crud.LocationValueObject update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions)
        throws Exception
    {
        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'status' can not be null");
        }

        if (type == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'type' can not be null");
        }

        if (uniqueCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'uniqueCode' can not be null");
        }

        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'levelCode' can not be null");
        }

        if (locationName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'locationName' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'id' can not be null");
        }

        if (individual == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'individual' can not be null");
        }

        if (locationType == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.update(com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.String uniqueCode, java.lang.String levelCode, java.lang.String locationName, java.lang.String description, java.lang.Long id, java.lang.Long individual, java.lang.Long[] individualOwners, java.lang.Long[] locationOrganisations, java.lang.Long locationType, java.lang.Long fallsWithinArea, java.lang.Long[] locations, java.lang.Long[] loginSessions) - 'locationType' can not be null");
        }

        return toValueObject(dao.update(status, type, uniqueCode, levelCode, locationName, description, id, individual, individualOwners, locationOrganisations, locationType, fallsWithinArea, locations, loginSessions));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.location.Location)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.location.crud.LocationValueObject toValueObject(com.jrsystems.jrbase.location.Location entity)
    {
        final com.jrsystems.jrbase.location.crud.LocationValueObject valueObject = new com.jrsystems.jrbase.location.crud.LocationValueObject();

        valueObject.setStatus(entity.getStatus());
        valueObject.setType(entity.getType());
        valueObject.setUniqueCode(entity.getUniqueCode());
        valueObject.setLevelCode(entity.getLevelCode());
        valueObject.setLocationName(entity.getLocationName());
        valueObject.setDescription(entity.getDescription());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.individual.Individual individual = entity.getIndividual();
        if (individual != null)
        {
            valueObject.setIndividual(individual.getId());
            valueObject.setIndividualLabel(individual.getIndividualId());
        }

        final java.util.Collection individualOwners = entity.getIndividualOwners();
        if (individualOwners == null || individualOwners.isEmpty())
        {
            valueObject.setIndividualOwners(null);
            valueObject.setIndividualOwnersLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[individualOwners.size()];
            final java.lang.String[] labels = new java.lang.String[individualOwners.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = individualOwners.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.individual.Individual element = (com.jrsystems.jrbase.individual.Individual)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getIndividualId();
            }
            valueObject.setIndividualOwners(values);
            valueObject.setIndividualOwnersLabels(labels);
        }

        final java.util.Collection locationOrganisations = entity.getLocationOrganisations();
        if (locationOrganisations == null || locationOrganisations.isEmpty())
        {
            valueObject.setLocationOrganisations(null);
            valueObject.setLocationOrganisationsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[locationOrganisations.size()];
            final java.lang.String[] labels = new java.lang.String[locationOrganisations.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = locationOrganisations.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.organisation.Organisation element = (com.jrsystems.jrbase.organisation.Organisation)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getRegistrationRef();
            }
            valueObject.setLocationOrganisations(values);
            valueObject.setLocationOrganisationsLabels(labels);
        }

        final com.jrsystems.jrbase.location.LocationType locationType = entity.getLocationType();
        if (locationType != null)
        {
            valueObject.setLocationType(locationType.getId());
            valueObject.setLocationTypeLabel(locationType.getLevelCode());
        }

        final com.jrsystems.jrbase.location.Location fallsWithinArea = entity.getFallsWithinArea();
        if (fallsWithinArea != null)
        {
            valueObject.setFallsWithinArea(fallsWithinArea.getId());
            valueObject.setFallsWithinAreaLabel(fallsWithinArea.getUniqueCode());
        }

        final java.util.Collection locations = entity.getLocations();
        if (locations == null || locations.isEmpty())
        {
            valueObject.setLocations(null);
            valueObject.setLocationsLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[locations.size()];
            final java.lang.String[] labels = new java.lang.String[locations.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = locations.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.location.Location element = (com.jrsystems.jrbase.location.Location)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getUniqueCode();
            }
            valueObject.setLocations(values);
            valueObject.setLocationsLabels(labels);
        }

        final java.util.Collection loginSessions = entity.getLoginSessions();
        if (loginSessions == null || loginSessions.isEmpty())
        {
            valueObject.setLoginSessions(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[loginSessions.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = loginSessions.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.loginsession.LoginSession element = (com.jrsystems.jrbase.loginsession.LoginSession)iterator.next();
                values[counter] = element.getId();
            }
            valueObject.setLoginSessions(values);
        }

        return valueObject;
    }
}
