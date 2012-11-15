// license-header java merge-point
package com.jrsystems.jrbase.individual.crud;

public interface IndividualManageableDao
{
    public com.jrsystems.jrbase.individual.Individual create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship);

    public com.jrsystems.jrbase.individual.Individual readById(java.lang.Long id);

    public java.util.List read(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.individual.Individual update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship);

    public void delete(java.lang.Long[] ids);

}