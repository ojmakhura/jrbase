package com.jrsystems.jrbase.role;

import javax.swing.JComponent;

import org.springframework.richclient.application.support.AbstractView;
import com.jrsystems.jrbase.role.vo.RoleVO;
import com.jrsystems.jrbase.utils.BaseServiceUtils;
import com.jrsystems.jrbase.common.BaseItemView;

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
		return null;
	}

	@Override
	protected void deleteItem() {
		getItemForm().getFormModel().commit();
		RoleVO roleVO = ((RoleVO)getItemForm().getFormObject());
		BaseServiceUtils.getRoleService().removeRole(roleVO);
	}

}
