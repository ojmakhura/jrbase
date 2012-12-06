// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.location;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.jrsystems.jrbase.location.LocationType
 */
public class LocationTypeDaoImpl
    extends com.jrsystems.jrbase.location.LocationTypeDaoBase
{
    /**
     * @see com.jrsystems.jrbase.location.LocationTypeDao#findByCriteria(com.jrsystems.jrbase.location.vo.LocationTypeSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.location.vo.LocationTypeSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(LocationType.class);
    	
    	if(searchCriteria.getLevelCode() != null){
    		criteria.add(Restrictions.ilike("levelCode", searchCriteria.getLevelCode()));
    	}
    	
    	if(searchCriteria.getName() != null){
    		criteria.add(Restrictions.ilike("name", searchCriteria.getName()));
    	}
    	
    	if(searchCriteria.getDescription() != null){
    		criteria.add(Restrictions.ilike("description", searchCriteria.getDescription()));
    	}
    	
    	if(searchCriteria.getStatus() != null){
    		criteria.add(Restrictions.eq("status", searchCriteria.getStatus()));
    	}
    	
        // @todo implement public com.jrsystems.jrbase.location.vo.LocationTypeVO[] handleFindByCriteria(com.jrsystems.jrbase.location.vo.LocationTypeSearchCriteria searchCriteria)
        return criteria.list();
}

    /**
     * @see com.jrsystems.jrbase.location.LocationTypeDao#toLocationTypeVO(com.jrsystems.jrbase.location.LocationType, com.jrsystems.jrbase.location.vo.LocationTypeVO)
     */
    public void toLocationTypeVO(
        com.jrsystems.jrbase.location.LocationType source,
        com.jrsystems.jrbase.location.vo.LocationTypeVO target)
    {
        // @todo verify behavior of toLocationTypeVO
        super.toLocationTypeVO(source, target);
    }


    /**
     * @see com.jrsystems.jrbase.location.LocationTypeDao#toLocationTypeVO(com.jrsystems.jrbase.location.LocationType)
     */
    public com.jrsystems.jrbase.location.vo.LocationTypeVO toLocationTypeVO(final com.jrsystems.jrbase.location.LocationType entity)
    {
        // @todo verify behavior of toLocationTypeVO
        return super.toLocationTypeVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.location.LocationType loadLocationTypeFromLocationTypeVO(com.jrsystems.jrbase.location.vo.LocationTypeVO locationTypeVO)
    {
        // @todo implement loadLocationTypeFromLocationTypeVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.loadLocationTypeFromLocationTypeVO(com.jrsystems.jrbase.location.vo.LocationTypeVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.location.LocationType locationType = this.load(locationTypeVO.getId());
        if (locationType == null)
        {
            locationType = com.jrsystems.jrbase.location.LocationType.Factory.newInstance();
        }
        return locationType;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.location.LocationTypeDao#locationTypeVOToEntity(com.jrsystems.jrbase.location.vo.LocationTypeVO)
     */
    public com.jrsystems.jrbase.location.LocationType locationTypeVOToEntity(com.jrsystems.jrbase.location.vo.LocationTypeVO locationTypeVO)
    {
        // @todo verify behavior of locationTypeVOToEntity
        com.jrsystems.jrbase.location.LocationType entity = this.loadLocationTypeFromLocationTypeVO(locationTypeVO);
        this.locationTypeVOToEntity(locationTypeVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.location.LocationTypeDao#locationTypeVOToEntity(com.jrsystems.jrbase.location.vo.LocationTypeVO, com.jrsystems.jrbase.location.LocationType)
     */
    public void locationTypeVOToEntity(
        com.jrsystems.jrbase.location.vo.LocationTypeVO source,
        com.jrsystems.jrbase.location.LocationType target,
        boolean copyIfNull)
    {
        // @todo verify behavior of locationTypeVOToEntity
        super.locationTypeVOToEntity(source, target, copyIfNull);
    }

}