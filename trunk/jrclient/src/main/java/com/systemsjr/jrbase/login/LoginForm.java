package com.systemsjr.jrbase.login;

import javax.swing.JComponent;

import org.springframework.richclient.form.AbstractForm;
import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

public class LoginForm<UserVO> extends AbstractForm {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public LoginForm() {
		super(FormModelHelper.createFormModel(new com.systemsjr.jrbase.user.vo.UserVO()), "loginForm");
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = new SwingBindingFactory(getFormModel());
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		
		builder.row();
		builder.add("username", "colSpan=1");
		builder.row();
		builder.addPasswordField("password", "colSpan=1");
		builder.row();
		
		return builder.getForm();
	}
	
}
