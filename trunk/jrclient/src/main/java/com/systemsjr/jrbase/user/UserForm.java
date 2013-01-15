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
		super.initForm("userTable");
		valueHolder = BaseUIUtils.getUserValueHolder();
		individualHolder = BaseUIUtils.getIndividualValueHolder();
		
		builder.row();
		builder.add("username", "colSpec=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("individual", individualHolder, "idNumber, surname, firstName"), "colSpec=40dlu");
		builder.add("name", "colSpec=40dlu:grow");
		builder.row();
		builder.addPasswordField("password", "colSpan=1");
		builder.addPasswordField("password2", "colSpan=1");
		builder.row();
		//builder.add("photo", "colSpan=1");
		
		super.endFormCreate();
		return itemPanel;
	}
	
}
