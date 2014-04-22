package com.systemsjr.jrbase.role;

import java.util.ArrayList;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;

public class RoleDetails extends BaseItemDetail<RoleVO>{

	public RoleDetails(RoleVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

	@Override
	public RoleVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
