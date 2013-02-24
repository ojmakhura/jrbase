package com.systemsjr.jrbase.login;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.dialog.ApplicationDialog;
import org.springframework.richclient.form.FormGuard;
import org.springframework.richclient.util.CustomizableFocusTraversalPolicy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.loginsession.SessionStatus;
import com.systemsjr.jrbase.loginsession.vo.LoginSessionVO;
import com.systemsjr.jrbase.security.JRAuthenticationManager;
import com.systemsjr.jrbase.user.UserStatus;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class LoginDialog extends ApplicationDialog {
	LoginForm<UserVO> form;

	public LoginDialog() {
		form = new LoginForm<UserVO>();
		CustomizableFocusTraversalPolicy
				.installCustomizableFocusTraversalPolicy();
	}

	public void setForm(LoginForm<UserVO> form) {
		this.form = form;
	}

	public LoginForm<UserVO> getForm() {
		return form;
	}

	@SuppressWarnings("unused")
	@Override
	protected boolean onFinish() {
		AuthenticationManager am = new JRAuthenticationManager();
		form.commit();
		UserDetailsVO userVO = (UserDetailsVO) form.getFormObject();
		userVO.setStatus(UserStatus.ACTIVE);
		if (userVO == null) {
			BaseUIUtils.showMessage("Login Error",
					"Could not log in.\nPlease Check your details.",
					org.springframework.richclient.core.Severity.ERROR);
			return false;
		}
		//org.springframework.context.support.ResourceMapFactoryBean
		try {
			Authentication request = new UsernamePasswordAuthenticationToken(
					userVO.getUsername(), userVO.getPassword());
			Authentication result = am.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
		} catch (AuthenticationException e) {
			System.out.println("Authentication failed: " + e.getMessage());
		}
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		LoginSessionVO session = (LoginSessionVO) Application.instance()
				.getApplicationContext().getBean("loginSessionVO");
		session.setStatus(SessionStatus.ACTIVE);
		session.setUser(userVO);
		session.setArea(new LocationVO());
		session = BaseServiceUtils.getLoginService().saveLoginSession(session);

		return true;
	}

	@Override
	protected JComponent createDialogContentPane() {
		BaseUIUtils.addGuardedCommandsToForm(
				new ActionCommand[] { getFinishCommand() }, form,
				FormGuard.ON_NOERRORS);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(form.getControl(), BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createTitledBorder("Bordered Dialog"));
		return panel;
	}

	@Override
	protected void disposeDialogContentPane() {
		super.disposeDialogContentPane();
	}

	@Override
	protected void onAboutToShow() {
		setTitle(getMessage("loginDialog.title"));
		new FormGuard(form.getFormModel(), getFinishCommand(),
				FormGuard.ON_NOERRORS);
	}
}
