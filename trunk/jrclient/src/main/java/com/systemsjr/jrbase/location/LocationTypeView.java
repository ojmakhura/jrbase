package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class LocationTypeView extends BaseItemView<LocationTypeVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new LocationTypeForm());
		return getItemForm().getControl();
	}

	@Override
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
	}
}
