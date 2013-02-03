package com.systemsjr.jrbase.workbench.menu.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

public class MenusCommand extends ActionCommand{

	@Override
	protected void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("menuView");
	}
	
}