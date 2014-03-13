package com.systemsjr.jrbase.counter;

import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class CounterControl extends BaseItemControl<CounterVO> {

	@Override
	public void handleDeleteItem(CounterVO item) {
		BaseServiceUtils.getCounterService().removeCounter(item);		
	}

	@Override
	public CounterVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultCounter();
	}

	@Override
	public CounterVO handleSaveItem(CounterVO item) {
		setAction(item.getId());
		item = BaseServiceUtils.getCounterService().saveCounter(item);
		return item;
	}

}
