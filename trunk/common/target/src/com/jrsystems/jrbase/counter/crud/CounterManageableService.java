// license-header java merge-point
package com.jrsystems.jrbase.counter.crud;

public interface CounterManageableService
{
    public com.jrsystems.jrbase.counter.crud.CounterValueObject create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
        throws Exception;

    public com.jrsystems.jrbase.counter.crud.CounterValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public com.jrsystems.jrbase.counter.crud.CounterValueObject update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
