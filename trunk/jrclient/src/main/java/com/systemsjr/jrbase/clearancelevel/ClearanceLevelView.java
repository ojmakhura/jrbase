package com.systemsjr.jrbase.clearancelevel;

import javax.swing.JComponent;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class ClearanceLevelView extends BaseItemView<ClearanceLevelVO> {
	@Override
	protected JComponent createControl() {
		setItemForm(new ClearanceLevelForm());

		//listTableFactory(getItemForm().getItemList());
		return getItemForm().getControl();
	}

	@Override
	protected ClearanceLevelVO saveItem() {
		logger.warn(getItemForm().getValueModel("levelDescription"));
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			ClearanceLevelVO levelVO = (ClearanceLevelVO) getItemForm().getFormObject();
			levelVO = BaseServiceUtils.getClearanceService().saveClearanceLevel(levelVO);
			getItemForm().getValueholder().refresh();
			return levelVO;
		}
		return null;
	}

	@Override
	protected ClearanceLevelVO newItem() {
		getItemForm().setFormObject(new ClearanceLevelVO());
		getItemForm().getFormModel().commit();
		return (ClearanceLevelVO) getItemForm().getFormObject();
	}

	@Override
	protected void deleteItem() {
		getItemForm().getFormModel().commit();
		ClearanceLevelVO levelVO = (ClearanceLevelVO) getItemForm().getFormObject();
		BaseServiceUtils.getClearanceService().removeClearanceLevel(levelVO);
		getItemForm().getFormModel().commit();
	}
}
