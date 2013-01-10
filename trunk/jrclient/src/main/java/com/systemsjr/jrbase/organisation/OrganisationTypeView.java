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
	protected OrganisationTypeVO saveItem() {
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			OrganisationTypeVO organisationTypeVO = (OrganisationTypeVO) getItemForm().getFormObject();
			organisationTypeVO = BaseServiceUtils.getOrgService().saveOrganisationType(organisationTypeVO);
			getItemForm().getValueholder().refresh();
			return organisationTypeVO;
		}
		return null;
	}

	@Override
	protected OrganisationTypeVO newItem() {
		getItemForm().setFormObject(new OrganisationTypeVO());
		getItemForm().getFormModel().commit();
		return (OrganisationTypeVO) getItemForm().getFormObject();
	}

	@Override
	protected void deleteItem() {
		getItemForm().getFormModel().commit();
		OrganisationTypeVO organisationTypeVO = (OrganisationTypeVO) getItemForm().getFormObject();
		BaseServiceUtils.getOrgService().removeOrganisationType(organisationTypeVO);
		getItemForm().getFormModel().commit();
		
	}
}
