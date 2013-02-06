package com.systemsjr.jrbase.role;

import java.util.ArrayList;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.role.vo.RoleVO;

public class RoleDetails extends BaseTabbedForm<RoleVO>{

	public RoleDetails(Object item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

}
