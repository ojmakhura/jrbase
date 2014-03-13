package com.systemsjr.jrbase.workbench.application;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrlib.richclient.BaseItemTable;

public class ApplicationTable extends BaseItemTable<ApplicationVO> {

	public ApplicationTable(ApplicationVO[] data, String modelId, String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
		// TODO Auto-generated constructor stub
	}
	
	public ApplicationTable(){
		super(new ApplicationVO[]{}, "applications", new String[]{
				"code",
				"name",
				"description"
		});
	}
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(50);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(100);
	}
	
	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getApplicationService().loadAllApplications());
		return getInitialData();
	}
}
