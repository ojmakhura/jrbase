package com.systemsjr.jrbase.organisation;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;

public class OrganisationTypeForm extends BaseItemForm<OrganisationTypeVO> {

	public OrganisationTypeForm(OrganisationTypeVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	public OrganisationTypeForm(){
		super(new OrganisationTypeVO(), "organisationType");
	}
}
