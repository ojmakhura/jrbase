package com.systemsjr.jrbase.user;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.systemsjr.jrbase.common.BaseItemDialog;
import com.systemsjr.jrbase.user.vo.UserVO;

public class UserDialog extends BaseItemDialog<UserVO> {

	public UserDialog() {
		super("userDialog");
	}
	
	public UserDialog(UserVO userVO) {
		super("userDialog");
		setItem(userVO);
	}

	@Override
	protected JComponent createDialogContentPane() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(getItemForm().getControl(), BorderLayout.CENTER);
		return panel;
	}
	
	@Override
	protected boolean onFinish() {
		getItemForm().commit();
		logger.warn("item is " + getItemForm().getFormObject().toString());
		return true;
	}

	@Override
	protected boolean itemExists() {
		// TODO Auto-generated method stub
		return false;
	}

}
