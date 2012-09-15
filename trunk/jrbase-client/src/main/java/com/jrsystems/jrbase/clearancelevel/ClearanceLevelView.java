package com.jrsystems.jrbase.clearancelevel;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.jrsystems.jrbase.common.BaseItemView;

public class ClearanceLevelView extends BaseItemView<ClearanceLevelVO> {
	public ClearanceLevelView(){
		setListTable(new ClearanceLevelTable());
		//getListTable().setInitialData(DataSourceAccessUtils.getAllClearanceLevels());
		
		setItemForm(new ClearanceLevelForm());
		getItemForm().setFormObject(new ClearanceLevelVO());
	}

	@Override
	protected ClearanceLevelVO saveItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ClearanceLevelVO newItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void deleteItem() {
		// TODO Auto-generated method stub
		
	}
}
