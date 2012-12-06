// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.counter;
/**
 * @see com.jrsystems.jrbase.counter.Counter
 */
public class CounterDaoImpl
    extends com.jrsystems.jrbase.counter.CounterDaoBase
{
    /**
     * @see com.jrsystems.jrbase.counter.CounterDao#toCounterVO(com.jrsystems.jrbase.counter.Counter, com.jrsystems.jrbase.counter.vo.CounterVO)
     */
    public void toCounterVO(
        com.jrsystems.jrbase.counter.Counter source,
        com.jrsystems.jrbase.counter.vo.CounterVO target)
    {
        // @todo verify behavior of toCounterVO
        super.toCounterVO(source, target);
    }


    /**
     * @see com.jrsystems.jrbase.counter.CounterDao#toCounterVO(com.jrsystems.jrbase.counter.Counter)
     */
    public com.jrsystems.jrbase.counter.vo.CounterVO toCounterVO(final com.jrsystems.jrbase.counter.Counter entity)
    {
        // @todo verify behavior of toCounterVO
        return super.toCounterVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.counter.Counter loadCounterFromCounterVO(com.jrsystems.jrbase.counter.vo.CounterVO counterVO)
    {
        // @todo implement loadCounterFromCounterVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.counter.loadCounterFromCounterVO(com.jrsystems.jrbase.counter.vo.CounterVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.counter.Counter counter = this.load(counterVO.getId());
        if (counter == null)
        {
            counter = com.jrsystems.jrbase.counter.Counter.Factory.newInstance();
        }
        return counter;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.counter.CounterDao#counterVOToEntity(com.jrsystems.jrbase.counter.vo.CounterVO)
     */
    public com.jrsystems.jrbase.counter.Counter counterVOToEntity(com.jrsystems.jrbase.counter.vo.CounterVO counterVO)
    {
        // @todo verify behavior of counterVOToEntity
        com.jrsystems.jrbase.counter.Counter entity = this.loadCounterFromCounterVO(counterVO);
        this.counterVOToEntity(counterVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.counter.CounterDao#counterVOToEntity(com.jrsystems.jrbase.counter.vo.CounterVO, com.jrsystems.jrbase.counter.Counter)
     */
    public void counterVOToEntity(
        com.jrsystems.jrbase.counter.vo.CounterVO source,
        com.jrsystems.jrbase.counter.Counter target,
        boolean copyIfNull)
    {
        // @todo verify behavior of counterVOToEntity
        super.counterVOToEntity(source, target, copyIfNull);
    }

}