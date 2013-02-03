package com.systemsjr.jrbase.location;

import java.util.ArrayList;

import org.springframework.richclient.form.TabbedForm;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.location.vo.LocationVO;

public class LocationDetails extends BaseTabbedForm<LocationVO>{

	public LocationDetails(Object item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

}
