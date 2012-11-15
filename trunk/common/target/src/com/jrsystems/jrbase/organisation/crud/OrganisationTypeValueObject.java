// license-header java merge-point
package com.jrsystems.jrbase.organisation.crud;

public class OrganisationTypeValueObject
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

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
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

}