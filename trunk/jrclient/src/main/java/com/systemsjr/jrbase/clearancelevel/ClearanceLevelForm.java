package com.systemsjr.jrbase.clearancelevel;

import javax.swing.JComponent;
import javax.swing.JTabbedPane;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class ClearanceLevelForm extends BaseItemForm<ClearanceLevelVO> {
	private JTabbedPane tab;
	public ClearanceLevelForm() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevelForm");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		
		super.initForm("clearanceLevelTable", new LevelDetails());
		valueHolder = BaseUIUtils.getClearanceLevelValueHolder();
		
		builder.row();
		builder.add("levelCode", "colSpec=40dlu");
		//builder.row();
		builder.add("levelDescription", "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBoundComboBox("upperLevel", valueHolder, "levelCode"));
		builder.row();
		builder.add(sbf.createBoundComboBox("lowerLevel", valueHolder, "levelCode"));
		builder.row();
		builder.addSeparator("Clearance Level Details");
		
		super.endFormCreate();
		
		return itemPanel;
	}	
}
