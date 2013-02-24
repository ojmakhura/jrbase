package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;

public class MenuForm extends BaseItemForm<MenuVO> {
	private RefreshableValueHolder menuHolder;
	public MenuForm() {
		super(new MenuVO(), "menuForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm("menuTable", new MenuDetails());
		
		valueHolder = BaseUIUtils.getMenusValueHolder();
		menuHolder = BaseUIUtils.getMenusValueHolder();
		
		builder.add("menuCode", "colSpan=1");
		builder.add("menuName", "colSpan=1");
		builder.row();
		builder.addTextArea("menuDescription", "colSpan=3");
		builder.row();
		builder.add(sbf.createBoundComboBox("menu", menuHolder, "menuName"));
		builder.row();
		
		super.endFormCreate("Menu Details");
		return itemPanel;
	}
	
}
