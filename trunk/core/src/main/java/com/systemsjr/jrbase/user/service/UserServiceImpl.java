// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.user.User;
import com.systemsjr.jrbase.user.UserDao;
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
    	User user = getUserDao().userVOToEntity(userVO);
    	
    	if(user.getId() == null){
    		user = getUserDao().create(user);
    	} else{
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
	protected List handleGetUserLocations(UserVO userVO) throws Exception {
		ArrayList<LocationVO> locations = new ArrayList<LocationVO>();
		UserLocationVO[] userLocations = userVO.getUserLocations();
		
		if(!ArrayUtils.isEmpty(userLocations)){
			for(UserLocationVO userLocation : userLocations){
				locations.add(userLocation.getLocation());
			}
		} else{
			locations = null;
		}
		
		return locations;
	}

	@Override
	protected UserVO[] handleGetAllUsers() throws Exception {
		return (UserVO[])getUserDao().loadAll(UserDao.TRANSFORM_USERVO).toArray();
	}

	@Override
	protected UserVO[] handleGetUsersByStatus(UserStatus status) throws Exception {
		
		UserSearchCriteria searchCriteria = new UserSearchCriteria();
		
		searchCriteria.setStatus(status);
		
		return (UserVO[]) getUserDao().findByCriteria(searchCriteria).toArray();
	}

	@Override
	protected UserVO handleGetUserDetails(String username) throws Exception {
		UserSearchCriteria searchCriteria = new UserSearchCriteria();
		
		searchCriteria.setUsername(username);
		
		return (UserVO)getUserDao().findByCriteria(searchCriteria).get(0);
	}

	@Override
	protected UserVO handleGetUserCurrentLocation(UserVO userVO) throws Exception {
		UserLocationSearchCriteria searchCriteria = new UserLocationSearchCriteria();
		
		if(userVO != null && userVO.getId() != null){
			searchCriteria.setUser(userVO);
			searchCriteria.setStatus(UserLocationStatus.ACTIVE);
		} else{
			return null;
		}
		
		return (UserVO) getUserLocationDao().findByCriteria(searchCriteria).toArray()[0];
	}

}