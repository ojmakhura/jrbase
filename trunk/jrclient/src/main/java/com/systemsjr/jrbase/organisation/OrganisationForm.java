package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;

public class OrganisationForm extends BaseItemForm<OrganisationVO> {

	public OrganisationForm(OrganisationVO item, String formId) {
		super(item, formId);
	}
	
	public OrganisationForm(){
		super(new OrganisationVO(), "organisation");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm("organisationTable");
		
		return itemPanel;
	}
}
