package com.systemsjr.jrbase.login;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.user.vo.UserVO;

public class LoginForm extends BaseItemForm<UserVO> {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public LoginForm() {
		super(new UserVO(), "user");
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		return new org.springframework.richclient.security.LoginForm().getControl();
	}
	
}
