// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::role::service::RoleService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.role.service;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.role.vo.RoleSearchCriteria;
import com.systemsjr.jrbase.role.vo.RoleVO;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 * @see com.systemsjr.jrbase.role.service.RoleService
 */
@Service("com.systemsjr.jrbase.role.service.RoleService")
public class RoleServiceImpl
    extends RoleServiceBase
{

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#saveRole(RoleVO)
     */
    @Override
    protected  RoleVO handleSaveRole(RoleVO roleVO)
        throws Exception
    {
        // TODO implement protected  RoleVO handleSaveRole(RoleVO roleVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.role.service.RoleService.handleSaveRole(RoleVO roleVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getAllRoles()
     */
    @Override
    protected  Collection<RoleVO> handleGetAllRoles()
        throws Exception
    {
        // TODO implement protected  Collection<RoleVO> handleGetAllRoles()
        throw new UnsupportedOperationException("com.systemsjr.jrbase.role.service.RoleService.handleGetAllRoles() Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getRolesByClearance(ClearanceLevelVO)
     */
    @Override
    protected  Collection<RoleVO> handleGetRolesByClearance(ClearanceLevelVO clearanceVO)
        throws Exception
    {
        // TODO implement protected  Collection<RoleVO> handleGetRolesByClearance(ClearanceLevelVO clearanceVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.role.service.RoleService.handleGetRolesByClearance(ClearanceLevelVO clearanceVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#getRoleClearanceLevels(RoleVO)
     */
    @Override
    protected  Collection<ClearanceLevelVO> handleGetRoleClearanceLevels(RoleVO roleVO)
        throws Exception
    {
        // TODO implement protected  Collection<ClearanceLevelVO> handleGetRoleClearanceLevels(RoleVO roleVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.role.service.RoleService.handleGetRoleClearanceLevels(RoleVO roleVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#removeRole(RoleVO)
     */
    @Override
    protected  void handleRemoveRole(RoleVO roleVO)
        throws Exception
    {
        // TODO implement protected  void handleRemoveRole(RoleVO roleVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.role.service.RoleService.handleRemoveRole(RoleVO roleVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.role.service.RoleService#searchRoles(RoleSearchCriteria)
     */
    @Override
    protected  Collection<RoleVO> handleSearchRoles(RoleSearchCriteria searchCriteria)
        throws Exception
    {
        // TODO implement protected  Collection<RoleVO> handleSearchRoles(RoleSearchCriteria searchCriteria)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.role.service.RoleService.handleSearchRoles(RoleSearchCriteria searchCriteria) Not implemented!");
    }

}