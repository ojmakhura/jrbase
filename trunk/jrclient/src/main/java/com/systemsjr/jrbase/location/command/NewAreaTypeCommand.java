package com.systemsjr.jrbase.location.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.systemsjr.jrbase.location.LocationTypeDialog;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class NewAreaTypeCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		LocationTypeDialog dialog = (LocationTypeDialog)Application.instance().getApplicationContext().getBean("areaTypeDialog");
		dialog.displayItem(BaseServiceUtils.createDefaultLocationType());
	}

}
