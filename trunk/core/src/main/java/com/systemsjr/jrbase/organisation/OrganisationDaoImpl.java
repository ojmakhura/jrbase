// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.organisation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * @see com.systemsjr.jrbase.organisation.Organisation
 */
public class OrganisationDaoImpl
    extends com.systemsjr.jrbase.organisation.OrganisationDaoBase
{
    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationDao#findByCriteria(com.systemsjr.jrbase.organisation.vo.OrganisationSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.organisation.vo.OrganisationSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(Organisation.class);
    	
    	if(searchCriteria.getRegistrationRef() != null){
    		criteria.add(Restrictions.ilike("registrationRef", "%" + searchCriteria.getRegistrationRef() + "%"));
    	}
    	
    	if(searchCriteria.getName() != null){
    		criteria.add(Restrictions.ilike("name", "%" + searchCriteria.getName() + "%"));
    	}
    	
    	if(searchCriteria.getDescription() != null){
    		criteria.add(Restrictions.ilike("description", "%" + searchCriteria.getDescription() + "%"));
    	}
    	
        return criteria.list();
    }

    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationDao#toOrganisationVO(com.systemsjr.jrbase.organisation.Organisation, com.systemsjr.jrbase.organisation.vo.OrganisationVO)
     */
    @Override
	public void toOrganisationVO(
        com.systemsjr.jrbase.organisation.Organisation source,
        com.systemsjr.jrbase.organisation.vo.OrganisationVO target)
    {
        super.toOrganisationVO(source, target);
        target.setOrganisationType(getOrganisationTypeDao().toOrganisationTypeVO(source.getOrganisationType()));
        //target.setOrganisationLocations(getOrganisationTypeDao().);
        // WARNING! No conversion for target.organisationLocations (can't convert source.getOrganisationLocations():com.systemsjr.jrbase.location.Location to com.systemsjr.jrbase.location.vo.LocationVO[]
    }


    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationDao#toOrganisationVO(com.systemsjr.jrbase.organisation.Organisation)
     */
    @Override
	public com.systemsjr.jrbase.organisation.vo.OrganisationVO toOrganisationVO(final com.systemsjr.jrbase.organisation.Organisation entity)
    {
        // @todo verify behavior of toOrganisationVO
        return super.toOrganisationVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.organisation.Organisation loadOrganisationFromOrganisationVO(com.systemsjr.jrbase.organisation.vo.OrganisationVO organisationVO)
    {
        // A typical implementation looks like this:
        com.systemsjr.jrbase.organisation.Organisation organisation;
        if (organisationVO.getId() == null)
        {
            organisation = com.systemsjr.jrbase.organisation.Organisation.Factory.newInstance();
        } else{
        	organisation = this.load(organisationVO.getId());
        }
        return organisation;
    }

    
    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationDao#organisationVOToEntity(com.systemsjr.jrbase.organisation.vo.OrganisationVO)
     */
    @Override
	public com.systemsjr.jrbase.organisation.Organisation organisationVOToEntity(com.systemsjr.jrbase.organisation.vo.OrganisationVO organisationVO)
    {
        // @todo verify behavior of organisationVOToEntity
        com.systemsjr.jrbase.organisation.Organisation entity = this.loadOrganisationFromOrganisationVO(organisationVO);
        this.organisationVOToEntity(organisationVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationDao#organisationVOToEntity(com.systemsjr.jrbase.organisation.vo.OrganisationVO, com.systemsjr.jrbase.organisation.Organisation)
     */
    @Override
	public void organisationVOToEntity(
        com.systemsjr.jrbase.organisation.vo.OrganisationVO source,
        com.systemsjr.jrbase.organisation.Organisation target,
        boolean copyIfNull)
    {
        // @todo verify behavior of organisationVOToEntity
        super.organisationVOToEntity(source, target, copyIfNull);
        if(source.getOrganisationType() != null){
        	target.setOrganisationType(getOrganisationTypeDao().organisationTypeVOToEntity(source.getOrganisationType()));
        }
    }

}