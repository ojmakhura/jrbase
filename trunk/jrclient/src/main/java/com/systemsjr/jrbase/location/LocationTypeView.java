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
	protected LocationTypeVO saveItem() {
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			LocationTypeVO locationTypeVO = (LocationTypeVO) getItemForm().getFormObject();
			setAction(locationTypeVO.getId());
			locationTypeVO = BaseServiceUtils.getLocationService().saveLocationType(locationTypeVO);
			getItemForm().getValueholder().refresh();
			return locationTypeVO;
		}
		return null;
	}

	@Override
	protected LocationTypeVO newItem() {
		getItemForm().setFormObject(new LocationTypeVO());
		getItemForm().getFormModel().commit();
		return (LocationTypeVO) getItemForm().getFormObject();
	}

	@Override
	protected LocationTypeVO deleteItem() {
		getItemForm().getFormModel().commit();
		LocationTypeVO locationTypeVO = (LocationTypeVO) getItemForm().getFormObject();
		BaseServiceUtils.getLocationService().removeLocationType(locationTypeVO);
		getItemForm().getFormModel().commit();
		
		return locationTypeVO;
	}
}
