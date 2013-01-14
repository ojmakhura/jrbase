package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class OrganisationTypeForm extends BaseItemForm<OrganisationTypeVO> {

	public OrganisationTypeForm(OrganisationTypeVO item, String formId) {
		super(item, formId);
	}
	
	public OrganisationTypeForm(){
		super(new OrganisationTypeVO(), "organisationTypeForm");
	}
	
	@Override
	protected JComponent createFormControl() {
		super.initForm("organisationTypeTable");
				
		valueHolder = BaseUIUtils.getOrganisationTypeValueHolder();
		builder.add("levelCode", "colSpec=40dlu");
		builder.add("name", "colSpec=40:grow");
		builder.row();
		builder.addTextArea("description", "colSpec=40dlu:grow");
		
		super.endFormCreate();
		return itemPanel;
	}
}
