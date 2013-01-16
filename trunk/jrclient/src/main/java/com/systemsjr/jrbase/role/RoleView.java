package com.systemsjr.jrbase.role;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.Action;
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
	protected RoleVO saveItem() {
		getItemForm().getFormModel().commit();		
		RoleVO roleVO = ((RoleVO)getItemForm().getFormObject());
		setAction(roleVO.getId());
		return BaseServiceUtils.getRoleService().saveRole(roleVO);
	}

	@Override
	protected RoleVO newItem() {
		getItemForm().setFormObject(new RoleVO());
		return (RoleVO) getItemForm().getFormObject();
	}

	@Override
	protected RoleVO deleteItem() {
		setAction(Action.DELETE);
		getItemForm().getFormModel().commit();
		RoleVO roleVO = ((RoleVO)getItemForm().getFormObject());
		BaseServiceUtils.getRoleService().removeRole(roleVO);
		return roleVO;
	}

}
