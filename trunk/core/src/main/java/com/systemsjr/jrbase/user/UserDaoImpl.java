// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.systemsjr.jrbase.role.Role;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;

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
        target.setStatus(source.getStatus());
        target.setIndividual(getIndividualDao().toIndividualVO(source.getIndividual()));
        target.setUserId(source.getUserId());
        StringBuffer passRep = new StringBuffer();
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
        //StandardPasswordEncoder encoder = new StandardPasswordEncoder();
        //target.setPassword(encoder.encode(source.getPassword1()));
    }

	@Override
	protected User handleUserLogin(String username, String password) throws Exception {
		Criteria criteria = getSession().createCriteria(User.class);
		
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", new StandardPasswordEncoder().encode(password)));
		
		System.out.println("username = " + username + " password = " + new StandardPasswordEncoder().encode(password));
		
		List users = criteria.list();
		
		if(users.size() > 1 || users.size() < 1){
			return null;
		}
		
		return (User) users.get(0);
	}

	@Override
	public User userDetailsVOToEntity(UserDetailsVO userDetailsVO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public void toUserDetailsVO(User source, UserDetailsVO target) {
		super.toUserDetailsVO(source, target);
		Collection srcRoles = source.getUserRoles();
        RoleVO[] targetRoles = new RoleVO[srcRoles.size()];
        int i=0;
        for (Object srcRole : srcRoles)
        {
        	targetRoles[i] = getRoleDao().toRoleVO((Role)srcRole);
        	i++;
        }
        target.setUserRoles(targetRoles);

	}

	@Override
	protected User handleGetUserDetails(String username) throws Exception {
		
		User user = (User)getSession().createQuery(
				"from com.systemsjr.jrbase.user.User user" +
						"left join fetch user.roles" +
						"where user.username = :username"
				).setParameter("username", username).uniqueResult();
		
		return user;
	}

}