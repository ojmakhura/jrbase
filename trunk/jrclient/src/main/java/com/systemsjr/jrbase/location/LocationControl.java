package com.systemsjr.jrbase.location;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class LocationControl extends BaseItemControl<LocationVO> {
	
	public LocationControl(){
		valueHolder = BaseUIUtils.getLocationValueHolder();
	}

	@Override
	public void handleDeleteItem(LocationVO item) {
		
		BaseServiceUtils.getLocationService().removeLocation(item);
	}

	@Override
	public LocationVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultLocation();
	}

	@Override
	public LocationVO handleSaveItem(LocationVO item) {

		setAction(item.getId());
		return BaseServiceUtils.getLocationService().saveLocation(item);
	}
}
