// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.user.User;
import com.systemsjr.jrbase.user.UserStatus;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserSearchCriteria;
import com.systemsjr.jrbase.user.vo.UserVO;

/**
 * @see com.systemsjr.jrbase.user.service.UserService
 */
@Service("com.systemsjr.jrbase.user.service.UserService")
public class UserServiceImpl
    extends com.systemsjr.jrbase.user.service.UserServiceBase
{

    /**
     * @see com.systemsjr.jrbase.user.service.UserService#saveUser(com.systemsjr.jrbase.user.vo.UserVO)
     */
    @Override
	protected UserVO handleSaveUser(UserDetailsVO userDetailsVO)
        throws java.lang.Exception
    {
    	User user;
    	
    	if(userDetailsVO.getId() == null){
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
	protected Collection<UserDetailsVO> handleGetAllUsers() throws Exception {
		Collection<User> users = getUserDao().loadAll();
		return getUserDao().toUserDetailsVOCollection(users);
	}

	@Override
	protected Collection<UserDetailsVO> handleGetUsersByStatus(UserStatus status) throws Exception {
		
		UserSearchCriteria searchCriteria = new UserSearchCriteria();
		
		searchCriteria.setStatus(status);
		Collection<User> users = getUserDao().findByCriteria(searchCriteria);
				
		return getUserDao().toUserDetailsVOCollection(users);
	}


	@Override
	protected UserDetailsVO handleDoLogin(UserDetailsVO userVO) throws Exception {
		//User user = getUserDao().userLogin(userVO.getUsername(), getUserDao().guserVO.getPassword());
		
		return null;//getUserDao().toUserVO(user);
	}

	@Override
	protected Collection<UserDetailsVO> handleSearchUsers(
			UserSearchCriteria searchCriteria) throws Exception {
		Collection<User> users = getUserDao().findByCriteria(searchCriteria);
		return getUserDao().toUserDetailsVOCollection(users);
	}

	@Override
	protected UserDetailsVO handleFindById(Long id) throws Exception {
		return id == null ? null : getUserDao().toUserDetailsVO(getUserDao().load(id));
	}

}
