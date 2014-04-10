package com.systemsjr.jrlib.richclient;

import javax.swing.JComponent;

import org.springframework.richclient.dialog.ApplicationDialog;

public abstract class BaseDetailDialog<T> extends ApplicationDialog {

	protected BaseItemTable<T> itemTable;
	protected BaseItemFilterForm searchForm;

	@Override
	protected boolean onFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	public BaseItemTable<T> getItemTable() {
		return itemTable;
	}

	public void setItemTable(BaseItemTable<T> itemTable) {
		this.itemTable = itemTable;
	}

	public BaseItemFilterForm getSearchForm() {
		return searchForm;
	}

	public void setSearchForm(BaseItemFilterForm searchForm) {
		this.searchForm = searchForm;
	}

	@Override
	protected JComponent createDialogContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

}
