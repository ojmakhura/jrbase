package com.systemsjr.jrbase.workbench.program;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

public class ProgramForm extends BaseItemForm<ProgramVO> {
	
	public ProgramForm() {
		super(BaseServiceUtils.createDefaultProgram(), "programForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm("programTable", new ProgramDetails());
		valueHolder = BaseUIUtils.getProgramsValueHolder();
		
		builder.add("programId", "colSpan=1");
		builder.add("programName", "colSpan=1");
		builder.row();
		builder.addTextArea("programDescription", "colSpec=40dlu:grow");
		
		super.endFormCreate("Program Details");
		return itemPanel;
	}
	
}
