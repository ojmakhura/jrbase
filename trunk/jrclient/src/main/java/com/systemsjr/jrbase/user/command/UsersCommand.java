package com.systemsjr.jrbase.user.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;



public class UsersCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("userView");
	}
}
