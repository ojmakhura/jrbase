// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.jrsystems.jrbase.location.vo;

/**
 * 
 */
public class LocationTypeSearchCriteria
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 8843942206583960254L;

    public LocationTypeSearchCriteria()
    {
    }

    public LocationTypeSearchCriteria(com.jrsystems.jrbase.location.LocationStatus status, java.lang.String levelCode, java.lang.String name)
    {
        this.status = status;
        this.levelCode = levelCode;
        this.name = name;
    }

    public LocationTypeSearchCriteria(com.jrsystems.jrbase.location.LocationStatus status, java.lang.String levelCode, java.lang.String name, java.lang.String description)
    {
        this.status = status;
        this.levelCode = levelCode;
        this.name = name;
        this.description = description;
    }

    /**
     * Copies constructor from other LocationTypeSearchCriteria
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public LocationTypeSearchCriteria(LocationTypeSearchCriteria otherBean)
    {
        this(otherBean.getStatus(), otherBean.getLevelCode(), otherBean.getName(), otherBean.getDescription());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(LocationTypeSearchCriteria otherBean)
    {
        if (otherBean != null)
        {
            this.setStatus(otherBean.getStatus());
            this.setLevelCode(otherBean.getLevelCode());
            this.setName(otherBean.getName());
            this.setDescription(otherBean.getDescription());
        }
    }

    private com.jrsystems.jrbase.location.LocationStatus status;

    /**
     * 
     */
    public com.jrsystems.jrbase.location.LocationStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(com.jrsystems.jrbase.location.LocationStatus status)
    {
        this.status = status;
    }

    private java.lang.String levelCode;

    /**
     * 
     */
    public java.lang.String getLevelCode()
    {
        return this.levelCode;
    }

    public void setLevelCode(java.lang.String levelCode)
    {
        this.levelCode = levelCode;
    }

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String description;

    /**
     * 
     */
    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
    }

    // com.jrsystems.jrbase.location.vo.LocationTypeSearchCriteria value-object java merge-point
}