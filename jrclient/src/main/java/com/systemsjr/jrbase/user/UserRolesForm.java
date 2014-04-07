package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class UserRolesForm extends BaseDetailForm<RoleVO> {
	
	public UserRolesForm(){
		super(BaseServiceUtils.createDefaultRole(), "userRoleForm", new UserRolesDialog());
	}
}
