package com.systemsjr.jrbase.organisation;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class OrganisationTypeForm extends BaseItemForm<OrganisationTypeVO> {

	public OrganisationTypeForm(OrganisationTypeVO item, String formId) {
		super(item, formId);
	}
	
	public OrganisationTypeForm(){
		super(new OrganisationTypeVO(), "organisationTypeForm");
	}
	
	@Override
	protected JComponent createFormControl() {
		//super.initForm("organisationTypeTable");
		sbf = (SwingBindingFactory) getBindingFactory();	
		itemList = (OrganisationTypeTable) Application.instance().getApplicationContext().getBean("organisationTypeTable");	
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		valueHolder = BaseUIUtils.getOrganisationTypeValueHolder();
		builder.add("levelCode", "colSpec=20dlu");
		builder.add("name", "colSpec=1:grow");
		builder.row();
		builder.addTextArea("description", "colSpec=40dlu:grow");
		
		//super.endFormCreate();
		
		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
		itemPanel.add(scrollPane, BorderLayout.WEST);
		return itemPanel;
	}
}
