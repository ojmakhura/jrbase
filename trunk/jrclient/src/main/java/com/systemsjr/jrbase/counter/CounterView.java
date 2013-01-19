package com.systemsjr.jrbase.counter;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class CounterView extends BaseItemView<CounterVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new CounterForm());
		return getItemForm().getControl();
	}

	@Override
	protected CounterVO handleSaveItem(CounterVO object) {
		setAction(object.getId());
		return BaseServiceUtils.getCounterService().saveCounter(object);
	}

	@Override
	protected void handleDeleteItem(CounterVO object) {
		BaseServiceUtils.getCounterService().removeCounter(object);
	}

	@Override
	protected CounterVO handleNewItem() {
		return BaseServiceUtils.createDefaultCounter();
	}
}
