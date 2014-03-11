// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.user.vo.UserLocationSearchCriteria;

/**
 * @see com.systemsjr.jrbase.user.UserLocation
 */
public class UserLocationDaoImpl
    extends com.systemsjr.jrbase.user.UserLocationDaoBase
{
    /**
     * @see com.systemsjr.jrbase.user.UserLocationDao#toUserLocationVO(com.systemsjr.jrbase.user.UserLocation, com.systemsjr.jrbase.user.vo.UserLocationVO)
     */
    @Override
	public void toUserLocationVO(
        com.systemsjr.jrbase.user.UserLocation source,
        com.systemsjr.jrbase.user.vo.UserLocationVO target)
    {
        // @todo verify behavior of toUserLocationVO
        super.toUserLocationVO(source, target);
        // WARNING! No conversion for target.user (can't convert source.getUser():com.systemsjr.jrbase.user.User to com.systemsjr.jrbase.user.vo.UserVO
        if(source.getUser() != null){
        	target.setUser(getUserDao().toUserDetailsVO(source.getUser()));
        }
        
        // WARNING! No conversion for target.location (can't convert source.getLocation():com.systemsjr.jrbase.location.Location to com.systemsjr.jrbase.location.vo.LocationVO
        if(source.getLocation() != null){
        	target.setLocation(getLocationDao().toLocationVO(source.getLocation()));
        }
        
    }


    /**
     * @see com.systemsjr.jrbase.user.UserLocationDao#toUserLocationVO(com.systemsjr.jrbase.user.UserLocation)
     */
    @Override
	public com.systemsjr.jrbase.user.vo.UserLocationVO toUserLocationVO(final com.systemsjr.jrbase.user.UserLocation entity)
    {
        // @todo verify behavior of toUserLocationVO
        return super.toUserLocationVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.user.UserLocation loadUserLocationFromUserLocationVO(com.systemsjr.jrbase.user.vo.UserLocationVO userLocationVO)
    {
        com.systemsjr.jrbase.user.UserLocation userLocation;
        if (userLocationVO.getId() == null)
        {
            userLocation = com.systemsjr.jrbase.user.UserLocation.Factory.newInstance();
        } else{
        	userLocation = this.load(userLocationVO.getId());
        }
        return userLocation;
        
    }

    
    /**
     * @see com.systemsjr.jrbase.user.UserLocationDao#userLocationVOToEntity(com.systemsjr.jrbase.user.vo.UserLocationVO)
     */
    @Override
	public com.systemsjr.jrbase.user.UserLocation userLocationVOToEntity(com.systemsjr.jrbase.user.vo.UserLocationVO userLocationVO)
    {
        // @todo verify behavior of userLocationVOToEntity
        com.systemsjr.jrbase.user.UserLocation entity = this.loadUserLocationFromUserLocationVO(userLocationVO);
        this.userLocationVOToEntity(userLocationVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.user.UserLocationDao#userLocationVOToEntity(com.systemsjr.jrbase.user.vo.UserLocationVO, com.systemsjr.jrbase.user.UserLocation)
     */
    @Override
	public void userLocationVOToEntity(
        com.systemsjr.jrbase.user.vo.UserLocationVO source,
        com.systemsjr.jrbase.user.UserLocation target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userLocationVOToEntity
        super.userLocationVOToEntity(source, target, copyIfNull);
        if(source.getUser() != null){
        	target.setUser(getUserDao().userDetailsVOToEntity(source.getUser()));
        }
        
        if(source.getLocation() != null){        	
        	target.setLocation(getLocationDao().locationVOToEntity(source.getLocation()));
        }
    }


	@Override
	protected List<?> handleFindByCriteria(
			UserLocationSearchCriteria searchCriteria) throws Exception {
		Criteria criteria = getSession().createCriteria(UserLocation.class);
		
		if(searchCriteria.getStatus() != null){
			criteria.add(Restrictions.ilike("status", searchCriteria.getStatus()));
		}
		
		if(searchCriteria.getLocation() != null){
			criteria.add(Restrictions.eq("location.id", searchCriteria.getLocation().getId()));
		}
		
		if(searchCriteria.getUser() != null){
			criteria.add(Restrictions.eq("user.id", searchCriteria.getUser().getId()));
		}
		
		return criteria.list();
	}

}