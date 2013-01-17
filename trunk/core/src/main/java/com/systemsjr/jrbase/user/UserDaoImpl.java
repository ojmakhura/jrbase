// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.utils.PasswordUtil;

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
        super.toUserVO(source, target);
        target.setUserClearanceLevels(getClearanceLevelDao().toClearanceLevelVOArray(source.getUserClearanceLevels()));
        target.setUserRoles(getRoleDao().toRoleVOArray(source.getUserRoles()));
        target.setUserLocations(getUserLocationDao().toUserLocationVOArray(source.getUserLocations()));
        target.setStatus(source.getStatus());
        target.setIndividual(getIndividualDao().toIndividualVO(source.getIndividual()));
        target.setUserId(source.getUserId());
        StringBuffer passRep = new StringBuffer();
        for(int i = 0; i < source.getPasswordLength(); i++){
        	passRep.append('*');
        }
                
        target.setPassword1(passRep.toString());
        target.setPassword2(passRep.toString());
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
    	com.systemsjr.jrbase.user.User user;
        if (userVO.getId() == null)
        {
            user = com.systemsjr.jrbase.user.User.Factory.newInstance();
        } else{
        	user  = this.load(userVO.getId());
        }        
        
        return user;
    }

    
    /**
     * @see com.systemsjr.jrbase.user.UserDao#userVOToEntity(com.systemsjr.jrbase.user.vo.UserVO)
     */
    @Override
	public com.systemsjr.jrbase.user.User userVOToEntity(com.systemsjr.jrbase.user.vo.UserVO userVO)
    {
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
        super.userVOToEntity(source, target, copyIfNull);
        target.setIndividual(getIndividualDao().individualVOToEntity(source.getIndividual()));
        try {
			target.setPassword(PasswordUtil.encryptPassword(source.getPassword1()));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}