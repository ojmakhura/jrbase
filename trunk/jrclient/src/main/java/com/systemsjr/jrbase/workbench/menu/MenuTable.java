package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;

public class MenuTable extends BaseItemTable<MenuVO> {

	public MenuTable(MenuVO[] data, String modelId, String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
		// TODO Auto-generated constructor stub
	}
	
	public MenuTable(){
		super(new MenuVO[]{}, "menus", new String[]{
				"menuCode",
				"menuName",
				"menuDescription"
		});
	}
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(50);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(100);
	}
	
	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getMenuService().getAllMenus());
		return getInitialData();
	}
}
