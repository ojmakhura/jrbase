package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class MenuControl extends BaseItemControl<MenuVO> {
	
	

	@Override
	protected JComponent createControl() {
		return super.createControl();
	}

	@Override
	public MenuVO handleSaveItem(MenuVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getMenuService().saveMenu(object);
		return object;
	}

	@Override
	public void handleDeleteItem(MenuVO object) {
		BaseServiceUtils.getMenuService().removeMenu(object);
	}

	@Override
	public MenuVO handleNewItem() {
		return BaseServiceUtils.createDefaultMenu();
	}

}
