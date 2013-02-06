package com.systemsjr.jrbase.workbench.program;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

public class ProgramTable extends BaseItemTable<ProgramVO> {
	
	public ProgramTable(){
		super(new ProgramVO[]{}, "programs", new String[]{
				"programId",
				"programName",
				"programDescription"
		});
	}
	
	@Override
	protected void configureTable(JTable table){
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(50);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(100);
	}
	

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getProgramService().getAllPrograms());
		return getInitialData();
	}
}
