// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.individual;

import java.util.List;

/**
 * @see com.jrsystems.jrbase.individual.Individual
 */
public class IndividualDaoImpl
    extends com.jrsystems.jrbase.individual.IndividualDaoBase
{
    /**
     * @see com.jrsystems.jrbase.individual.IndividualDao#findByCriteria(com.jrsystems.jrbase.individual.vo.IndividualSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.individual.vo.IndividualSearchCriteria searchCriteria)
    {
        // @todo implement public com.jrsystems.jrbase.individual.vo.IndividualVO handleFindByCriteria(com.jrsystems.jrbase.individual.vo.IndividualSearchCriteria searchCriteria)
        return null;
    }

    /**
     * @see com.jrsystems.jrbase.individual.IndividualDao#toIndividualVO(com.jrsystems.jrbase.individual.Individual, com.jrsystems.jrbase.individual.vo.IndividualVO)
     */
    public void toIndividualVO(
        com.jrsystems.jrbase.individual.Individual source,
        com.jrsystems.jrbase.individual.vo.IndividualVO target)
    {
        // @todo verify behavior of toIndividualVO
        super.toIndividualVO(source, target);
        // WARNING! No conversion for target.nextOfKin (can't convert source.getNextOfKin():com.jrsystems.jrbase.individual.Individual to com.jrsystems.jrbase.individual.vo.IndividualVO
        // WARNING! No conversion for target.countryOfBirth (can't convert source.getCountryOfBirth():com.jrsystems.jrbase.location.Location to com.jrsystems.jrbase.location.vo.LocationVO
        // WARNING! No conversion for target.countryOfCitizenship (can't convert source.getCountryOfCitizenship():com.jrsystems.jrbase.location.Location to com.jrsystems.jrbase.location.vo.LocationVO
    }


    /**
     * @see com.jrsystems.jrbase.individual.IndividualDao#toIndividualVO(com.jrsystems.jrbase.individual.Individual)
     */
    public com.jrsystems.jrbase.individual.vo.IndividualVO toIndividualVO(final com.jrsystems.jrbase.individual.Individual entity)
    {
        // @todo verify behavior of toIndividualVO
        return super.toIndividualVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.individual.Individual loadIndividualFromIndividualVO(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO)
    {
        // @todo implement loadIndividualFromIndividualVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.individual.loadIndividualFromIndividualVO(com.jrsystems.jrbase.individual.vo.IndividualVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.individual.Individual individual = this.load(individualVO.getId());
        if (individual == null)
        {
            individual = com.jrsystems.jrbase.individual.Individual.Factory.newInstance();
        }
        return individual;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.individual.IndividualDao#individualVOToEntity(com.jrsystems.jrbase.individual.vo.IndividualVO)
     */
    public com.jrsystems.jrbase.individual.Individual individualVOToEntity(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO)
    {
        // @todo verify behavior of individualVOToEntity
        com.jrsystems.jrbase.individual.Individual entity = this.loadIndividualFromIndividualVO(individualVO);
        this.individualVOToEntity(individualVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.individual.IndividualDao#individualVOToEntity(com.jrsystems.jrbase.individual.vo.IndividualVO, com.jrsystems.jrbase.individual.Individual)
     */
    public void individualVOToEntity(
        com.jrsystems.jrbase.individual.vo.IndividualVO source,
        com.jrsystems.jrbase.individual.Individual target,
        boolean copyIfNull)
    {
        // @todo verify behavior of individualVOToEntity
        super.individualVOToEntity(source, target, copyIfNull);
    }

}