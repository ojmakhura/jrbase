package com.systemsjr.jrbase.form;

import java.beans.PropertyChangeEvent;

import org.springframework.binding.value.ValueModel;

public abstract class ValueChangeMonitor implements java.beans.PropertyChangeListener{

	private ValueModel model;
	
	public ValueChangeMonitor(ValueModel model, boolean b){
		this.model = model;
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		onValueChange(evt.getNewValue(), evt.getOldValue());
	}
	
	public abstract void onValueChange(java.lang.Object newValue, java.lang.Object oldValue);
	
	
}
