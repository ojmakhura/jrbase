package com.systemsjr.jrbase.workbench.application;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.workbench.application.vo.ApplicationSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class ApplicationSearchForm extends BaseItemFilterForm {

	public ApplicationSearchForm() {
		super("applicationSearchForm");
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new ApplicationSearchCriteria();
	}

}
