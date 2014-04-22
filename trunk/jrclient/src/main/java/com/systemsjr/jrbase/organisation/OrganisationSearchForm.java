package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.organisation.vo.OrganisationSearchCriteria;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class OrganisationSearchForm extends BaseItemFilterForm {

	public OrganisationSearchForm() {
		super("organisationSearchForm");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("registrationRef");
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
		return new OrganisationSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		OrganisationSearchCriteria object = (OrganisationSearchCriteria) getFormObject();
		OrganisationVO[] organisations = BaseServiceUtils.getOrgService().searchOrganisations(object);	
		JRTableUtils.refreshTable(table, organisations);
	}

}
