package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class OrganisationTypeForm extends BaseItemForm<OrganisationTypeVO> {

	public OrganisationTypeForm(OrganisationTypeVO item, String formId) {
		super(item, formId);
	}
	
	public OrganisationTypeForm(){
		super(new OrganisationTypeVO(), "organisationTypeForm");
	}
	
	@Override
	protected JComponent createFormControl() {
		super.initForm();
				
		builder.add("levelCode", "colSpec=40dlu");
		builder.row();
		builder.add("name", colSpec);
		builder.row();
		builder.addTextArea("description", colSpec);
		
		return super.endFormCreate("");
	}
}
