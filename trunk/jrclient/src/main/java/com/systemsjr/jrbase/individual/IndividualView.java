package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class IndividualView extends BaseItemView<IndividualVO> {

	@Override
	protected JComponent createControl() {

		setItemForm(new IndividualForm());
		return getItemForm().getControl();
	}

	@Override
	protected IndividualVO handleSaveItem(IndividualVO object) {
		setAction(object.getId());
		object = BaseServiceUtils.getIndividualService().saveIndividual(object);
		return object;
	}

	@Override
	protected void handleDeleteItem(IndividualVO object) {
		BaseServiceUtils.getIndividualService().removeIndividual(object);
	}

	@Override
	protected IndividualVO handleNewItem() {
		return BaseServiceUtils.createDefaultIndividual();
	}
}
