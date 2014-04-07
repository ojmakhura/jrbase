package com.systemsjr.jrbase.individual;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class IndividualView extends WorkbenchView {

	public IndividualView(){
		super("individualView");
	}
<<<<<<< .mine
=======

	/*@Override
	protected IndividualVO handleSaveItem(IndividualVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getIndividualService().saveIndividual(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(IndividualVO object) {
		BaseServiceUtils.getIndividualService().removeIndividual(object);
	}

	@Override
	protected IndividualVO handleNewItem() {
		return BaseServiceUtils.createDefaultIndividual();
	}*/
>>>>>>> .r69
}
