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
	protected LocationVO saveItem() {
		
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			LocationVO locationVO = (LocationVO) getItemForm().getFormObject();
			setAction(locationVO.getId());
			locationVO = BaseServiceUtils.getLocationService().saveLocation(locationVO);
			getItemForm().getValueholder().refresh();
			return locationVO;
		}
		return null;
	}

	@Override
	protected LocationVO newItem() {
		getItemForm().setFormObject(new LocationVO());
		getItemForm().getFormModel().commit();
		return (LocationVO) getItemForm().getFormObject();
	}

	@Override
	protected LocationVO deleteItem() {
		getItemForm().getFormModel().commit();
		LocationVO locationVO = (LocationVO) getItemForm().getFormObject();
		BaseServiceUtils.getLocationService().removeLocation(locationVO);
		getItemForm().getFormModel().commit();
		
		return locationVO;
	}
}
