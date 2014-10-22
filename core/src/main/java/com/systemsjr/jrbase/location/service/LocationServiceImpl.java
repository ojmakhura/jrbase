// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location.service;

import java.util.List;

import com.systemsjr.jrbase.location.Location;
import com.systemsjr.jrbase.location.LocationType;
import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationTypeSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.location.vo.LocationVO;

/**
 * @see com.systemsjr.jrbase.location.service.LocationService
 */
public class LocationServiceImpl
    extends com.systemsjr.jrbase.location.service.LocationServiceBase
{

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAllLocationsByType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  LocationVO[] handleGetAllLocations()
        throws java.lang.Exception
    {
    	LocationVO[] locationVOs = getLocationDao().toLocationVOArray(getLocationDao().loadAll());
    	   	
		return locationVOs;
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getLocationsInLocation(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  LocationVO[] handleGetLocationsInLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO[] handleGetLocationsInLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetLocationsInLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#removeLocation(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  void handleRemoveLocation(com.systemsjr.jrbase.location.vo.LocationVO locationVO)
        throws java.lang.Exception
    {
    	if(locationVO.getId() != null){
    		getLocationDao().remove(locationVO.getId());
    	}
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#saveLocation(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  com.systemsjr.jrbase.location.vo.LocationVO handleSaveLocation(com.systemsjr.jrbase.location.vo.LocationVO locationVO)
        throws java.lang.Exception
    {
    	Location location;
    	
    	if(locationVO.getId() == null){
    		location = getLocationDao().create(getLocationDao().locationVOToEntity(locationVO));
    	}else{
    		location = getLocationDao().locationVOToEntity(locationVO);
    		getLocationDao().update(location);
    	}
    	return getLocationDao().toLocationVO(location);
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#removeLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  void handleRemoveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO locationTypeVO)
        throws java.lang.Exception
    {
    	if(locationTypeVO.getId() != null){
    		getLocationTypeDao().remove(locationTypeVO.getId());
    	}
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#saveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleSaveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO locationTypeVO)
        throws java.lang.Exception
    {
    	LocationType locationType;
    	
    	if(locationTypeVO.getId() == null){
    		locationType = getLocationTypeDao().create(getLocationTypeDao().locationTypeVOToEntity(locationTypeVO));
    	} else{
    		locationType = getLocationTypeDao().locationTypeVOToEntity(locationTypeVO);
    		getLocationTypeDao().update(locationType);
    	}
    	
    	return getLocationTypeDao().toLocationTypeVO(locationType);
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getLocationsByStatus(com.systemsjr.jrbase.location.LocationStatus)
     */
    @Override
	protected  LocationVO[] handleGetLocationByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO[] handleGetLocationsByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetLocationsByStatus(com.systemsjr.jrbase.location.LocationStatus status) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getLocationTypesByStatus(com.systemsjr.jrbase.location.LocationStatus)
     */
    @Override
	protected  LocationTypeVO[] handleGetLocationTypesByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO[] handleGetLocationTypesByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetLocationTypesByStatus(com.systemsjr.jrbase.location.LocationStatus status) Not implemented!");
    }

	@Override
	protected LocationTypeVO[] handleGetAllLocationTypes() throws Exception {
		LocationTypeVO[] locationTypes = getLocationTypeDao().toLocationTypeVOArray(getLocationTypeDao().loadAll());
		
		if(locationTypes == null){
			return new LocationTypeVO[]{};
		}
		
		return locationTypes;
	}

	@Override
	protected LocationVO[] handleGetAllCountries() throws Exception {
		LocationVO[] locations = getLocationDao().toLocationVOArray(getLocationDao().findCountries());
		if(locations == null){
			locations = new LocationVO[]{};
		}
		return locations;
	}

	@Override
	protected LocationVO[] handleSearchLocations(
			LocationSearchCriteria searchCriteria) throws Exception {
		
		if(searchCriteria == null){
			return new LocationVO[]{};
		}
		List locations = getLocationDao().findByCriteria(searchCriteria);
		return getLocationDao().toLocationVOArray(locations);
	}

	@Override
	protected LocationTypeVO[] handleSearchLocationTypes(
			LocationTypeSearchCriteria searchCriteria) throws Exception {
		
		if(searchCriteria == null){
			return new LocationTypeVO[]{};
		}
		
		List types = getLocationTypeDao().findByCriteria(searchCriteria);
		return getLocationTypeDao().toLocationTypeVOArray(types);
	}

}