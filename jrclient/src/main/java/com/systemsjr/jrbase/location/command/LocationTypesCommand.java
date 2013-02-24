package com.systemsjr.jrbase.location.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;




public class LocationTypesCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("locationTypeView");
	}

}
