package com.systemsjr.jrbase.config;

import java.awt.Dimension;

import org.springframework.richclient.command.ActionCommandExecutor;
import org.springframework.richclient.wizard.AbstractWizard;
import org.springframework.richclient.wizard.WizardDialog;

public class BaseSetupWizard extends AbstractWizard implements
		ActionCommandExecutor {
	private WizardDialog wizardDialog;
	@Override
	protected boolean onFinish() {
		return true;
	}

	@Override
	public void execute() {
		if (wizardDialog == null) {
			wizardDialog = new WizardDialog();
			wizardDialog.setPreferredSize(new Dimension(500, 300));
			wizardDialog.setResizable(true);
		}
		wizardDialog.showDialog();
	}
}
