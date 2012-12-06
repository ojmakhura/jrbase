// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.counter.service;

import com.jrsystems.jrbase.counter.Counter;
import com.jrsystems.jrbase.counter.vo.CounterVO;

/**
 * @see com.jrsystems.jrbase.counter.service.CounterService
 */
public class CounterServiceImpl
    extends com.jrsystems.jrbase.counter.service.CounterServiceBase
{

    /**
     * @see com.jrsystems.jrbase.counter.service.CounterService#createCounter(com.jrsystems.jrbase.counter.vo.CounterVO)
     */
    protected  com.jrsystems.jrbase.counter.vo.CounterVO handleCreateCounter(com.jrsystems.jrbase.counter.vo.CounterVO counterVO)
        throws java.lang.Exception
    {
    	Counter counter = getCounterDao().counterVOToEntity(counterVO);
    	
    	if(counter.getId() == null){
    		counter = getCounterDao().create(counter);
    	} else{
    		getCounterDao().update(counter);
    	}
    	
    	return getCounterDao().toCounterVO(counter);
    }

    /**
     * @see com.jrsystems.jrbase.counter.service.CounterService#getCount(java.lang.String)
     */
    protected  String handleGetCount(java.lang.String counterName)
        throws java.lang.Exception
    {
        // @todo implement protected  String handleGetCount(java.lang.String counterName)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.counter.service.CounterService.handleGetCount(java.lang.String counterName) Not implemented!");
    }

	@Override
	protected void handleRemoveCounter(CounterVO counterVO) throws Exception {
		
		if(counterVO.getId() != null){
			getCounterDao().remove(counterVO.getId());
		}
		
	}

}