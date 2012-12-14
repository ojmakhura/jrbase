// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.organisation.service;

import java.util.Arrays;
import java.util.List;

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
	protected  List<OrganisationVO> handleGetOrganisationBranches(com.systemsjr.jrbase.organisation.vo.OrganisationVO organisationVO)
        throws java.lang.Exception
    {
    	OrganisationVO[] branches = null;
    	if(organisationVO.getId() != null){
    		branches = (OrganisationVO[])organisationVO.getBranches().toArray();
    	}
    	
    	return Arrays.asList(branches);
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
	protected  List<OrganisationVO> handleGetAllOrganisations()
        throws java.lang.Exception
    {
    	return Arrays.asList((OrganisationVO[])getOrganisationDao().loadAll(OrganisationDao.TRANSFORM_ORGANISATIONVO).toArray());
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationService#getAllOrganisationTypes()
     */
    @Override
	protected  List<OrganisationTypeVO> handleGetAllOrganisationTypes()
        throws java.lang.Exception
    {
    	return Arrays.asList((OrganisationTypeVO[])getOrganisationTypeDao().loadAll(OrganisationTypeDao.TRANSFORM_ORGANISATIONTYPEVO).toArray());
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