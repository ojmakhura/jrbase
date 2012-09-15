package com.jrsystems.jrbase.individual.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.individual.IndividualDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class NewIndividualCommand extends ActionCommand {
	@Override
	protected void doExecuteCommand() {
		System.out.print("On NewIndividualCommand");
		Application.instance().getActiveWindow().getPage().showView("individualView");
	}

}
