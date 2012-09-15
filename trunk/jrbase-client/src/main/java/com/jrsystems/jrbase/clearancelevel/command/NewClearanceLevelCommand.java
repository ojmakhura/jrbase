package com.jrsystems.jrbase.clearancelevel.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.clearancelevel.ClearanceLevelDialog;
import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;

public class NewClearanceLevelCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		Application.instance().getActiveWindow().getPage().showView("clearenceLevelView");
	}

}
