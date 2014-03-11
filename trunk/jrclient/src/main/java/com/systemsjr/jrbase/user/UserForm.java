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
		
		builder.add(sbf.createBoundComboBox("status", UserStatus.literals()), "colSpan=1");
		builder.row();
		builder.add("userId", "colSpan=1");
		builder.add("username", "colSpan=1");
		builder.row();
		builder.add(sbf.createBinding("individual", BaseUIUtils.getIndividualContext()), "colSpan=1");
		//builder.add(sbf.createBoundComboBox("individual", individualHolder, "idNumber"), "colSpan=1");
		builder.add("name", "colSpec=40dlu:grow");
		builder.row();
		builder.addPasswordField("password1", "colSpan=1");
		builder.addPasswordField("password2", "colSpan=1");
		builder.row();
		//builder.add("photo", "colSpan=1");
		
		super.endFormCreate("");
		return itemPanel;
	}
}
