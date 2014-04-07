package com.systemsjr.jrbase.login;

import javax.swing.JComponent;

import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;
import com.systemsjr.jrlib.richclient.BaseItemView;

public class LoginView extends BaseItemView {

	@Override
	protected JComponent createControl() {
		LoginForm form = new LoginForm();
		
		return form.getControl();
	}

	@Override
	public void addTasks() {
		// TODO Auto-generated method stub
		
	}
}
