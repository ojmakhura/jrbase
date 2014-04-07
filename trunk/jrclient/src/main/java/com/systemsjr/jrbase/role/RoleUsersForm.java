package com.systemsjr.jrbase.role;

import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailDialog;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class RoleUsersForm extends BaseDetailForm<UserVO> {

	public RoleUsersForm() {
		super(BaseServiceUtils.createDefaultUser(), "roleUsersForm", new RoleUsersDialog());
	}

}
