package com.jrsystems.jrbase.role.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

public class NewRoleCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("roleView");
	}
}
