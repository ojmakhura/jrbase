// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package com.jrsystems.jrbase.organisation.service;

/**
 * 
 */
public interface OrganisationService
{

    /**
     * 
     */
    public java.util.List getOrganisationBranches(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisationVO);

    /**
     * 
     */
    public com.jrsystems.jrbase.organisation.vo.OrganisationVO saveOrganisation(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisatioVO);

    /**
     * 
     */
    public com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO saveOrganisationType(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO);

    /**
     * 
     */
    public java.util.List getAllOrganisations();

    /**
     * 
     */
    public java.util.List getAllOrganisationTypes();

    /**
     * 
     */
    public void removeOrganisation(com.jrsystems.jrbase.organisation.vo.OrganisationVO organisationVO);

    /**
     * 
     */
    public void removeOrganisationType(com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO organisationTypeVO);

}
