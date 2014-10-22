package com.systemsjr.jrbase.individual;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.individual.vo.KinVO;
import com.systemsjr.jrlib.richclient.BaseItemTable;
import com.systemsjr.jrlib.richclient.BaseItemTable;

public class NextOfKinTable extends BaseItemTable<KinVO>{
	public NextOfKinTable(){
		super(new KinVO[]{}, "nextOfKin", new String[]{
				"kinType",
				"individual.idNumber",
				"individual.surname",
				"individual.firstName"
		});
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(30);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(100);
		tcm.getColumn(3).setPreferredWidth(100);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		//setInitialData(BaseServiceUtils.getIndividualService().getAllIndividuals());
		return getInitialData();
	}
}
