package com.systemsjr.jrbase.clearancelevel;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.role.RoleTable;
import com.systemsjr.jrbase.user.UserTable;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class ClearanceLevelDetails extends BaseItemDetail<ClearanceLevelVO>{
	private RoleTable roleListTable;
	private UserTable usersTable;
	
	public ClearanceLevelDetails() {
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
		JRTableUtils.refreshTable(roleListTable, BaseServiceUtils.getRoleService().searchRoles(null));
		return super.createTabComponent(roleListTable, "Cleared Roles");
	}
	
	private JComponent getClearedUsersTab(){
		JRTableUtils.refreshTable(usersTable, BaseServiceUtils.getUserService().searchUsers(null));
		return super.createTabComponent(usersTable, "Cleared Users");
	}

	@Override
	public ClearanceLevelVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleTable getRoleListTable() {
		return roleListTable;
	}

	public void setRoleListTable(RoleTable roleListTable) {
		this.roleListTable = roleListTable;
	}

	public UserTable getUsersTable() {
		return usersTable;
	}

	public void setUsersTable(UserTable usersTable) {
		this.usersTable = usersTable;
	}
	
	
}
