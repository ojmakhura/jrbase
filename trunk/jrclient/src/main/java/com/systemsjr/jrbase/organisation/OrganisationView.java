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
	protected OrganisationVO saveItem() {
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			OrganisationVO organisationVO = (OrganisationVO) getItemForm().getFormObject();
			organisationVO = BaseServiceUtils.getOrgService().saveOrganisation(organisationVO);
			getItemForm().getValueholder().refresh();
			((OrganisationForm)getItemForm()).getTypesValueHolder().refresh();
			return organisationVO;
		}
		return null;
	}

	@Override
	protected OrganisationVO newItem() {
		getItemForm().setFormObject(new OrganisationVO());
		getItemForm().getFormModel().commit();
		return (OrganisationVO) getItemForm().getFormObject();
	}

	@Override
	protected OrganisationVO deleteItem() {
		getItemForm().getFormModel().commit();
		OrganisationVO organisationVO = (OrganisationVO) getItemForm().getFormObject();
		BaseServiceUtils.getOrgService().removeOrganisation(organisationVO);
		getItemForm().getFormModel().commit();
		
		return organisationVO;
	}
}
