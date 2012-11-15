// license-header java merge-point
package com.jrsystems.jrbase.counter.crud;

public class CounterValueObject
    implements java.io.Serializable
{
    private java.lang.String counterName;

    public java.lang.String getCounterName()
    {
        return this.counterName;
    }

    public void setCounterName(java.lang.String counterName)
    {
        this.counterName = counterName;
    }

    private java.lang.String format;

    public java.lang.String getFormat()
    {
        return this.format;
    }

    public void setFormat(java.lang.String format)
    {
        this.format = format;
    }

    private java.lang.Long currentCount;

    public java.lang.Long getCurrentCount()
    {
        return this.currentCount;
    }

    public void setCurrentCount(java.lang.Long currentCount)
    {
        this.currentCount = currentCount;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

}