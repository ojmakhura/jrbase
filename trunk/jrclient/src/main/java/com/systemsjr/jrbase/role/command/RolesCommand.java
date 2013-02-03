package com.systemsjr.jrbase.role.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;



public class RolesCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		logger.warn("getting tole view");
		Application.instance().getActiveWindow().getPage().showView("roleView");
	}

}
