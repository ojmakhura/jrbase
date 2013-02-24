package com.systemsjr.jrbase.user;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;


public class UserTable extends BaseItemTable<UserVO>{

	public UserTable(String modelId, String[] columnPropertyNames) {
		super(modelId, columnPropertyNames);
	}
	
	public UserTable(){
		super(new UserVO[]{}, "users", new String[]{
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
	
}