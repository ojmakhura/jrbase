package com.systemsjr.jrbase.location;

import java.util.ArrayList;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;

public class LocationDetails extends BaseItemDetail<LocationVO>{

	public LocationDetails(LocationVO item, String formId) {
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

	@Override
	public LocationVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
