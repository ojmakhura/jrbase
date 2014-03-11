// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user.service;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserSearchCriteria;

/**
 * @see com.systemsjr.jrbase.user.service.SecurityService
 */
public class SecurityServiceImpl
    extends com.systemsjr.jrbase.user.service.SecurityServiceBase
{

    /**
     * @see com.systemsjr.jrbase.user.service.SecurityService#getUserDetails(java.lang.String)
     */
    protected  com.systemsjr.jrbase.user.vo.UserDetailsVO handleGetUserDetails(java.lang.String username)
        throws java.lang.Exception
    {
    	
    	UserSearchCriteria searchCriteria = new UserSearchCriteria();
    	searchCriteria.setUsername(username);
    	
    	UserDetailsVO[] users = getUserDao().toUserDetailsVOArray(getUserDao().findByCriteria(searchCriteria));
    	
    	if(users.length > 0){
    		return users[0];
    	}
    	
    	return null;
    }

}