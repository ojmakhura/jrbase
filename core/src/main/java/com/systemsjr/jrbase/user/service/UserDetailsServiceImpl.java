// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user.service;

import com.systemsjr.jrbase.ServiceLocator;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;

/**
 * @see com.systemsjr.jrbase.user.service.UserDetailsService
 */
public class UserDetailsServiceImpl
    extends com.systemsjr.jrbase.user.service.UserDetailsServiceBase
{

    /**
     * @see com.systemsjr.jrbase.user.service.UserDetailsService#getUserDetails(java.lang.String)
     */
    protected  com.systemsjr.jrbase.user.vo.UserVO handleGetUserDetails(java.lang.String username)
        throws java.lang.Exception
    {
    	SecurityService service = ServiceLocator.instance().getSecurityService();
    	UserDetailsVO userDetailsVO = service.getUserDetails(username);
    	   	 	
    	return userDetailsVO;
    }

}