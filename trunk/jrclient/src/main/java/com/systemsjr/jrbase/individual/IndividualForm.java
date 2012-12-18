package com.systemsjr.jrbase.individual;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class IndividualForm extends BaseItemForm<IndividualVO> {

	public IndividualForm(IndividualVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public IndividualForm(){
		super(new IndividualVO(), "individual");
	}

	@Override
	protected JComponent createFormControl() {
		sbf = (SwingBindingFactory) getBindingFactory();
		valueHolder = BaseUIUtils.getIndividualValueHolder();
		itemList = (BaseItemTable<IndividualVO>) Application.instance().getApplicationContext().getBean("individualTable");
		//builder = new TableFormBuilder(sbf);
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("individualId", "colSpan=1");
		builder.add("idNumber", "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("salutation", Salutation.literals().toArray()), "colSpan=1");
		builder.row();
		builder.add("firstName", "colSpan=1");
		builder.add("middleNames", "colSpan=1");
		builder.row();
		builder.add("surname", "colSpan=1");
		builder.add(sbf.createBoundComboBox("sex", Gender.literals().toArray()), "colSpan=1");
		builder.row();
		builder.addTextArea("postalAddress", "colSpan=1");
		builder.addTextArea("physicalAddress", "colSpan=1");
		
		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
		itemPanel.add(scrollPane, BorderLayout.WEST);
		
		return builder.getForm();
	}

}
