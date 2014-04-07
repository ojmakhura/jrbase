package com.systemsjr.jrbase.location;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class LocationView extends WorkbenchView {

	public LocationView(){
		super("locationView");
	}
<<<<<<< .mine
=======

	/*@Override
	protected LocationVO handleSaveItem(LocationVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getLocationService().saveLocation(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(LocationVO object) {
		BaseServiceUtils.getLocationService().removeLocation(object);
	}

	@Override
	protected LocationVO handleNewItem() {
		return BaseServiceUtils.createDefaultLocation();
	}*/
>>>>>>> .r69
}
