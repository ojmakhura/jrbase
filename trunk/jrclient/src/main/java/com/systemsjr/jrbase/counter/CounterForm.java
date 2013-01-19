package com.systemsjr.jrbase.counter;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class CounterForm extends BaseItemForm<CounterVO> {

	public CounterForm(CounterVO item, String formId) {
		super(item, formId);
	}
	
	public CounterForm(){
		super(BaseServiceUtils.createDefaultCounter(), "counterForm");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		super.initForm("counterListTable", null);
		valueHolder = BaseUIUtils.getCounterValueHolder();
		
		builder.setLabelAttributes("colSpec=right:pref");
		builder.row();
		builder.add("counterName", "colSpan=1");
		builder.row();
		builder.add("format", "colSpan=1");
		builder.row();
		builder.add("currentCount", "colSpan=1");

		super.endFormCreate("");
		return itemPanel;
	}
	
	

}
