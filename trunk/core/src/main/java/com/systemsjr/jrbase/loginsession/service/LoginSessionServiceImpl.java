// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.loginsession.service;

import java.util.List;

import com.systemsjr.jrbase.loginsession.LoginSession;
import com.systemsjr.jrbase.loginsession.LoginSessionDao;
import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;
import com.systemsjr.jrbase.user.vo.UserSearchCriteria;
import com.systemsjr.jrbase.user.vo.UserVO;

/**
 * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService
 */
public class LoginSessionServiceImpl
    extends com.systemsjr.jrbase.loginsession.service.LoginSessionServiceBase
{

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#saveLoginSession(com.systemsjr.jrbase.loginsession.vo.LoginSessionVO)
     */
    @Override
	protected  com.systemsjr.jrbase.loginsession.vo.LoginSessionVO handleSaveLoginSession(com.systemsjr.jrbase.loginsession.vo.LoginSessionVO loginSessionVO)
        throws java.lang.Exception
    {
    	LoginSession loginSession = getLoginSessionDao().loginSessionVOToEntity(loginSessionVO);
    	
    	if(loginSession.getId() == null){
    		loginSession = getLoginSessionDao().create(loginSession);
    	} else {
    		getLoginSessionDao().update(loginSession);
    	}
    	
    	return getLoginSessionDao().toLoginSessionVO(loginSession);
    }

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#getAllLoginSessions()
     */
    @Override
	protected  LoginSessionVO[] handleGetAllLoginSessions()
        throws java.lang.Exception
    {
        
    	
        return (LoginSessionVO[])getLoginSessionDao().loadAll(LoginSessionDao.TRANSFORM_LOGINSESSIONVO).toArray();
    }

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#verifyLoginDetails(java.lang.String, java.lang.String)
     */
    @Override
	protected  com.systemsjr.jrbase.loginsession.vo.LoginSessionVO handleVerifyLoginDetails(java.lang.String username, java.lang.String encryptedPassword)
        throws java.lang.Exception
    {
        UserSearchCriteria searchCriteria = new UserSearchCriteria();
        LoginSessionVO loginSessionVO;
                
        searchCriteria.setUsername(username);
        searchCriteria.setPassword(encryptedPassword);
        
        List<UserVO> user = getUserDao().findByCriteria(searchCriteria);
        
        if(user.isEmpty()){
        	loginSessionVO = null;
        } else{
        	loginSessionVO = new LoginSessionVO();
        	loginSessionVO.setUser(user.get(0));
        	//loginSessionVO.setArea(user.get(0).get)
        }
        
        return loginSessionVO;
    }

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#getUserName()
     */
    protected  java.lang.String handleGetUserName()
        throws java.lang.Exception
    {
        // @todo implement protected  java.lang.String handleGetUserName()
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.loginsession.service.LoginSessionService.handleGetUserName() Not implemented!");
    }

}