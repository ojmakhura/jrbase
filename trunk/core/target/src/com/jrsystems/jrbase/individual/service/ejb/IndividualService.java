// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringSessionLocal.vsl in andromda-spring-cartridge.
//
package com.jrsystems.jrbase.individual.service.ejb;

/**
 * @see com.jrsystems.jrbase.individual.service.IndividualService
 */
public interface IndividualService
    extends javax.ejb.EJBLocalObject
{
    /**
     * 
     */
    public com.jrsystems.jrbase.individual.vo.IndividualVO saveIndividual(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO);

    /**
     * 
     */
    public java.util.List getAllIndividuals();

    /**
     * 
     */
    public void removeIndividual(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO);

}