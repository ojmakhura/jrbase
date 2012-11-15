// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.jrsystems.jrbase.location.vo;

/**
 * 
 */
public class LocationVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -6570055520239957057L;

    public LocationVO()
    {
    }

    public LocationVO(java.lang.Long id, com.jrsystems.jrbase.location.LocationStatus status, com.jrsystems.jrbase.location.vo.LocationTypeVO locationTypeVO, String description, String locationName, java.lang.String uniqueCode, String levelCode)
    {
        this.id = id;
        this.status = status;
        this.locationTypeVO = locationTypeVO;
        this.description = description;
        this.locationName = locationName;
        this.uniqueCode = uniqueCode;
        this.levelCode = levelCode;
    }

    /**
     * Copies constructor from other LocationVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public LocationVO(LocationVO otherBean)
    {
        this(otherBean.getId(), otherBean.getStatus(), otherBean.getLocationTypeVO(), otherBean.getDescription(), otherBean.getLocationName(), otherBean.getUniqueCode(), otherBean.getLevelCode());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(LocationVO otherBean)
    {
        if (otherBean != null)
        {
            this.setId(otherBean.getId());
            this.setStatus(otherBean.getStatus());
            this.setLocationTypeVO(otherBean.getLocationTypeVO());
            this.setDescription(otherBean.getDescription());
            this.setLocationName(otherBean.getLocationName());
            this.setUniqueCode(otherBean.getUniqueCode());
            this.setLevelCode(otherBean.getLevelCode());
        }
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
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

    private com.jrsystems.jrbase.location.vo.LocationTypeVO locationTypeVO;

    /**
     * 
     */
    public com.jrsystems.jrbase.location.vo.LocationTypeVO getLocationTypeVO()
    {
        return this.locationTypeVO;
    }

    public void setLocationTypeVO(com.jrsystems.jrbase.location.vo.LocationTypeVO locationTypeVO)
    {
        this.locationTypeVO = locationTypeVO;
    }

    private String description;

    /**
     * 
     */
    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private String locationName;

    /**
     * 
     */
    public String getLocationName()
    {
        return this.locationName;
    }

    public void setLocationName(String locationName)
    {
        this.locationName = locationName;
    }

    private java.lang.String uniqueCode;

    /**
     * 
     */
    public java.lang.String getUniqueCode()
    {
        return this.uniqueCode;
    }

    public void setUniqueCode(java.lang.String uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }

    private String levelCode;

    /**
     * 
     */
    public String getLevelCode()
    {
        return this.levelCode;
    }

    public void setLevelCode(String levelCode)
    {
        this.levelCode = levelCode;
    }

    // com.jrsystems.jrbase.location.vo.LocationVO value-object java merge-point
}