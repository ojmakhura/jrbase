package com.systemsjr.jrbase.workbench.program;

import com.systemsjr.jrbase.workbench.application.ApplicationView;

public class ProgramView extends ApplicationView {

	public ProgramView(){
		super("programView");
	}

	/*@Override
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
	}*/
}
