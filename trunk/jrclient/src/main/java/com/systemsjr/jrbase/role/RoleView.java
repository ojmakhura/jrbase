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
	protected RoleVO saveItem() {
		getItemForm().getFormModel().commit();		
		RoleVO roleVO = ((RoleVO)getItemForm().getFormObject());
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

	@Override
	protected void showItem() {
		// TODO Auto-generated method stub
		
	}

}
