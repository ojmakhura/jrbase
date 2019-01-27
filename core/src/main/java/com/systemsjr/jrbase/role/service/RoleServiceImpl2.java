// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.role.service;

import java.util.Collection;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.role.Role;
import com.systemsjr.jrbase.role.vo.RoleSearchCriteria;
import com.systemsjr.jrbase.role.vo.RoleVO;

/**
 * @see com.systemsjr.jrbase.role.service.RoleService
 */
public class RoleServiceImpl2
    extends com.systemsjr.jrbase.role.service.RoleServiceBase
{

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#saveRole(com.systemsjr.jrbase.role.vo.RoleVO)
     */
    @Override
	protected  com.systemsjr.jrbase.role.vo.RoleVO handleSaveRole(com.systemsjr.jrbase.role.vo.RoleVO roleVO)
        throws java.lang.Exception
    {
    	Role role;// = getRoleDao().roleVOToEntity(roleVO);
    	
    	if(roleVO.getId() == null){
    		role = getRoleDao().create(getRoleDao().roleVOToEntity(roleVO));
    	} else{
    		role = getRoleDao().roleVOToEntity(roleVO);
    		getRoleDao().update(role);
    	}
    	
    	return getRoleDao().toRoleVO(role);
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getAllRoles()
     */
    @Override
	protected  Collection<RoleVO> handleGetAllRoles()
        throws java.lang.Exception
    {
    	Collection<Role> roles = getRoleDao().loadAll();
    	return getRoleDao().toRoleVOCollection(roles);
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getRolesByClearance(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    @Override
	protected  Collection<RoleVO> handleGetRolesByClearance(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceVO)
        throws java.lang.Exception
    {
    	// @todo
    	RoleSearchCriteria searchCriteria = new RoleSearchCriteria();
    	
    	return this.searchRoles(searchCriteria);
    }

	@Override
	protected Collection<ClearanceLevelVO> handleGetRoleClearanceLevels(RoleVO roleVO) throws Exception {
		
		Role role = getRoleDao().load(roleVO.getId());
		
		return getClearanceLevelDao().toClearanceLevelVOCollection(role.getRoleClearanceLevels());
	}

	@Override
	protected void handleRemoveRole(RoleVO roleVO) throws Exception {
		
		if(roleVO.getId() != null){
			getRoleDao().remove(getRoleDao().roleVOToEntity(roleVO));
		}
	}

	@Override
	protected Collection<RoleVO> handleSearchRoles(RoleSearchCriteria searchCriteria)
			throws Exception {
		
		Collection<Role> roles = getRoleDao().findByCriteria(searchCriteria); 
		return getRoleDao().toRoleVOCollection(roles);
	}

}