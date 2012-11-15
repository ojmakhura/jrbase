// license-header java merge-point
package com.jrsystems.jrbase.individual.crud;

public class IndividualValueObject
    implements java.io.Serializable
{
    private java.lang.String individualId;

    public java.lang.String getIndividualId()
    {
        return this.individualId;
    }

    public void setIndividualId(java.lang.String individualId)
    {
        this.individualId = individualId;
    }

    private java.lang.String idNumber;

    public java.lang.String getIdNumber()
    {
        return this.idNumber;
    }

    public void setIdNumber(java.lang.String idNumber)
    {
        this.idNumber = idNumber;
    }

    private com.jrsystems.jrbase.individual.Salutation salutation;

    public com.jrsystems.jrbase.individual.Salutation getSalutation()
    {
        return this.salutation;
    }

    public void setSalutation(com.jrsystems.jrbase.individual.Salutation salutation)
    {
        this.salutation = salutation;
    }

    private java.lang.String surname;

    public java.lang.String getSurname()
    {
        return this.surname;
    }

    public void setSurname(java.lang.String surname)
    {
        this.surname = surname;
    }

    private java.lang.String firstName;

    public java.lang.String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(java.lang.String firstName)
    {
        this.firstName = firstName;
    }

    private java.lang.String middleNames;

    public java.lang.String getMiddleNames()
    {
        return this.middleNames;
    }

    public void setMiddleNames(java.lang.String middleNames)
    {
        this.middleNames = middleNames;
    }

    private com.jrsystems.jrbase.individual.Gender sex;

    public com.jrsystems.jrbase.individual.Gender getSex()
    {
        return this.sex;
    }

    public void setSex(com.jrsystems.jrbase.individual.Gender sex)
    {
        this.sex = sex;
    }

    private java.lang.String postalAddress;

    public java.lang.String getPostalAddress()
    {
        return this.postalAddress;
    }

    public void setPostalAddress(java.lang.String postalAddress)
    {
        this.postalAddress = postalAddress;
    }

    private java.lang.String physicalAddress;

    public java.lang.String getPhysicalAddress()
    {
        return this.physicalAddress;
    }

    public void setPhysicalAddress(java.lang.String physicalAddress)
    {
        this.physicalAddress = physicalAddress;
    }

    private java.lang.String email;

    public java.lang.String getEmail()
    {
        return this.email;
    }

    public void setEmail(java.lang.String email)
    {
        this.email = email;
    }

    private java.util.Date dob;

    public java.util.Date getDob()
    {
        return this.dob;
    }

    public void setDob(java.util.Date dob)
    {
        this.dob = dob;
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

    private java.lang.Long[] nextOfKin;

    public java.lang.Long[] getNextOfKin()
    {
        return this.nextOfKin;
    }

    public void setNextOfKin(java.lang.Long[] nextOfKin)
    {
        this.nextOfKin = nextOfKin;
    }

    private java.lang.String[] nextOfKinLabels;

    public java.lang.String[] getNextOfKinLabels()
    {
        return this.nextOfKinLabels;
    }

    public void setNextOfKinLabels(java.lang.String[] nextOfKinLabels)
    {
        this.nextOfKinLabels = nextOfKinLabels;
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

    private java.lang.Long countryOfBirth;

    public java.lang.Long getCountryOfBirth()
    {
        return this.countryOfBirth;
    }

    public void setCountryOfBirth(java.lang.Long countryOfBirth)
    {
        this.countryOfBirth = countryOfBirth;
    }

    private java.lang.String countryOfBirthLabel;

    public java.lang.String getCountryOfBirthLabel()
    {
        return this.countryOfBirthLabel;
    }

    public void setCountryOfBirthLabel(java.lang.String countryOfBirthLabel)
    {
        this.countryOfBirthLabel = countryOfBirthLabel;
    }

    private java.lang.Long countryOfCitizenship;

    public java.lang.Long getCountryOfCitizenship()
    {
        return this.countryOfCitizenship;
    }

    public void setCountryOfCitizenship(java.lang.Long countryOfCitizenship)
    {
        this.countryOfCitizenship = countryOfCitizenship;
    }

    private java.lang.String countryOfCitizenshipLabel;

    public java.lang.String getCountryOfCitizenshipLabel()
    {
        return this.countryOfCitizenshipLabel;
    }

    public void setCountryOfCitizenshipLabel(java.lang.String countryOfCitizenshipLabel)
    {
        this.countryOfCitizenshipLabel = countryOfCitizenshipLabel;
    }

}