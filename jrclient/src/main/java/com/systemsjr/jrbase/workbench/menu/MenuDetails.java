package com.systemsjr.jrbase.workbench.menu;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;

public class MenuDetails extends BaseTabbedForm<MenuVO> {

	public MenuDetails(Object item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public MenuDetails(){
		super(BaseServiceUtils.createDefaultMenu(), "menuDetails");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("Sub Menus", createSubMenusTab()));
		tabs.add(new Tab("Programs", createProgramsTab()));
		tabs.add(new Tab("Users", createUsersTab()));
		tabs.add(new Tab("Roles", createRolesTab()));
		return tabs.toArray(new Tab[0]);
	}
	
	 private JComponent createSubMenusTab(){
		 return super.createTabComponent("menuTable", "Sub Menus");
	 }
	 
	 private JComponent createProgramsTab(){
		 return super.createTabComponent("programTable", "Programs");
	 }
	 
	 private JComponent createUsersTab(){
		 return super.createTabComponent("userTable", "Users");
	 }

	 private JComponent createRolesTab(){
		 return super.createTabComponent("userTable", "Users");
	 }
}
