package com.jrsystems.jrbase.location.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.location.LocationTypeDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class NewAreaTypeCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		LocationTypeDialog dialog = (LocationTypeDialog)Application.instance().getApplicationContext().getBean("areaTypeDialog");
		dialog.displayItem(BaseServiceUtils.createDefaultLocationType());
	}

}
