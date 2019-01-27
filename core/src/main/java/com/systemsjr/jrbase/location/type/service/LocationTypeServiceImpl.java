// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::location::type::service::LocationTypeService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.location.type.service;

import com.systemsjr.jrbase.location.LocationStatus;
import com.systemsjr.jrbase.location.type.LocationType;
import com.systemsjr.jrbase.location.type.vo.LocationTypeSearchCriteria;
import com.systemsjr.jrbase.location.type.vo.LocationTypeVO;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 * @see com.systemsjr.jrbase.location.type.service.LocationTypeService
 */
@Service("com.systemsjr.jrbase.location.type.service.LocationTypeService")
public class LocationTypeServiceImpl
    extends LocationTypeServiceBase
{
	/**
     * @see com.systemsjr.jrbase.location.service.LocationTypeService#findById(Long)
     */
    @Override
    protected  LocationTypeVO handleFindById(Long id)
        throws Exception
    {
    	return id == null ? null : getLocationTypeDao().toLocationTypeVO(getLocationTypeDao().load(id));
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationTypeService#searchLocationTypes(LocationTypeSearchCriteria)
     */
    @Override
    protected  Collection<LocationTypeVO> handleSearchLocationTypes(LocationTypeSearchCriteria searchCriteria)
        throws Exception
    {
    	Collection<LocationType> types = getLocationTypeDao().findByCriteria(searchCriteria);
		return getLocationTypeDao().toLocationTypeVOCollection(types);
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationTypeService#getLocationTypesByStatus(LocationStatus)
     */
    @Override
    protected  Collection<LocationTypeVO> handleGetLocationTypesByStatus(LocationStatus status)
        throws Exception
    {
        // TODO implement protected  Collection<LocationTypeVO> handleGetLocationTypesByStatus(LocationStatus status)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationTypeService.handleGetLocationTypesByStatus(LocationStatus status) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationTypeService#getAllLocationTypes()
     */
    @Override
    protected  Collection<LocationTypeVO> handleGetAllLocationTypes()
        throws Exception
    {
        // TODO implement protected  Collection<LocationTypeVO> handleGetAllLocationTypes()
        throw new UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationTypeService.handleGetAllLocationTypes() Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationTypeService#saveLocationType(LocationTypeVO)
     */
    @Override
    protected  LocationTypeVO handleSaveLocationType(LocationTypeVO areaTypeVO)
        throws Exception
    {
        // TODO implement protected  LocationTypeVO handleSaveLocationType(LocationTypeVO areaTypeVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationTypeService.handleSaveLocationType(LocationTypeVO areaTypeVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.location.service.LocationTypeService#removeLocationType(LocationTypeVO)
     */
    @Override
    protected  void handleRemoveLocationType(LocationTypeVO locationTypeVO)
        throws Exception
    {
        // TODO implement protected  void handleRemoveLocationType(LocationTypeVO locationTypeVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.location.service.LocationTypeService.handleRemoveLocationType(LocationTypeVO locationTypeVO) Not implemented!");
    }
}