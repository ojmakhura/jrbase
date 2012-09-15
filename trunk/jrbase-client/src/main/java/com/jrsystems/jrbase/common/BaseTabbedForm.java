package com.jrsystems.jrbase.common;

import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.TabbedForm;


public abstract class BaseTabbedForm<T> extends TabbedForm {

	public BaseTabbedForm(Object item, String formId) {
		super(FormModelHelper.createFormModel(item), formId);
	}
}
