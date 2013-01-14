// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.location.vo.LocationVO;

/**
 * @see com.systemsjr.jrbase.location.Location
 */
public class LocationDaoImpl
    extends com.systemsjr.jrbase.location.LocationDaoBase
{
    /**
     * @see com.systemsjr.jrbase.location.LocationDao#findByCriteria(com.systemsjr.jrbase.location.vo.LocationSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.location.vo.LocationSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Location.class);
    	
    	if(searchCriteria.getLevelCode() != null){
    		criteria.add(Restrictions.ilike("levelCode", searchCriteria.getLevelCode()));
    	}
    	
    	if(searchCriteria.getUniqueCode() != null){
    		criteria.add(Restrictions.ilike("uniqueCode", searchCriteria.getUniqueCode()));
    	}
    	
    	if(searchCriteria.getLocationName() != null){
    		criteria.add(Restrictions.ilike("locationName", searchCriteria.getLocationName()));
    	}
    	
    	if(searchCriteria.getStatus() != null){
    		criteria.add(Restrictions.eq("status", searchCriteria.getStatus()));
    	}

    	if(searchCriteria.getLocationTypeVO() != null){
    		criteria.add(Restrictions.eq("locationTypeVO", searchCriteria.getLocationTypeVO()));
    	}
    	
        return criteria.list();
    }

    /**
     * @see com.systemsjr.jrbase.location.LocationDao#toLocationVO(com.systemsjr.jrbase.location.Location, com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	public void toLocationVO(
        com.systemsjr.jrbase.location.Location source,
        com.systemsjr.jrbase.location.vo.LocationVO target)
    {
        // @todo verify behavior of toLocationVO
        super.toLocationVO(source, target);
        // WARNING! No conversion for target.description (can't convert source.getDescription():java.lang.String to String
        target.setDescription(target.getDescription());
        // WARNING! No conversion for target.locationName (can't convert source.getLocationName():java.lang.String to String
        target.setLocationName(source.getLocationName());
        
        // WARNING! No conversion for target.levelCode (can't convert source.getLevelCode():java.lang.String to String
        target.setLevelCode(source.getLevelCode());
        
        target.setLocationType(getLocationTypeDao().toLocationTypeVO(source.getLocationType()));
        
        if(source.getFallsWithinArea() != null){
        	LocationVO locationVO = new LocationVO();
        	locationVO.setDescription(source.getFallsWithinArea().getDescription());
        	locationVO.setId(source.getFallsWithinArea().getId());
        	locationVO.setLevelCode(source.getFallsWithinArea().getLevelCode());
        	locationVO.setLocationName(source.getFallsWithinArea().getLocationName());
        	locationVO.setLocationType(getLocationTypeDao().toLocationTypeVO(source.getFallsWithinArea().getLocationType()));
        	locationVO.setStatus(source.getFallsWithinArea().getStatus());
        	locationVO.setType(source.getFallsWithinArea().getType());
        	target.setFallsWithinLocation(locationVO);
        }
    }


    /**
     * @see com.systemsjr.jrbase.location.LocationDao#toLocationVO(com.systemsjr.jrbase.location.Location)
     */
    @Override
	public com.systemsjr.jrbase.location.vo.LocationVO toLocationVO(final com.systemsjr.jrbase.location.Location entity)
    {
        // @todo verify behavior of toLocationVO
        return super.toLocationVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.location.Location loadLocationFromLocationVO(com.systemsjr.jrbase.location.vo.LocationVO locationVO)
    {
        // A typical implementation looks like this:
        com.systemsjr.jrbase.location.Location location;// = this.load(locationVO.getId());
        if (locationVO.getId() == null)
        {
            location = com.systemsjr.jrbase.location.Location.Factory.newInstance();
        } else{
        	location = this.load(locationVO.getId());
        }
        	
        return location;
    }

    
    /**
     * @see com.systemsjr.jrbase.location.LocationDao#locationVOToEntity(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	public com.systemsjr.jrbase.location.Location locationVOToEntity(com.systemsjr.jrbase.location.vo.LocationVO locationVO)
    {
        // @todo verify behavior of locationVOToEntity
        com.systemsjr.jrbase.location.Location entity = this.loadLocationFromLocationVO(locationVO);
        this.locationVOToEntity(locationVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.location.LocationDao#locationVOToEntity(com.systemsjr.jrbase.location.vo.LocationVO, com.systemsjr.jrbase.location.Location)
     */
    @Override
	public void locationVOToEntity(
        com.systemsjr.jrbase.location.vo.LocationVO source,
        com.systemsjr.jrbase.location.Location target,
        boolean copyIfNull)
    {
        // @todo verify behavior of locationVOToEntity
        super.locationVOToEntity(source, target, copyIfNull);
        // No conversion for target.levelCode (can't convert source.getLevelCode():String to java.lang.String
        if(copyIfNull || source.getLevelCode() != null){
        	target.setLevelCode(source.getLevelCode());
        }
        
        // No conversion for target.locationName (can't convert source.getLocationName():String to java.lang.String
        if(copyIfNull || source.getLocationName() != null){
        	target.setLocationName(source.getLocationName());
        }
        
        // No conversion for target.description (can't convert source.getDescription():String to java.lang.String
        if(copyIfNull || source.getDescription() != null){
        	target.setDescription(source.getDescription());
        }
        
        if(copyIfNull || source.getLocationType() != null){
        	target.setLocationType(getLocationTypeDao().locationTypeVOToEntity(source.getLocationType()));
        }
    }
    

}