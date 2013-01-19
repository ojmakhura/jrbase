package com.systemsjr.jrbase.clearancelevel;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class LevelDetails extends BaseTabbedForm<ClearanceLevelVO>{

	public LevelDetails() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevelDetails");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("Cleared Roles", getClearedRolesTab()));
		tabs.add(new Tab("Cleared Users", getClearedUsersTab()));
		
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent getClearedRolesTab(){
		
		return super.createTabComponent("roleListTable", "Cleared Roles");
	}
	
	private JComponent getClearedUsersTab(){
		
		return super.createTabComponent("userTable", "Cleared Users");
	}
	
}
