package com.systemsjr.jrbase.clearancelevel;

import javax.swing.JComponent;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class ClearanceLevelForm extends BaseItemForm<ClearanceLevelVO> {
	public ClearanceLevelForm() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevelForm");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		
		super.initForm();
		
		builder.row();
		builder.add("levelCode", "colSpec=40dlu");
		//builder.row();
		builder.add("levelDescription", "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBinding("upperLevel", BaseUIUtils.getClearenceContext()));
		builder.row();
		builder.add(sbf.createBinding("lowerLevel", BaseUIUtils.getClearenceContext()));
		builder.row();
		
		super.endFormCreate("Clearance Level Details");
		
		return itemPanel;
	}

	@Override
	public void setFormObject(Object formObject) {
		super.setFormObject(formObject);
		
		
	}
	
	

}
