package com.systemsjr.jrbase.user;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class UserLocationForm extends BaseDetailForm<LocationVO> {

	public UserLocationForm() {
		super(BaseServiceUtils.createDefaultLocation(), "userLocationForm", new UserLocationDialog());
	}

	/*@Override
	protected void doAdd() {
		// TODO Auto-generated method stub
		
	}*/
}
