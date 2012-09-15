package com.jrsystems.jrbase.login;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.user.vo.UserVO;

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
