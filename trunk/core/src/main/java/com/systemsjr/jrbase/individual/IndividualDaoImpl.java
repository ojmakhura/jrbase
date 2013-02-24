// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.individual;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.systemsjr.jrbase.individual.Individual
 */
public class IndividualDaoImpl
    extends com.systemsjr.jrbase.individual.IndividualDaoBase
{
    /**
     * @see com.systemsjr.jrbase.individual.IndividualDao#findByCriteria(com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Individual.class);
        
    	if(searchCriteria.getEmail() != null){
    		criteria.add(Restrictions.ilike("email", searchCriteria.getEmail()));
    	}
    	
    	if(searchCriteria.getFirstName() != null){
    		criteria.add(Restrictions.ilike("firstName", searchCriteria.getFirstName()));
    	}
    	
    	if(searchCriteria.getIdNumber() != null){
    		criteria.add(Restrictions.ilike("idNumber", searchCriteria.getIdNumber()));
    	}
    	
    	if(searchCriteria.getIndividualId() != null){
    		criteria.add(Restrictions.ilike("individualId", searchCriteria.getIndividualId()));
    	}
    	
    	if(searchCriteria.getMiddleNames() != null){
    		criteria.add(Restrictions.ilike("middleNames", searchCriteria.getMiddleNames()));
    	}
    	
    	if(searchCriteria.getPhysicalAddress() != null){
    		criteria.add(Restrictions.ilike("physicalAddress", searchCriteria.getPhysicalAddress()));
    	}
    	
    	if(searchCriteria.getPostalAddress() != null){
    		criteria.add(Restrictions.ilike("postalAddress", searchCriteria.getPostalAddress()));
    	}
    	
    	if(searchCriteria.getPostalAddress() != null){
    		criteria.add(Restrictions.ilike("postalAddress", searchCriteria.getPostalAddress()));
    	}
    	
    	if(searchCriteria.getSalutation() != null){
    		criteria.add(Restrictions.ilike("surname", searchCriteria.getSurname()));
    	}
    	
    	if(searchCriteria.getSalutation() != null){
    		criteria.add(Restrictions.ilike("salutation", searchCriteria.getSalutation()));
    	}
    	
    	if(searchCriteria.getSex() != null){
    		criteria.add(Restrictions.ilike("sex", searchCriteria.getSex()));
    	}
    	
    	return criteria.list();
    }

    /**
     * @see com.systemsjr.jrbase.individual.IndividualDao#toIndividualVO(com.systemsjr.jrbase.individual.Individual, com.systemsjr.jrbase.individual.vo.IndividualVO)
     */
    @Override
	public void toIndividualVO(
        com.systemsjr.jrbase.individual.Individual source,
        com.systemsjr.jrbase.individual.vo.IndividualVO target)
    {
        // @todo verify behavior of toIndividualVO
        super.toIndividualVO(source, target);
        
        // WARNING! No conversion for target.nextOfKin (can't convert source.getNextOfKin():com.systemsjr.jrbase.individual.Individual to com.systemsjr.jrbase.individual.vo.IndividualVO
        target.setNextOfKins(getNextOfKinDao().toNextOfKinVOArray(source.getNextOfKins()));
        // WARNING! No conversion for target.countryOfBirth (can't convert source.getCountryOfBirth():com.systemsjr.jrbase.location.Location to com.systemsjr.jrbase.location.vo.LocationVO
        target.setCountryOfBirth(getLocationDao().toLocationVO(source.getCountryOfBirth()));
        // WARNING! No conversion for target.countryOfCitizenship (can't convert source.getCountryOfCitizenship():com.systemsjr.jrbase.location.Location to com.systemsjr.jrbase.location.vo.LocationVO
        target.setCountryOfCitizenship(getLocationDao().toLocationVO(source.getCountryOfCitizenship()));
    }


    /**
     * @see com.systemsjr.jrbase.individual.IndividualDao#toIndividualVO(com.systemsjr.jrbase.individual.Individual)
     */
    @Override
	public com.systemsjr.jrbase.individual.vo.IndividualVO toIndividualVO(final com.systemsjr.jrbase.individual.Individual entity)
    {
        // @todo verify behavior of toIndividualVO
        return super.toIndividualVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.individual.Individual loadIndividualFromIndividualVO(com.systemsjr.jrbase.individual.vo.IndividualVO individualVO)
    {        
        /* A typical implementation looks like this:*/
        com.systemsjr.jrbase.individual.Individual individual = null;//this.load(individualVO.getId());
        if (individualVO.getId() != null)
        {
        	individual = this.load(individualVO.getId());
        } else {
        	individual = com.systemsjr.jrbase.individual.Individual.Factory.newInstance();
        }
        return individual;
    }

    
    /**
     * @see com.systemsjr.jrbase.individual.IndividualDao#individualVOToEntity(com.systemsjr.jrbase.individual.vo.IndividualVO)
     */
    @Override
	public com.systemsjr.jrbase.individual.Individual individualVOToEntity(com.systemsjr.jrbase.individual.vo.IndividualVO individualVO)
    {
        // @todo verify behavior of individualVOToEntity
        com.systemsjr.jrbase.individual.Individual entity = this.loadIndividualFromIndividualVO(individualVO);
        this.individualVOToEntity(individualVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.individual.IndividualDao#individualVOToEntity(com.systemsjr.jrbase.individual.vo.IndividualVO, com.systemsjr.jrbase.individual.Individual)
     */
    @Override
	public void individualVOToEntity(
        com.systemsjr.jrbase.individual.vo.IndividualVO source,
        com.systemsjr.jrbase.individual.Individual target,
        boolean copyIfNull)
    {
        // @todo verify behavior of individualVOToEntity
        super.individualVOToEntity(source, target, copyIfNull);
    }

}