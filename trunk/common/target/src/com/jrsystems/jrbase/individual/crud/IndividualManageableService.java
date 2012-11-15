// license-header java merge-point
package com.jrsystems.jrbase.individual.crud;

public interface IndividualManageableService
{
    public com.jrsystems.jrbase.individual.crud.IndividualValueObject create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
        throws Exception;

    public com.jrsystems.jrbase.individual.crud.IndividualValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.individual.crud.IndividualValueObject update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
