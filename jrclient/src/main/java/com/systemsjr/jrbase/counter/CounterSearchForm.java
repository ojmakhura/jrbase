package com.systemsjr.jrbase.counter;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class CounterSearchForm extends BaseItemFilterForm {

	public CounterSearchForm() {
		super("counterSearchForm");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return super.newFormObject();
	}

	@Override
	protected void doSearch() {
		commit();
		
	}
}
