// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::loginsession::service::LoginSessionService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.loginsession.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;

/**
 * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService
 */
@Service("com.systemsjr.jrbase.loginsession.service.LoginSessionService")
public class LoginSessionServiceImpl
    extends LoginSessionServiceBase
{

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#saveLoginSession(LoginSessionVO)
     */
    @Override
    protected  LoginSessionVO handleSaveLoginSession(LoginSessionVO loginSessionVO)
        throws Exception
    {
        // TODO implement protected  LoginSessionVO handleSaveLoginSession(LoginSessionVO loginSessionVO)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.loginsession.service.LoginSessionService.handleSaveLoginSession(LoginSessionVO loginSessionVO) Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#getAllLoginSessions()
     */
    @Override
    protected  Collection<LoginSessionVO> handleGetAllLoginSessions()
        throws Exception
    {
        // TODO implement protected  Collection<LoginSessionVO> handleGetAllLoginSessions()
        throw new UnsupportedOperationException("com.systemsjr.jrbase.loginsession.service.LoginSessionService.handleGetAllLoginSessions() Not implemented!");
    }

    /**
     * @see com.systemsjr.jrbase.loginsession.service.LoginSessionService#verifyLoginDetails(String, String)
     */
    @Override
    protected  LoginSessionVO handleVerifyLoginDetails(String username, String password)
        throws Exception
    {
        // TODO implement protected  LoginSessionVO handleVerifyLoginDetails(String username, String password)
        throw new UnsupportedOperationException("com.systemsjr.jrbase.loginsession.service.LoginSessionService.handleVerifyLoginDetails(String username, String password) Not implemented!");
    }

}