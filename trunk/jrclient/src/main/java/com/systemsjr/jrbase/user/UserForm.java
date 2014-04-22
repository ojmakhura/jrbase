package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class UserForm extends BaseItemForm<UserDetailsVO> {
	/**
	 * @wbp.parser.entryPoint
	 */
	public UserForm() {
		super(new UserDetailsVO(), "userForm");
		
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		super.initForm();
		
		builder.add(sbf.createBoundComboBox("status", UserStatus.literals()), "colSpan=1");
		builder.row();
		builder.add(sbf.createBinding("individual", BaseUIUtils.getIndividualContext()));
		builder.row();
		builder.add("username", "colSpan=1");
		builder.add("name", "colSpan=1");
		builder.row();
		builder.addPasswordField("password1", "colSpan=1");
		builder.addPasswordField("password2", "colSpan=1");
		builder.row();
		//builder.add("photo", "colSpan=1");
		
		super.endFormCreate("User Details");
		return itemPanel;
	}
}
