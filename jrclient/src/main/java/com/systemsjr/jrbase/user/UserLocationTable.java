package com.systemsjr.jrbase.user;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.user.vo.UserLocationVO;
import com.systemsjr.jrlib.richclient.BaseItemTable;


public class UserLocationTable extends BaseItemTable<UserLocationVO>{

	public UserLocationTable(String modelId, String[] columnPropertyNames) {
		super(modelId, columnPropertyNames);
	}
	
	public UserLocationTable(){
		super(new UserLocationVO[]{}, "userLocations", new String[]{
				"location.levelCode",
				"location.locationName",
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
		//setInitialData(BaseServiceUtils.getUserService().getUserLocations(get));
		return getInitialData();
	}
	
}