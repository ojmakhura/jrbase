package com.systemsjr.jrbase.location;

import java.util.ArrayList;

import com.systemsjr.jrbase.location.vo.LocationVO;
<<<<<<< .mine
import com.systemsjr.jrlib.richclient.BaseItemDetail;
=======
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;
>>>>>>> .r69

public class LocationDetails extends BaseItemDetail<LocationVO>{

	public LocationDetails(LocationVO item, String formId) {
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

<<<<<<< .mine
	@Override
	public LocationVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}
=======
	@Override
	public LocationVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> .r69
}
