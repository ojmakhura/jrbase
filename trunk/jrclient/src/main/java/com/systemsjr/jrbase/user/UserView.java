package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import org.springframework.richclient.core.Severity;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.user.vo.UserVO;
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
		
		if(userVO.getPassword() == null){
			BaseUIUtils.showMessage("Empty Password!!", "Password is empty!", Severity.ERROR);
			return null;
		}
		
		if(!userVO.getPassword().equals(userVO.getPassword2())){
			BaseUIUtils.showMessage("Password Mismatch!!", "Passwords Do Not Match!", Severity.ERROR);
			return null;
		}
		
		return BaseServiceUtils.getUserService().saveUser(userVO);
	}

	@Override
	protected UserVO newItem() {
		getItemForm().setFormObject(new UserVO());
		return (UserVO) getItemForm().getFormObject();
	}

	@Override
	protected UserVO deleteItem() {
		getItemForm().commit();
		UserVO userVO = (UserVO) getItemForm().getFormObject();
		BaseServiceUtils.getUserService().removeUser(userVO);
		
		return userVO;
	}
}
