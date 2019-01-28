// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::role::service::RoleService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.role.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.role.Role;
import com.systemsjr.jrbase.role.vo.RoleSearchCriteria;
import com.systemsjr.jrbase.role.vo.RoleVO;

/**
 * @see com.systemsjr.jrbase.role.service.RoleService
 */
@Service("com.systemsjr.jrbase.role.service.RoleService")
public class RoleServiceImpl
    extends RoleServiceBase
{


    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#saveRole(com.systemsjr.jrbase.role.vo.RoleVO)
     */
    @Override
	protected  RoleVO handleSaveRole(RoleVO roleVO)
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

	@Override
	protected RoleVO handleFindById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return getRoleDao().toRoleVO(getRoleDao().load(id));
	}

}