// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationTypeSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
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
    		criteria.add(Restrictions.eq("locationType", getLocationTypeDao().locationTypeVOToEntity(searchCriteria.getLocationTypeVO())));
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
        super.toLocationVO(source, target);
        target.setDescription(target.getDescription());
        target.setLocationName(source.getLocationName());
        
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
        com.systemsjr.jrbase.location.Location location;
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
        super.locationVOToEntity(source, target, copyIfNull);
        if(copyIfNull || source.getLevelCode() != null){
        	target.setLevelCode(source.getLevelCode());
        }
        
        if(copyIfNull || source.getLocationName() != null){
        	target.setLocationName(source.getLocationName());
        }
        
        if(copyIfNull || source.getDescription() != null){
        	target.setDescription(source.getDescription());
        }
        
        if(copyIfNull || source.getLocationType() != null){
        	target.setLocationType(getLocationTypeDao().locationTypeVOToEntity(source.getLocationType()));
        }
    }

	@Override
	protected List handleFindCountries() throws Exception {
    	LocationSearchCriteria searchCritera = new LocationSearchCriteria();
    	LocationTypeSearchCriteria typeCriteria = new LocationTypeSearchCriteria();
    	typeCriteria.setLevelCode("CTR");
    	LocationTypeVO[] types = getLocationTypeDao().toLocationTypeVOArray(getLocationTypeDao().findByCriteria(typeCriteria));
    	
    	searchCritera.setLocationTypeVO(types[0]);
    	
        return findByCriteria(searchCritera);
	}
    

}