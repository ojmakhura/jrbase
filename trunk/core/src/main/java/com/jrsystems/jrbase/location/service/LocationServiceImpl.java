// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.location.service;

import java.util.List;

import org.hibernate.Criteria;

import com.jrsystems.jrbase.location.vo.LocationSearchCriteria;
import com.jrsystems.jrbase.location.vo.LocationTypeSearchCriteria;

/**
 * @see com.jrsystems.jrbase.location.service.LocationService
 */
public class LocationServiceImpl
    extends com.jrsystems.jrbase.location.service.LocationServiceBase
{

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#getAllAreasByType(com.jrsystems.jrbase.location.vo.LocationTypeVO)
     */
    protected  List handleGetAllAreasByType(com.jrsystems.jrbase.location.vo.LocationTypeVO locationTypeVO)
        throws java.lang.Exception
    {
    	LocationSearchCriteria locationCriteria = new LocationSearchCriteria();
    	locationCriteria.setLocationTypeVO(locationTypeVO);
    	//Criteria criteria = getLocationTypeDao().
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationVO handleGetAllAreasByType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleGetAllAreasByType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#getAreasInArea(com.jrsystems.jrbase.location.vo.LocationVO)
     */
    protected  java.util.List handleGetAreasInArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationVO[] handleGetAreasInArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleGetAreasInArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#removeArea(com.jrsystems.jrbase.location.vo.LocationVO)
     */
    protected  void handleRemoveArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationVO handleRemoveArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleRemoveArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#saveArea(com.jrsystems.jrbase.location.vo.LocationVO)
     */
    protected  com.jrsystems.jrbase.location.vo.LocationVO handleSaveArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationVO handleSaveArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleSaveArea(com.jrsystems.jrbase.location.vo.LocationVO areaVO) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#removeAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO)
     */
    protected  void handleRemoveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationTypeVO handleRemoveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleRemoveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#saveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO)
     */
    protected  com.jrsystems.jrbase.location.vo.LocationTypeVO handleSaveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationTypeVO handleSaveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleSaveAreaType(com.jrsystems.jrbase.location.vo.LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#getAllAreaType()
     */
    protected  com.jrsystems.jrbase.location.vo.LocationTypeVO[] handleGetAllAreaType()
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationTypeVO[] handleGetAllAreaType()
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleGetAllAreaType() Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#getAreasByStatus(com.jrsystems.jrbase.location.LocationStatus)
     */
    protected  List handleGetAreasByStatus(com.jrsystems.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationVO[] handleGetAreasByStatus(com.jrsystems.jrbase.location.LocationStatus status)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleGetAreasByStatus(com.jrsystems.jrbase.location.LocationStatus status) Not implemented!");
    }

    /**
     * @see com.jrsystems.jrbase.location.service.LocationService#getAreaTypesByStatus(com.jrsystems.jrbase.location.LocationStatus)
     */
    protected  List handleGetAreaTypesByStatus(com.jrsystems.jrbase.location.LocationStatus status)
        throws java.lang.Exception
    {
        // @todo implement protected  com.jrsystems.jrbase.location.vo.LocationTypeVO[] handleGetAreaTypesByStatus(com.jrsystems.jrbase.location.LocationStatus status)
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.location.service.LocationService.handleGetAreaTypesByStatus(com.jrsystems.jrbase.location.LocationStatus status) Not implemented!");
    }

	@Override
	protected List handleGetAllAreaTypes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}