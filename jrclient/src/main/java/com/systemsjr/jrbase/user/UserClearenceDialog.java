package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.clearancelevel.ClearanceLevelSearchForm;
import com.systemsjr.jrbase.clearancelevel.ClearanceLevelTable;
import com.systemsjr.jrlib.richclient.BaseDetailDialog;

public class UserClearenceDialog extends BaseDetailDialog {
	@Override
	protected JComponent createDialogContentPane() {
		if(itemTable == null){
			itemTable = new ClearanceLevelTable();
		}
		
		if(searchForm == null){
			searchForm = new ClearanceLevelSearchForm();
		}
		
		return super.createDialogContentPane();
	}	
}
