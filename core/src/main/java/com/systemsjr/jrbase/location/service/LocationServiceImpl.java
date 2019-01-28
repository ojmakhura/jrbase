// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::location::service::LocationService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.location.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.location.Location;
import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationVO;

/**
 * @see com.systemsjr.jrbase.location.service.LocationService
 */
@Service("com.systemsjr.jrbase.location.service.LocationService")
public class LocationServiceImpl
    extends LocationServiceBase
{

	/**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAllLocationsByType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  Collection<LocationVO> handleGetAllLocations()
        throws java.lang.Exception
    {
    	Collection<LocationVO> locationVOs = getLocationDao().toLocationVOCollection(getLocationDao().loadAll());
    	   	
		return locationVOs;
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getLocationsInLocation(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  Collection<LocationVO> handleGetLocationsInLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
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
     * @see com.systemsjr.jrbase.location.service.LocationService#getLocationsByStatus(com.systemsjr.jrbase.location.LocationStatus)
     */
    @Override
	protected  Collection<LocationVO> handleGetLocationByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
    	LocationSearchCriteria criteria = new LocationSearchCriteria();
    	criteria.setStatus(status);
    	
    	return this.searchLocations(criteria);
    }

	@Override
	protected Collection<LocationVO> handleGetAllCountries() throws Exception {
		Collection<LocationVO> locations = getLocationDao().toLocationVOCollection(getLocationDao().findCountries());
		
		return locations;
	}

	@Override
	protected Collection<LocationVO> handleSearchLocations(
			LocationSearchCriteria searchCriteria) throws Exception {
		
		Collection<Location> locations = getLocationDao().findByCriteria(searchCriteria);
		return getLocationDao().toLocationVOCollection(locations);
	}

	@Override
	protected LocationVO handleFindById(Long id) throws Exception {
		return id == null ? null : getLocationDao().toLocationVO(getLocationDao().load(id));
	}

}