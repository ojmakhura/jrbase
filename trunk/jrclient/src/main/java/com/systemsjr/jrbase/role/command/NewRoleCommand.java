package com.systemsjr.jrbase.role.command;

import org.springframework.richclient.command.support.ShowViewCommand;



public class NewRoleCommand extends ShowViewCommand {

	@Override
	protected void doExecuteCommand() {
		//get
		//getActiveWindow().getPage().showView("roleView");
		getApplicationWindow().getPage().showView("roleView");
		
	}
}
