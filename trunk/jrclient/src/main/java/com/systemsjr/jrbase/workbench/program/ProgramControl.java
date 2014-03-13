package com.systemsjr.jrbase.workbench.program;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class ProgramControl extends BaseItemControl<ProgramVO> {

	@Override
	public void handleDeleteItem(ProgramVO item) {
		
		BaseServiceUtils.getProgramService().removeProgram(item);
	}

	@Override
	public ProgramVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultProgram();
	}

	@Override
	public ProgramVO handleSaveItem(ProgramVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getProgramService().saveProgram(item);
	}

}
