package com.systemsjr.jrbase.workbench.menu;

import com.systemsjr.jrbase.workbench.application.ApplicationView;

public class MenuView extends ApplicationView{

<<<<<<< .mine
	public MenuView(){
		super("menuView");
=======
	public MenuView(){
		super("menuView");
	}
	
	/*@Override
	protected JComponent createControl() {
		return getItemForm().getControl();
>>>>>>> .r69
	}*/
<<<<<<< .mine
=======

	/*@Override
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
	}*/
>>>>>>> .r69
}
