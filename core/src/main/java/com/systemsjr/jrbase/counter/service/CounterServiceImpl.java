// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::counter::service::CounterService
 * STEREOTYPE:  Service
 * STEREOTYPE:  WebService
 */
package com.systemsjr.jrbase.counter.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.counter.Counter;
import com.systemsjr.jrbase.counter.vo.CounterVO;

/**
 * @see com.systemsjr.jrbase.counter.service.CounterService
 */
@Service("com.systemsjr.jrbase.counter.service.CounterService")
public class CounterServiceImpl
    extends CounterServiceBase
{

	/**
     * @see com.systemsjr.jrbase.counter.service.CounterService#createCounter(com.systemsjr.jrbase.counter.vo.CounterVO)
     */
    @Override
	protected  com.systemsjr.jrbase.counter.vo.CounterVO handleSaveCounter(com.systemsjr.jrbase.counter.vo.CounterVO counterVO)
        throws java.lang.Exception
    { 	
    	Counter counter;// = getCounterDao().counterVOToEntity(counterVO);
    	
    	if(counterVO.getId() == null){
    		counter = getCounterDao().create(getCounterDao().counterVOToEntity(counterVO));
    	} else{
    		counter = getCounterDao().counterVOToEntity(counterVO);
    		getCounterDao().update(counter);
    	}
    	
    	return getCounterDao().toCounterVO(counter);
    }

    /**
     * @see com.systemsjr.jrbase.counter.service.CounterService#getCount(java.lang.String)
     */
    @Override
	protected  String handleGetCount(java.lang.String counterName)
        throws java.lang.Exception
    {
        // @todo implement protected  String handleGetCount(java.lang.String counterName)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.counter.service.CounterService.handleGetCount(java.lang.String counterName) Not implemented!");
    }

	@Override
	protected void handleRemoveCounter(CounterVO counterVO) throws Exception {
		
		if(counterVO.getId() != null){
			getCounterDao().remove(counterVO.getId());
		}
		
	}

	@Override
	protected Collection<CounterVO> handleGetAllCounters() throws Exception {
		Collection<Counter> counters = getCounterDao().loadAll(); 
		return getCounterDao().toCounterVOCollection(counters);
	}

	@Override
	protected CounterVO handleFindById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return id == null ? null : getCounterDao().toCounterVO(getCounterDao().load(id));
	}

}