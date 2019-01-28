// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::individual::service::IndividualService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.individual.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.individual.Individual;
import com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria;
import com.systemsjr.jrbase.individual.vo.IndividualVO;

/**
 * @see com.systemsjr.jrbase.individual.service.IndividualService
 */
@Service("com.systemsjr.jrbase.individual.service.IndividualService")
public class IndividualServiceImpl
    extends IndividualServiceBase
{

	/**
     * @see com.systemsjr.jrbase.individual.service.IndividualService#saveIndividual(com.systemsjr.jrbase.individual.vo.IndividualVO)
     */
    @Override
	protected  IndividualVO handleSaveIndividual(IndividualVO individualVO)
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
	protected  Collection<IndividualVO>  handleGetAllIndividuals()
        throws java.lang.Exception
    {
    	Collection<Individual> individuals = getIndividualDao().loadAll();
    	return getIndividualDao().toIndividualVOCollection(individuals);
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
	protected Collection<IndividualVO> handleSearchIndividuals(
			IndividualSearchCriteria searchCriteria) throws Exception {
		
		if(searchCriteria == null){
			return new ArrayList<IndividualVO>();
		}
		
		return getIndividualDao().toIndividualVOCollection(getIndividualDao().findByCriteria(searchCriteria));
	}

	@Override
	protected IndividualVO handleFindById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return id == null ? null : getIndividualDao().toIndividualVO(getIndividualDao().load(id));
	}

}