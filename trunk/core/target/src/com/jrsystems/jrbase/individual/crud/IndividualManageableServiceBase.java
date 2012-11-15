// license-header java merge-point
package com.jrsystems.jrbase.individual.crud;

public final class IndividualManageableServiceBase
    implements IndividualManageableService
{
    private com.jrsystems.jrbase.individual.crud.IndividualManageableDao dao;

    public void setDao(com.jrsystems.jrbase.individual.crud.IndividualManageableDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.individual.crud.IndividualManageableDao getDao()
    {
        return this.dao;
    }

    public com.jrsystems.jrbase.individual.crud.IndividualValueObject create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
        throws Exception
    {
        if (individualId == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'individualId' can not be null");
        }

        if (idNumber == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'idNumber' can not be null");
        }

        if (salutation == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'salutation' can not be null");
        }

        if (surname == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'surname' can not be null");
        }

        if (firstName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'firstName' can not be null");
        }

        if (sex == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'sex' can not be null");
        }

        if (postalAddress == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'postalAddress' can not be null");
        }

        if (physicalAddress == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'physicalAddress' can not be null");
        }

        if (dob == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'dob' can not be null");
        }

        if (countryOfBirth == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'countryOfBirth' can not be null");
        }

        if (countryOfCitizenship == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'countryOfCitizenship' can not be null");
        }

        return toValueObject(dao.create(individualId, idNumber, salutation, surname, firstName, middleNames, sex, postalAddress, physicalAddress, email, dob, id, nextOfKin, individual, countryOfBirth, countryOfCitizenship));
    }

    public com.jrsystems.jrbase.individual.crud.IndividualValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
        throws Exception
    {
        return toValueObjects(dao.read(individualId, idNumber, salutation, surname, firstName, middleNames, sex, postalAddress, physicalAddress, email, dob, id, nextOfKin, individual, countryOfBirth, countryOfCitizenship));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public java.util.Map readBackingLists()
        throws Exception
    {
        return getDao().readBackingLists();
    }

    public com.jrsystems.jrbase.individual.crud.IndividualValueObject update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
        throws Exception
    {
        if (individualId == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'individualId' can not be null");
        }

        if (idNumber == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'idNumber' can not be null");
        }

        if (salutation == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'salutation' can not be null");
        }

        if (surname == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'surname' can not be null");
        }

        if (firstName == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'firstName' can not be null");
        }

        if (sex == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'sex' can not be null");
        }

        if (postalAddress == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'postalAddress' can not be null");
        }

        if (physicalAddress == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'physicalAddress' can not be null");
        }

        if (dob == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'dob' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'id' can not be null");
        }

        if (countryOfBirth == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'countryOfBirth' can not be null");
        }

        if (countryOfCitizenship == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship) - 'countryOfCitizenship' can not be null");
        }

        return toValueObject(dao.update(individualId, idNumber, salutation, surname, firstName, middleNames, sex, postalAddress, physicalAddress, email, dob, id, nextOfKin, individual, countryOfBirth, countryOfCitizenship));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "com.jrsystems.jrbase.individual.crud.IndividualManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((com.jrsystems.jrbase.individual.Individual)iterator.next()));
        }

        return list;
    }

    private static com.jrsystems.jrbase.individual.crud.IndividualValueObject toValueObject(com.jrsystems.jrbase.individual.Individual entity)
    {
        final com.jrsystems.jrbase.individual.crud.IndividualValueObject valueObject = new com.jrsystems.jrbase.individual.crud.IndividualValueObject();

        valueObject.setIndividualId(entity.getIndividualId());
        valueObject.setIdNumber(entity.getIdNumber());
        valueObject.setSalutation(entity.getSalutation());
        valueObject.setSurname(entity.getSurname());
        valueObject.setFirstName(entity.getFirstName());
        valueObject.setMiddleNames(entity.getMiddleNames());
        valueObject.setSex(entity.getSex());
        valueObject.setPostalAddress(entity.getPostalAddress());
        valueObject.setPhysicalAddress(entity.getPhysicalAddress());
        valueObject.setEmail(entity.getEmail());
        valueObject.setDob(entity.getDob());
        valueObject.setId(entity.getId());

        final java.util.Collection nextOfKin = entity.getNextOfKin();
        if (nextOfKin == null || nextOfKin.isEmpty())
        {
            valueObject.setNextOfKin(null);
            valueObject.setNextOfKinLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[nextOfKin.size()];
            final java.lang.String[] labels = new java.lang.String[nextOfKin.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = nextOfKin.iterator(); iterator.hasNext();counter++)
            {
                final com.jrsystems.jrbase.individual.Individual element = (com.jrsystems.jrbase.individual.Individual)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getIndividualId();
            }
            valueObject.setNextOfKin(values);
            valueObject.setNextOfKinLabels(labels);
        }

        final com.jrsystems.jrbase.individual.Individual individual = entity.getIndividual();
        if (individual != null)
        {
            valueObject.setIndividual(individual.getId());
            valueObject.setIndividualLabel(individual.getIndividualId());
        }

        final com.jrsystems.jrbase.location.Location countryOfBirth = entity.getCountryOfBirth();
        if (countryOfBirth != null)
        {
            valueObject.setCountryOfBirth(countryOfBirth.getId());
            valueObject.setCountryOfBirthLabel(countryOfBirth.getUniqueCode());
        }

        final com.jrsystems.jrbase.location.Location countryOfCitizenship = entity.getCountryOfCitizenship();
        if (countryOfCitizenship != null)
        {
            valueObject.setCountryOfCitizenship(countryOfCitizenship.getId());
            valueObject.setCountryOfCitizenshipLabel(countryOfCitizenship.getUniqueCode());
        }

        return valueObject;
    }
}
