package com.systemsjr.jrlib.binding;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComponent;

import org.jdesktop.swingx.JXDatePicker;
import org.joda.time.DateTime;
import org.springframework.binding.form.FormModel;
import org.springframework.richclient.form.binding.support.CustomBinding;

public class WorkbenchDateBinding extends CustomBinding implements
		PropertyChangeListener {
	
	private final JXDatePicker datePicker; 
	private final boolean readOnly; 
	private boolean isSettingText = false;
	
	protected WorkbenchDateBinding(FormModel model, String path, JXDatePicker datePicker, boolean readOnly) {
		super(model, path, DateTime.class); 
		this.datePicker = datePicker; 
		this.readOnly = readOnly;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (!isSettingText && !isReadOnly()) 
			controlValueChanged(new DateTime(datePicker.getDate()));
	}

	@Override
	protected void valueModelChanged(Object newValue) {
		isSettingText = true;
		setDatePickerValue((DateTime) newValue); 
		readOnlyChanged(); 
		isSettingText = false;

	}
	private void setDatePickerValue(DateTime dateTime) { 
		if (dateTime == null) { 
			datePicker.setDate(null); 
		} else { 
			datePicker.setDate(dateTime.toDate()); 
		} 
	}

	@Override
	protected JComponent doBindControl() {
		setDatePickerValue((DateTime) getValue()); 
		datePicker.getEditor().addPropertyChangeListener("value", this); 
		return datePicker;
	}

	@Override
	protected void readOnlyChanged() {
		datePicker.setEditable(isEnabled() && !this.readOnly && !isReadOnly());
	}

	@Override
	protected void enabledChanged() {
		datePicker.setEnabled(isEnabled()); 
		readOnlyChanged();
	}

}
