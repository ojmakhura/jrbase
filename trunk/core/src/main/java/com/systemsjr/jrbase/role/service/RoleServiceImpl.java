// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.role.service;

import java.util.Arrays;
import java.util.List;

import com.jrsystems.jrbase.role.Role;
import com.jrsystems.jrbase.role.RoleDao;
import com.jrsystems.jrbase.role.vo.RoleSearchCriteria;
import com.jrsystems.jrbase.role.vo.RoleVO;

/**
 * @see com.jrsystems.jrbase.role.service.RoleService
 */
public class RoleServiceImpl
    extends com.jrsystems.jrbase.role.service.RoleServiceBase
{

    /**
     * @see com.jrsystems.jrbase.role.service.RoleService#saveRole(com.jrsystems.jrbase.role.vo.RoleVO)
     */
    protected  com.jrsystems.jrbase.role.vo.RoleVO handleSaveRole(com.jrsystems.jrbase.role.vo.RoleVO roleVO)
        throws java.lang.Exception
    {
    	Role role;// = getRoleDao().roleVOToEntity(roleVO);
    	
    	if(roleVO.getId() == null){
    		System.out.println("id is null");
    		role = getRoleDao().create(getRoleDao().roleVOToEntity(roleVO));
    		System.out.println("id is " + role.getId());
    	} else{
    		role = getRoleDao().roleVOToEntity(roleVO);
    		getRoleDao().update(role);
    	}
    	
    	return getRoleDao().toRoleVO(role);
    }

    /**
     * @see com.jrsystems.jrbase.role.service.RoleService#getAllRoles()
     */
    protected  List handleGetAllRoles()
        throws java.lang.Exception
    {
    	return Arrays.asList(getRoleDao().loadAll(RoleDao.TRANSFORM_ROLEVO).toArray());
    }

    /**
     * @see com.jrsystems.jrbase.role.service.RoleService#getRolesByClearance(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    protected  List<RoleVO> handleGetRolesByClearance(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceVO)
        throws java.lang.Exception
    {
    	// @todo
    	RoleSearchCriteria searchCriteria = new RoleSearchCriteria();
    	
    	//searchCriteria.set
    	
    	return null;
    }

    /**
     * @see com.jrsystems.jrbase.role.service.RoleService#getRoleClearance(com.jrsystems.jrbase.role.vo.RoleVO)
     */
    protected  com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO[] handleGetRoleClearance(com.jrsystems.jrbase.role.vo.RoleVO roleVO)
        throws java.lang.Exception
    {
    	return roleVO.getRoleClearanceLevels();
    }

	@Override
	protected List handleGetRoleClearanceLevels(RoleVO roleVO) throws Exception {
		
		Role role = getRoleDao().roleVOToEntity(roleVO);
		
		return Arrays.asList(role.getRoleClearanceLevels().toArray());
	}

	@Override
	protected void handleRemoveRole(RoleVO roleVO) throws Exception {
		
		if(roleVO.getId() != null){
			getRoleDao().remove(getRoleDao().roleVOToEntity(roleVO));
		}
	}

}