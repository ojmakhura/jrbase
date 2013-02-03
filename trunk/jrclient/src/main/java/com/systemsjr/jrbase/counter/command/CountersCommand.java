package com.systemsjr.jrbase.counter.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;



public class CountersCommand extends ActionCommand {
	
	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("counterView");
	}

}
