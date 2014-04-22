package com.systemsjr.jrbase.location;

import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class LocationTypeControl extends BaseItemControl<LocationTypeVO> {
	
	public LocationTypeControl(){
		valueHolder = BaseUIUtils.getLocationTypeValueHolder();
	}

	@Override
	public void handleDeleteItem(LocationTypeVO item) {
		
		BaseServiceUtils.getLocationService().removeLocationType(item);
	}

	@Override
	public LocationTypeVO handleNewItem() {
		return BaseServiceUtils.createDefaultLocationType();
	}

	@Override
	public LocationTypeVO handleSaveItem(LocationTypeVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getLocationService().saveLocationType(item);
	}
}
