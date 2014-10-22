// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.user.User;
import com.systemsjr.jrbase.user.UserLocationStatus;
import com.systemsjr.jrbase.user.UserStatus;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserLocationSearchCriteria;
import com.systemsjr.jrbase.user.vo.UserLocationVO;
import com.systemsjr.jrbase.user.vo.UserSearchCriteria;

/**
 * @see com.systemsjr.jrbase.user.service.UserService
 */
public class UserServiceImpl
    extends com.systemsjr.jrbase.user.service.UserServiceBase
{

    /**
     * @see com.systemsjr.jrbase.user.service.UserService#saveUser(com.systemsjr.jrbase.user.vo.UserVO)
     */
    @Override
	protected  com.systemsjr.jrbase.user.vo.UserVO handleSaveUser(com.systemsjr.jrbase.user.vo.UserDetailsVO userDetailsVO)
        throws java.lang.Exception
    {
    	User user;
    	
    	if(userDetailsVO.getId() == null){
    		//user = getUserDao().create(getUserDao().userVOToEntity(userVO));
    		user = getUserDao().create(getUserDao().userDetailsVOToEntity(userDetailsVO));
    	} else{
    		user = getUserDao().userDetailsVOToEntity(userDetailsVO);
    		getUserDao().update(user);
    	}
    	
    	return getUserDao().toUserDetailsVO(user);
    }    

	@Override
	protected void handleRemoveUser(UserDetailsVO userVO) throws Exception {
		
		if(userVO.getId() != null){
			getUserDao().remove(userVO.getId());
		}
		
	}

	@Override
	protected LocationVO[] handleGetUserLocations(UserDetailsVO userVO) throws Exception {
		ArrayList<LocationVO> locations = new ArrayList<LocationVO>();
		UserLocationVO[] userLocations = getUserLocationDao().toUserLocationVOArray(getUserDao().getUserDetails(userVO.getUsername()).getUserLocations());//userVO.getUserLocations();
		
		if(!ArrayUtils.isEmpty(userLocations)){
			for(UserLocationVO userLocation : userLocations){
				locations.add(userLocation.getLocation());
			}
		} else{
			locations = null;
		}
		
		return (LocationVO[]) locations.toArray();
	}

	@Override
	protected UserDetailsVO[] handleGetAllUsers() throws Exception {
		Collection users = getUserDao().loadAll();
		return getUserDao().toUserDetailsVOArray(users);
	}

	@Override
	protected UserDetailsVO[] handleGetUsersByStatus(UserStatus status) throws Exception {
		
		UserSearchCriteria searchCriteria = new UserSearchCriteria();
		
		searchCriteria.setStatus(status);
		List users = getUserDao().findByCriteria(searchCriteria);
				
		return getUserDao().toUserDetailsVOArray(users);
	}

	@Override
	protected LocationVO handleGetUserCurrentLocation(UserDetailsVO userVO) throws Exception {
		UserLocationSearchCriteria searchCriteria = new UserLocationSearchCriteria();
		
		if(userVO != null && userVO.getId() != null){
			searchCriteria.setUser(userVO);
			searchCriteria.setStatus(UserLocationStatus.ACTIVE);
		} else{
			return null;
		}
		
		return  getUserLocationDao().toUserLocationVOArray(getUserLocationDao().findByCriteria(searchCriteria))[0].getLocation();
	}

	@Override
	protected UserDetailsVO handleDoLogin(UserDetailsVO userVO) throws Exception {
		//User user = getUserDao().userLogin(userVO.getUsername(), getUserDao().guserVO.getPassword());
		
		return null;//getUserDao().toUserVO(user);
	}

	@Override
	protected UserDetailsVO[] handleSearchUsers(
			UserSearchCriteria searchCriteria) throws Exception {
		if(searchCriteria == null){
			return new UserDetailsVO[]{};
		}
		List users = getUserDao().findByCriteria(searchCriteria);
		return getUserDao().toUserDetailsVOArray(users);
	}

	@Override
	protected UserLocationVO[] handleSearchUserLocation(
			UserLocationSearchCriteria searchCriteria) throws Exception {
		if(searchCriteria == null){
			return new UserLocationVO[]{};
		}
		List userLocations = getUserLocationDao().findByCriteria(searchCriteria);
		return getUserLocationDao().toUserLocationVOArray(userLocations);
	}

}