package com.systemsjr.jrbase.role;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemTable;

public class RoleTable extends BaseItemTable<RoleVO> {

	public RoleTable(RoleVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public RoleTable() {
		this(new RoleVO[]{}, "roles", new String[]{
				"roleCode",
				"role"
		});		
	}

	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
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
	protected void setViewId(String id) {
		viewId = id;
	}
	

	@Override
	public JTable getItemTable(){
		JTable table = getTable();
		if(table != null){
			return table;
		}
		return null;
	}
}
