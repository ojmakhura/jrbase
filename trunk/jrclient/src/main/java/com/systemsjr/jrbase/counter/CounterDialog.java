package com.systemsjr.jrbase.counter;

import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrlib.richclient.BaseItemDialog;

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
