package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.location.LocationSearchForm;
import com.systemsjr.jrbase.location.LocationTable;
import com.systemsjr.jrlib.richclient.BaseDetailDialog;

public class UserLocationDialog  extends BaseDetailDialog{
	
	@Override
	protected JComponent createDialogContentPane() {
		if(itemTable == null){
			itemTable = new LocationTable();
		}
		
		if(searchForm == null){
			searchForm = new LocationSearchForm();
		}
		
		return super.createDialogContentPane();
	}

}
