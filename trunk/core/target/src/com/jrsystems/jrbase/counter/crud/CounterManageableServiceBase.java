// license-header java merge-point
package com.jrsystems.jrbase.counter.crud;

public final class CounterManageableServiceBase
    implements CounterManageableService
{
    private com.jrsystems.jrbase.counter.crud.CounterManageableDao dao;

    public void setDao(com.jrsystems.jrbase.counter.crud.CounterManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.counter.crud.CounterManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.counter.crud.CounterValueObject create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
        throws Exception
    {
        if (counterName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'counterName' can not be null");
        }

        if (format == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'format' can not be null");
        }

        if (currentCount == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'currentCount' can not be null");
        }

        return toValueObject(dao.create(counterName, format, currentCount, id));
    }

    public com.jrsystems.jrbase.counter.crud.CounterValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
        throws Exception
    {
        return toValueObjects(dao.read(counterName, format, currentCount, id));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public com.jrsystems.jrbase.counter.crud.CounterValueObject update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
        throws Exception
    {
        if (counterName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'counterName' can not be null");
        }

        if (format == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'format' can not be null");
        }

        if (currentCount == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'currentCount' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id) - 'id' can not be null");
        }

        return toValueObject(dao.update(counterName, format, currentCount, id));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.counter.crud.CounterManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.counter.Counter)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.counter.crud.CounterValueObject toValueObject(com.jrsystems.jrbase.counter.Counter entity)
    {
        final com.jrsystems.jrbase.counter.crud.CounterValueObject valueObject = new com.jrsystems.jrbase.counter.crud.CounterValueObject();

        valueObject.setCounterName(entity.getCounterName());
        valueObject.setFormat(entity.getFormat());
        valueObject.setCurrentCount(entity.getCurrentCount());
        valueObject.setId(entity.getId());

        return valueObject;
    }
}
