package com.systemsjr.jrbase.utils;

import org.apache.commons.lang.StringUtils;

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
import com.systemsjr.jrbase.organisation.service.OrganisationService;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.role.service.RoleService;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.user.service.UserDetailsService;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.workbench.application.service.ApplicationService;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrbase.workbench.menu.service.MenuService;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrbase.workbench.program.service.ProgramService;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;
import com.systemsjr.jrlib.utils.JRLibServiceUtils;

public class BaseServiceUtils extends JRLibServiceUtils{
	
	private static ClearanceLevelService clearanceService;
	private static CounterService counterService;
	private static IndividualService individualService;
	private static LocationService locationService;
	private static OrganisationService orgService;
	private static RoleService roleService;	
	private static MenuService menuService;
	private static ApplicationService applicationService;
	private static ProgramService programService;
	private static UserDetailsService userDetailsService;
	//private static Userloca
	
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
	public static UserDetailsVO createDefaultUser(){
		UserDetailsVO user = new UserDetailsVO();
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

	public static OrganisationService getOrgService() {
		if(orgService == null){
			orgService = serviceLocator.getOrganisationService();
		}
		return orgService;
	}

	public static RoleService getRoleService() {
		if(roleService == null){
			ServiceLocator locator = serviceLocator;
			RoleService service = serviceLocator.getRoleService();
			roleService = service;
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

	public static ApplicationService getApplicationService() {
		if(applicationService == null){
			applicationService = serviceLocator.getApplicationService();
		}
		return applicationService;
	}

	public static ApplicationVO createDefaultApplication() {
		ApplicationVO application = new ApplicationVO();
		return application;
	}
}
