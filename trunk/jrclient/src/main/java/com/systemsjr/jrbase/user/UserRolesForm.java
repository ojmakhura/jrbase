package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class UserRolesForm extends BaseDetailForm {
	
	public UserRolesForm(){
		super(BaseServiceUtils.createDefaultRole(), "userRoleForm", new UserRolesDialog());
	}

	/*@Override
	protected void doAdd() {
		UserRolesDialog dialog = new UserRolesDialog();
		dialog.showDialog();
		RoleVO roleVO = (RoleVO) dialog.getItemTable().getSelectedItem();
		listTable.getFinalEventList().add(roleVO);
	}*/

}
