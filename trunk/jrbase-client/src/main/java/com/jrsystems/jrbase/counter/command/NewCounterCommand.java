package com.jrsystems.jrbase.counter.command;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;

import com.jrsystems.jrbase.counter.CounterDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class NewCounterCommand extends ActionCommand {

	@Override
	public void doExecuteCommand() {
		CounterDialog dialog = (CounterDialog)Application.instance().getApplicationContext().getBean("counterDialog");
		dialog.displayItem(BaseServiceUtils.createDefaultCounter());
	}

}
