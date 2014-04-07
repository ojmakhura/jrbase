package com.systemsjr.jrbase.user;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;

import com.systemsjr.jrbase.role.RoleTable;

public class UserRolesTable extends RoleTable {

	@Override
	protected ActionCommandExecutor getDetailsCommand() {
		if(detailsCommand == null){
			detailsCommand = new ActionCommand("detailsCommand") {				
				@Override
				protected void doExecuteCommand() {
					
				}
			};
		}
		return detailsCommand;
	}
}
