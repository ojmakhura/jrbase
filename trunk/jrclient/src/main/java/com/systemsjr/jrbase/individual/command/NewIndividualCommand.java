package com.systemsjr.jrbase.individual.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;



public class NewIndividualCommand extends ActionCommand {
	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("individualView");
	}

}
