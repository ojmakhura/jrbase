package com.systemsjr.jrbase.user;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;

import com.systemsjr.jrbase.clearancelevel.ClearanceLevelTable;

public class UserClearenceTable extends ClearanceLevelTable {
	
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
