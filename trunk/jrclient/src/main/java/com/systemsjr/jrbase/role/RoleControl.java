package com.systemsjr.jrbase.role;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class RoleControl extends BaseItemControl<RoleVO> {

	@Override
	public void handleDeleteItem(RoleVO item) {
		
		BaseServiceUtils.getRoleService().removeRole(item);
	}

	@Override
	public RoleVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultRole();
	}

	@Override
	public RoleVO handleSaveItem(RoleVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getRoleService().saveRole(item);
	}

}
