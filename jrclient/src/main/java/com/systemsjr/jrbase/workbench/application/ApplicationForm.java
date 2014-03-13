package com.systemsjr.jrbase.workbench.application;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class ApplicationForm extends BaseItemForm<ApplicationVO> {
	private RefreshableValueHolder applicationHolder;
	
	public ApplicationForm() {
		super(new ApplicationVO(), "applicationForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm();
		applicationHolder = BaseUIUtils.getApplicationValueHolder();
		builder.add("code");
		builder.add("name");
		builder.row();
		builder.add("description");
		super.endFormCreate(null);
		return itemPanel;
	}
}
