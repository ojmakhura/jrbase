package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class UserControl extends BaseItemControl<UserDetailsVO> {

	@Override
	public void handleDeleteItem(UserDetailsVO item) {
		BaseServiceUtils.getUserService().removeUser(item);
	}

	@Override
	public UserDetailsVO handleNewItem() {
		return (UserDetailsVO) BaseServiceUtils.createDefaultUser();
	}

	@Override
	public UserDetailsVO handleSaveItem(UserDetailsVO item) {
		setAction(item.getId());
		item = (UserDetailsVO) BaseServiceUtils.getUserService().saveUser(item);
		return item;
	}

}
