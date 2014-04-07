package com.systemsjr.jrbase.organisation;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class OrganisationView extends WorkbenchView {
	
	public OrganisationView(){
		super("organisationView");
	}
<<<<<<< .mine
=======

	/*@Override
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
	}*/
>>>>>>> .r69
}
