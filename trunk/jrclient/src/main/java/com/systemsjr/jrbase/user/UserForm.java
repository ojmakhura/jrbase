package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class UserForm extends BaseItemForm<UserVO> {
	RefreshableValueHolder individualHolder;
	/**
	 * @wbp.parser.entryPoint
	 */
	public UserForm() {
		super(BaseServiceUtils.createDefaultUser(), "userForm");
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		super.initForm("userTable", null);
		valueHolder = BaseUIUtils.getUserValueHolder();
		individualHolder = BaseUIUtils.getIndividualValueHolder();
		
		builder.add(sbf.createBoundComboBox("status", UserStatus.literals()), "colSpec=70dlu");
		builder.row();
		builder.add("userId", "colSpan=1");
		builder.add("username", "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("individual", individualHolder, "idNumber"), "colSpan=1");
		builder.add("name", "colSpec=40dlu:grow");
		builder.row();
		builder.addPasswordField("password1", "colSpan=1");
		builder.addPasswordField("password2", "colSpan=1");
		builder.row();
		//builder.add("photo", "colSpan=1");
		
		super.endFormCreate();
		return itemPanel;
	}
	
}
