// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.user.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import com.jrsystems.jrbase.location.vo.LocationVO;
import com.jrsystems.jrbase.user.User;
import com.jrsystems.jrbase.user.UserDao;
import com.jrsystems.jrbase.user.UserLocationStatus;
import com.jrsystems.jrbase.user.UserStatus;
import com.jrsystems.jrbase.user.vo.UserLocationSearchCriteria;
import com.jrsystems.jrbase.user.vo.UserLocationVO;
import com.jrsystems.jrbase.user.vo.UserSearchCriteria;
import com.jrsystems.jrbase.user.vo.UserVO;

/**
 * @see com.jrsystems.jrbase.user.service.UserService
 */
public class UserServiceImpl
    extends com.jrsystems.jrbase.user.service.UserServiceBase
{

    /**
     * @see com.jrsystems.jrbase.user.service.UserService#saveUser(com.jrsystems.jrbase.user.vo.UserVO)
     */
    protected  com.jrsystems.jrbase.user.vo.UserVO handleSaveUser(com.jrsystems.jrbase.user.vo.UserVO userVO)
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
	protected List handleGetAllUsers() throws Exception {
		return Arrays.asList((UserVO[])getUserDao().loadAll(UserDao.TRANSFORM_USERVO).toArray());
	}

	@Override
	protected List handleGetUsersByStatus(UserStatus status) throws Exception {
		
		UserSearchCriteria searchCriteria = new UserSearchCriteria();
		
		searchCriteria.setStatus(status);
		
		return getUserDao().findByCriteria(searchCriteria);
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