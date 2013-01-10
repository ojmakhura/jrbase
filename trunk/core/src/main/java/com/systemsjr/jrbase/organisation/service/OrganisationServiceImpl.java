// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.organisation.service;

import java.util.Collection;

import com.systemsjr.jrbase.organisation.Organisation;
import com.systemsjr.jrbase.organisation.OrganisationDao;
import com.systemsjr.jrbase.organisation.OrganisationType;
import com.systemsjr.jrbase.organisation.OrganisationTypeDao;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;

/**
 * @see com.systemsjr.jrbase.organisation.service.OrganisationService
 */
public class OrganisationServiceImpl
    extends com.systemsjr.jrbase.organisation.service.OrganisationServiceBase
{

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#getOrganisationBranches(com.systemsjr.jrbase.organisation.vo.OrganisationVO)
     */
    @Override
	protected  OrganisationVO[] handleGetOrganisationBranches(com.systemsjr.jrbase.organisation.vo.OrganisationVO organisationVO)
        throws java.lang.Exception
    {
    	OrganisationVO[] branches = null;
    	if(organisationVO.getId() != null){
    		branches = (OrganisationVO[])organisationVO.getBranches().toArray();
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
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#saveOrganisationType(com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO)
     */
    @Override
	protected  com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO handleSaveOrganisationType(com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO)
        throws java.lang.Exception
    {
    	OrganisationType organisationType = getOrganisationTypeDao().organisationTypeVOToEntity(organisationTypeVO);
    	
    	if(organisationType.getId() == null){
    		organisationType = getOrganisationTypeDao().create(organisationType);
    	} else{
    		getOrganisationTypeDao().update(organisationType);
    	}
    	
    	return getOrganisationTypeDao().toOrganisationTypeVO(organisationType);
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#getAllOrganisations()
     */
    @Override
	protected  OrganisationVO[] handleGetAllOrganisations()
        throws java.lang.Exception
    {
    	Collection orgs = getOrganisationDao().loadAll();
    	return getOrganisationDao().toOrganisationVOArray(orgs);
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#getAllOrganisationTypes()
     */
    @Override
	protected  OrganisationTypeVO[] handleGetAllOrganisationTypes()
        throws java.lang.Exception
    {
    	try{
    	Collection orgTypes = getOrganisationTypeDao().loadAll();
    	System.out.println("ahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    	
    	return getOrganisationTypeDao().toOrganisationTypeVOArray(orgTypes);
    	} catch(Exception e){
    		System.out.println("ijoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
    		e.printStackTrace();
    	}
    	return null;
    }

	@Override
	protected void handleRemoveOrganisation(OrganisationVO organisationVO)
			throws Exception {

		if(organisationVO.getId() != null){
			getOrganisationDao().remove(organisationVO.getId());
		}
		
	}

	@Override
	protected void handleRemoveOrganisationType(
			OrganisationTypeVO organisationTypeVO) throws Exception {
		
		if(organisationTypeVO.getId() != null){
			getOrganisationTypeDao().remove(organisationTypeVO.getId());
		}		
	}
}