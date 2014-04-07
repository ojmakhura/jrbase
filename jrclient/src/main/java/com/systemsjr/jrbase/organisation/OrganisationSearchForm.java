package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.organisation.vo.OrganisationSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class OrganisationSearchForm extends BaseItemFilterForm {

	public OrganisationSearchForm() {
		super("organisationSearchForm");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new OrganisationSearchCriteria();
	}

}