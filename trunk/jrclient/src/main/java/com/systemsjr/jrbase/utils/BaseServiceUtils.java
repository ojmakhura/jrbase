package com.systemsjr.jrbase.utils;

import java.util.Calendar;

import org.apache.commons.lang.StringUtils;
import org.jdesktop.swingx.auth.LoginService;

import com.systemsjr.jrbase.ServiceLocator;
import com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService;
import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.counter.service.CounterService;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.individual.service.IndividualService;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.location.service.LocationService;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.loginsession.service.LoginSessionService;
import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;
import com.systemsjr.jrbase.organisation.service.OrganisationService;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.role.service.RoleService;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.user.service.UserDetailsService;
import com.systemsjr.jrbase.user.service.UserService;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.workbench.menu.service.MenuService;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrbase.workbench.program.service.ProgramService;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

public class BaseServiceUtils {
	private static ServiceLocator serviceLocator = ServiceLocator.instance();
	private static UserService userService;
	private static ClearanceLevelService clearanceService;
	private static CounterService counterService;
	private static IndividualService individualService;
	private static LocationService locationService;
	private static LoginSessionService sessionService;
	private static OrganisationService orgService;
	private static RoleService roleService;
	private static LoginSessionService loginService;
	private static LoginSessionVO loginSession;
	private static MenuService menuService;
	private static ProgramService programService;
	private static UserDetailsService userDetailsService;
	
	public static final String dateFormat = "dd-MMM-yyyy HH:mm:ss";
	
	public static Calendar calendar = Calendar.getInstance();
	
	/**
	 * Creates a default role
	 * @return
	 */
	public static RoleVO createDefaultRole(){
		RoleVO roleVO = new RoleVO();
		//roleVO.setCreatedBy(getCurrentUsername());
		
		return roleVO;
	}
	
	/**
	 * Creates a default user
	 * @return
	 */
	public static UserVO createDefaultUser(){
		UserVO user = new UserVO();
		//user.setUserId(counterService.getCount("userCounter"));
		//user.setCreatedBy(getCurrentUsername());
		return user;
	}
	
	/**
	 * Creates a default clearence level
	 * @return
	 */
	public static ClearanceLevelVO createDefaultLevel(){
		ClearanceLevelVO level = new ClearanceLevelVO();
		//level.setCreatedBy(getCurrentUsername());
		return level;
	}
	
	/**
	 * Creates a default individual object
	 * @return
	 */
	public static IndividualVO createDefaultIndividual(){
		IndividualVO individual = new IndividualVO();
		//individual.setIndividualId(counterService.getCount("individualCounter"));
		
		//individual.setCreatedBy(getCurrentUsername());
		
		return individual;
	}
	
	/**
	 * Creates a default counter object
	 * @return
	 */
	public static CounterVO createDefaultCounter(){
		CounterVO counter = new CounterVO();
		counter.setCurrentCount(0l);
		return counter;
	}
	
	/**
	 * Creates a default location of the given type
	 * @param locationTypeVO
	 * @return
	 */
	public static LocationVO createDefaultLocation(LocationTypeVO locationTypeVO){
		LocationVO location = new LocationVO();
		location.setLocationType(locationTypeVO);
		//area.setCreatedBy(getCurrentUsername());
		return location;
	}
	
	/**
	 * Creates a default location with no location type
	 * @return
	 */
	public static LocationVO createDefaultLocation(){
		LocationVO location = new LocationVO();
		//area.setCreatedBy(getCurrentUsername());
		return location;
	}

	/**
	 * Returns the curently logged in user
	 * @return
	 */
	public static UserVO getCurrentUser() {
		String username = getCurrentUsername();
		if (StringUtils.isNotBlank(username)) {
			UserVO user = getUserDetailsService().getUserDetails(username);
			return user;
		}
		return null;
	}
	
	/**
	 * Creates a default location type object
	 * @return
	 */
	public static LocationTypeVO createDefaultLocationType() {
		LocationTypeVO locationType = new LocationTypeVO();
		return locationType;
	}
	
	/**
	 * Gets the username of the currently logged in user
	 * @return
	 */
	public static String getCurrentUsername() {
		/*ApplicationSecurityManager sm = (ApplicationSecurityManager) Application
			.services().getService(ApplicationSecurityManager.class);
		/*if (sm.getAuthentication() != null) {
			return sm.getAuthentication().getName();
		}*/
		return "Initial_User";
	}
	
	/**
	 * Gets the service locator
	 * @return
	 */
	public static ServiceLocator getServiceLocator() {
		return serviceLocator;
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
	 * Gets the clearance level service.
	 * If the user service is null, we retrieve it from the service locator
	 * @return UserService
	 */
	public static ClearanceLevelService getClearanceService() {
		if(clearanceService == null){
			clearanceService = serviceLocator.getClearanceLevelService();
		}
		return clearanceService;
	}

	public static CounterService getCounterService() {
		if(counterService == null){
			counterService = serviceLocator.getCounterService();
		}
		return counterService;
	}

	public static IndividualService getIndividualService() {
		if(individualService == null){
			individualService = serviceLocator.getIndividualService();
		}
		return individualService;
	}

	public static LocationService getLocationService() {
		if(locationService == null){
			locationService = serviceLocator.getLocationService();
		}
		return locationService;
	}


	public static LoginSessionService getSessionService() {
		if(sessionService == null){
			sessionService = serviceLocator.getLoginSessionService();
		}
		return sessionService;
	}

	public static OrganisationService getOrgService() {
		if(orgService == null){
			orgService = serviceLocator.getOrganisationService();
		}
		return orgService;
	}

	public static RoleService getRoleService() {
		if(roleService == null){
			roleService = serviceLocator.getRoleService();
		}
		return roleService;
	}
	
	public static UserDetailsService getUserDetailsService(){
		if(userDetailsService == null){
			userDetailsService = serviceLocator.getUserDetailsService();
		}
		
		return userDetailsService;
	}
	
	public static MenuService getMenuService(){
		if(menuService == null){
			menuService = serviceLocator.getMenuService();
		}
		
		return menuService;
	}
	
	public static ProgramService getProgramService(){
		if(programService == null){
			programService = serviceLocator.getProgramService();
		}
		
		return programService;
	}
	
	public static LoginSessionService getLoginService(){
		if(loginService == null){
			loginService = serviceLocator.getLoginSessionService();
		}
		
		return loginService;
	}

	public static OrganisationVO createDefaultOrganisation(OrganisationVO organisation) {
		OrganisationVO org = new OrganisationVO();
		if(organisation != null){
			 
		}
		
		return org;
	}
	
	public static OrganisationTypeVO createDefaultOrganisationType(){
		OrganisationTypeVO orgType = new OrganisationTypeVO();
		
		return orgType;
	}

	public static MenuVO createDefaultMenu() {
		MenuVO menuVO = new MenuVO();
		return menuVO;
	}
	
	public static ProgramVO createDefaultProgram() {
		ProgramVO programVO = new ProgramVO();
		return programVO;
	}
}
