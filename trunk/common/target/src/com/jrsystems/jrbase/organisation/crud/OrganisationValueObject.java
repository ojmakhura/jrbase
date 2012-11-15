// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public class OrganisationValueObject
    implements java.io.Serializable
{
    private java.lang.String registrationRef;

    public java.lang.String getRegistrationRef()
    {
        return this.registrationRef;
    }

    public void setRegistrationRef(java.lang.String registrationRef)
    {
        this.registrationRef = registrationRef;
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

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long organisation;

    public java.lang.Long getOrganisation()
    {
        return this.organisation;
    }

    public void setOrganisation(java.lang.Long organisation)
    {
        this.organisation = organisation;
    }

    private java.lang.String organisationLabel;

    public java.lang.String getOrganisationLabel()
    {
        return this.organisationLabel;
    }

    public void setOrganisationLabel(java.lang.String organisationLabel)
    {
        this.organisationLabel = organisationLabel;
    }

    private java.lang.Long[] organisations;

    public java.lang.Long[] getOrganisations()
    {
        return this.organisations;
    }

    public void setOrganisations(java.lang.Long[] organisations)
    {
        this.organisations = organisations;
    }

    private java.lang.String[] organisationsLabels;

    public java.lang.String[] getOrganisationsLabels()
    {
        return this.organisationsLabels;
    }

    public void setOrganisationsLabels(java.lang.String[] organisationsLabels)
    {
        this.organisationsLabels = organisationsLabels;
    }

    private java.lang.Long organisationType;

    public java.lang.Long getOrganisationType()
    {
        return this.organisationType;
    }

    public void setOrganisationType(java.lang.Long organisationType)
    {
        this.organisationType = organisationType;
    }

    private java.lang.String organisationTypeLabel;

    public java.lang.String getOrganisationTypeLabel()
    {
        return this.organisationTypeLabel;
    }

    public void setOrganisationTypeLabel(java.lang.String organisationTypeLabel)
    {
        this.organisationTypeLabel = organisationTypeLabel;
    }

    private java.lang.Long[] organisationLocations;

    public java.lang.Long[] getOrganisationLocations()
    {
        return this.organisationLocations;
    }

    public void setOrganisationLocations(java.lang.Long[] organisationLocations)
    {
        this.organisationLocations = organisationLocations;
    }

    private java.lang.String[] organisationLocationsLabels;

    public java.lang.String[] getOrganisationLocationsLabels()
    {
        return this.organisationLocationsLabels;
    }

    public void setOrganisationLocationsLabels(java.lang.String[] organisationLocationsLabels)
    {
        this.organisationLocationsLabels = organisationLocationsLabels;
    }

}