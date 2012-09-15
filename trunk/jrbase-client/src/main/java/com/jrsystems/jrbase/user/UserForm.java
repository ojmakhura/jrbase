package com.jrsystems.jrbase.user;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.user.vo.UserVO;

public class UserForm extends BaseItemForm<UserVO> {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public UserForm() {
		super(new UserVO(), "user");
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		return builder.getForm();
	}
	
}
