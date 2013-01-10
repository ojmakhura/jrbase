package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;

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
		super.initForm("organisationTable");
		
		valueHolder = BaseUIUtils.getOrganisationValueHolder();
		typesValueHolder = BaseUIUtils.getOrganisationTypeValueHolder();
		
		builder.add(sbf.createBoundComboBox("organisationType", typesValueHolder, "name"), "colSpan=1");
		builder.row();
		builder.add("registrationRef", "colSpan=1");
		builder.row();
		builder.add("name", "colSpec=40dlu:grow");
		builder.row();
		builder.add("description", "colSpec=40dlu:grow");
		
		super.endFormCreate();
		return itemPanel;
	}

	public RefreshableValueHolder getTypesValueHolder() {
		return typesValueHolder;
	}

	public void setTypesValueHolder(RefreshableValueHolder typesValueHolder) {
		this.typesValueHolder = typesValueHolder;
	}
}
