package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import org.springframework.richclient.core.Severity;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.Action;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class UserView extends BaseItemView<UserVO> {
	
	
	@Override
	protected JComponent createControl() {
		setItemForm(new UserForm());
		return getItemForm().getControl();
	}

	@Override
	protected UserVO saveItem() {
		getItemForm().commit();
		UserVO userVO = (UserVO) getItemForm().getFormObject();
		setAction(userVO.getId());
		if(userVO.getPassword1() == null){
			BaseUIUtils.showMessage("Empty Password!!", "Password is empty!", Severity.ERROR);
			return null;
		}
		
		if(!userVO.getPassword1().equals(userVO.getPassword2())){
			BaseUIUtils.showMessage("Password Mismatch!!", "Passwords Do Not Match!", Severity.ERROR);
			return null;
		}
		
		userVO.setPasswordLength(userVO.getPassword1().length());
		
		return BaseServiceUtils.getUserService().saveUser(userVO);
	}

	@Override
	protected UserVO newItem() {
		getItemForm().setFormObject(new UserVO());
		return (UserVO) getItemForm().getFormObject();
	}

	@Override
	protected UserVO deleteItem() {
		setAction(Action.DELETE);
		getItemForm().commit();
		UserVO userVO = (UserVO) getItemForm().getFormObject();
		BaseServiceUtils.getUserService().removeUser(userVO);
		
		return userVO;
	}
}
