package com.systemsjr.jrbase.workbench.program;

import javax.swing.JComponent;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrbase.workbench.PlatformType;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class ProgramForm extends BaseItemForm<ProgramVO> {
	
	public ProgramForm() {
		super(BaseServiceUtils.createDefaultProgram(), "programForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm();
		
<<<<<<< .mine
		builder.add(sbf.createBoundComboBox("type", PlatformType.values()), colSpec);
=======
		builder.add(sbf.createBoundComboBox("type", PlatformType.values()), "colSpan=1");
		builder.row();
		builder.add(sbf.createBinding("menu", BaseUIUtils.getMenuContext()));
		builder.row();
		builder.add("programId", "colSpan=1");
		builder.add("programName", "colSpan=1");
>>>>>>> .r69
		builder.row();
		builder.add(sbf.createBinding("menu", BaseUIUtils.getMenuContext()));
		builder.row();
		builder.add("programId", colSpec);
		builder.add("programName", colSpec);
		builder.row();
		builder.addTextArea("programDescription", colSpec);
		
		return super.endFormCreate("Program Details");
	}
	
}
