package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class UserClearenceForm extends BaseDetailForm {

	public UserClearenceForm() {
		super(BaseServiceUtils.createDefaultLevel(), "userClearenceForm", new UserClearenceDialog());
	}/*

	@Override
	protected void doAdd() {
		UserClearenceDialog dialog = new UserClearenceDialog();
		dialog.showDialog();
		listTable.getFinalEventList().add(dialog.getItemTable().getSelectedItem());
	}*/
}
