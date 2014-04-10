package com.systemsjr.jrbase.clearancelevel;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;


public class ClearedRolesTable extends ClearanceLevelTable {

	public ClearedRolesTable() {
		super();
		// TODO Auto-generated constructor stub
	}

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
