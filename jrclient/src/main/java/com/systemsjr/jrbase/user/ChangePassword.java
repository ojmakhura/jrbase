package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class ChangePassword extends BaseItemForm<UserDetailsVO> {

	public ChangePassword() {
		super(new UserDetailsVO(), "changePasswordForm");
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
		super.initForm();
		builder.addPasswordField("password", "colSpan=1");
		builder.addPasswordField("password1", "colSpan=1");
		builder.addPasswordField("password2", "colSpan=1");
		super.endFormCreate(null);
		return itemPanel;
	 }

}
