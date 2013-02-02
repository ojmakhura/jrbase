// Generated by: hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.location;

import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationVO;
import java.util.List;

/**
 * @see Location
 */
public class LocationDaoImpl
    extends LocationDaoBase
{
    /**
     * {@inheritDoc}
     */
    protected List handleFindByCriteria(LocationSearchCriteria searchCriteria)
    {
        // TODO implement public List handleFindByCriteria(LocationSearchCriteria searchCriteria)
        return null;
}

    /**
     * {@inheritDoc}
     */
    protected List handleFindCountries()
    {
        // TODO implement public List handleFindCountries()
        return null;
}

    /**
     * {@inheritDoc}
     */
    public void toLocationVO(
        Location source,
        LocationVO target)
    {
        // TODO verify behavior of toLocationVO
        super.toLocationVO(source, target);
        // WARNING! No conversion for target.locationType (can't convert source.getLocationType():com.systemsjr.jrbase.location.LocationType to com.systemsjr.jrbase.location.vo.LocationTypeVO
    }

    /**
     * {@inheritDoc}
     */
    public LocationVO toLocationVO(final Location entity)
    {
        // TODO verify behavior of toLocationVO
        return super.toLocationVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Location loadLocationFromLocationVO(LocationVO locationVO)
    {
        // TODO implement loadLocationFromLocationVO
        throw new UnsupportedOperationException("com.systemsjr.jrbase.location.loadLocationFromLocationVO(LocationVO) not yet implemented.");

        /* A typical implementation looks like this:
        Location location = this.get(locationVO.getId());
        if (location == null)
        {
            location = Location.Factory.newInstance();
        }
        return location;
        */
    }

    /**
     * {@inheritDoc}
     */
    public Location locationVOToEntity(LocationVO locationVO)
    {
        // TODO verify behavior of locationVOToEntity
        Location entity = this.loadLocationFromLocationVO(locationVO);
        this.locationVOToEntity(locationVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void locationVOToEntity(
        LocationVO source,
        Location target,
        boolean copyIfNull)
    {
        // TODO verify behavior of locationVOToEntity
        super.locationVOToEntity(source, target, copyIfNull);
    }
}