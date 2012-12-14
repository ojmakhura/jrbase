// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.systemsjr.jrbase.user.User
 */
public class UserDaoImpl
    extends com.systemsjr.jrbase.user.UserDaoBase
{
    /**
     * @see com.systemsjr.jrbase.user.UserDao#findByCriteria(com.systemsjr.jrbase.user.vo.UserSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.user.vo.UserSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(User.class);
    	
    	if(searchCriteria.getUserId() != null){
    		criteria.add(Restrictions.ilike("userId", searchCriteria.getUserId()));
    	}
    	
    	if(searchCriteria.getName() != null){
    		criteria.add(Restrictions.ilike("name", searchCriteria.getName()));
    	}
    	
    	if(searchCriteria.getStatus() != null){
    		criteria.add(Restrictions.eq("status", searchCriteria.getStatus()));
    	}
        // @todo implement public com.systemsjr.jrbase.user.vo.UserLocationVO[] handleFindByCriteria(com.systemsjr.jrbase.user.vo.UserSearchCriteria searchCriteria)
        return criteria.list();
    }

    /**
     * @see com.systemsjr.jrbase.user.UserDao#toUserVO(com.systemsjr.jrbase.user.User, com.systemsjr.jrbase.user.vo.UserVO)
     */
    @Override
	public void toUserVO(
        com.systemsjr.jrbase.user.User source,
        com.systemsjr.jrbase.user.vo.UserVO target)
    {
        // @todo verify behavior of toUserVO
    	//getRoleDao().
        super.toUserVO(source, target);
        // WARNING! No conversion for target.userClearanceLevels (can't convert source.getUserClearanceLevels():com.systemsjr.jrbase.clearancelevel.ClearanceLevel to com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO[]
        // WARNING! No conversion for target.userRoles (can't convert source.getUserRoles():com.systemsjr.jrbase.role.Role to com.systemsjr.jrbase.role.vo.RoleVO[]
        // WARNING! No conversion for target.userLocations (can't convert source.getUserLocations():com.systemsjr.jrbase.user.UserLocation to com.systemsjr.jrbase.user.vo.UserLocationVO[]
    }


    /**
     * @see com.systemsjr.jrbase.user.UserDao#toUserVO(com.systemsjr.jrbase.user.User)
     */
    @Override
	public com.systemsjr.jrbase.user.vo.UserVO toUserVO(final com.systemsjr.jrbase.user.User entity)
    {
        // @todo verify behavior of toUserVO
        return super.toUserVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.user.User loadUserFromUserVO(com.systemsjr.jrbase.user.vo.UserVO userVO)
    {
    	com.systemsjr.jrbase.user.User user = this.load(userVO.getId());
        if (user == null)
        {
            user = com.systemsjr.jrbase.user.User.Factory.newInstance();
        }
        return user;
    }

    
    /**
     * @see com.systemsjr.jrbase.user.UserDao#userVOToEntity(com.systemsjr.jrbase.user.vo.UserVO)
     */
    @Override
	public com.systemsjr.jrbase.user.User userVOToEntity(com.systemsjr.jrbase.user.vo.UserVO userVO)
    {
        // @todo verify behavior of userVOToEntity
        com.systemsjr.jrbase.user.User entity = this.loadUserFromUserVO(userVO);
        this.userVOToEntity(userVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.user.UserDao#userVOToEntity(com.systemsjr.jrbase.user.vo.UserVO, com.systemsjr.jrbase.user.User)
     */
    @Override
	public void userVOToEntity(
        com.systemsjr.jrbase.user.vo.UserVO source,
        com.systemsjr.jrbase.user.User target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userVOToEntity
        super.userVOToEntity(source, target, copyIfNull);
    }

}