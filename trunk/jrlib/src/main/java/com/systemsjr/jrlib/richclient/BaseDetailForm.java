package com.systemsjr.jrlib.richclient;

import javax.swing.JComponent;

import org.springframework.richclient.form.AbstractForm;


public class BaseDetailForm<T> extends AbstractForm{
	
	BaseDetailTable<T> listTable;

	public BaseDetailForm(T createDefaultRole, String string,
			BaseDetailDialog<T> dialog) {
	}

	@Override
	protected JComponent createFormControl() {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseDetailTable<T> getListTable() {
		return listTable;
	}

	public void setListTable(BaseDetailTable<T> listTable) {
		this.listTable = listTable;
	}
	
	

}
