package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class UserForm extends BaseItemForm<UserDetailsVO> {
	RefreshableValueHolder individualHolder;
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
		individualHolder = BaseUIUtils.getIndividualValueHolder();
		builder.add(sbf.createBoundComboBox("status", UserStatus.literals()), colSpec + " " + colSpan);
		builder.row();
		builder.add(sbf.createBinding("individual", BaseUIUtils.getIndividualContext()));
		builder.row();
		builder.add("username", colSpec);
		builder.add("name", colSpec);
		builder.row();
		builder.addPasswordField("password1", colSpec);
		builder.addPasswordField("password2", colSpec);
		builder.row();
		//builder.add("photo", "colSpan=1");
		
		return super.endFormCreate("User Details");
	}
}
