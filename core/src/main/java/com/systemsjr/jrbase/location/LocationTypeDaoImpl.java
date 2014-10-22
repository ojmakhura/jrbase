// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.location.vo.LocationTypeVO;

/**
 * @see com.systemsjr.jrbase.location.LocationType
 */
public class LocationTypeDaoImpl
    extends com.systemsjr.jrbase.location.LocationTypeDaoBase
{
    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#findByCriteria(com.systemsjr.jrbase.location.vo.LocationTypeSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.location.vo.LocationTypeSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(LocationType.class);
    	
    	if(searchCriteria.getLevelCode() != null){
    		criteria.add(Restrictions.ilike("levelCode",  "%" + searchCriteria.getLevelCode() + "%"));
    	}
    	
    	if(searchCriteria.getName() != null){
    		criteria.add(Restrictions.ilike("name", "%" + searchCriteria.getName() + "%"));
    	}
    	
    	if(searchCriteria.getDescription() != null){
    		criteria.add(Restrictions.ilike("description", "%" + searchCriteria.getDescription() + "%"));
    	}
    	
    	if(searchCriteria.getStatus() != null){
    		criteria.add(Restrictions.eq("status", searchCriteria.getStatus()));
    	}
    	
        return criteria.list();
}

    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#toLocationTypeVO(com.systemsjr.jrbase.location.LocationType, com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	public void toLocationTypeVO(
        com.systemsjr.jrbase.location.LocationType source,
        com.systemsjr.jrbase.location.vo.LocationTypeVO target)
    {
        // @todo verify behavior of toLocationTypeVO
        super.toLocationTypeVO(source, target);
        if(source.getFallsWithinLocationType() != null){
        	com.systemsjr.jrbase.location.vo.LocationTypeVO type = new LocationTypeVO();
        	type.setDescription(source.getFallsWithinLocationType().getDescription());
        	type.setId(source.getFallsWithinLocationType().getId());
        	type.setLevelCode(source.getFallsWithinLocationType().getLevelCode());
        	type.setName(source.getFallsWithinLocationType().getName());
        	type.setStatus(source.getFallsWithinLocationType().getStatus());
        	type.setType(source.getFallsWithinLocationType().getType());
        	type.setUniqueCode(source.getFallsWithinLocationType().getUniqueCode());
        	target.setFallsWithinLocationType(type);
        }
    }


    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#toLocationTypeVO(com.systemsjr.jrbase.location.LocationType)
     */
    @Override
	public com.systemsjr.jrbase.location.vo.LocationTypeVO toLocationTypeVO(final com.systemsjr.jrbase.location.LocationType entity)
    {
        // @todo verify behavior of toLocationTypeVO
        return super.toLocationTypeVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.location.LocationType loadLocationTypeFromLocationTypeVO(com.systemsjr.jrbase.location.vo.LocationTypeVO locationTypeVO)
    {
        // A typical implementation looks like this:
        com.systemsjr.jrbase.location.LocationType locationType;// = this.load(locationTypeVO.getId());
        if (locationTypeVO.getId() == null)
        {
            locationType = com.systemsjr.jrbase.location.LocationType.Factory.newInstance();
        } else{
        	locationType = this.load(locationTypeVO.getId());
        }
        return locationType;
    }

    
    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#locationTypeVOToEntity(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	public com.systemsjr.jrbase.location.LocationType locationTypeVOToEntity(com.systemsjr.jrbase.location.vo.LocationTypeVO locationTypeVO)
    {
        // @todo verify behavior of locationTypeVOToEntity
        com.systemsjr.jrbase.location.LocationType entity = this.loadLocationTypeFromLocationTypeVO(locationTypeVO);
        this.locationTypeVOToEntity(locationTypeVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#locationTypeVOToEntity(com.systemsjr.jrbase.location.vo.LocationTypeVO, com.systemsjr.jrbase.location.LocationType)
     */
    @Override
	public void locationTypeVOToEntity(
        com.systemsjr.jrbase.location.vo.LocationTypeVO source,
        com.systemsjr.jrbase.location.LocationType target,
        boolean copyIfNull)
    {
        // @todo verify behavior of locationTypeVOToEntity
        super.locationTypeVOToEntity(source, target, copyIfNull);
        if(source.getFallsWithinLocationType() != null){
        	LocationType type = this.loadLocationTypeFromLocationTypeVO(source.getFallsWithinLocationType());
        	target.setFallsWithinLocationType(type);
        }
    }

}