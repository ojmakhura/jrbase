package com.systemsjr.jrbase.role;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class RoleTable extends BaseItemTable<RoleVO> {

	public RoleTable() {
		super(new RoleVO[]{}, "roles", new String[]{
				"roleCode",
				"role"
		});
		
	}

	@Override
	protected void configureTable(JTable table) {
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(10);
		tcm.getColumn(1).setPreferredWidth(100);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getRoleService().getAllRoles());
		return getInitialData();
	}
	
	@Override
	public JTable getItemTable(){
		JTable table = getTable();
		if(table != null){
			return table;
		}
		return null;
	}
	
	@Override
	protected void setViewId(String id) {
		viewId = id;
	}

}
