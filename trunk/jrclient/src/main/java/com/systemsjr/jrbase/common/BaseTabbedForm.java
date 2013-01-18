package com.systemsjr.jrbase.common;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.TabbedForm;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.role.RoleTable;



public abstract class BaseTabbedForm<T> extends TabbedForm {

	public BaseTabbedForm(Object item, String formId) {
		super(FormModelHelper.createFormModel(item), formId);
	}
	
	public JComponent createTabComponent(BaseItemTable<T> itemTable, String title){
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		BaseItemTable table = itemTable;
		JScrollPane scrollPane = getComponentFactory().createScrollPane();
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(table.getControl());
		scrollPane.setBorder(BorderFactory.createTitledBorder("Cleared Roles"));
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}
}
