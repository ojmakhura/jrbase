package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class UserClearenceForm extends BaseDetailForm<ClearanceLevelVO> {

	public UserClearenceForm() {
		super(BaseServiceUtils.createDefaultLevel(), "userClearenceForm", new UserClearenceDialog());
	}
}
