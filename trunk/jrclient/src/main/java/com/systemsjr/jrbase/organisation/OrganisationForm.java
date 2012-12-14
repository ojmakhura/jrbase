package com.systemsjr.jrbase.organisation;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;

public class OrganisationForm extends BaseItemForm<OrganisationVO> {

	public OrganisationForm(OrganisationVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public OrganisationForm(){
		super(new OrganisationVO(), "organisation");
	}

}
