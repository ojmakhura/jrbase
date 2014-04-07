package com.systemsjr.jrbase.counter;

import javax.swing.JComponent;

import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class CounterForm extends BaseItemForm<CounterVO> {
	
	public CounterForm(CounterVO item, String formId) {
		super(item, formId);
	}
	
	public CounterForm(){
		super(new CounterVO(), "counterForm");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
<<<<<<< .mine
		super.initForm();
	
=======
		super.initForm();
	
		builder.setLabelAttributes("colSpec=right:pref");
>>>>>>> .r69
		builder.row();
		builder.add("counterName", colSpan);
		builder.row();
		builder.add("format", colSpan);
		builder.row();
		builder.add("currentCount", colSpan);

		super.endFormCreate("");
		return itemPanel;
	}
}
