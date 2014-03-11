package com.systemsjr.jrlib.utils;

import java.util.Calendar;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.security.ApplicationSecurityManager;

import com.systemsjr.jrbase.ServiceLocator;
import com.systemsjr.jrbase.loginsession.service.LoginSessionService;
import com.systemsjr.jrbase.user.service.UserService;

public class JRLibServiceUtils {
	private static LoginSessionService loginService;
	private static UserService userService;
	
	protected static ServiceLocator serviceLocator = ServiceLocator.instance();
	public static final String dateFormat = "dd-MMM-yyyy HH:mm:ss";
	
	public static Calendar calendar = Calendar.getInstance();
	
	public static LoginSessionService getLoginService(){
		if(loginService == null){
			loginService = serviceLocator.getLoginSessionService();
		}
		
		return loginService;
	}
	
	/**
	 * Gets the user service.
	 * If the user service is null, we retrieve it from the service locator
	 * @return UserService
	 */
	public static UserService getUserService() {
		if(userService == null){
			userService = serviceLocator.getUserService();
		}
		return userService;
	}
	
	/**
	 * Gets the service locator
	 * @return
	 */
	public static ServiceLocator getServiceLocator() {
		return serviceLocator;
	}
	
	/**
	 * Gets the username of the currently logged in user
	 * @return
	 */
	public static String getCurrentUsername() {
		ApplicationSecurityManager sm = (ApplicationSecurityManager) Application
			.services().getService(ApplicationSecurityManager.class);
		if (sm.getAuthentication() != null) {
			return sm.getAuthentication().getName();
		}
		return null;
	}
}
