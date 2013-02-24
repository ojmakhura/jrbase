package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class UserView extends BaseItemView<UserVO> {
	
	
	@Override
	protected JComponent createControl() {
		setItemForm(new UserForm());
		return getItemForm().getControl();
	}

	@Override
	protected UserVO handleSaveItem(UserVO object) {
		UserVO userVO = object;
		setAction(userVO.getId());
		/*if(userVO.getPassword1() == null){
			BaseUIUtils.showMessage("Empty Password!!", "Password is empty!", Severity.ERROR);
			return null;
		}
		
		if(!userVO.getPassword1().equals(userVO.getPassword2())){
			BaseUIUtils.showMessage("Password Mismatch!!", "Passwords Do Not Match!", Severity.ERROR);
			return null;
		}
		
		userVO.setPasswordLength(userVO.getPassword1().length());*/
		object = BaseServiceUtils.getUserService().saveUser(userVO);
		return object;
	}

	@Override
	protected void handleDeleteItem(UserVO object) {
		BaseServiceUtils.getUserService().removeUser(object);		
	}

	@Override
	protected UserVO handleNewItem() {

		return BaseServiceUtils.createDefaultUser();
	}
}
