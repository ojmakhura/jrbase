package com.systemsjr.jrbase.user;

import java.util.ArrayList;

import org.springframework.richclient.form.TabbedForm;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.user.vo.UserVO;

public class UserDetails extends BaseTabbedForm<UserVO>{

	public UserDetails(Object item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

}
