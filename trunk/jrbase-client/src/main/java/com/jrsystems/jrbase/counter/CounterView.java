package com.jrsystems.jrbase.counter;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.springframework.richclient.application.support.AbstractView;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jrsystems.jrbase.common.BaseItemView;
import com.jrsystems.jrbase.counter.vo.CounterVO;

public class CounterView extends BaseItemView<CounterVO> {

	@Override
	protected JComponent createControl() {
		FormLayout layout = new FormLayout("10dlu, 100dlu:grow, 10dlu",
		"5dlu, 160dlu, 5dlu");
		CellConstraints cc = new CellConstraints();
		PanelBuilder builder = new PanelBuilder(layout, new JPanel());

		return builder.getPanel();
	}

	@Override
	protected CounterVO saveItem() {
		System.out.println("Saving role");
		getItemForm().getFormModel().commit();
		
		CounterVO counterVO = ((CounterVO)getItemForm().getFormObject());
		//return BaseServiceUtils.getRoleService().saveRole(roleVO);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected CounterVO newItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void deleteItem() {
		// TODO Auto-generated method stub
		
	}

}
