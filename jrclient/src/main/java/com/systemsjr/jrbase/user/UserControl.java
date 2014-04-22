package com.systemsjr.jrbase.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.systemsjr.jrbase.role.RoleTable;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class UserControl extends BaseItemControl<UserDetailsVO> {
	
	public UserControl(){
		super();
		valueHolder = BaseUIUtils.getUserValueHolder();
	}

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
		BCryptPasswordEncoder encoder = (BCryptPasswordEncoder) getApplicationContext().getBean("passwordEncoder");
		if(item.getPassword1() != null){
			item.setPassword(encoder.encode(item.getPassword1()));
		}
		item = (UserDetailsVO) BaseServiceUtils.getUserService().saveUser(item);
		
		return item;
	}

	/*@Override
	public void checkDetails(UserDetailsVO item) {
		UserDetails details = (UserDetails) getItemForm().getDetails();
		RoleTable roleTable = (RoleTable) details.getUserRolesForm().getListTable();
		RoleVO[] roles = new RoleVO[roleTable.getFinalEventList().size()];
		item.setUserRoles(roles);
		for(int i = 0; i < roles.length; i++){
			roles[i] = ((RoleVO) roleTable.getFinalEventList().get(i));
		}
		BaseServiceUtils.getUserService().saveUser(item);
	}*/

}
