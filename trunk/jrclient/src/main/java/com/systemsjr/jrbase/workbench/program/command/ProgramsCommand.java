package com.systemsjr.jrbase.workbench.program.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

public class ProgramsCommand extends ActionCommand{

	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("programView");
	}
	
}