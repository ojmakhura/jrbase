package com.systemsjr.jrbase.counter;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class CounterView extends WorkbenchView {

	public CounterView(){
		super("counterView");
	}
<<<<<<< .mine
=======

	/*@Override
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
	}*/
>>>>>>> .r69
}
