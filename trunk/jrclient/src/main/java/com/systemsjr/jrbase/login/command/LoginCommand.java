package com.systemsjr.jrbase.login.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.systemsjr.jrbase.login.LoginDialog;

public class LoginCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("loginView");
	}

}