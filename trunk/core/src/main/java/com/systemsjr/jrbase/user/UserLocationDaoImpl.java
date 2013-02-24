// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.user;
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
        // WARNING! No conversion for target.location (can't convert source.getLocation():com.systemsjr.jrbase.location.Location to com.systemsjr.jrbase.location.vo.LocationVO
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
        // @todo implement loadUserLocationFromUserLocationVO
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.user.loadUserLocationFromUserLocationVO(com.systemsjr.jrbase.user.vo.UserLocationVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.systemsjr.jrbase.user.UserLocation userLocation = this.load(userLocationVO.getId());
        if (userLocation == null)
        {
            userLocation = com.systemsjr.jrbase.user.UserLocation.Factory.newInstance();
        }
        return userLocation;
        */
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
    }

}