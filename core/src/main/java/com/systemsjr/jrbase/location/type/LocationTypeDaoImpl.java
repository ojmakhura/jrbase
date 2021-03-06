// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on 01/26/2019 23:54:27+0000.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location.type;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.systemsjr.jrbase.location.type.vo.LocationTypeSearchCriteria;
import com.systemsjr.jrbase.location.type.vo.LocationTypeVO;

/**
 * @see LocationType
 */
@Repository
public class LocationTypeDaoImpl
    extends LocationTypeDaoBase
{
	/**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#findByCriteria(com.systemsjr.jrbase.location.vo.LocationTypeSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(LocationTypeSearchCriteria searchCriteria)
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
        LocationType source,
        LocationTypeVO target)
    {
        // @todo verify behavior of toLocationTypeVO
        super.toLocationTypeVO(source, target);
        if(source.getFallsWithinLocationType() != null){
        	LocationTypeVO type = new LocationTypeVO();
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
	public LocationTypeVO toLocationTypeVO(final LocationType entity)
    {
        // @todo verify behavior of toLocationTypeVO
        return super.toLocationTypeVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private LocationType loadLocationTypeFromLocationTypeVO(LocationTypeVO locationTypeVO)
    {
        // A typical implementation looks like this:
        LocationType locationType;// = this.load(locationTypeVO.getId());
        if (locationTypeVO.getId() == null)
        {
            locationType = LocationType.Factory.newInstance();
        } else{
        	locationType = this.load(locationTypeVO.getId());
        }
        return locationType;
    }

    
    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#locationTypeVOToEntity(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	public LocationType locationTypeVOToEntity(LocationTypeVO locationTypeVO)
    {
        // @todo verify behavior of locationTypeVOToEntity
        LocationType entity = this.loadLocationTypeFromLocationTypeVO(locationTypeVO);
        this.locationTypeVOToEntity(locationTypeVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.location.LocationTypeDao#locationTypeVOToEntity(com.systemsjr.jrbase.location.vo.LocationTypeVO, com.systemsjr.jrbase.location.LocationType)
     */
    @Override
	public void locationTypeVOToEntity(
        LocationTypeVO source,
        LocationType target,
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