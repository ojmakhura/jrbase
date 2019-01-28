// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::organisation::service::OrganisationService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.organisation.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.organisation.Organisation;
import com.systemsjr.jrbase.organisation.vo.OrganisationSearchCriteria;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;

/**
 * @see com.systemsjr.jrbase.organisation.service.OrganisationService
 */
@Service("com.systemsjr.jrbase.organisation.service.OrganisationService")
public class OrganisationServiceImpl
    extends OrganisationServiceBase
{

	/**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#getOrganisationBranches(com.systemsjr.jrbase.organisation.vo.OrganisationVO)
     */
    @Override
	protected  Collection<OrganisationVO> handleGetOrganisationBranches(OrganisationVO organisationVO)
        throws java.lang.Exception
    {
    	Collection<OrganisationVO> branches = null;
    	if(organisationVO.getId() != null){
    		branches = organisationVO.getBranches();
    	}
    	
    	return branches;
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#saveOrganisation(com.systemsjr.jrbase.organisation.vo.OrganisationVO)
     */
    @Override
	protected  com.systemsjr.jrbase.organisation.vo.OrganisationVO handleSaveOrganisation(com.systemsjr.jrbase.organisation.vo.OrganisationVO organisatioVO)
        throws java.lang.Exception
    {
    	Organisation organisation = getOrganisationDao().organisationVOToEntity(organisatioVO);
    	
    	if(organisation.getId() == null){
    		organisation = getOrganisationDao().create(organisation);
    	} else{
    		getOrganisationDao().update(organisation);
    	}
    	
    	return getOrganisationDao().toOrganisationVO(organisation);
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#getAllOrganisations()
     */
    @Override
	protected  Collection<OrganisationVO> handleGetAllOrganisations()
        throws java.lang.Exception
    {
    	Collection<Organisation> orgs = getOrganisationDao().loadAll();
    	return getOrganisationDao().toOrganisationVOCollection(orgs);
    }


	@Override
	protected void handleRemoveOrganisation(OrganisationVO organisationVO)
			throws Exception {

		if(organisationVO.getId() != null){
			getOrganisationDao().remove(organisationVO.getId());
		}
		
	}

	@Override
	protected Collection<OrganisationVO> handleSearchOrganisations(OrganisationSearchCriteria searchCriteria) throws Exception {
		
		Collection<Organisation> orgs = getOrganisationDao().findByCriteria(searchCriteria);
		return getOrganisationDao().toOrganisationVOCollection(orgs);
	}

	@Override
	protected OrganisationVO handleFindById(Long id) throws Exception {
		
		return id == null ? null : getOrganisationDao().toOrganisationVO(getOrganisationDao().load(id));
	}
}