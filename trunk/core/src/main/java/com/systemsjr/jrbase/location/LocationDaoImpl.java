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
 * @see com.jrsystems.jrbase.location.Location
 */
public class LocationDaoImpl
    extends com.jrsystems.jrbase.location.LocationDaoBase
{
    /**
     * @see com.jrsystems.jrbase.location.LocationDao#findByCriteria(com.jrsystems.jrbase.location.vo.LocationSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.location.vo.LocationSearchCriteria searchCriteria)
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
     * @see com.jrsystems.jrbase.location.LocationDao#toLocationVO(com.jrsystems.jrbase.location.Location, com.jrsystems.jrbase.location.vo.LocationVO)
     */
    public void toLocationVO(
        com.jrsystems.jrbase.location.Location source,
        com.jrsystems.jrbase.location.vo.LocationVO target)
    {
        // @todo verify behavior of toLocationVO
        super.toLocationVO(source, target);
        // WARNING! No conversion for target.description (can't convert source.getDescription():java.lang.String to String
        // WARNING! No conversion for target.locationName (can't convert source.getLocationName():java.lang.String to String
        // WARNING! No conversion for target.levelCode (can't convert source.getLevelCode():java.lang.String to String
    }


    /**
     * @see com.jrsystems.jrbase.location.LocationDao#toLocationVO(com.jrsystems.jrbase.location.Location)
     */
    public com.jrsystems.jrbase.location.vo.LocationVO toLocationVO(final com.jrsystems.jrbase.location.Location entity)
    {
        // @todo verify behavior of toLocationVO
        return super.toLocationVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.location.Location loadLocationFromLocationVO(com.jrsystems.jrbase.location.vo.LocationVO locationVO)
    {
        // @todo implement loadLocationFromLocationVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.loadLocationFromLocationVO(com.jrsystems.jrbase.location.vo.LocationVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.location.Location location = this.load(locationVO.getId());
        if (location == null)
        {
            location = com.jrsystems.jrbase.location.Location.Factory.newInstance();
        }
        return location;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.location.LocationDao#locationVOToEntity(com.jrsystems.jrbase.location.vo.LocationVO)
     */
    public com.jrsystems.jrbase.location.Location locationVOToEntity(com.jrsystems.jrbase.location.vo.LocationVO locationVO)
    {
        // @todo verify behavior of locationVOToEntity
        com.jrsystems.jrbase.location.Location entity = this.loadLocationFromLocationVO(locationVO);
        this.locationVOToEntity(locationVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.location.LocationDao#locationVOToEntity(com.jrsystems.jrbase.location.vo.LocationVO, com.jrsystems.jrbase.location.Location)
     */
    public void locationVOToEntity(
        com.jrsystems.jrbase.location.vo.LocationVO source,
        com.jrsystems.jrbase.location.Location target,
        boolean copyIfNull)
    {
        // @todo verify behavior of locationVOToEntity
        super.locationVOToEntity(source, target, copyIfNull);
        // No conversion for target.levelCode (can't convert source.getLevelCode():String to java.lang.String
        // No conversion for target.locationName (can't convert source.getLocationName():String to java.lang.String
        // No conversion for target.description (can't convert source.getDescription():String to java.lang.String
    }

}