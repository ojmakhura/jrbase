package com.systemsjr.jrbase.clearancelevel;

import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class ClearedUsersForm extends BaseDetailForm<UserVO> {


	public ClearedUsersForm() {
		super(BaseServiceUtils.createDefaultUser(), "clearedUserForm", new ClearedUsersDialog());
	}

}
