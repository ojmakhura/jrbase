package com.systemsjr.jrbase.user;

import java.util.ArrayList;

import org.springframework.richclient.form.TabbedForm;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;

public class UserDetails extends BaseItemDetail<UserDetailsVO>{

	public UserDetails(UserDetailsVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		
		return tabs.toArray(new Tab[0]);
	}

	@Override
	public UserDetailsVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
