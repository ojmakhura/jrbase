package com.systemsjr.jrbase.counter;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemTable;

public class CounterTable extends BaseItemTable<CounterVO> {

	public CounterTable(CounterVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public CounterTable(){
		super(new CounterVO[]{}, "counters", new String[]{
				"counterName",
				"format",
				"currentCount"
		});		
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(10);
		tcm.getColumn(1).setPreferredWidth(100);
		tcm.getColumn(2).setPreferredWidth(10);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getCounterService().getAllCounters());
		return getInitialData();
	}
	

	@Override
	protected void setViewId(String id) {
		viewId = id;
	}

}
