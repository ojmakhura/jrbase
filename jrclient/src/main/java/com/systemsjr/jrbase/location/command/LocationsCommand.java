package com.systemsjr.jrbase.location.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;




public class LocationsCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("locationView");
	}

}
