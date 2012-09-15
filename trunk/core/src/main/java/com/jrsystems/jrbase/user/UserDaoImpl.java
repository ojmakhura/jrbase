// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.user;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.jrsystems.jrbase.user.User
 */
public class UserDaoImpl
    extends com.jrsystems.jrbase.user.UserDaoBase
{
    /**
     * @see com.jrsystems.jrbase.user.UserDao#findByCriteria(com.jrsystems.jrbase.user.vo.UserSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.user.vo.UserSearchCriteria searchCriteria)
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
        // @todo implement public com.jrsystems.jrbase.user.vo.UserLocationVO[] handleFindByCriteria(com.jrsystems.jrbase.user.vo.UserSearchCriteria searchCriteria)
        return criteria.list();
    }

    /**
     * @see com.jrsystems.jrbase.user.UserDao#toUserVO(com.jrsystems.jrbase.user.User, com.jrsystems.jrbase.user.vo.UserVO)
     */
    public void toUserVO(
        com.jrsystems.jrbase.user.User source,
        com.jrsystems.jrbase.user.vo.UserVO target)
    {
        // @todo verify behavior of toUserVO
    	//getRoleDao().
        super.toUserVO(source, target);
        // WARNING! No conversion for target.userClearanceLevels (can't convert source.getUserClearanceLevels():com.jrsystems.jrbase.clearancelevel.ClearanceLevel to com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO[]
        // WARNING! No conversion for target.userRoles (can't convert source.getUserRoles():com.jrsystems.jrbase.role.Role to com.jrsystems.jrbase.role.vo.RoleVO[]
        // WARNING! No conversion for target.userLocations (can't convert source.getUserLocations():com.jrsystems.jrbase.user.UserLocation to com.jrsystems.jrbase.user.vo.UserLocationVO[]
    }


    /**
     * @see com.jrsystems.jrbase.user.UserDao#toUserVO(com.jrsystems.jrbase.user.User)
     */
    public com.jrsystems.jrbase.user.vo.UserVO toUserVO(final com.jrsystems.jrbase.user.User entity)
    {
        // @todo verify behavior of toUserVO
        return super.toUserVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.user.User loadUserFromUserVO(com.jrsystems.jrbase.user.vo.UserVO userVO)
    {
    	com.jrsystems.jrbase.user.User user = this.load(userVO.getId());
        if (user == null)
        {
            user = com.jrsystems.jrbase.user.User.Factory.newInstance();
        }
        return user;
    }

    
    /**
     * @see com.jrsystems.jrbase.user.UserDao#userVOToEntity(com.jrsystems.jrbase.user.vo.UserVO)
     */
    public com.jrsystems.jrbase.user.User userVOToEntity(com.jrsystems.jrbase.user.vo.UserVO userVO)
    {
        // @todo verify behavior of userVOToEntity
        com.jrsystems.jrbase.user.User entity = this.loadUserFromUserVO(userVO);
        this.userVOToEntity(userVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.user.UserDao#userVOToEntity(com.jrsystems.jrbase.user.vo.UserVO, com.jrsystems.jrbase.user.User)
     */
    public void userVOToEntity(
        com.jrsystems.jrbase.user.vo.UserVO source,
        com.jrsystems.jrbase.user.User target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userVOToEntity
        super.userVOToEntity(source, target, copyIfNull);
    }

}