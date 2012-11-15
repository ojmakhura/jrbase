// license-header java merge-point
package com.jrsystems.jrbase.location.crud;

public class LocationValueObject
    implements java.io.Serializable
{
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

    private java.lang.String uniqueCode;

    public java.lang.String getUniqueCode()
    {
        return this.uniqueCode;
    }

    public void setUniqueCode(java.lang.String uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }

    private java.lang.String levelCode;

    public java.lang.String getLevelCode()
    {
        return this.levelCode;
    }

    public void setLevelCode(java.lang.String levelCode)
    {
        this.levelCode = levelCode;
    }

    private java.lang.String locationName;

    public java.lang.String getLocationName()
    {
        return this.locationName;
    }

    public void setLocationName(java.lang.String locationName)
    {
        this.locationName = locationName;
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

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long individual;

    public java.lang.Long getIndividual()
    {
        return this.individual;
    }

    public void setIndividual(java.lang.Long individual)
    {
        this.individual = individual;
    }

    private java.lang.String individualLabel;

    public java.lang.String getIndividualLabel()
    {
        return this.individualLabel;
    }

    public void setIndividualLabel(java.lang.String individualLabel)
    {
        this.individualLabel = individualLabel;
    }

    private java.lang.Long[] individualOwners;

    public java.lang.Long[] getIndividualOwners()
    {
        return this.individualOwners;
    }

    public void setIndividualOwners(java.lang.Long[] individualOwners)
    {
        this.individualOwners = individualOwners;
    }

    private java.lang.String[] individualOwnersLabels;

    public java.lang.String[] getIndividualOwnersLabels()
    {
        return this.individualOwnersLabels;
    }

    public void setIndividualOwnersLabels(java.lang.String[] individualOwnersLabels)
    {
        this.individualOwnersLabels = individualOwnersLabels;
    }

    private java.lang.Long[] locationOrganisations;

    public java.lang.Long[] getLocationOrganisations()
    {
        return this.locationOrganisations;
    }

    public void setLocationOrganisations(java.lang.Long[] locationOrganisations)
    {
        this.locationOrganisations = locationOrganisations;
    }

    private java.lang.String[] locationOrganisationsLabels;

    public java.lang.String[] getLocationOrganisationsLabels()
    {
        return this.locationOrganisationsLabels;
    }

    public void setLocationOrganisationsLabels(java.lang.String[] locationOrganisationsLabels)
    {
        this.locationOrganisationsLabels = locationOrganisationsLabels;
    }

    private java.lang.Long locationType;

    public java.lang.Long getLocationType()
    {
        return this.locationType;
    }

    public void setLocationType(java.lang.Long locationType)
    {
        this.locationType = locationType;
    }

    private java.lang.String locationTypeLabel;

    public java.lang.String getLocationTypeLabel()
    {
        return this.locationTypeLabel;
    }

    public void setLocationTypeLabel(java.lang.String locationTypeLabel)
    {
        this.locationTypeLabel = locationTypeLabel;
    }

    private java.lang.Long fallsWithinArea;

    public java.lang.Long getFallsWithinArea()
    {
        return this.fallsWithinArea;
    }

    public void setFallsWithinArea(java.lang.Long fallsWithinArea)
    {
        this.fallsWithinArea = fallsWithinArea;
    }

    private java.lang.String fallsWithinAreaLabel;

    public java.lang.String getFallsWithinAreaLabel()
    {
        return this.fallsWithinAreaLabel;
    }

    public void setFallsWithinAreaLabel(java.lang.String fallsWithinAreaLabel)
    {
        this.fallsWithinAreaLabel = fallsWithinAreaLabel;
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

    private java.lang.Long[] loginSessions;

    public java.lang.Long[] getLoginSessions()
    {
        return this.loginSessions;
    }

    public void setLoginSessions(java.lang.Long[] loginSessions)
    {
        this.loginSessions = loginSessions;
    }

}