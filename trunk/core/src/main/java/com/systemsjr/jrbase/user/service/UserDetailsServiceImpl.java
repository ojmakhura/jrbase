// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user.service;

import org.acegisecurity.userdetails.UsernameNotFoundException;

import com.systemsjr.jrbase.ServiceLocator;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserVO;

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
    	
    	if (userDetailsVO == null) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }
    	
    	//UserVO userVO = new UserVO(userDetailsVO.getStatus(), userDetailsVO.getName(), userDetailsVO.getUserId(), userDetailsVO.getId(), userDetailsVO.getUsername(), userDetailsVO.getIndividual());
        return userDetailsVO;
    }

}