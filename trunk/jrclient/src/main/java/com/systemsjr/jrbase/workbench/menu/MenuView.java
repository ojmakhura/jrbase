package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;

public class MenuView extends BaseItemView<MenuVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new MenuForm());
		return getItemForm().getControl();
	}

	@Override
	protected MenuVO handleSaveItem(MenuVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getMenuService().saveMenu(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(MenuVO object) {
		BaseServiceUtils.getMenuService().removeMenu(object);
	}

	@Override
	protected MenuVO handleNewItem() {
		return BaseServiceUtils.createDefaultMenu();
	}
}
