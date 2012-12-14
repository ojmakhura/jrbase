package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;

public class IndividualView<IndividualVO> extends BaseItemView<IndividualVO> {

	@Override
	protected JComponent createControl() {
		return new IndividualForm().createFormControl();
	}

	@Override
	protected IndividualVO saveItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IndividualVO newItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void deleteItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void showItem() {
		// TODO Auto-generated method stub
		
	}	
}
