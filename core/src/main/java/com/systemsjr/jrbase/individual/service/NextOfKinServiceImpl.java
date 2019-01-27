// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::individual::service::NextOfKinService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.individual.service;

import com.systemsjr.jrbase.individual.NextOfKin;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.individual.vo.KinSearchCriteria;
import com.systemsjr.jrbase.individual.vo.NextOfKinVO;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 * @see com.systemsjr.jrbase.individual.service.NextOfKinService
 */
@Service("com.systemsjr.jrbase.individual.service.NextOfKinService")
public class NextOfKinServiceImpl
    extends NextOfKinServiceBase
{

    /**
     * @see com.systemsjr.jrbase.individual.service.NextOfKinService#findById(Long)
     */
    @Override
    protected  NextOfKinVO handleFindById(Long id)
        throws Exception
    {
    	return getNextOfKinDao().toNextOfKinVO(getNextOfKinDao().load(id));
    }

    /**
     * @see com.systemsjr.jrbase.individual.service.NextOfKinService#searchKin(KinSearchCriteria)
     */
    @Override
    protected  Collection<NextOfKinVO> handleSearchKin(KinSearchCriteria searchCriteria)
        throws Exception
    {
    	Collection<NextOfKin> kin = getNextOfKinDao().findByCriteria(searchCriteria);
    	return getNextOfKinDao().toNextOfKinVOCollection(kin);
    }

    /**
     * @see com.systemsjr.jrbase.individual.service.NextOfKinService#removeKin(NextOfKinVO)
     */
    @Override
    protected  void handleRemoveKin(NextOfKinVO kin)
        throws Exception
    {
    	if(kin != null && kin.getId() != null)
    	{
    		getNextOfKinDao().remove(kin.getId());
    	}
    }

    /**
     * @see com.systemsjr.jrbase.individual.service.NextOfKinService#getAllKin(IndividualVO)
     */
    @Override
    protected  Collection<NextOfKinVO> handleGetAllKin(IndividualVO individualVO)
        throws Exception
    {
    	return getNextOfKinDao().toNextOfKinVOCollection(getNextOfKinDao().loadAll());
    }

    /**
     * @see com.systemsjr.jrbase.individual.service.NextOfKinService#saveKin(NextOfKinVO)
     */
    @Override
    protected  NextOfKinVO handleSaveKin(NextOfKinVO kin)
        throws Exception
    {
    	NextOfKin k = getNextOfKinDao().nextOfKinVOToEntity(kin);
    	k = getNextOfKinDao().createOrUpdate(k);
    	return getNextOfKinDao().toNextOfKinVO(k);
    }

}