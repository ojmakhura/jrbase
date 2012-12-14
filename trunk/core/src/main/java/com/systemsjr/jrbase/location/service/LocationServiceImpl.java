// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location.service;

import java.util.List;

import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;

/**
 * @see com.systemsjr.jrbase.location.service.LocationService
 */
public class LocationServiceImpl
    extends com.systemsjr.jrbase.location.service.LocationServiceBase
{

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAllAreasByType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  List handleGetAllAreasByType(com.systemsjr.jrbase.location.vo.LocationTypeVO locationTypeVO)
        throws java.lang.Exception
    {
    	LocationSearchCriteria locationCriteria = new LocationSearchCriteria();
    	locationCriteria.setLocationTypeVO(locationTypeVO);
    	//Criteria criteria = getLocationTypeDao().
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO handleGetAllAreasByType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAllAreasByType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAreasInArea(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  java.util.List handleGetAreasInArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO[] handleGetAreasInArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAreasInArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#removeArea(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  void handleRemoveArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO handleRemoveArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleRemoveArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#saveArea(com.systemsjr.jrbase.location.vo.LocationVO)
     */
    @Override
	protected  com.systemsjr.jrbase.location.vo.LocationVO handleSaveArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO handleSaveArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleSaveArea(com.systemsjr.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#removeAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  void handleRemoveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleRemoveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleRemoveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#saveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO)
     */
    @Override
	protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleSaveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO handleSaveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleSaveAreaType(com.systemsjr.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAllAreaType()
     */
    protected  com.systemsjr.jrbase.location.vo.LocationTypeVO[] handleGetAllAreaType()
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO[] handleGetAllAreaType()
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAllAreaType() Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAreasByStatus(com.systemsjr.jrbase.location.LocationStatus)
     */
    @Override
	protected  List handleGetAreasByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationVO[] handleGetAreasByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAreasByStatus(com.systemsjr.jrbase.location.LocationStatus status) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationService#getAreaTypesByStatus(com.systemsjr.jrbase.location.LocationStatus)
     */
    @Override
	protected  List handleGetAreaTypesByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
        // @todo implement protected  com.systemsjr.jrbase.location.vo.LocationTypeVO[] handleGetAreaTypesByStatus(com.systemsjr.jrbase.location.LocationStatus status)
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationService.handleGetAreaTypesByStatus(com.systemsjr.jrbase.location.LocationStatus status) Not implemented!");
    }

	@Override
	protected List handleGetAllAreaTypes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}