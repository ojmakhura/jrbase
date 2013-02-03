package com.systemsjr.jrbase.organisation.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;



public class OrganisationsCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("organisationView");
	}
}
