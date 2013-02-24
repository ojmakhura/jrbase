package com.systemsjr.jrbase.clearancelevel;

import javax.swing.JComponent;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class ClearanceLevelView extends BaseItemView<ClearanceLevelVO> {
	
	  /**
	   * @wbp.parser.entryPoint
	   */
	@Override
	protected JComponent createControl() {
		setItemForm(new ClearanceLevelForm());

		return getItemForm().getControl();
	}

	@Override
	protected ClearanceLevelVO saveItem() {
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			ClearanceLevelVO levelVO = (ClearanceLevelVO) getItemForm().getFormObject();
			setAction(levelVO.getId());
			levelVO = BaseServiceUtils.getClearanceService().saveClearanceLevel(levelVO);
			getItemForm().getValueholder().refresh();
			return levelVO;
		}
		return null;
	}

	@Override
	protected ClearanceLevelVO handleSaveItem(ClearanceLevelVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getClearanceService().saveClearanceLevel(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(ClearanceLevelVO object) {
		BaseServiceUtils.getClearanceService().removeClearanceLevel(object);
	}

	@Override
	protected ClearanceLevelVO handleNewItem() {
		return BaseServiceUtils.createDefaultLevel();
	}
	
	
}
