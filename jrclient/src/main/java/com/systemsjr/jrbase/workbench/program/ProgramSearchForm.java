package com.systemsjr.jrbase.workbench.program;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.workbench.program.vo.ProgramSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class ProgramSearchForm extends BaseItemFilterForm {

	public ProgramSearchForm() {
		super("programSearchForm");
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
		// TODO Auto-generated method stub
		return new ProgramSearchCriteria();
	}

}
