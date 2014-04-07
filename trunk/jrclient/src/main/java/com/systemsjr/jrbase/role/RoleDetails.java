package com.systemsjr.jrbase.role;

import java.util.ArrayList;

<<<<<<< .mine
import javax.swing.JComponent;

=======
>>>>>>> .r69
import com.systemsjr.jrbase.role.vo.RoleVO;
<<<<<<< .mine
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;
=======
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;
>>>>>>> .r69

<<<<<<< .mine
public class RoleDetails extends BaseItemDetail<RoleVO>{
	
	RoleUsersForm roleUsersForm;
=======
public class RoleDetails extends BaseItemDetail<RoleVO>{
>>>>>>> .r69

	public RoleDetails(RoleVO item, String formId) {
		super(item, formId);
	}
	
	public RoleDetails(){
		this(BaseServiceUtils.createDefaultRole(), "roleDetails");
	}

	@Override
	protected Tab[] getTabs() {
<<<<<<< .mine
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("roleUsers", getUserTab()));
=======
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
>>>>>>> .r69
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent getUserTab(){
		JRTableUtils.refreshTable(roleUsersForm.getListTable(), BaseServiceUtils.getUserService().searchUsers(null));
		roleUsersForm.getControl().repaint();
		return roleUsersForm.getControl();
	}

<<<<<<< .mine
	@Override
	public RoleVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public RoleUsersForm getRoleUsersForm() {
		return roleUsersForm;
	}

	public void setRoleUsersForm(RoleUsersForm roleUsersForm) {
		this.roleUsersForm = roleUsersForm;
	}
=======
	@Override
	public RoleVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> .r69
}
