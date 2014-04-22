package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.role.RoleSearchForm;
import com.systemsjr.jrbase.role.RoleTable;
import com.systemsjr.jrlib.richclient.BaseDetailDialog;

public class UserRolesDialog extends BaseDetailDialog{

	@Override
	protected JComponent createDialogContentPane() {
		if(itemTable == null){
			itemTable = new RoleTable();
		}
		
		if(searchForm == null){
			searchForm = new RoleSearchForm();
		}
		
		return super.createDialogContentPane();
	}	
}
