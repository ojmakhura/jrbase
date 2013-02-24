package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class OrganisationView extends BaseItemView<OrganisationVO> {
	
	@Override
	protected JComponent createControl() {
		setItemForm(new OrganisationForm());
		return getItemForm().getControl();
	}

	@Override
	protected OrganisationVO handleSaveItem(OrganisationVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getOrgService().saveOrganisation(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(OrganisationVO object) {
		BaseServiceUtils.getOrgService().removeOrganisation(object);
	}

	@Override
	protected OrganisationVO handleNewItem() {
		return BaseServiceUtils.createDefaultOrganisation(null);
	}
}
