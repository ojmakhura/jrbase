package com.jrsystems.jrbase.login;

import javax.swing.JComponent;

import org.springframework.richclient.application.support.AbstractView;

import com.jrsystems.jrbase.common.BaseItemView;
import com.jrsystems.jrbase.loginsession.vo.LoginSessionVO;

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

}
