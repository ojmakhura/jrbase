package com.systemsjr.jrbase.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.systemsjr.jrbase.user.UserStatus;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.role.vo.RoleVO;

public class UserDetailsImpl implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4421860450880873166L;
	private UserDetailsVO userDetailsVO;
    private GrantedAuthority[] authorities;
    
    public UserDetailsImpl(UserDetailsVO userDetailsVO) {
        this.userDetailsVO = userDetailsVO;
        this.authorities = null; // lazily initialized
    }
    
    public UserDetailsVO getUserDetailsVO() {
        return userDetailsVO;
    }
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		RoleVO[] roles = userDetailsVO.getUserRoles();
		authorities = new SimpleGrantedAuthority[roles.length];
		
		for(int i = 0; i < roles.length; i++){
			authorities[i] = new SimpleGrantedAuthority(roles[i].getRole());
		}
		
		return Arrays.asList(authorities);
	}

	@Override
	public String getPassword() {
		return userDetailsVO.getPassword();
	}

	@Override
	public String getUsername() {
		return userDetailsVO.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return (userDetailsVO.getStatus() == UserStatus.ACTIVE);
	}

	@Override
	public boolean isAccountNonLocked() {
		return (userDetailsVO.getStatus() == UserStatus.INACTIVE);
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return (userDetailsVO.getStatus() == UserStatus.INACTIVE);
	}

	@Override
	public boolean isEnabled() {
		return (userDetailsVO.getStatus() == UserStatus.ACTIVE);
	}


}
