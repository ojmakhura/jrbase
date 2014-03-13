package com.systemsjr.jrbase.clearancelevel;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class ClearanceLevelControl extends BaseItemControl<ClearanceLevelVO> {

	@Override
	public void handleDeleteItem(ClearanceLevelVO item) {
		
		BaseServiceUtils.getClearanceService().removeClearanceLevel(item);
		
	}

	@Override
	public ClearanceLevelVO handleNewItem() {
		// TODO Auto-generated method stub
		return BaseServiceUtils.createDefaultLevel();
	}

	@Override
	public ClearanceLevelVO handleSaveItem(ClearanceLevelVO item) {
		setAction(item.getId());
		item = BaseServiceUtils.getClearanceService().saveClearanceLevel(item);
		return item;
	}
}
