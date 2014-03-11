package com.systemsjr.jrlib.binding;

import javax.swing.JComponent;

import org.springframework.binding.form.FormModel;
import org.springframework.richclient.form.binding.support.AbstractBinding;

public class WorkbenchDateTimebinder extends AbstractBinding {

	private boolean defaultsSet = false;
	private boolean readOnly = false;

	/*
	 * public WorkbenchDateTimebinder(){ super.requiredSourceClass =
	 * DateTime.class; }
	 */

	protected WorkbenchDateTimebinder(FormModel formModel,
			String formPropertyPath, Class requiredSourceClass) {
		super(formModel, formPropertyPath, requiredSourceClass);
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	@Override
	protected JComponent doBindControl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void readOnlyChanged() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void enabledChanged() {
		// TODO Auto-generated method stub

	}

}
