package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class LocationView extends BaseItemView<LocationVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new LocationForm());
		
		return getItemForm().getControl();
	}

	@Override
	protected LocationVO newItem() {
		getItemForm().setFormObject(new LocationVO());
		getItemForm().getFormModel().commit();
		return (LocationVO) getItemForm().getFormObject();
	}

	@Override
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
	}
}
