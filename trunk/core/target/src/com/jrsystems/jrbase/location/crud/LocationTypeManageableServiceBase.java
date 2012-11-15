// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public final class LocationTypeManageableServiceBase
    implements LocationTypeManageableService
{
    private com.jrsystems.jrbase.location.crud.LocationTypeManageableDao dao;

    public void setDao(com.jrsystems.jrbase.location.crud.LocationTypeManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.location.crud.LocationTypeManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.location.crud.LocationTypeValueObject create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
        throws Exception
    {
        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'levelCode' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'name' can not be null");
        }

        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'status' can not be null");
        }

        if (type == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.create(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'type' can not be null");
        }

        return toValueObject(dao.create(levelCode, name, description, status, type, id, fallsWithinLocationType, locationTypes, locations));
    }

    public com.jrsystems.jrbase.location.crud.LocationTypeValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
        throws Exception
    {
        return toValueObjects(dao.read(levelCode, name, description, status, type, id, fallsWithinLocationType, locationTypes, locations));
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

    public com.jrsystems.jrbase.location.crud.LocationTypeValueObject update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations)
        throws Exception
    {
        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'levelCode' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'name' can not be null");
        }

        if (status == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'status' can not be null");
        }

        if (type == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'type' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.update(java.lang.String levelCode, java.lang.String name, java.lang.String description, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.Type type, java.lang.Long id, java.lang.Long fallsWithinLocationType, java.lang.Long[] locationTypes, java.lang.Long[] locations) - 'id' can not be null");
        }

        return toValueObject(dao.update(levelCode, name, description, status, type, id, fallsWithinLocationType, locationTypes, locations));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.location.crud.LocationTypeManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.location.LocationType)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.location.crud.LocationTypeValueObject toValueObject(com.jrsystems.jrbase.location.LocationType entity)
    {
        final com.jrsystems.jrbase.location.crud.LocationTypeValueObject valueObject = new com.jrsystems.jrbase.location.crud.LocationTypeValueObject();

        valueObject.setLevelCode(entity.getLevelCode());
        valueObject.setName(entity.getName());
        valueObject.setDescription(entity.getDescription());
        valueObject.setStatus(entity.getStatus());
        valueObject.setType(entity.getType());
        valueObject.setId(entity.getId());

        final com.jrsystems.jrbase.location.LocationType fallsWithinLocationType = entity.getFallsWithinLocationType();
        if (fallsWithinLocationType != null)
        {
            valueObject.setFallsWithinLocationType(fallsWithinLocationType.getId());
            valueObject.setFallsWithinLocationTypeLabel(fallsWithinLocationType.getLevelCode());
        }

        final java.util.Collection locationTypes = entity.getLocationTypes();
        if (locationTypes == null || locationTypes.isEmpty())
        {
            valueObject.setLocationTypes(null);
            valueObject.setLocationTypesLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[locationTypes.size()];
            final java.lang.String[] labels = new java.lang.String[locationTypes.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = locationTypes.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.location.LocationType element = (com.jrsystems.jrbase.location.LocationType)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getLevelCode();
            }
            valueObject.setLocationTypes(values);
            valueObject.setLocationTypesLabels(labels);
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

        return valueObject;
    }
}
