// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::user::location::service::UserLocationService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.user.location.service;

import com.systemsjr.jrbase.user.User;
import com.systemsjr.jrbase.user.location.UserLocation;
import com.systemsjr.jrbase.user.location.UserLocationStatus;
import com.systemsjr.jrbase.user.location.vo.UserLocationSearchCriteria;
import com.systemsjr.jrbase.user.location.vo.UserLocationVO;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 * @see com.systemsjr.jrbase.user.location.service.UserLocationService
 */
@Service("com.systemsjr.jrbase.user.location.service.UserLocationService")
public class UserLocationServiceImpl
    extends UserLocationServiceBase
{

	/**
     * @see com.systemsjr.jrbase.user.service.UserLocationService#searchUserLocation(UserLocationSearchCriteria)
     */
    @Override
    protected  Collection<UserLocationVO> handleSearchUserLocation(UserLocationSearchCriteria searchCriteria)
        throws Exception
    {
    	Collection<UserLocation> userLocations = getUserLocationDao().findByCriteria(searchCriteria);
		return getUserLocationDao().toUserLocationVOCollection(userLocations);
    }

    /**
     * @see com.systemsjr.jrbase.user.service.UserLocationService#getUserCurrentLocation(UserDetailsVO)
     */
    @Override
    protected  UserLocationVO handleGetUserCurrentLocation(UserDetailsVO userVO)
        throws Exception
    {
    	UserLocationSearchCriteria searchCriteria = new UserLocationSearchCriteria();
		
		if(userVO != null && userVO.getId() != null){
			searchCriteria.setUser(userVO);
			searchCriteria.setStatus(UserLocationStatus.ACTIVE);
		} else{
			return null;
		}
		
		return  getUserLocationDao().toUserLocationVOArray(getUserLocationDao().findByCriteria(searchCriteria))[0];
    }

    /**
     * @see com.systemsjr.jrbase.user.service.UserLocationService#getUserLocations(UserDetailsVO)
     */
    @Override
    protected  Collection<UserLocationVO> handleGetUserLocations(UserDetailsVO userVO)
        throws Exception
    {
    	
    	if(userVO == null || userVO.getId() != null)
    	{
    		return null;
    	}
    	
    	User user = getUserDao().load(userVO.getId());
    	Collection<UserLocation> userLocations = user.getUserLocations();
    				
		return getUserLocationDao().toUserLocationVOCollection(userLocations);
    }

    /**
     * @see com.systemsjr.jrbase.user.service.UserLocationService#saveUserLocation(UserLocationVO)
     */
    @Override
    protected  UserLocationVO handleSaveUserLocation(UserLocationVO userLocationVO)
        throws Exception
    {
    	if(userLocationVO == null)
    	{
    		return null;
    	}
    	
    	UserLocation userLocation = getUserLocationDao().userLocationVOToEntity(userLocationVO);
    	userLocation = getUserLocationDao().createOrUpdate(userLocation);
    	
    	return getUserLocationDao().toUserLocationVO(userLocation);
    }

    /**
     * @see com.systemsjr.jrbase.user.service.UserLocationService#removeUserLocation(UserLocationVO)
     */
    @Override
    protected  void handleRemoveUserLocation(UserLocationVO userLocationVO)
        throws Exception
    {
    	
    	if(userLocationVO != null && userLocationVO.getId() != null)
    	{
    		getUserLocationDao().remove(userLocationVO.getId());
    	}
    }

    /**
     * @see com.systemsjr.jrbase.user.service.UserLocationService#getAllUserLocations()
     */
    @Override
    protected  Collection<UserLocationVO> handleGetAllUserLocations()
        throws Exception
    {
    	Collection<UserLocation> locations = getUserLocationDao().loadAll();
    	
    	return getUserLocationDao().toUserLocationVOCollection(locations);
    }

	@Override
	protected UserLocationVO handleFindById(Long id) throws Exception {
		
		return id == null ? null : getUserLocationDao().toUserLocationVO(getUserLocationDao().load(id));
	}
}