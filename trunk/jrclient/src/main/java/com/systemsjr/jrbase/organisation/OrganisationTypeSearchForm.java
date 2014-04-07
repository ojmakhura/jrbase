package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

<<<<<<< .mine
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.organisation.vo.OrganisationTypeSearchCriteria;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

=======
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.organisation.vo.OrganisationTypeSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

>>>>>>> .r69
public class OrganisationTypeSearchForm extends BaseItemFilterForm {

	public OrganisationTypeSearchForm() {
		super("organisationTypeSearchForm");
	}

<<<<<<< .mine
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("levelCode");
		builder.row();
		builder.add("name");
		builder.row();
		builder.add("description");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();

		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new OrganisationTypeSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		OrganisationTypeSearchCriteria object = (OrganisationTypeSearchCriteria) getFormObject();
		OrganisationTypeVO[] types = BaseServiceUtils.getOrgService().searchOrganisationTypes(object);
		JRTableUtils.refreshTable(table, types);
	}

=======
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
		return new OrganisationTypeSearchCriteria();
	}

>>>>>>> .r69
}
