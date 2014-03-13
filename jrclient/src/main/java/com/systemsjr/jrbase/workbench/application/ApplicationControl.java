package com.systemsjr.jrbase.workbench.application;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class ApplicationControl extends BaseItemControl<ApplicationVO> {

	@Override
	public void handleDeleteItem(ApplicationVO item) {
		
		BaseServiceUtils.getApplicationService().removeApplication(item);
	}

	@Override
	public ApplicationVO handleNewItem() {
		return BaseServiceUtils.createDefaultApplication();
	}

	@Override
	public ApplicationVO handleSaveItem(ApplicationVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getApplicationService().saveApplication(item);
	}

}
