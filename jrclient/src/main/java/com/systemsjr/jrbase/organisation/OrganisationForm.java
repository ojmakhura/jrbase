package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class OrganisationForm extends BaseItemForm<OrganisationVO> {
	private RefreshableValueHolder typesValueHolder;
	public OrganisationForm(OrganisationVO item, String formId) {
		super(item, formId);
	}
	
	public OrganisationForm(){
		super(new OrganisationVO(), "organisationForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm();
		
		typesValueHolder = BaseUIUtils.getOrganisationTypeValueHolder();
		
<<<<<<< .mine
		builder.add(sbf.createBinding("organisationType", BaseUIUtils.getOrganisationTypeContext()), colSpec);
=======
		builder.add(sbf.createBinding("organisationType", BaseUIUtils.getOrganisationTypeContext()), "colSpec=40dlu:grow");
		builder.row();
		builder.add("registrationRef", "colSpec=40dlu:grow");
>>>>>>> .r69
		builder.row();
		builder.add("registrationRef", colSpec);
		builder.row();
		builder.add("name", colSpec);
		builder.row();
		builder.addTextArea("description", colSpec);
		
<<<<<<< .mine
		return super.endFormCreate(null);
=======
		super.endFormCreate(null);
		return itemPanel;
>>>>>>> .r69
	}

	public RefreshableValueHolder getTypesValueHolder() {
		return typesValueHolder;
	}

	public void setTypesValueHolder(RefreshableValueHolder typesValueHolder) {
		this.typesValueHolder = typesValueHolder;
	}
}
