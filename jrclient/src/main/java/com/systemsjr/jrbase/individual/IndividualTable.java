package com.systemsjr.jrbase.individual;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemTable;

public class IndividualTable extends BaseItemTable<IndividualVO> {

	public IndividualTable(IndividualVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public IndividualTable(){
		super(new IndividualVO[]{}, "individuals", new String[]{
				"idNumber",
				"surname",
				"firstName"
		});
		
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(30);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(100);
		//tcm.getColumn(3).setPreferredWidth(30);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getIndividualService().getAllIndividuals());
		return getInitialData();
	}

	@Override
	protected void setViewId(String id) {
		viewId = id;
	}
}
