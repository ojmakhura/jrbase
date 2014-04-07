package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.systemsjr.jrbase.role.RoleTable;
import com.systemsjr.jrbase.user.UserTable;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrbase.workbench.program.ProgramTable;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class MenuDetails extends BaseItemDetail<MenuVO> {
	private MenuTable subMenusTable;
	private ProgramTable programsTable;
	private UserTable usersTable;
	private RoleTable rolesTable;

	public MenuDetails(MenuVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public MenuDetails(){
		super(BaseServiceUtils.createDefaultMenu(), "menuDetails");
	}

	@Override
	protected Tab[] getTabs() {
		return new Tab[]{
				new Tab("Sub Menus", createSubMenusTab()),
				new Tab("Programs", createProgramsTab()),
				new Tab("Users", createUsersTab()),
				new Tab("Roles", createRolesTab())
		};
	}
	
	 private JComponent createSubMenusTab(){
<<<<<<< .mine
		 JRTableUtils.refreshTable(subMenusTable, BaseServiceUtils.getMenuService().searchMenus(null));
		 return new JPanel();
=======
		 JRTableUtils.refreshTable(subMenusTable, BaseServiceUtils.getMenuService().searchMenus(null));
		 return super.createTabComponent(subMenusTable, "Sub Menus");
>>>>>>> .r69
	 }
	 
	 private JComponent createProgramsTab(){
<<<<<<< .mine
		 JRTableUtils.refreshTable(programsTable, BaseServiceUtils.getProgramService().searchPrograms(null));
		 return new JPanel();
=======
		 JRTableUtils.refreshTable(programsTable, BaseServiceUtils.getProgramService().searchPrograms(null));
		 return super.createTabComponent(programsTable, "Programs");
>>>>>>> .r69
	 }
	 
	 private JComponent createUsersTab(){
<<<<<<< .mine
		 JRTableUtils.refreshTable(usersTable, BaseServiceUtils.getUserService().searchUsers(null));
		 return new JPanel();
=======
		 JRTableUtils.refreshTable(usersTable, BaseServiceUtils.getUserService().searchUsers(null));
		 return super.createTabComponent(usersTable, "Users");
>>>>>>> .r69
	 }

	 private JComponent createRolesTab(){
<<<<<<< .mine
		 JRTableUtils.refreshTable(rolesTable, BaseServiceUtils.getRoleService().searchRoles(null));
		 return new JPanel();
=======
		 JRTableUtils.refreshTable(rolesTable, BaseServiceUtils.getRoleService().searchRoles(null));
		 return super.createTabComponent(rolesTable, "Users");
>>>>>>> .r69
	 }

	public MenuTable getSubMenusTable() {
		return subMenusTable;
	}

	public void setSubMenusTable(MenuTable subMenusTable) {
		this.subMenusTable = subMenusTable;
	}

	public ProgramTable getProgramsTable() {
		return programsTable;
	}

	public void setProgramsTable(ProgramTable programsTable) {
		this.programsTable = programsTable;
	}

	public UserTable getUsersTable() {
		return usersTable;
	}

	public void setUsersTable(UserTable usersTable) {
		this.usersTable = usersTable;
	}

	public RoleTable getRolesTable() {
		return rolesTable;
	}

	public void setRolesTable(RoleTable rolesTable) {
		this.rolesTable = rolesTable;
	}

	@Override
	public MenuVO handleGetNewItem() {
		
		return null;
	}
}
