package com.systemsjr.jrbase.login;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;

public class LoginView extends BaseItemView<LoginSessionVO> {

	@Override
	protected JComponent createControl() {
		LoginForm form = new LoginForm();
		
		return form.getControl();
	}

	@Override
	protected LoginSessionVO saveItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected LoginSessionVO newItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void deleteItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void showItem() {
		// TODO Auto-generated method stub
		
	}

}