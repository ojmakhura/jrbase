// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.individual.service;

import java.util.Collection;

import com.systemsjr.jrbase.individual.Individual;
import com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.individual.vo.KinSearchCriteria;
import com.systemsjr.jrbase.individual.vo.NextOfKinVO;

/**
 * @see com.systemsjr.jrbase.individual.service.IndividualService
 */
public class IndividualServiceImpl
    extends com.systemsjr.jrbase.individual.service.IndividualServiceBase
{

    /**
     * @see com.systemsjr.jrbase.individual.service.IndividualService#saveIndividual(com.systemsjr.jrbase.individual.vo.IndividualVO)
     */
    @Override
	protected  com.systemsjr.jrbase.individual.vo.IndividualVO handleSaveIndividual(com.systemsjr.jrbase.individual.vo.IndividualVO individualVO)
        throws java.lang.Exception
    {
    	Individual individual = getIndividualDao().individualVOToEntity(individualVO);
    	
    	if(individual.getId() == null){
    		individual = getIndividualDao().create(individual);
    	} else {
    		getIndividualDao().update(individual);
    	}
    	
    	return getIndividualDao().toIndividualVO(individual);
    }

    /**
     * @see com.systemsjr.jrbase.individual.service.IndividualService#getAllIndividuals()
     */
    @Override
	protected  IndividualVO[] handleGetAllIndividuals()
        throws java.lang.Exception
    {
    	Collection individuals = getIndividualDao().loadAll();
    	return getIndividualDao().toIndividualVOArray(individuals);
    }

    /**
     * @see com.systemsjr.jrbase.individual.service.IndividualService#removeIndividual(com.systemsjr.jrbase.individual.vo.IndividualVO)
     */
    @Override
	protected  void handleRemoveIndividual(com.systemsjr.jrbase.individual.vo.IndividualVO individualVO)
        throws java.lang.Exception
    {
    	if(individualVO.getId() != null){
    		getIndividualDao().remove(individualVO.getId());
    	}
    }

	@Override
	protected IndividualVO[] handleSearchIndividuals(
			IndividualSearchCriteria searchCriteria) throws Exception {
		
		if(searchCriteria == null){
			return new IndividualVO[]{};
		}
		
		return getIndividualDao().toIndividualVOArray(getIndividualDao().findByCriteria(searchCriteria));
	}

	@Override
	protected NextOfKinVO handleSaveKin(NextOfKinVO kin) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected NextOfKinVO handleGetAllKin(IndividualVO individualVO)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void handleRemoveKin(NextOfKinVO kin) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected NextOfKinVO[] handleSearchKin(KinSearchCriteria searchCriteria)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}