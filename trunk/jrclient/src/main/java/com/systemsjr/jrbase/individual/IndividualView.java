package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.counter.CounterForm;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class IndividualView extends BaseItemView<IndividualVO> {

	@Override
	protected JComponent createControl() {

		setItemForm(new IndividualForm());
		return getItemForm().getControl();
	}

	@Override
	protected IndividualVO saveItem() {
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			IndividualVO individualVO = (IndividualVO)getItemForm().getFormObject();
			logger.warn(individualVO);
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
	protected IndividualVO deleteItem() {
		getItemForm().getFormModel().commit();
		IndividualVO individualVO = (IndividualVO) getItemForm().getFormObject();
		BaseServiceUtils.getIndividualService().removeIndividual(individualVO);
		getItemForm().getFormModel().commit();
		
		return individualVO;
	}
}
