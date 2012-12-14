package com.systemsjr.jrbase.workbench.menu.command;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.user.vo.UserVO;

public class MenuForm extends BaseItemForm<UserVO> {
	
	public MenuForm() {
		super(new UserVO(), "user");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		return builder.getForm();
	}
	
}
