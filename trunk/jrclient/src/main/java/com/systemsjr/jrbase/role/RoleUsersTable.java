package com.systemsjr.jrbase.role;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;

import com.systemsjr.jrbase.user.UserTable;

public class RoleUsersTable extends UserTable{
	
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
