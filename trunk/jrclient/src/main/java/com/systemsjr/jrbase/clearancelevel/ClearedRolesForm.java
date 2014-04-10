package com.systemsjr.jrbase.clearancelevel;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class ClearedRolesForm extends BaseDetailForm<RoleVO>{
			
	public ClearedRolesForm(){
		super(BaseServiceUtils.createDefaultRole(), "clearedRolesForm", new ClearedRolesDialog());
	}
}
