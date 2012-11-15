// license-header java merge-point
package com.jrsystems.jrbase.individual.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class IndividualManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements IndividualManageableDao
{
    private com.jrsystems.jrbase.individual.IndividualDao dao;

    public void setDao(com.jrsystems.jrbase.individual.IndividualDao dao)
    {
        this.dao = dao;
    }

    protected com.jrsystems.jrbase.individual.IndividualDao getDao()
    {
        return this.dao;
    }

    private com.jrsystems.jrbase.individual.IndividualDao nextOfKinDao = null;

    public void setNextOfKinDao(com.jrsystems.jrbase.individual.IndividualDao nextOfKinDao)
    {
        this.nextOfKinDao = nextOfKinDao;
    }

    protected com.jrsystems.jrbase.individual.IndividualDao getNextOfKinDao()
    {
        return this.nextOfKinDao;
    }

    private com.jrsystems.jrbase.individual.IndividualDao individualDao = null;

    public void setIndividualDao(com.jrsystems.jrbase.individual.IndividualDao individualDao)
    {
        this.individualDao = individualDao;
    }

    protected com.jrsystems.jrbase.individual.IndividualDao getIndividualDao()
    {
        return this.individualDao;
    }

    private com.jrsystems.jrbase.location.LocationDao countryOfBirthDao = null;

    public void setCountryOfBirthDao(com.jrsystems.jrbase.location.LocationDao countryOfBirthDao)
    {
        this.countryOfBirthDao = countryOfBirthDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getCountryOfBirthDao()
    {
        return this.countryOfBirthDao;
    }

    private com.jrsystems.jrbase.location.LocationDao countryOfCitizenshipDao = null;

    public void setCountryOfCitizenshipDao(com.jrsystems.jrbase.location.LocationDao countryOfCitizenshipDao)
    {
        this.countryOfCitizenshipDao = countryOfCitizenshipDao;
    }

    protected com.jrsystems.jrbase.location.LocationDao getCountryOfCitizenshipDao()
    {
        return this.countryOfCitizenshipDao;
    }

    private java.util.Set findIndividualByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.individual.IndividualImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findUserByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.user.UserImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findLocationByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.location.LocationImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public com.jrsystems.jrbase.individual.Individual create(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
    {
        final com.jrsystems.jrbase.individual.Individual entity = new com.jrsystems.jrbase.individual.IndividualImpl();
        entity.setIndividualId(individualId);
        entity.setIdNumber(idNumber);
        entity.setSalutation(salutation);
        entity.setSurname(surname);
        entity.setFirstName(firstName);
        entity.setMiddleNames(middleNames);
        entity.setSex(sex);
        entity.setPostalAddress(postalAddress);
        entity.setPhysicalAddress(physicalAddress);
        entity.setEmail(email);
        entity.setDob(dob);
        entity.setId(id);
        final java.util.Set nextOfKinEntities = (nextOfKin != null && nextOfKin.length > 0)
            ? this.findIndividualByIds(nextOfKin)
            : java.util.Collections.EMPTY_SET;

        entity.setNextOfKin(nextOfKinEntities);

        com.jrsystems.jrbase.individual.Individual individualEntity = null;
        if (individual != null)
        {
            individualEntity = (com.jrsystems.jrbase.individual.Individual)getIndividualDao().load(individual);
        }

        entity.setIndividual(individualEntity);

        com.jrsystems.jrbase.location.Location countryOfBirthEntity = null;
        if (countryOfBirth != null)
        {
            countryOfBirthEntity = (com.jrsystems.jrbase.location.Location)getCountryOfBirthDao().load(countryOfBirth);
        }

        entity.setCountryOfBirth(countryOfBirthEntity);

        com.jrsystems.jrbase.location.Location countryOfCitizenshipEntity = null;
        if (countryOfCitizenship != null)
        {
            countryOfCitizenshipEntity = (com.jrsystems.jrbase.location.Location)getCountryOfCitizenshipDao().load(countryOfCitizenship);
        }

        entity.setCountryOfCitizenship(countryOfCitizenshipEntity);


        return (com.jrsystems.jrbase.individual.Individual)this.getDao().create(entity);
    }

    public com.jrsystems.jrbase.individual.Individual readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.individual.IndividualImpl.class);

            if (individualId != null)
                criteria.add(Expression.ilike("individualId", individualId, MatchMode.START));
            if (idNumber != null)
                criteria.add(Expression.ilike("idNumber", idNumber, MatchMode.START));
            if (salutation != null)
            criteria.add(Expression.eq("salutation", salutation));
            if (surname != null)
                criteria.add(Expression.ilike("surname", surname, MatchMode.START));
            if (firstName != null)
                criteria.add(Expression.ilike("firstName", firstName, MatchMode.START));
            if (middleNames != null)
                criteria.add(Expression.ilike("middleNames", middleNames, MatchMode.START));
            if (sex != null)
            criteria.add(Expression.eq("sex", sex));
            if (postalAddress != null)
                criteria.add(Expression.ilike("postalAddress", postalAddress, MatchMode.START));
            if (physicalAddress != null)
                criteria.add(Expression.ilike("physicalAddress", physicalAddress, MatchMode.START));
            if (email != null)
                criteria.add(Expression.ilike("email", email, MatchMode.START));
            if (dob != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(dob);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("dob", dob));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("dob", dob, calendar.getTime()));
                }
            }
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (nextOfKin != null && nextOfKin.length > 0) criteria.createCriteria("nextOfKin").add(Expression.in("id", nextOfKin));
            if (individual != null) criteria.createCriteria("individual").add(Expression.eq("id", individual));
            if (countryOfBirth != null) criteria.createCriteria("countryOfBirth").add(Expression.eq("id", countryOfBirth));
            if (countryOfCitizenship != null) criteria.createCriteria("countryOfCitizenship").add(Expression.eq("id", countryOfCitizenship));
            criteria.setMaxResults(250);

            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public java.util.List readAll()
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(com.jrsystems.jrbase.individual.IndividualImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public java.util.Map readBackingLists()
    {
        final java.util.Map lists = new java.util.HashMap();
        final Session session = this.getSession();

        try
        {
            lists.put("nextOfKin", session.createQuery("select item.id, item.individualId from com.jrsystems.jrbase.individual.Individual item order by item.individualId").list());
            lists.put("individual", session.createQuery("select item.id, item.individualId from com.jrsystems.jrbase.individual.Individual item order by item.individualId").list());
            lists.put("countryOfBirth", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
            lists.put("countryOfCitizenship", session.createQuery("select item.id, item.uniqueCode from com.jrsystems.jrbase.location.Location item order by item.uniqueCode").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public com.jrsystems.jrbase.individual.Individual update(java.lang.String individualId, java.lang.String idNumber, com.jrsystems.jrbase.individual.Salutation salutation, java.lang.String surname, java.lang.String firstName, java.lang.String middleNames, com.jrsystems.jrbase.individual.Gender sex, java.lang.String postalAddress, java.lang.String physicalAddress, java.lang.String email, java.util.Date dob, java.lang.Long id, java.lang.Long[] nextOfKin, java.lang.Long individual, java.lang.Long countryOfBirth, java.lang.Long countryOfCitizenship)
    {
        final com.jrsystems.jrbase.individual.Individual entity = this.getDao().load(id);

        entity.setIndividualId(individualId);
        entity.setIdNumber(idNumber);
        entity.setSalutation(salutation);
        entity.setSurname(surname);
        entity.setFirstName(firstName);
        entity.setMiddleNames(middleNames);
        entity.setSex(sex);
        entity.setPostalAddress(postalAddress);
        entity.setPhysicalAddress(physicalAddress);
        entity.setEmail(email);
        entity.setDob(dob);
        final java.util.Set nextOfKinEntities = (nextOfKin != null && nextOfKin.length > 0)
            ? this.findIndividualByIds(nextOfKin)
            : java.util.Collections.EMPTY_SET;

        entity.setNextOfKin(nextOfKinEntities);

        com.jrsystems.jrbase.individual.Individual individualEntity = null;
        if (individual != null)
        {
            individualEntity = getIndividualDao().load(individual);
        }

        entity.setIndividual(individualEntity);

        com.jrsystems.jrbase.location.Location countryOfBirthEntity = null;
        if (countryOfBirth != null)
        {
            countryOfBirthEntity = getCountryOfBirthDao().load(countryOfBirth);
        }

        entity.setCountryOfBirth(countryOfBirthEntity);

        com.jrsystems.jrbase.location.Location countryOfCitizenshipEntity = null;
        if (countryOfCitizenship != null)
        {
            countryOfCitizenshipEntity = getCountryOfCitizenshipDao().load(countryOfCitizenship);
        }

        entity.setCountryOfCitizenship(countryOfCitizenshipEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete $manageable.generalizationRoot.fullyQualifiedEntityImplementationName where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}