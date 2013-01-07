package com.systemsjr.jrbase.counter;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class CounterView extends BaseItemView<CounterVO> {

	@Override
	protected JComponent createControl() {
		setItemForm(new CounterForm());
		listTableFactory(getItemForm().getItemList());
		return getItemForm().getControl();
	}

	@Override
	protected CounterVO saveItem() {
		getItemForm().getFormModel().commit();
		
		CounterVO counterVO = ((CounterVO)getItemForm().getFormObject());
		return BaseServiceUtils.getCounterService().saveCounter(counterVO);
	}

	@Override
	protected CounterVO newItem() {
		getItemForm().setFormObject(new CounterVO());
		return (CounterVO) getItemForm().getFormObject();
	}

	@Override
	protected void deleteItem() {
		getItemForm().commit();
		CounterVO counterVO = (CounterVO) getItemForm().getFormObject();
		BaseServiceUtils.getCounterService().removeCounter(counterVO);
	}
}
