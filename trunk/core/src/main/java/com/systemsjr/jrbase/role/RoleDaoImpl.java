// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.role;

import java.util.List;

import org.hibernate.Criteria;

import com.jrsystems.jrbase.clearancelevel.ClearanceLevel;
import com.jrsystems.jrbase.user.User;

import java.util.Arrays;

/**
 * @see com.jrsystems.jrbase.role.Role
 */
public class RoleDaoImpl
    extends com.jrsystems.jrbase.role.RoleDaoBase
{
    /**
     * @see com.jrsystems.jrbase.role.RoleDao#findByCriteria(com.jrsystems.jrbase.role.vo.RoleSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.role.vo.RoleSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Role.class);
            	
    	return Arrays.asList(toRoleVOArray(criteria.list()));
    }

    /**
     * @see com.jrsystems.jrbase.role.RoleDao#toRoleVO(com.jrsystems.jrbase.role.Role, com.jrsystems.jrbase.role.vo.RoleVO)
     */
    public void toRoleVO(
        com.jrsystems.jrbase.role.Role source,
        com.jrsystems.jrbase.role.vo.RoleVO target)
    {
        super.toRoleVO(source, target);
        
        /*if(source.getRoleClearanceLevels() != null){
        	ClearanceLevel[] clearanceLevels = (ClearanceLevel[])source.getRoleClearanceLevels().toArray();
        	target.setRoleClearanceLevels(getClearanceLevelDao().toClearanceLevelVOArray(Arrays.asList(clearanceLevels)));
        }
        
        if(source.getUsers() != null){
        	User[] users = (User[])source.getUsers().toArray();
        	target.setUsers(getUserDao().toUserVOArray(Arrays.asList(users)));
        }*/
    }


    /**
     * @see com.jrsystems.jrbase.role.RoleDao#toRoleVO(com.jrsystems.jrbase.role.Role)
     */
    public com.jrsystems.jrbase.role.vo.RoleVO toRoleVO(final com.jrsystems.jrbase.role.Role entity)
    {
        // @todo verify behavior of toRoleVO
        return super.toRoleVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.role.Role loadRoleFromRoleVO(com.jrsystems.jrbase.role.vo.RoleVO roleVO)
    {
        com.jrsystems.jrbase.role.Role role = null;//this.load(roleVO.getId());
        if (roleVO.getId() != null && (role = this.load(roleVO.getId())) != null)
        {
        	return role;
            //role = com.jrsystems.jrbase.role.Role.Factory.newInstance();
        }
        role = Role.Factory.newInstance();
        roleVOToEntity(roleVO, role, true);
        return role;
        
    }

    
    /**
     * @see com.jrsystems.jrbase.role.RoleDao#roleVOToEntity(com.jrsystems.jrbase.role.vo.RoleVO)
     */
    public com.jrsystems.jrbase.role.Role roleVOToEntity(com.jrsystems.jrbase.role.vo.RoleVO roleVO)
    {
        // @todo verify behavior of roleVOToEntity
        com.jrsystems.jrbase.role.Role entity = this.loadRoleFromRoleVO(roleVO);
        this.roleVOToEntity(roleVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.role.RoleDao#roleVOToEntity(com.jrsystems.jrbase.role.vo.RoleVO, com.jrsystems.jrbase.role.Role)
     */
    public void roleVOToEntity(
        com.jrsystems.jrbase.role.vo.RoleVO source,
        com.jrsystems.jrbase.role.Role target,
        boolean copyIfNull)
    {
        // @todo verify behavior of roleVOToEntity
        super.roleVOToEntity(source, target, copyIfNull);
    }

}