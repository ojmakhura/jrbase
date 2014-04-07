package com.systemsjr.jrbase.workbench.program;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseItemTable;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class ProgramDetails extends BaseItemDetail<ProgramVO> {

	private BaseItemTable usersTable;
	private BaseItemTable rolesTable;

	public ProgramDetails(ProgramVO item, String formId) {
		super(item, formId);
	}
	
	public ProgramDetails(){
		super(BaseServiceUtils.createDefaultProgram(), "programDetails");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		tabs.add(new Tab("Cleared Users", createUsersTab()));
		tabs.add(new Tab("Cleared Roles", createRolesTab()));
		
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent createUsersTab(){
<<<<<<< .mine
		JRTableUtils.refreshTable(usersTable, BaseServiceUtils.getUserService().searchUsers(null));
		return new JPanel();
=======
		JRTableUtils.refreshTable(usersTable, BaseServiceUtils.getUserService().searchUsers(null));
		return super.createTabComponent(usersTable, "Cleared Users");
>>>>>>> .r69
	}
	
	private JComponent createRolesTab(){
<<<<<<< .mine
		JRTableUtils.refreshTable(rolesTable, BaseServiceUtils.getRoleService().searchRoles(null));
		return new JPanel();
=======
		JRTableUtils.refreshTable(rolesTable, BaseServiceUtils.getRoleService().searchRoles(null));
		return super.createTabComponent(rolesTable, "Cleared Roles");
>>>>>>> .r69
	}
<<<<<<< .mine

	@Override
	public ProgramVO handleGetNewItem() {
		//getTabbedPane().get
		return null;
	}

	public BaseItemTable getUsersTable() {
		return usersTable;
	}

	public void setUsersTable(BaseItemTable usersTable) {
		this.usersTable = usersTable;
	}

	public BaseItemTable getRolesTable() {
		return rolesTable;
	}
=======

	@Override
	public ProgramVO handleGetNewItem() {
		//getTabbedPane().get
		return null;
	}

	public BaseItemTable getUsersTable() {
		return usersTable;
	}

	public void setUsersTable(BaseItemTable usersTable) {
		this.usersTable = usersTable;
	}

	public BaseItemTable getRolesTable() {
		return rolesTable;
	}

	public void setRolesTable(BaseItemTable rolesTable) {
		this.rolesTable = rolesTable;
	}
>>>>>>> .r69
}
