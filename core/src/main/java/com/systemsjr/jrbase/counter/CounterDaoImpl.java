// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.counter;


/**
 * @see com.systemsjr.jrbase.counter.Counter
 */
public class CounterDaoImpl
    extends com.systemsjr.jrbase.counter.CounterDaoBase
{
    /**
     * @see com.systemsjr.jrbase.counter.CounterDao#toCounterVO(com.systemsjr.jrbase.counter.Counter, com.systemsjr.jrbase.counter.vo.CounterVO)
     */
    @Override
	public void toCounterVO(
        com.systemsjr.jrbase.counter.Counter source,
        com.systemsjr.jrbase.counter.vo.CounterVO target)
    {
        // @todo verify behavior of toCounterVO
        super.toCounterVO(source, target);
    }


    /**
     * @see com.systemsjr.jrbase.counter.CounterDao#toCounterVO(com.systemsjr.jrbase.counter.Counter)
     */
    @Override
	public com.systemsjr.jrbase.counter.vo.CounterVO toCounterVO(final com.systemsjr.jrbase.counter.Counter entity)
    {
        // @todo verify behavior of toCounterVO
        return super.toCounterVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.counter.Counter loadCounterFromCounterVO(com.systemsjr.jrbase.counter.vo.CounterVO counterVO)
    {        
        com.systemsjr.jrbase.counter.Counter counter = null;//this.load(counterVO.getId());
        if (counterVO.getId() != null)
        {
        	counter = this.load(counterVO.getId());
        } else{
        	counter = Counter.Factory.newInstance();
        }
        return counter;
    }

    
    /**
     * @see com.systemsjr.jrbase.counter.CounterDao#counterVOToEntity(com.systemsjr.jrbase.counter.vo.CounterVO)
     */
    @Override
	public com.systemsjr.jrbase.counter.Counter counterVOToEntity(com.systemsjr.jrbase.counter.vo.CounterVO counterVO)
    {
        com.systemsjr.jrbase.counter.Counter entity = this.loadCounterFromCounterVO(counterVO);
        this.counterVOToEntity(counterVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.counter.CounterDao#counterVOToEntity(com.systemsjr.jrbase.counter.vo.CounterVO, com.systemsjr.jrbase.counter.Counter)
     */
    @Override
	public void counterVOToEntity(
        com.systemsjr.jrbase.counter.vo.CounterVO source,
        com.systemsjr.jrbase.counter.Counter target,
        boolean copyIfNull)
    {
        super.counterVOToEntity(source, target, copyIfNull);
    }

}