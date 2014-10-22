// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.individual;
/**
 * @see com.systemsjr.jrbase.individual.NextOfKin
 */
public class KinDaoImpl
    extends KinDaoBase
{
    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#toNextOfKinVO(com.systemsjr.jrbase.individual.NextOfKin, com.systemsjr.jrbase.individual.vo.NextOfKinVO)
     */
    public void toKinVO(
        com.systemsjr.jrbase.individual.Kin source,
        com.systemsjr.jrbase.individual.vo.KinVO target)
    {
        // @todo verify behavior of toNextOfKinVO
        super.toKinVO(source, target);
        // WARNING! No conversion for target.individual (can't convert source.getIndividual():com.systemsjr.jrbase.individual.Individual to com.systemsjr.jrbase.individual.vo.IndividualVO
        target.setIndividual(getIndividualDao().toIndividualVO(source.getIndividual()));
        // WARNING! No conversion for target.kin (can't convert source.getKin():com.systemsjr.jrbase.individual.Individual to com.systemsjr.jrbase.individual.vo.IndividualVO
        target.setKin(getIndividualDao().toIndividualVO(source.getKin()));
    }


    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#toNextOfKinVO(com.systemsjr.jrbase.individual.NextOfKin)
     */
    public com.systemsjr.jrbase.individual.vo.KinVO toKinVO(final com.systemsjr.jrbase.individual.Kin entity)
    {
        // @todo verify behavior of toNextOfKinVO
        return super.toKinVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.individual.Kin loadKinFromKinVO(com.systemsjr.jrbase.individual.vo.KinVO nextOfKinVO)
    {
        com.systemsjr.jrbase.individual.Kin nextOfKin = null;
        if (nextOfKinVO.getId() == null)
        {
            nextOfKin = com.systemsjr.jrbase.individual.Kin.Factory.newInstance();
        } else{
        	nextOfKin = this.load(nextOfKinVO.getId());
        }
        return nextOfKin;
        
    }

    
    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#nextOfKinVOToEntity(com.systemsjr.jrbase.individual.vo.NextOfKinVO)
     */
    public com.systemsjr.jrbase.individual.Kin kinVOToEntity(com.systemsjr.jrbase.individual.vo.KinVO nextOfKinVO)
    {
        // @todo verify behavior of nextOfKinVOToEntity
        com.systemsjr.jrbase.individual.Kin entity = this.loadKinFromKinVO(nextOfKinVO);
        this.kinVOToEntity(nextOfKinVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.individual.NextOfKinDao#nextOfKinVOToEntity(com.systemsjr.jrbase.individual.vo.NextOfKinVO, com.systemsjr.jrbase.individual.NextOfKin)
     */
    public void kinVOToEntity(
        com.systemsjr.jrbase.individual.vo.KinVO source,
        com.systemsjr.jrbase.individual.Kin target,
        boolean copyIfNull)
    {
        // @todo verify behavior of nextOfKinVOToEntity
        super.kinVOToEntity(source, target, copyIfNull);
    }

}