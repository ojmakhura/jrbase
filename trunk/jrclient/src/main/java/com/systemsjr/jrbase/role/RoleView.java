package com.systemsjr.jrbase.role;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

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
	protected RoleVO saveItem() {
		getItemForm().getFormModel().commit();		
		RoleVO roleVO = ((RoleVO)getItemForm().getFormObject());
		RoleForm roleForm = (RoleForm) getItemForm();
		AbstractTableModel tableModel = roleForm.getItemList().getTableModel();
		tableModel.fireTableDataChanged();
		JTable table = roleForm.getItemList().getItemTable();
		table.repaint();
		return BaseServiceUtils.getRoleService().saveRole(roleVO);
	}

	@Override
	protected RoleVO newItem() {
		getItemForm().setFormObject(new RoleVO());
		return (RoleVO) getItemForm().getFormObject();
	}

	@Override
	protected void deleteItem() {
		getItemForm().getFormModel().commit();
		RoleVO roleVO = ((RoleVO)getItemForm().getFormObject());
		BaseServiceUtils.getRoleService().removeRole(roleVO);
	}
}
