package com.systemsjr.jrbase.user;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseItemTable;


public class UserTable extends BaseItemTable<UserDetailsVO>{

	public UserTable(String modelId, String[] columnPropertyNames) {
		super(modelId, columnPropertyNames);
	}
	
	public UserTable(){
		super(new UserDetailsVO[]{}, "users", new String[]{
				"username",
				"name",
				"status"
		});
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(50);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(30);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getUserService().getAllUsers());
		return getInitialData();
	}

	@Override
	public void doMore(BaseItemDetail detail, UserDetailsVO user) {
		UserDetails userDetail = (UserDetails) detail;
		BaseItemTable table = userDetail.getUserRolesForm().getListTable();
		table.getFinalEventList().clear();
		for(RoleVO role : user.getUserRoles()){
			table.getFinalEventList().add(role);
		}
	}
	
}