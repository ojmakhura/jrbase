package com.jrsystems.jrbase.role;

import com.jrsystems.jrbase.common.BaseItemDialog;
import com.jrsystems.jrbase.role.vo.RoleVO;

public class RoleDialog extends BaseItemDialog<RoleVO> {

	public RoleDialog() {
		super("roleDialog");
	}

	@Override
	protected boolean itemExists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean onFinish() {
		// TODO Auto-generated method stub
		getItemForm().getFormModel().commit();
		System.out.println(getItemForm().getFormModel().getFormObject());
		System.out.println(getItemForm().getFormObject());
		System.out.println(((RoleVO)getItemForm().getFormObject()).getRole());
		return super.onFinish();
	}
}
