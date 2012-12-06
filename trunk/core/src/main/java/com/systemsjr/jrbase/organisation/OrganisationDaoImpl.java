// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.organisation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.jrsystems.jrbase.organisation.Organisation
 */
public class OrganisationDaoImpl
    extends com.jrsystems.jrbase.organisation.OrganisationDaoBase
{
    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationDao#findByCriteria(com.jrsystems.jrbase.organisation.vo.OrganisationSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.organisation.vo.OrganisationSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Organisation.class);
    	
    	if(searchCriteria.getRegistrationRef() != null){
    		criteria.add(Restrictions.ilike("registrationRef", searchCriteria.getRegistrationRef()));
    	}
    	
    	if(searchCriteria.getName() != null){
    		criteria.add(Restrictions.ilike("name", searchCriteria.getName()));
    	}
    	
    	if(searchCriteria.getDescription() != null){
    		criteria.add(Restrictions.ilike("description", searchCriteria.getDescription()));
    	}
    	
        return criteria.list();
    }

    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationDao#toOrganisationVO(com.jrsystems.jrbase.organisation.Organisation, com.jrsystems.jrbase.organisation.vo.OrganisationVO)
     */
    public void toOrganisationVO(
        com.jrsystems.jrbase.organisation.Organisation source,
        com.jrsystems.jrbase.organisation.vo.OrganisationVO target)
    {
        // @todo verify behavior of toOrganisationVO
        super.toOrganisationVO(source, target);
        // WARNING! No conversion for target.organisationType (can't convert source.getOrganisationType():com.jrsystems.jrbase.organisation.OrganisationType to com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO
        // WARNING! No conversion for target.organisationLocations (can't convert source.getOrganisationLocations():com.jrsystems.jrbase.location.Location to com.jrsystems.jrbase.location.vo.LocationVO[]
    }


    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationDao#toOrganisationVO(com.jrsystems.jrbase.organisation.Organisation)
     */
    public com.jrsystems.jrbase.organisation.vo.OrganisationVO toOrganisationVO(final com.jrsystems.jrbase.organisation.Organisation entity)
    {
        // @todo verify behavior of toOrganisationVO
        return super.toOrganisationVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.organisation.Organisation loadOrganisationFromOrganisationVO(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisationVO)
    {
        // @todo implement loadOrganisationFromOrganisationVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.organisation.loadOrganisationFromOrganisationVO(com.jrsystems.jrbase.organisation.vo.OrganisationVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.organisation.Organisation organisation = this.load(organisationVO.getId());
        if (organisation == null)
        {
            organisation = com.jrsystems.jrbase.organisation.Organisation.Factory.newInstance();
        }
        return organisation;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationDao#organisationVOToEntity(com.jrsystems.jrbase.organisation.vo.OrganisationVO)
     */
    public com.jrsystems.jrbase.organisation.Organisation organisationVOToEntity(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisationVO)
    {
        // @todo verify behavior of organisationVOToEntity
        com.jrsystems.jrbase.organisation.Organisation entity = this.loadOrganisationFromOrganisationVO(organisationVO);
        this.organisationVOToEntity(organisationVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationDao#organisationVOToEntity(com.jrsystems.jrbase.organisation.vo.OrganisationVO, com.jrsystems.jrbase.organisation.Organisation)
     */
    public void organisationVOToEntity(
        com.jrsystems.jrbase.organisation.vo.OrganisationVO source,
        com.jrsystems.jrbase.organisation.Organisation target,
        boolean copyIfNull)
    {
        // @todo verify behavior of organisationVOToEntity
        super.organisationVOToEntity(source, target, copyIfNull);
    }

}