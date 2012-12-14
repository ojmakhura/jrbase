package com.systemsjr.jrbase.role.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.AbstractCommand;



public class RolesCommand extends AbstractCommand {

	@Override
	public void execute() {
		logger.warn("getting tole view");
		Application.instance().getActiveWindow().getPage().showView("roleView");
	}

}
