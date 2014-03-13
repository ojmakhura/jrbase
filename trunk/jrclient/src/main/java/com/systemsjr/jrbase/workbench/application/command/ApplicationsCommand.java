package com.systemsjr.jrbase.workbench.application.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;


public class ApplicationsCommand extends ActionCommand{

	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("applicationView");
	}
	
}