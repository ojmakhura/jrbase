package com.jrsystems.jrbase.organisation;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.organisation.vo.OrganisationTypeVO;

public class OrganisationTypeForm extends BaseItemForm<OrganisationTypeVO> {

	public OrganisationTypeForm(OrganisationTypeVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	public OrganisationTypeForm(){
		super(new OrganisationTypeVO(), "organisationType");
	}
}
