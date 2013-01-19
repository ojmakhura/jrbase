package com.systemsjr.jrbase.role;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class RoleView extends BaseItemView<RoleVO>{
	
	public RoleView(){
		super();
	}
	
	@Override
	protected JComponent createControl() {
		setItemForm(new RoleForm());
		return getItemForm().getControl();
	}
	
	@Override
	protected RoleVO handleSaveItem(RoleVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getRoleService().saveRole(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(RoleVO object) {
		BaseServiceUtils.getRoleService().removeRole(object);
	}

	@Override
	protected RoleVO handleNewItem() {
		return BaseServiceUtils.createDefaultRole();
	}

}
