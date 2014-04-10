package com.systemsjr.jrbase.role;

import javax.swing.JComponent;

import com.systemsjr.jrbase.user.UserSearchForm;
import com.systemsjr.jrlib.richclient.BaseDetailDialog;

public class RoleUsersDialog extends BaseDetailDialog {

	@Override
	protected JComponent createDialogContentPane() {
		if(itemTable == null){
			itemTable = new RoleUsersTable();
		}
		
		if(searchForm == null){
			searchForm = new UserSearchForm();
		}
		
		return null;
	}	
}
