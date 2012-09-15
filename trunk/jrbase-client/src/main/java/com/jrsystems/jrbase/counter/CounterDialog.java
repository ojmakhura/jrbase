package com.jrsystems.jrbase.counter;

import com.jrsystems.jrbase.common.BaseItemDialog;
import com.jrsystems.jrbase.counter.vo.CounterVO;

public class CounterDialog extends BaseItemDialog<CounterVO> {

	public CounterDialog() {
		super("counterDialog");
	}

	@Override
	protected boolean itemExists() {
		// TODO Auto-generated method stub
		return false;
	}

}
