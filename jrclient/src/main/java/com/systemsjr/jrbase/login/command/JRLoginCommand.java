package com.systemsjr.jrbase.login.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.dialog.ApplicationDialog;
import org.springframework.richclient.security.ApplicationSecurityManager;
import org.springframework.richclient.security.LoginCommand;
import org.springframework.richclient.security.support.DefaultApplicationSecurityManager;
import org.springframework.security.core.Authentication;

import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;

public class JRLoginCommand extends LoginCommand {
	private LoginSessionVO loginSession;
	private ApplicationDialog dialog = null;
	
	@Override
	protected void postLogin() {
		ApplicationSecurityManager sm = (DefaultApplicationSecurityManager)Application.instance().getApplicationContext().getBean("applicationSecurityManager");
		Authentication auth = sm.getAuthentication();
	}	

}
