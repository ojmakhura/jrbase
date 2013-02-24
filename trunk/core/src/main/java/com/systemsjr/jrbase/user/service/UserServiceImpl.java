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
import com.systemsjr.jrbase.user.vo.UserLocationSearchCriteria;
import com.systemsjr.jrbase.user.vo.UserLocationVO;
import com.systemsjr.jrbase.user.vo.UserSearchCriteria;
import com.systemsjr.jrbase.user.vo.UserVO;

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
	protected  com.systemsjr.jrbase.user.vo.UserVO handleSaveUser(com.systemsjr.jrbase.user.vo.UserVO userVO)
        throws java.lang.Exception
    {
    	User user;
    	
    	if(userVO.getId() == null){
    		user = getUserDao().create(getUserDao().userVOToEntity(userVO));
    	} else{
    		user = getUserDao().userVOToEntity(userVO);
    		getUserDao().update(user);
    	}
    	
    	return getUserDao().toUserVO(user);
    }    

	@Override
	protected void handleRemoveUser(UserVO userVO) throws Exception {
		
		if(userVO.getId() != null){
			getUserDao().remove(userVO.getId());
		}
		
	}

	@Override
	protected LocationVO[] handleGetUserLocations(UserVO userVO) throws Exception {
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
	protected UserVO[] handleGetAllUsers() throws Exception {
		Collection users = getUserDao().loadAll();
		return getUserDao().toUserVOArray(users);
	}

	@Override
	protected UserVO[] handleGetUsersByStatus(UserStatus status) throws Exception {
		
		UserSearchCriteria searchCriteria = new UserSearchCriteria();
		
		searchCriteria.setStatus(status);
		List users = getUserDao().findByCriteria(searchCriteria);
				
		return getUserDao().toUserVOArray(users);
	}

	@Override
	protected LocationVO handleGetUserCurrentLocation(UserVO userVO) throws Exception {
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
	protected UserVO handleDoLogin(UserVO userVO) throws Exception {
		//User user = getUserDao().userLogin(userVO.getUsername(), getUserDao().guserVO.getPassword());
		
		return null;//getUserDao().toUserVO(user);
	}

}