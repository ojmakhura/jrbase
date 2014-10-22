// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.organisation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.organisation.vo.OrganisationTypeSearchCriteria;

/**
 * @see com.systemsjr.jrbase.organisation.OrganisationType
 */
public class OrganisationTypeDaoImpl
    extends com.systemsjr.jrbase.organisation.OrganisationTypeDaoBase
{
    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationTypeDao#toOrganisationTypeVO(com.systemsjr.jrbase.organisation.OrganisationType, com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO)
     */
    @Override
	public void toOrganisationTypeVO(
        com.systemsjr.jrbase.organisation.OrganisationType source,
        com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO target)
    {
        // @todo verify behavior of toOrganisationTypeVO
        super.toOrganisationTypeVO(source, target);
    }


    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationTypeDao#toOrganisationTypeVO(com.systemsjr.jrbase.organisation.OrganisationType)
     */
    @Override
	public com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO toOrganisationTypeVO(final com.systemsjr.jrbase.organisation.OrganisationType entity)
    {
        // @todo verify behavior of toOrganisationTypeVO
        return super.toOrganisationTypeVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.organisation.OrganisationType loadOrganisationTypeFromOrganisationTypeVO(com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO)
    {
        com.systemsjr.jrbase.organisation.OrganisationType organisationType;// = this.load(organisationTypeVO.getId());
        if (organisationTypeVO.getId() == null)
        {
            organisationType = com.systemsjr.jrbase.organisation.OrganisationType.Factory.newInstance();
        } else{
        	organisationType = this.load(organisationTypeVO.getId());
        }
        return organisationType;
        
    }

    
    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationTypeDao#organisationTypeVOToEntity(com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO)
     */
    @Override
	public com.systemsjr.jrbase.organisation.OrganisationType organisationTypeVOToEntity(com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO)
    {
        // @todo verify behavior of organisationTypeVOToEntity
        com.systemsjr.jrbase.organisation.OrganisationType entity = this.loadOrganisationTypeFromOrganisationTypeVO(organisationTypeVO);
        this.organisationTypeVOToEntity(organisationTypeVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.organisation.OrganisationTypeDao#organisationTypeVOToEntity(com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO, com.systemsjr.jrbase.organisation.OrganisationType)
     */
    @Override
	public void organisationTypeVOToEntity(
        com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO source,
        com.systemsjr.jrbase.organisation.OrganisationType target,
        boolean copyIfNull)
    {
        // @todo verify behavior of organisationTypeVOToEntity
        super.organisationTypeVOToEntity(source, target, copyIfNull);
    }


	@Override
	protected List handleFindByCriteria(
			OrganisationTypeSearchCriteria searchCriteria) throws Exception {
		
		Criteria criteria = getSession().createCriteria(OrganisationType.class);
		
		if(searchCriteria.getLevelCode() != null){
			criteria.add(Restrictions.ilike("levelCode", "%" + searchCriteria.getLevelCode() + "%"));
		}
		
		if(searchCriteria.getName() != null){
			criteria.add(Restrictions.ilike("name", "%" + searchCriteria.getName() + "%"));
		}
		
		return criteria.list();
	}

}