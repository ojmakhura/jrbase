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

<<<<<<< .mine
	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		
	}
	
	@Override
	protected Object newFormObject() {
		return super.newFormObject();
	}

	@Override
	protected void doSearch() {
		commit();
		
	}

=======
	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		
	}
	
	@Override
	protected Object newFormObject() {
		return super.newFormObject();
	}

>>>>>>> .r69
}
