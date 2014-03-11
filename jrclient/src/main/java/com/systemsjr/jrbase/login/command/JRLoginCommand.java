package com.systemsjr.jrbase.login.command;

import org.springframework.richclient.dialog.ApplicationDialog;
import org.springframework.richclient.security.LoginCommand;

import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;

public class JRLoginCommand extends LoginCommand {
	private LoginSessionVO loginSession;
	private ApplicationDialog dialog = null;
	
	@Override
	protected void postLogin() {
		//ApplicationSecurityManager sm = (DefaultApplicationSecurityManager)ggetApplicationContext().getBean("applicationSecurityManager");
		//Authentication auth = sm.getAuthentication();
		
	}	

}
