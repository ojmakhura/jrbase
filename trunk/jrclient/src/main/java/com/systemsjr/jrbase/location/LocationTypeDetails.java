package com.systemsjr.jrbase.location;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.TabbedForm;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.role.RoleTable;

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
		
		BaseItemTable table = (BaseItemTable) Application.instance().getApplicationContext().getBean("roleListTable");
		
		return super.createTabComponent(table, "Cleared Roles");
	}

}
