package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuSearchCriteria;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class MenuSearchForm extends BaseItemFilterForm {

	public MenuSearchForm() {
		super("menuSearchForm");
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("menuCode");
		builder.row();
		builder.add("menuName");
		builder.row();
		builder.add("menuDescription");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();
		
		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		// TODO Auto-generated method stub
		return new MenuSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		MenuSearchCriteria object = (MenuSearchCriteria) getFormObject();
		MenuVO[] menus = BaseServiceUtils.getMenuService().searchMenus(object);		
		MenuControl menuControl = (MenuControl) getApplicationContext().getBean("menuControl");		
		menuControl.getItemList().getItemTable();
		JRTableUtils.refreshTable(menuControl.getItemList(), menus);
	}
}
