package com.jrsystems.jrbase.user.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.user.UserDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class NewUserCommand extends ActionCommand {

	@Override
	protected void doExecuteCommand() {
		// TODO Auto-generated method stub
		UserDialog userDialog = (UserDialog)Application.instance().getApplicationContext().getBean("userDialog");
		userDialog.displayItem(BaseServiceUtils.createDefaultUser());
	}

}
