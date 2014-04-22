package com.systemsjr.jrbase.individual;

import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class IndividualControl extends BaseItemControl<IndividualVO> {
	
	public IndividualControl(){
		valueHolder = BaseUIUtils.getIndividualValueHolder();
	}

	@Override
	public void handleDeleteItem(IndividualVO item) {
		
		BaseServiceUtils.getIndividualService().removeIndividual(item);		
	}

	@Override
	public IndividualVO handleNewItem() {		
		return BaseServiceUtils.createDefaultIndividual();
	}

	@Override
	public IndividualVO handleSaveItem(IndividualVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getIndividualService().saveIndividual(item);
	}
}
