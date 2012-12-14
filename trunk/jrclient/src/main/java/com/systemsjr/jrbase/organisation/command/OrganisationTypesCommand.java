package com.systemsjr.jrbase.organisation.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.AbstractCommand;



public class OrganisationTypesCommand extends AbstractCommand {

	@Override
	public void execute() {
		Application.instance().getActiveWindow().getPage().showView("organisationTypeView");
	}

}
