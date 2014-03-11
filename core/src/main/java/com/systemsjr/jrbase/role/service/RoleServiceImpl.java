// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.role.service;

import java.util.Collection;
import java.util.List;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.role.Role;
import com.systemsjr.jrbase.role.vo.RoleSearchCriteria;
import com.systemsjr.jrbase.role.vo.RoleVO;

/**
 * @see com.systemsjr.jrbase.role.service.RoleService
 */
public class RoleServiceImpl
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
	protected  RoleVO[] handleGetAllRoles()
        throws java.lang.Exception
    {
    	Collection roles = getRoleDao().loadAll();
    	return getRoleDao().toRoleVOArray(roles);
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getRolesByClearance(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    @Override
	protected  RoleVO[] handleGetRolesByClearance(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceVO)
        throws java.lang.Exception
    {
    	// @todo
    	RoleSearchCriteria searchCriteria = new RoleSearchCriteria();
    	
    	//searchCriteria.set
    	
    	return null;
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getRoleClearance(com.systemsjr.jrbase.role.vo.RoleVO)
     */
    protected  com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO[] handleGetRoleClearance(com.systemsjr.jrbase.role.vo.RoleVO roleVO)
        throws java.lang.Exception
    {
    	return (ClearanceLevelVO[]) roleVO.getRoleClearanceLevels().toArray();
    }

	@Override
	protected ClearanceLevelVO[] handleGetRoleClearanceLevels(RoleVO roleVO) throws Exception {
		
		Role role = getRoleDao().roleVOToEntity(roleVO);
		
		return (ClearanceLevelVO[]) role.getRoleClearanceLevels().toArray();
	}

	@Override
	protected void handleRemoveRole(RoleVO roleVO) throws Exception {
		
		if(roleVO.getId() != null){
			getRoleDao().remove(getRoleDao().roleVOToEntity(roleVO));
		}
	}

	@Override
	protected RoleVO[] handleSearchRoles(RoleSearchCriteria searchCriteria)
			throws Exception {
		if(searchCriteria == null){
			return new RoleVO[]{};
		}
		List roles = getRoleDao().findByCriteria(searchCriteria); 
		return getRoleDao().toRoleVOArray(roles);
	}

}