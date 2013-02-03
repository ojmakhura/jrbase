package com.systemsjr.jrbase.individual.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;



public class IndividualsCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("individualView");
	}

}
