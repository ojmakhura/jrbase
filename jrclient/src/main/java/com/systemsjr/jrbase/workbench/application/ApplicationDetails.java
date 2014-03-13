package com.systemsjr.jrbase.workbench.application;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseItemTable;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class ApplicationDetails extends BaseItemDetail<ApplicationVO> {

	private BaseItemTable programTable;
	private BaseItemTable userTable;

	public ApplicationDetails(ApplicationVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public ApplicationDetails(){
		super(BaseServiceUtils.createDefaultApplication(), "applicationDetails");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("Programs", createProgramsTab()));
		tabs.add(new Tab("Users", createUsersTab()));
		return tabs.toArray(new Tab[0]);
	}
	
	 
	 private JComponent createProgramsTab(){
		 JRTableUtils.refreshTable(programTable, BaseServiceUtils.getProgramService().searchPrograms(null));
		 return super.createTabComponent(programTable, "Programs");
	 }
	 
	 private JComponent createUsersTab(){
		 JRTableUtils.refreshTable(userTable, BaseServiceUtils.getUserService().searchUsers(null));
		 return super.createTabComponent(userTable, "Users");
	 }

	public BaseItemTable getProgramTable() {
		return programTable;
	}

	public void setProgramTable(BaseItemTable programTable) {
		this.programTable = programTable;
	}

	public BaseItemTable getUserTable() {
		return userTable;
	}

	public void setUserTable(BaseItemTable userTable) {
		this.userTable = userTable;
	}

	@Override
	public ApplicationVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 
}
