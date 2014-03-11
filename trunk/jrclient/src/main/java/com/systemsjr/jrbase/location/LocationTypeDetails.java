package com.systemsjr.jrbase.location;

import java.util.ArrayList;

import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;

public class LocationTypeDetails extends BaseItemDetail<LocationTypeVO>{

	public LocationTypeDetails(LocationTypeVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		return tabs.toArray(new Tab[0]);
	}
	/*
	protected JComponent createLocationsTab(){
		
		return super.createTabComponent(roleListTable, "Cleared Roles");
	}*/

	@Override
	public LocationTypeVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
