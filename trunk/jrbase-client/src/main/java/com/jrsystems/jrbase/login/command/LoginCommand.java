package com.jrsystems.jrbase.login.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.login.LoginDialog;
import com.jrsystems.jrbase.user.UserDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class LoginCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		LoginDialog loginDialog = (LoginDialog)Application.instance().getApplicationContext().getBean("loginDialog");
		loginDialog.showDialog();
	}

}
