package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class ChangePassword extends BaseItemForm<UserVO> {

	public ChangePassword() {
		super(BaseServiceUtils.createDefaultUser(), "changePasswordForm");
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		super.initForm("userTable", null);
		builder.addPasswordField("password", "colSpan=1");
		builder.addPasswordField("password1", "colSpan=1");
		builder.addPasswordField("password2", "colSpan=1");
		super.endFormCreate(null);
		return itemPanel;
	 }

}
