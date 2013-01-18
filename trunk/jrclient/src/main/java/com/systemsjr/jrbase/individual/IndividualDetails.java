package com.systemsjr.jrbase.individual;

import java.util.ArrayList;

import org.springframework.richclient.form.TabbedForm;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.individual.vo.IndividualVO;

public class IndividualDetails extends BaseTabbedForm<IndividualVO> {

	public IndividualDetails(Object item, String formId) {
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

}
