package com.systemsjr.jrbase.common;

import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.TabbedForm;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;



public abstract class BaseTabbedForm<T> extends TabbedForm {

	public BaseTabbedForm(Object item, String formId) {
		super(FormModelHelper.createFormModel(item), formId);
	}
	
	public JComponent createTabComponent(String tableName, String title){
		SwingBindingFactory sbf = new SwingBindingFactory(getFormModel());
		TableFormBuilder builder = new TableFormBuilder(sbf);
		BaseItemTable table = (BaseItemTable) Application.instance().getApplicationContext().getBean(tableName);
		JScrollPane scrollPane = new JScrollPane();
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(table.getControl());
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}
}
