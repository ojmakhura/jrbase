// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.loginsession.service;

import java.util.Arrays;
import java.util.List;

import com.jrsystems.jrbase.loginsession.LoginSession;
import com.jrsystems.jrbase.loginsession.LoginSessionDao;
import com.jrsystems.jrbase.loginsession.vo.LoginSessionVO;
import com.jrsystems.jrbase.user.vo.UserSearchCriteria;
import com.jrsystems.jrbase.user.vo.UserVO;
import com.jrsystems.jrbase.utils.LoginUtil;

/**
 * @see com.jrsystems.jrbase.loginsession.service.LoginSessionService
 */
public class LoginSessionServiceImpl
    extends com.jrsystems.jrbase.loginsession.service.LoginSessionServiceBase
{

    /**
     * @see com.jrsystems.jrbase.loginsession.service.LoginSessionService#saveLoginSession(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO)
     */
    protected  com.jrsystems.jrbase.loginsession.vo.LoginSessionVO handleSaveLoginSession(com.jrsystems.jrbase.loginsession.vo.LoginSessionVO loginSessionVO)
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
     * @see com.jrsystems.jrbase.loginsession.service.LoginSessionService#getAllLoginSessions()
     */
    protected  List<LoginSessionVO> handleGetAllLoginSessions()
        throws java.lang.Exception
    {
        
    	
        return Arrays.asList((LoginSessionVO[])getLoginSessionDao().loadAll(LoginSessionDao.TRANSFORM_LOGINSESSIONVO).toArray());
    }

    /**
     * @see com.jrsystems.jrbase.loginsession.service.LoginSessionService#verifyLoginDetails(java.lang.String, java.lang.String)
     */
    protected  com.jrsystems.jrbase.loginsession.vo.LoginSessionVO handleVerifyLoginDetails(java.lang.String username, java.lang.String encryptedPassword)
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
     * @see com.jrsystems.jrbase.loginsession.service.LoginSessionService#getUserName()
     */
    protected  java.lang.String handleGetUserName()
        throws java.lang.Exception
    {
        // @todo implement protected  java.lang.String handleGetUserName()
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.loginsession.service.LoginSessionService.handleGetUserName() Not implemented!");
    }

}