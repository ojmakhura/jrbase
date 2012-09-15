// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.organisation.service;

import java.util.Arrays;
import java.util.List;

import com.jrsystems.jrbase.organisation.Organisation;
import com.jrsystems.jrbase.organisation.OrganisationDao;
import com.jrsystems.jrbase.organisation.OrganisationType;
import com.jrsystems.jrbase.organisation.OrganisationTypeDao;
import com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO;
import com.jrsystems.jrbase.organisation.vo.OrganisationVO;

/**
 * @see com.jrsystems.jrbase.organisation.service.OrganisationService
 */
public class OrganisationServiceImpl
    extends com.jrsystems.jrbase.organisation.service.OrganisationServiceBase
{

    /**
     * @see com.jrsystems.jrbase.organisation.service.OrganisationService#getOrganisationBranches(com.jrsystems.jrbase.organisation.vo.OrganisationVO)
     */
    protected  List<OrganisationVO> handleGetOrganisationBranches(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisationVO)
        throws java.lang.Exception
    {
    	OrganisationVO[] branches = null;
    	if(organisationVO.getId() != null){
    		branches = (OrganisationVO[])organisationVO.getBranches().toArray();
    	}
    	
    	return Arrays.asList(branches);
    }

    /**
     * @see com.jrsystems.jrbase.organisation.service.OrganisationService#saveOrganisation(com.jrsystems.jrbase.organisation.vo.OrganisationVO)
     */
    protected  com.jrsystems.jrbase.organisation.vo.OrganisationVO handleSaveOrganisation(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisatioVO)
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
     * @see com.jrsystems.jrbase.organisation.service.OrganisationService#saveOrganisationType(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO)
     */
    protected  com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO handleSaveOrganisationType(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO)
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
     * @see com.jrsystems.jrbase.organisation.service.OrganisationService#getAllOrganisations()
     */
    protected  List<OrganisationVO> handleGetAllOrganisations()
        throws java.lang.Exception
    {
    	return Arrays.asList((OrganisationVO[])getOrganisationDao().loadAll(OrganisationDao.TRANSFORM_ORGANISATIONVO).toArray());
    }

    /**
     * @see com.jrsystems.jrbase.organisation.service.OrganisationService#getAllOrganisationTypes()
     */
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