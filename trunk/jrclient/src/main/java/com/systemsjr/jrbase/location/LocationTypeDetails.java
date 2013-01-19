package com.systemsjr.jrbase.location;

import java.util.ArrayList;

import javax.swing.JComponent;

import org.springframework.richclient.form.TabbedForm;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;

public class LocationTypeDetails extends BaseTabbedForm<LocationTypeVO>{

	public LocationTypeDetails(Object item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		
		return tabs.toArray(new Tab[0]);
	}
	
	protected JComponent createLocationsTab(){
		
		return super.createTabComponent("roleListTable", "Cleared Roles");
	}

}
