package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class LocationTypeForm extends BaseItemForm<LocationTypeVO> {

	public LocationTypeForm(LocationTypeVO item, String formId) {
		super(item, formId);
	}
	
	public LocationTypeForm(){
		super(new LocationTypeVO(), "areaType");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm("locationTypeTable");
		valueHolder = BaseUIUtils.getLocationTypeValueHolder();
		
		builder.add(sbf.createBoundComboBox("type", new Object[]{Type.AREATYPE, Type.FACILITYTYPE}), "colSpan=1");
		builder.add(sbf.createBoundComboBox("status", LocationStatus.literals().toArray()), "colSpan=1");
		builder.row();
		builder.add("levelCode", "colSpec=40dlu:grow");
		builder.add("uniqueCode", "colSpec=40dlu:grow");
		builder.row();
		builder.add("name", "colSpec=1:grow");
		builder.row();
		builder.addTextArea("description", "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("fallsWithinLocationType", valueHolder, "name"),"colSpec=1:grow");
		
		super.endFormCreate();
		return itemPanel;
	}
}
