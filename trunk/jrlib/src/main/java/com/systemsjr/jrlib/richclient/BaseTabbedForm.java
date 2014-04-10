package com.systemsjr.jrlib.richclient;

import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.TabbedForm;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;



public abstract class BaseTabbedForm<T> extends TabbedForm {
	private BaseItemDialog<T> addDialog;
	//protect
	
	public BaseTabbedForm(T item, String formId) {
		super(FormModelHelper.createFormModel(item), formId);
	}
	
	public JComponent createTabComponent(BaseItemTable table, String title){
		SwingBindingFactory sbf = new SwingBindingFactory(getFormModel());
		TableFormBuilder builder = new TableFormBuilder(sbf);
		JScrollPane scrollPane = getComponentFactory().createScrollPane();
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(table.getControl());
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}
	
}
