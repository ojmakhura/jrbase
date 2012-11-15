// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public class LocationTypeValueObject
    implements java.io.Serializable
{
    private java.lang.String levelCode;

    public java.lang.String getLevelCode()
    {
        return this.levelCode;
    }

    public void setLevelCode(java.lang.String levelCode)
    {
        this.levelCode = levelCode;
    }

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String description;

    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
    }

    private com.jrsystems.jrbase.location.LocationStatus status;

    public com.jrsystems.jrbase.location.LocationStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(com.jrsystems.jrbase.location.LocationStatus status)
    {
        this.status = status;
    }

    private com.jrsystems.jrbase.location.Type type;

    public com.jrsystems.jrbase.location.Type getType()
    {
        return this.type;
    }

    public void setType(com.jrsystems.jrbase.location.Type type)
    {
        this.type = type;
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

    private java.lang.Long fallsWithinLocationType;

    public java.lang.Long getFallsWithinLocationType()
    {
        return this.fallsWithinLocationType;
    }

    public void setFallsWithinLocationType(java.lang.Long fallsWithinLocationType)
    {
        this.fallsWithinLocationType = fallsWithinLocationType;
    }

    private java.lang.String fallsWithinLocationTypeLabel;

    public java.lang.String getFallsWithinLocationTypeLabel()
    {
        return this.fallsWithinLocationTypeLabel;
    }

    public void setFallsWithinLocationTypeLabel(java.lang.String fallsWithinLocationTypeLabel)
    {
        this.fallsWithinLocationTypeLabel = fallsWithinLocationTypeLabel;
    }

    private java.lang.Long[] locationTypes;

    public java.lang.Long[] getLocationTypes()
    {
        return this.locationTypes;
    }

    public void setLocationTypes(java.lang.Long[] locationTypes)
    {
        this.locationTypes = locationTypes;
    }

    private java.lang.String[] locationTypesLabels;

    public java.lang.String[] getLocationTypesLabels()
    {
        return this.locationTypesLabels;
    }

    public void setLocationTypesLabels(java.lang.String[] locationTypesLabels)
    {
        this.locationTypesLabels = locationTypesLabels;
    }

    private java.lang.Long[] locations;

    public java.lang.Long[] getLocations()
    {
        return this.locations;
    }

    public void setLocations(java.lang.Long[] locations)
    {
        this.locations = locations;
    }

    private java.lang.String[] locationsLabels;

    public java.lang.String[] getLocationsLabels()
    {
        return this.locationsLabels;
    }

    public void setLocationsLabels(java.lang.String[] locationsLabels)
    {
        this.locationsLabels = locationsLabels;
    }

}