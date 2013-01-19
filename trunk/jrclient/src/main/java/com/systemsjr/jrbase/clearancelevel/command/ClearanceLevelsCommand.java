package com.systemsjr.jrbase.clearancelevel.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

public class ClearanceLevelsCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("clearanceLevelView");
	}

}
