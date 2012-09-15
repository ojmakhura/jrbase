// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.loginsession;

import java.util.List;

import org.hibernate.Criteria;

/**
 * @see com.jrsystems.jrbase.loginsession.LoginSession
 */
public class LoginSessionDaoImpl
    extends com.jrsystems.jrbase.loginsession.LoginSessionDaoBase
{
    /**
     * @see com.jrsystems.jrbase.loginsession.LoginSessionDao#findByCriteria(com.jrsystems.jrbase.loginsession.vo.LoginSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.loginsession.vo.LoginSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(LoginSession.class);
    	
    	//if(searchCriteria.get)
    		
        return criteria.list();
    }

    /**
     * @see com.jrsystems.jrbase.loginsession.LoginSessionDao#toLoginSessionVO(com.jrsystems.jrbase.loginsession.LoginSession, com.jrsystems.jrbase.loginsession.vo.LoginSessionVO)
     */
    public void toLoginSessionVO(
        com.jrsystems.jrbase.loginsession.LoginSession source,
        com.jrsystems.jrbase.loginsession.vo.LoginSessionVO target)
    {
        // @todo verify behavior of toLoginSessionVO
        super.toLoginSessionVO(source, target);
        // WARNING! No conversion for target.user (can't convert source.getUser():com.jrsystems.jrbase.user.User to com.jrsystems.jrbase.user.vo.UserVO
        // WARNING! No conversion for target.area (can't convert source.getArea():com.jrsystems.jrbase.location.Location to com.jrsystems.jrbase.location.vo.LocationVO
    }


    /**
     * @see com.jrsystems.jrbase.loginsession.LoginSessionDao#toLoginSessionVO(com.jrsystems.jrbase.loginsession.LoginSession)
     */
    public com.jrsystems.jrbase.loginsession.vo.LoginSessionVO toLoginSessionVO(final com.jrsystems.jrbase.loginsession.LoginSession entity)
    {
        // @todo verify behavior of toLoginSessionVO
        return super.toLoginSessionVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.loginsession.LoginSession loadLoginSessionFromLoginSessionVO(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO loginSessionVO)
    {
        // @todo implement loadLoginSessionFromLoginSessionVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.loginsession.loadLoginSessionFromLoginSessionVO(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.loginsession.LoginSession loginSession = this.load(loginSessionVO.getId());
        if (loginSession == null)
        {
            loginSession = com.jrsystems.jrbase.loginsession.LoginSession.Factory.newInstance();
        }
        return loginSession;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.loginsession.LoginSessionDao#loginSessionVOToEntity(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO)
     */
    public com.jrsystems.jrbase.loginsession.LoginSession loginSessionVOToEntity(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO loginSessionVO)
    {
        // @todo verify behavior of loginSessionVOToEntity
        com.jrsystems.jrbase.loginsession.LoginSession entity = this.loadLoginSessionFromLoginSessionVO(loginSessionVO);
        this.loginSessionVOToEntity(loginSessionVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.loginsession.LoginSessionDao#loginSessionVOToEntity(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO, com.jrsystems.jrbase.loginsession.LoginSession)
     */
    public void loginSessionVOToEntity(
        com.jrsystems.jrbase.loginsession.vo.LoginSessionVO source,
        com.jrsystems.jrbase.loginsession.LoginSession target,
        boolean copyIfNull)
    {
        // @todo verify behavior of loginSessionVOToEntity
        super.loginSessionVOToEntity(source, target, copyIfNull);
    }

}