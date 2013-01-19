package com.systemsjr.jrbase.organisation;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class OrganisationTypeView extends BaseItemView<OrganisationTypeVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new OrganisationTypeForm());
		return getItemForm().getControl();
	}

	@Override
	protected OrganisationTypeVO handleSaveItem(OrganisationTypeVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getOrgService().saveOrganisationType(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(OrganisationTypeVO object) {
		BaseServiceUtils.getOrgService().removeOrganisationType(object);
	}

	@Override
	protected OrganisationTypeVO handleNewItem() {
		return BaseServiceUtils.createDefaultOrganisationType();
	}
}
