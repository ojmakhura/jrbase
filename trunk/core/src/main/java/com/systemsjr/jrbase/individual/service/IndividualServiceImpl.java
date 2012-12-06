// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.individual.service;

import java.util.Collection;
import java.util.List;

import com.jrsystems.jrbase.individual.Individual;
import com.jrsystems.jrbase.individual.IndividualDao;
import com.jrsystems.jrbase.individual.vo.IndividualVO;

/**
 * @see com.jrsystems.jrbase.individual.service.IndividualService
 */
public class IndividualServiceImpl
    extends com.jrsystems.jrbase.individual.service.IndividualServiceBase
{

    /**
     * @see com.jrsystems.jrbase.individual.service.IndividualService#saveIndividual(com.jrsystems.jrbase.individual.vo.IndividualVO)
     */
    protected  com.jrsystems.jrbase.individual.vo.IndividualVO handleSaveIndividual(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO)
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
     * @see com.jrsystems.jrbase.individual.service.IndividualService#getAllIndividuals()
     */
    protected  List handleGetAllIndividuals()
        throws java.lang.Exception
    {
    	return java.util.Arrays.asList(getIndividualDao().loadAll(IndividualDao.TRANSFORM_INDIVIDUALVO).toArray());
    }

    /**
     * @see com.jrsystems.jrbase.individual.service.IndividualService#removeIndividual(com.jrsystems.jrbase.individual.vo.IndividualVO)
     */
    protected  void handleRemoveIndividual(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO)
        throws java.lang.Exception
    {
    	if(individualVO.getId() != null){
    		getIndividualDao().remove(individualVO.getId());
    	}
    }

}