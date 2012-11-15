// license-header java merge-point
package com.jrsystems.jrbase.clearancelevel.crud;

public final class ClearanceLevelManageableServiceBase
    implements ClearanceLevelManageableService
{
    private com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableDao dao;

    public void setDao(com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject create(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
        throws Exception
    {
        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableService.create(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel) - 'levelCode' can not be null");
        }

        if (levelDescription == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableService.create(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel) - 'levelDescription' can not be null");
        }

        return toValueObject(dao.create(levelCode, levelDescription, id, clearedUsers, clearedRoles, lowerLevel, upperLevel));
    }

    public com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
        throws Exception
    {
        return toValueObjects(dao.read(levelCode, levelDescription, id, clearedUsers, clearedRoles, lowerLevel, upperLevel));
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

    public com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel)
        throws Exception
    {
        if (levelCode == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableService.update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel) - 'levelCode' can not be null");
        }

        if (levelDescription == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableService.update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel) - 'levelDescription' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableService.update(java.lang.String levelCode, java.lang.String levelDescription, java.lang.Long id, java.lang.Long[] clearedUsers, java.lang.Long[] clearedRoles, java.lang.Long lowerLevel, java.lang.Long upperLevel) - 'id' can not be null");
        }

        return toValueObject(dao.update(levelCode, levelDescription, id, clearedUsers, clearedRoles, lowerLevel, upperLevel));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.clearancelevel.ClearanceLevel)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject toValueObject(com.jrsystems.jrbase.clearancelevel.ClearanceLevel entity)
    {
        final com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject valueObject = new com.jrsystems.jrbase.clearancelevel.crud.ClearanceLevelValueObject();

        valueObject.setLevelCode(entity.getLevelCode());
        valueObject.setLevelDescription(entity.getLevelDescription());
        valueObject.setId(entity.getId());

        final java.util.Collection clearedUsers = entity.getClearedUsers();
        if (clearedUsers == null || clearedUsers.isEmpty())
        {
            valueObject.setClearedUsers(null);
            valueObject.setClearedUsersLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[clearedUsers.size()];
            final java.lang.String[] labels = new java.lang.String[clearedUsers.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = clearedUsers.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.user.User element = (com.jrsystems.jrbase.user.User)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getUsername();
            }
            valueObject.setClearedUsers(values);
            valueObject.setClearedUsersLabels(labels);
        }

        final java.util.Collection clearedRoles = entity.getClearedRoles();
        if (clearedRoles == null || clearedRoles.isEmpty())
        {
            valueObject.setClearedRoles(null);
            valueObject.setClearedRolesLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[clearedRoles.size()];
            final java.lang.String[] labels = new java.lang.String[clearedRoles.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = clearedRoles.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.role.Role element = (com.jrsystems.jrbase.role.Role)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getRoleCode();
            }
            valueObject.setClearedRoles(values);
            valueObject.setClearedRolesLabels(labels);
        }

        final com.jrsystems.jrbase.clearancelevel.ClearanceLevel lowerLevel = entity.getLowerLevel();
        if (lowerLevel != null)
        {
            valueObject.setLowerLevel(lowerLevel.getId());
            valueObject.setLowerLevelLabel(lowerLevel.getLevelCode());
        }

        final com.jrsystems.jrbase.clearancelevel.ClearanceLevel upperLevel = entity.getUpperLevel();
        if (upperLevel != null)
        {
            valueObject.setUpperLevel(upperLevel.getId());
            valueObject.setUpperLevelLabel(upperLevel.getLevelCode());
        }

        return valueObject;
    }
}
