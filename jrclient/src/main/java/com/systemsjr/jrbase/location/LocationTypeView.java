package com.systemsjr.jrbase.location;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class LocationTypeView extends WorkbenchView {

	public LocationTypeView(){
		super("locationTypeView");
	}

	/*@Override
	protected LocationTypeVO handleSaveItem(LocationTypeVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getLocationService().saveLocationType(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(LocationTypeVO object) {
		BaseServiceUtils.getLocationService().removeLocationType(object);
	}

	@Override
	protected LocationTypeVO handleNewItem() {
		return BaseServiceUtils.createDefaultLocationType();
	}*/
}
