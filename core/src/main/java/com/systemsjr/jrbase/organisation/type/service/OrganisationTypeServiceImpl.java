// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::organisation::type::service::OrganisationTypeService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.organisation.type.service;

import com.systemsjr.jrbase.organisation.type.OrganisationType;
import com.systemsjr.jrbase.organisation.type.vo.OrganisationTypeSearchCriteria;
import com.systemsjr.jrbase.organisation.type.vo.OrganisationTypeVO;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 * @see com.systemsjr.jrbase.organisation.type.service.OrganisationTypeService
 */
@Service("com.systemsjr.jrbase.organisation.type.service.OrganisationTypeService")
public class OrganisationTypeServiceImpl
    extends OrganisationTypeServiceBase
{

	/**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationTypeService#searchOrganisationTypes(OrganisationTypeSearchCriteria)
     */
    @Override
    protected  Collection<OrganisationTypeVO> handleSearchOrganisationTypes(OrganisationTypeSearchCriteria searchCriteria)
        throws Exception
    {
    	Collection<OrganisationType> types = getOrganisationTypeDao().findByCriteria(searchCriteria);
		return getOrganisationTypeDao().toOrganisationTypeVOCollection(types);
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationTypeService#removeOrganisationType(OrganisationTypeVO)
     */
    @Override
    protected  void handleRemoveOrganisationType(OrganisationTypeVO organisationTypeVO)
        throws Exception
    {
    	if(organisationTypeVO.getId() != null){
			getOrganisationTypeDao().remove(organisationTypeVO.getId());
		}
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationTypeService#getAllOrganisationTypes()
     */
    @Override
    protected  Collection<OrganisationTypeVO> handleGetAllOrganisationTypes()
        throws Exception
    {
    	Collection<OrganisationType> orgTypes = getOrganisationTypeDao().loadAll();
    	
    	return getOrganisationTypeDao().toOrganisationTypeVOCollection(orgTypes);
    }

    /**
     * @see com.systemsjr.jrbase.organisation.service.OrganisationTypeService#saveOrganisationType(OrganisationTypeVO)
     */
    @Override
    protected  OrganisationTypeVO handleSaveOrganisationType(OrganisationTypeVO organisationTypeVO)
        throws Exception
    {
    	OrganisationType organisationType = getOrganisationTypeDao().organisationTypeVOToEntity(organisationTypeVO);
    	
    	if(organisationType.getId() == null){
    		organisationType = getOrganisationTypeDao().create(organisationType);
    	} else{
    		getOrganisationTypeDao().update(organisationType);
    	}
    	
    	return getOrganisationTypeDao().toOrganisationTypeVO(organisationType);
    }

	@Override
	protected OrganisationTypeVO handleFindById(Long id) throws Exception {
		return id == null ? null : getOrganisationTypeDao().toOrganisationTypeVO(getOrganisationTypeDao().load(id));
	}

}