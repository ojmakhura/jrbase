package com.systemsjr.jrbase.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.systemsjr.jrbase.ServiceLocator;
import com.systemsjr.jrbase.user.service.SecurityService;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;

public class UserDetailsServiceImpl implements UserDetailsService{
	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		SecurityService service = ServiceLocator.instance().getSecurityService();
		UserDetailsVO userDetails = service.getUserDetails(arg0);
		if (userDetails == null) {
            throw new UsernameNotFoundException("User " + arg0 + " not found");
        }
		
        return new UserDetailsImpl(userDetails);
	}

}
