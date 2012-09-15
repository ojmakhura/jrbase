package com.jrsystems.jrbase.location.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.location.LocationDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class NewAreaCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		LocationDialog dialog = (LocationDialog)Application.instance().getApplicationContext().getBean("areaDialog");
		dialog.displayItem(BaseServiceUtils.createDefaultLocation());
	}

}
