// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.organisation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.jrsystems.jrbase.organisation.vo.OrganisationTypeSearchCriteria;

/**
 * @see com.jrsystems.jrbase.organisation.OrganisationType
 */
public class OrganisationTypeDaoImpl
    extends com.jrsystems.jrbase.organisation.OrganisationTypeDaoBase
{
    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationTypeDao#toOrganisationTypeVO(com.jrsystems.jrbase.organisation.OrganisationType, com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO)
     */
    public void toOrganisationTypeVO(
        com.jrsystems.jrbase.organisation.OrganisationType source,
        com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO target)
    {
        // @todo verify behavior of toOrganisationTypeVO
        super.toOrganisationTypeVO(source, target);
    }


    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationTypeDao#toOrganisationTypeVO(com.jrsystems.jrbase.organisation.OrganisationType)
     */
    public com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO toOrganisationTypeVO(final com.jrsystems.jrbase.organisation.OrganisationType entity)
    {
        // @todo verify behavior of toOrganisationTypeVO
        return super.toOrganisationTypeVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.organisation.OrganisationType loadOrganisationTypeFromOrganisationTypeVO(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO)
    {
        // @todo implement loadOrganisationTypeFromOrganisationTypeVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.organisation.loadOrganisationTypeFromOrganisationTypeVO(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.organisation.OrganisationType organisationType = this.load(organisationTypeVO.getId());
        if (organisationType == null)
        {
            organisationType = com.jrsystems.jrbase.organisation.OrganisationType.Factory.newInstance();
        }
        return organisationType;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationTypeDao#organisationTypeVOToEntity(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO)
     */
    public com.jrsystems.jrbase.organisation.OrganisationType organisationTypeVOToEntity(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO)
    {
        // @todo verify behavior of organisationTypeVOToEntity
        com.jrsystems.jrbase.organisation.OrganisationType entity = this.loadOrganisationTypeFromOrganisationTypeVO(organisationTypeVO);
        this.organisationTypeVOToEntity(organisationTypeVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.organisation.OrganisationTypeDao#organisationTypeVOToEntity(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO, com.jrsystems.jrbase.organisation.OrganisationType)
     */
    public void organisationTypeVOToEntity(
        com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO source,
        com.jrsystems.jrbase.organisation.OrganisationType target,
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
			criteria.add(Restrictions.ilike("levelCode", searchCriteria.getLevelCode()));
		}
		
		if(searchCriteria.getName() != null){
			criteria.add(Restrictions.ilike("name", searchCriteria.getName()));
		}
		
		return criteria.list();
	}

}