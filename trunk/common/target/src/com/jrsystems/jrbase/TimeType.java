// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: Enumeration.vsl in andromda-java-cartridge.
//
package com.jrsystems.jrbase;

/**
 * 
 */
public class TimeType
    implements java.io.Serializable, java.lang.Comparable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 2317960439647052939L;

    /**
     * 
     */
    public static final TimeType HOURS = new TimeType("HOURS");

    /**
     * 
     */
    public static final TimeType MINUTES = new TimeType("MINUTES");

    /**
     * 
     */
    public static final TimeType DAYS = new TimeType("DAYS");

    /**
     * 
     */
    public static final TimeType SECONDS = new TimeType("SECONDS");

    private java.lang.String value;

    private TimeType(java.lang.String value)
    {
        this.value = value;
    }

    /**
     * The default constructor allowing
     * super classes to access it.
     */
    protected TimeType()
    {
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return java.lang.String.valueOf(value);
    }

    /**
     * Creates an instance of TimeType from <code>value</code>.
     *
     * @param value the value to create the TimeType from.
     */
    public static TimeType fromString(java.lang.String value)
    {
        final TimeType typeValue = (TimeType)values.get(value);
        if (typeValue == null)
        {
            throw new IllegalArgumentException("invalid value '" + value + "', possible values are: " + literals);
        }
        return typeValue;
    }

    /**
     * Gets the underlying value of this type safe enumeration.
     *
     * @return the underlying value.
     */
    public java.lang.String getValue()
    {
        return this.value;
    }

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object that)
    {
        return (this == that) ? 0 : this.getValue().compareTo(((TimeType)that).getValue());
    }

    /**
     * Returns an unmodifiable list containing the literals that are known by this enumeration.
     *
     * @return A List containing the actual literals defined by this enumeration, this list
     *         can not be modified.
     */
    public static java.util.List literals()
    {
        return literals;
    }

    /**
     * Returns an unmodifiable list containing the names of the literals that are known
     * by this enumeration.
     *
     * @return A List containing the actual names of the literals defined by this
     *         enumeration, this list can not be modified.
     */
    public static java.util.List names()
    {
        return names;
    }
    
    /**
     * Returns an unmodifiable list containing the actual enumeration instance values.
     *
     * @return A List containing the actual enumeration instance values.
     */
    public static java.util.List values()
    {
        return valueList;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object)
    {
        return (this == object)
            || (object instanceof TimeType && ((TimeType)object).getValue().equals(
                this.getValue()));
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode()
    {
        return this.getValue().hashCode();
    }

    /**
     * This method allows the deserialization of an instance of this enumeration type to return the actual instance
     * that will be the singleton for the JVM in which the current thread is running.
     * <p>
     * Doing this will allow users to safely use the equality operator <code>==</code> for enumerations because
     * a regular deserialized object is always a newly constructed instance and will therefore never be
     * an existing reference; it is this <code>readResolve()</code> method which will intercept the deserialization
     * process in order to return the proper singleton reference.
     * <p>
     * This method is documented here:
     * <a href="http://java.sun.com/j2se/1.3/docs/guide/serialization/spec/input.doc6.html">Java
     * Object Serialization Specification</a>
     */
    private java.lang.Object readResolve() throws java.io.ObjectStreamException
    {
        return TimeType.fromString(this.value);
    }

    private static final java.util.Map values = new java.util.LinkedHashMap(4, 1);
    private static java.util.List literals = new java.util.ArrayList(4);
    private static java.util.List names = new java.util.ArrayList(4);
    private static java.util.List valueList = new java.util.ArrayList(4);

    /**
     * Initializes the values.
     */
    static
    {
        values.put(HOURS.value, HOURS);
        valueList.add(HOURS);
        literals.add(HOURS.value);
        names.add("HOURS");
        values.put(MINUTES.value, MINUTES);
        valueList.add(MINUTES);
        literals.add(MINUTES.value);
        names.add("MINUTES");
        values.put(DAYS.value, DAYS);
        valueList.add(DAYS);
        literals.add(DAYS.value);
        names.add("DAYS");
        values.put(SECONDS.value, SECONDS);
        valueList.add(SECONDS);
        literals.add(SECONDS.value);
        names.add("SECONDS");
        valueList = java.util.Collections.unmodifiableList(valueList);
        literals = java.util.Collections.unmodifiableList(literals);
        names = java.util.Collections.unmodifiableList(names);
    }
}