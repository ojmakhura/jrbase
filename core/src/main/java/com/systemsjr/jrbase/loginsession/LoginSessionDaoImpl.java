// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.loginsession;

import java.util.List;

import org.hibernate.Criteria;

/**
 * @see com.systemsjr.jrbase.loginsession.LoginSession
 */
public class LoginSessionDaoImpl
    extends com.systemsjr.jrbase.loginsession.LoginSessionDaoBase
{
    /**
     * @see com.systemsjr.jrbase.loginsession.LoginSessionDao#findByCriteria(com.systemsjr.jrbase.loginsession.vo.LoginSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.loginsession.vo.LoginSearchCriteria searchCriteria)
    {
    	Criteria criteria = getSession().createCriteria(LoginSession.class);
    	
    	//if(searchCriteria.get)
    		
        return criteria.list();
    }

    /**
     * @see com.systemsjr.jrbase.loginsession.LoginSessionDao#toLoginSessionVO(com.systemsjr.jrbase.loginsession.LoginSession, com.systemsjr.jrbase.loginsession.vo.LoginSessionVO)
     */
    @Override
	public void toLoginSessionVO(
        com.systemsjr.jrbase.loginsession.LoginSession source,
        com.systemsjr.jrbase.loginsession.vo.LoginSessionVO target)
    {
        // @todo verify behavior of toLoginSessionVO
        super.toLoginSessionVO(source, target);
        // WARNING! No conversion for target.user (can't convert source.getUser():com.systemsjr.jrbase.user.User to com.systemsjr.jrbase.user.vo.UserVO
        target.setUser(getUserDao().toUserVO(source.getUser()));
        // WARNING! No conversion for target.area (can't convert source.getArea():com.systemsjr.jrbase.location.Location to com.systemsjr.jrbase.location.vo.LocationVO
        target.setArea(getLocationDao().toLocationVO(source.getArea()));
    }


    /**
     * @see com.systemsjr.jrbase.loginsession.LoginSessionDao#toLoginSessionVO(com.systemsjr.jrbase.loginsession.LoginSession)
     */
    @Override
	public com.systemsjr.jrbase.loginsession.vo.LoginSessionVO toLoginSessionVO(final com.systemsjr.jrbase.loginsession.LoginSession entity)
    {
        // @todo verify behavior of toLoginSessionVO
        return super.toLoginSessionVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.loginsession.LoginSession loadLoginSessionFromLoginSessionVO(com.systemsjr.jrbase.loginsession.vo.LoginSessionVO loginSessionVO)
    {
        // A typical implementation looks like this:
        com.systemsjr.jrbase.loginsession.LoginSession loginSession;
        if (loginSessionVO.getId() == null)
        {
            loginSession = com.systemsjr.jrbase.loginsession.LoginSession.Factory.newInstance();
        } else{
        	loginSession = this.load(loginSessionVO.getId());
        }
        return loginSession;
    }

    
    /**
     * @see com.systemsjr.jrbase.loginsession.LoginSessionDao#loginSessionVOToEntity(com.systemsjr.jrbase.loginsession.vo.LoginSessionVO)
     */
    @Override
	public com.systemsjr.jrbase.loginsession.LoginSession loginSessionVOToEntity(com.systemsjr.jrbase.loginsession.vo.LoginSessionVO loginSessionVO)
    {
        // @todo verify behavior of loginSessionVOToEntity
        com.systemsjr.jrbase.loginsession.LoginSession entity = this.loadLoginSessionFromLoginSessionVO(loginSessionVO);
        this.loginSessionVOToEntity(loginSessionVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.loginsession.LoginSessionDao#loginSessionVOToEntity(com.systemsjr.jrbase.loginsession.vo.LoginSessionVO, com.systemsjr.jrbase.loginsession.LoginSession)
     */
    @Override
	public void loginSessionVOToEntity(
        com.systemsjr.jrbase.loginsession.vo.LoginSessionVO source,
        com.systemsjr.jrbase.loginsession.LoginSession target,
        boolean copyIfNull)
    {
        // @todo verify behavior of loginSessionVOToEntity
        super.loginSessionVOToEntity(source, target, copyIfNull);
    }

}