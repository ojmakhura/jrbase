// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.user;
/**
 * @see com.jrsystems.jrbase.user.UserLocation
 */
public class UserLocationDaoImpl
    extends com.jrsystems.jrbase.user.UserLocationDaoBase
{
    /**
     * @see com.jrsystems.jrbase.user.UserLocationDao#toUserLocationVO(com.jrsystems.jrbase.user.UserLocation, com.jrsystems.jrbase.user.vo.UserLocationVO)
     */
    public void toUserLocationVO(
        com.jrsystems.jrbase.user.UserLocation source,
        com.jrsystems.jrbase.user.vo.UserLocationVO target)
    {
        // @todo verify behavior of toUserLocationVO
        super.toUserLocationVO(source, target);
        // WARNING! No conversion for target.user (can't convert source.getUser():com.jrsystems.jrbase.user.User to com.jrsystems.jrbase.user.vo.UserVO
        // WARNING! No conversion for target.location (can't convert source.getLocation():com.jrsystems.jrbase.location.Location to com.jrsystems.jrbase.location.vo.LocationVO
    }


    /**
     * @see com.jrsystems.jrbase.user.UserLocationDao#toUserLocationVO(com.jrsystems.jrbase.user.UserLocation)
     */
    public com.jrsystems.jrbase.user.vo.UserLocationVO toUserLocationVO(final com.jrsystems.jrbase.user.UserLocation entity)
    {
        // @todo verify behavior of toUserLocationVO
        return super.toUserLocationVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.user.UserLocation loadUserLocationFromUserLocationVO(com.jrsystems.jrbase.user.vo.UserLocationVO userLocationVO)
    {
        // @todo implement loadUserLocationFromUserLocationVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.user.loadUserLocationFromUserLocationVO(com.jrsystems.jrbase.user.vo.UserLocationVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.user.UserLocation userLocation = this.load(userLocationVO.getId());
        if (userLocation == null)
        {
            userLocation = com.jrsystems.jrbase.user.UserLocation.Factory.newInstance();
        }
        return userLocation;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.user.UserLocationDao#userLocationVOToEntity(com.jrsystems.jrbase.user.vo.UserLocationVO)
     */
    public com.jrsystems.jrbase.user.UserLocation userLocationVOToEntity(com.jrsystems.jrbase.user.vo.UserLocationVO userLocationVO)
    {
        // @todo verify behavior of userLocationVOToEntity
        com.jrsystems.jrbase.user.UserLocation entity = this.loadUserLocationFromUserLocationVO(userLocationVO);
        this.userLocationVOToEntity(userLocationVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.user.UserLocationDao#userLocationVOToEntity(com.jrsystems.jrbase.user.vo.UserLocationVO, com.jrsystems.jrbase.user.UserLocation)
     */
    public void userLocationVOToEntity(
        com.jrsystems.jrbase.user.vo.UserLocationVO source,
        com.jrsystems.jrbase.user.UserLocation target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userLocationVOToEntity
        super.userLocationVOToEntity(source, target, copyIfNull);
    }

}