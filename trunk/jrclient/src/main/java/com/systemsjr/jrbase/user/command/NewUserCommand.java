package com.systemsjr.jrbase.user.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.systemsjr.jrbase.user.UserDialog;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class NewUserCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		// TODO Auto-generated method stub
		UserDialog userDialog = (UserDialog)Application.instance().getApplicationContext().getBean("userDialog");
		userDialog.displayItem(BaseServiceUtils.createDefaultUser());
	}

}
