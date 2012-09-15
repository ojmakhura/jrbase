package com.jrsystems.jrbase.organisation;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.organisation.vo.OrganisationVO;

public class OrganisationForm extends BaseItemForm<OrganisationVO> {

	public OrganisationForm(OrganisationVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public OrganisationForm(){
		super(new OrganisationVO(), "organisation");
	}

}
