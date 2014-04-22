package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class UserLocationForm extends BaseDetailForm {

	public UserLocationForm() {
		super(BaseServiceUtils.createDefaultLocation(), "userLocationForm", new UserLocationDialog());
		// TODO Auto-generated constructor stub
	}

	/*@Override
	protected void doAdd() {
		// TODO Auto-generated method stub
		
	}*/
}
