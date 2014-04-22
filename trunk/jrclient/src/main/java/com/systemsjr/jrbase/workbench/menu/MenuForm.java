package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrbase.workbench.PlatformType;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class MenuForm extends BaseItemForm<MenuVO> {
	private RefreshableValueHolder menuHolder;	
	
	public MenuForm() {
		super(new MenuVO(), "menuForm");
		
	}

	@Override
	protected JComponent createFormControl() {
	
		super.initForm();
		
		menuHolder = BaseUIUtils.getMenuValueHolder();
		
		builder.add(sbf.createBoundComboBox("type", PlatformType.values()), "colSpan=1");
		builder.row();
		builder.add("menuCode", "colSpan=1");
		builder.add("menuName", "colSpan=1");
		builder.row();
		builder.addTextArea("menuDescription", "colSpan=3");
		builder.row();
		builder.add(sbf.createBinding("menu", BaseUIUtils.getMenuContext()), "colSpan=2");
		
		builder.row();
		
		super.endFormCreate("Menu Details");
		return itemPanel;
	}
	
}
