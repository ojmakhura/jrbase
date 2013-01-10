package com.systemsjr.jrbase.location;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class LocationForm extends BaseItemForm<LocationVO> {

	public LocationForm(LocationVO item, String formId) {
		super(item, formId);
	}
	
	public LocationForm(){
		super(new LocationVO(), "area");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm("locationListTable");
		
		valueHolder = BaseUIUtils.getIndividualValueHolder();
		
		builder.add(sbf.createBoundComboBox("status", LocationStatus.literals().toArray()), "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("locationType", BaseUIUtils.getLocationTypeValueHolder(), "name"));
		builder.row();
		builder.add("levelCode", "colSpec=20dlu");
		builder.add("uniqueCode", "colSpec=40dlu:grow");
		builder.row();
		builder.add("locationName", "colSpec=40dlu:grow");
		builder.row();
		builder.addTextArea("description", "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBoundComboBox("fallsWithinLocation", valueHolder, "locationName"), "colSpan=1");
		
		//super.endFormCreate();
		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
		itemPanel.add(scrollPane, BorderLayout.WEST);
		return itemPanel;
	}
	
	
}
