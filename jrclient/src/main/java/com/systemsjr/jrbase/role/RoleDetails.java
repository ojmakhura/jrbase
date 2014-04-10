package com.systemsjr.jrbase.role;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;
public class RoleDetails extends BaseItemDetail<RoleVO>{
	
	RoleUsersForm roleUsersForm;

	public RoleDetails(RoleVO item, String formId) {
		super(item, formId);
	}
	
	public RoleDetails(){
		this(BaseServiceUtils.createDefaultRole(), "roleDetails");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("roleUsers", getUserTab()));
		
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent getUserTab(){
		JRTableUtils.refreshTable(roleUsersForm.getListTable(), BaseServiceUtils.getUserService().searchUsers(null));
		roleUsersForm.getControl().repaint();
		return roleUsersForm.getControl();
	}


	public RoleUsersForm getRoleUsersForm() {
		return roleUsersForm;
	}

	public void setRoleUsersForm(RoleUsersForm roleUsersForm) {
		this.roleUsersForm = roleUsersForm;
	}
	@Override
	public RoleVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
