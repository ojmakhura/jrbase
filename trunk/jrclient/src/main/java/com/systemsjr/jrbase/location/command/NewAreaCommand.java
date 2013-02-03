package com.systemsjr.jrbase.location.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.systemsjr.jrbase.location.LocationDialog;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class NewAreaCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		LocationDialog dialog = (LocationDialog)Application.instance().getApplicationContext().getBean("areaDialog");
		dialog.displayItem(BaseServiceUtils.createDefaultLocation());
	}

}
