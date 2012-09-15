package com.jrsystems.jrbase.role;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.jrsystems.jrbase.common.BaseItemTable;
import com.jrsystems.jrbase.role.vo.RoleVO;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

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
		setInitialData(BaseServiceUtils.getRoleService().getAllRoles().toArray());
		return getInitialData();
	}
}
