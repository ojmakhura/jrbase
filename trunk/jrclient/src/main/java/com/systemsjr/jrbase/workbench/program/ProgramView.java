package com.systemsjr.jrbase.workbench.program;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

public class ProgramView extends BaseItemView<ProgramVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new ProgramForm());
		return getItemForm().getControl();
	}

	@Override
	protected ProgramVO handleSaveItem(ProgramVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getProgramService().saveProgram(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(ProgramVO object) {
		
		BaseServiceUtils.getProgramService().removeProgram(object);
	}

	@Override
	protected ProgramVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultProgram();
	}
}
