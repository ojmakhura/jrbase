// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.individual;
/**
 * @see com.systemsjr.jrbase.individual.NextOfKin
 */
public class NextOfKinDaoImpl
    extends com.systemsjr.jrbase.individual.NextOfKinDaoBase
{
    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#toNextOfKinVO(com.systemsjr.jrbase.individual.NextOfKin, com.systemsjr.jrbase.individual.vo.NextOfKinVO)
     */
    public void toNextOfKinVO(
        com.systemsjr.jrbase.individual.NextOfKin source,
        com.systemsjr.jrbase.individual.vo.NextOfKinVO target)
    {
        // @todo verify behavior of toNextOfKinVO
        super.toNextOfKinVO(source, target);
        // WARNING! No conversion for target.individual (can't convert source.getIndividual():com.systemsjr.jrbase.individual.Individual to com.systemsjr.jrbase.individual.vo.IndividualVO
        target.setIndividual(getIndividualDao().toIndividualVO(source.getIndividual()));
        // WARNING! No conversion for target.kin (can't convert source.getKin():com.systemsjr.jrbase.individual.Individual to com.systemsjr.jrbase.individual.vo.IndividualVO
        target.setKin(getIndividualDao().toIndividualVO(source.getKin()));
    }


    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#toNextOfKinVO(com.systemsjr.jrbase.individual.NextOfKin)
     */
    public com.systemsjr.jrbase.individual.vo.NextOfKinVO toNextOfKinVO(final com.systemsjr.jrbase.individual.NextOfKin entity)
    {
        // @todo verify behavior of toNextOfKinVO
        return super.toNextOfKinVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.individual.NextOfKin loadNextOfKinFromNextOfKinVO(com.systemsjr.jrbase.individual.vo.NextOfKinVO nextOfKinVO)
    {
        com.systemsjr.jrbase.individual.NextOfKin nextOfKin = null;
        if (nextOfKinVO.getId() == null)
        {
            nextOfKin = com.systemsjr.jrbase.individual.NextOfKin.Factory.newInstance();
        } else{
        	nextOfKin = this.load(nextOfKinVO.getId());
        }
        return nextOfKin;
        
    }

    
    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#nextOfKinVOToEntity(com.systemsjr.jrbase.individual.vo.NextOfKinVO)
     */
    public com.systemsjr.jrbase.individual.NextOfKin nextOfKinVOToEntity(com.systemsjr.jrbase.individual.vo.NextOfKinVO nextOfKinVO)
    {
        // @todo verify behavior of nextOfKinVOToEntity
        com.systemsjr.jrbase.individual.NextOfKin entity = this.loadNextOfKinFromNextOfKinVO(nextOfKinVO);
        this.nextOfKinVOToEntity(nextOfKinVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#nextOfKinVOToEntity(com.systemsjr.jrbase.individual.vo.NextOfKinVO, com.systemsjr.jrbase.individual.NextOfKin)
     */
    public void nextOfKinVOToEntity(
        com.systemsjr.jrbase.individual.vo.NextOfKinVO source,
        com.systemsjr.jrbase.individual.NextOfKin target,
        boolean copyIfNull)
    {
        // @todo verify behavior of nextOfKinVOToEntity
        super.nextOfKinVOToEntity(source, target, copyIfNull);
    }

}