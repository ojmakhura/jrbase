// license-header java merge-point
package com.jrsystems.jrbase.counter.crud;

public interface CounterManageableDao
{
    public com.jrsystems.jrbase.counter.Counter create(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id);

    public com.jrsystems.jrbase.counter.Counter readById(java.lang.Long id);

    public java.util.List read(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id);

    public java.util.List readAll();

    public com.jrsystems.jrbase.counter.Counter update(java.lang.String counterName, java.lang.String format, java.lang.Long currentCount, java.lang.Long id);

    public void delete(java.lang.Long[] ids);

}