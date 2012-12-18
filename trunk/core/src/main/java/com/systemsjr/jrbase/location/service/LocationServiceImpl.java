// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location.service;

import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
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
	protected  LocationVO[] handleGetAllLocationsByType(com.systemsjr.jrbase.location.vo.LocationTypeVO locationTypeVO)
        throws java.lang.Exception
    {
    	if(locationTypeVO == null){
    		return (LocationVO[]) getLocationDao().loadAll(getLocationDao().TRANSFORM_LOCATIONVO).toArray();
    	} else{
	    	LocationSearchCriteria locationCriteria = new LocationSearchCriteria();
	    	locationCriteria.setLocationTypeVO(locationTypeVO);
	    	//Criteria criteria = getLocationTypeDao().
	        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO handleGetAllLocationsByType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
	        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAllLocationsByType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    	}
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
	protected  void handleRemoveLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO handleRemoveLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleRemoveLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#saveLocation(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  com.systemsjr.jrbase.location.vo.LocationVO handleSaveLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO handleSaveLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleSaveLocation(com.systemsjr.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#removeLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  void handleRemoveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleRemoveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleRemoveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#saveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleSaveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleSaveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleSaveLocationType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAllLocationType()
     */
    protected  com.systemsjr.jrbase.location.vo.LocationTypeVO[] handleGetAllLocationType()
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO[] handleGetAllLocationType()
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAllLocationType() Not implemented!");
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
		// TODO Auto-generated method stub
		return null;
	}

}