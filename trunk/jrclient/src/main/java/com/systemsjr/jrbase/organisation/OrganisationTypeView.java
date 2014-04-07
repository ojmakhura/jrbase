package com.systemsjr.jrbase.organisation;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class OrganisationTypeView extends WorkbenchView {

	public OrganisationTypeView(){
		super("organisationTypeView");
	}
<<<<<<< .mine
=======

	/*@Override
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
	}*/
>>>>>>> .r69
}
