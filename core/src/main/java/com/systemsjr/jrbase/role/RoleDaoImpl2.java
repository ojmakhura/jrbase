// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.role;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.systemsjr.jrbase.role.Role
 */
public class RoleDaoImpl2
    extends com.systemsjr.jrbase.role.RoleDaoBase
{
    /**
     * @see com.systemsjr.jrbase.role.RoleDao#findByCriteria(com.systemsjr.jrbase.role.vo.RoleSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.role.vo.RoleSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Role.class);
    	
    	if(searchCriteria.getRole() != null){
    		criteria.add(Restrictions.ilike("role", "%" + searchCriteria.getRole() + "%"));
    	}
    	
    	if(searchCriteria.getRoleCode() != null){
    		criteria.add(Restrictions.ilike("roleCode", "%" + searchCriteria.getRoleCode() + "%"));
    	}
        
    	if(searchCriteria.getRoleDescription() != null){
    		criteria.add(Restrictions.ilike("roleDescription", "%" + searchCriteria.getRoleDescription() + "%"));
    	}
    	
    	return Arrays.asList(toRoleVOArray(criteria.list()));
    }

    /**
     * @see com.systemsjr.jrbase.role.RoleDao#toRoleVO(com.systemsjr.jrbase.role.Role, com.systemsjr.jrbase.role.vo.RoleVO)
     */
    @Override
	public void toRoleVO(
        com.systemsjr.jrbase.role.Role source,
        com.systemsjr.jrbase.role.vo.RoleVO target)
    {
        super.toRoleVO(source, target);
    }


    /**
     * @see com.systemsjr.jrbase.role.RoleDao#toRoleVO(com.systemsjr.jrbase.role.Role)
     */
    @Override
	public com.systemsjr.jrbase.role.vo.RoleVO toRoleVO(final com.systemsjr.jrbase.role.Role entity)
    {
        // @todo verify behavior of toRoleVO
        return super.toRoleVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.role.Role loadRoleFromRoleVO(com.systemsjr.jrbase.role.vo.RoleVO roleVO)
    {
        com.systemsjr.jrbase.role.Role role = null;//this.load(roleVO.getId());
        if (roleVO.getId() != null)
        {
        	role = this.load(roleVO.getId());
        } else{
        	role = Role.Factory.newInstance();
        }
        return role;
        
    }

    
    /**
     * @see com.systemsjr.jrbase.role.RoleDao#roleVOToEntity(com.systemsjr.jrbase.role.vo.RoleVO)
     */
    @Override
	public com.systemsjr.jrbase.role.Role roleVOToEntity(com.systemsjr.jrbase.role.vo.RoleVO roleVO)
    {
        // @todo verify behavior of roleVOToEntity
        com.systemsjr.jrbase.role.Role entity = this.loadRoleFromRoleVO(roleVO);
        this.roleVOToEntity(roleVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.role.RoleDao#roleVOToEntity(com.systemsjr.jrbase.role.vo.RoleVO, com.systemsjr.jrbase.role.Role)
     */
    @Override
	public void roleVOToEntity(
        com.systemsjr.jrbase.role.vo.RoleVO source,
        com.systemsjr.jrbase.role.Role target,
        boolean copyIfNull)
    {
        // @todo verify behavior of roleVOToEntity
        super.roleVOToEntity(source, target, copyIfNull);
    }

}