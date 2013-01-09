package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.individual.vo.IndividualVO;

public class IndividualView extends BaseItemView<IndividualVO> {

	@Override
	protected JComponent createControl() {
		return new IndividualForm().createFormControl();
	}

	@Override
	protected IndividualVO saveItem() {
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			IndividualVO individualVO = (IndividualVO)getItemForm().getFormObject();
			individualVO = BaseServiceUtils.getIndividualService().saveIndividual(individualVO);
			return individualVO;
		}
		return null;
	}

	@Override
	protected IndividualVO newItem() {
		getItemForm().setFormObject(new IndividualVO());
		getItemForm().getFormModel().commit();
		return (IndividualVO) getItemForm().getFormObject();
	}

	@Override
	protected void deleteItem() {
		getItemForm().getFormModel().commit();
		IndividualVO individualVO = (IndividualVO) getItemForm().getFormObject();
		BaseServiceUtils.getIndividualService().removeIndividual(individualVO);
		getItemForm().getFormModel().commit();
	}
}
