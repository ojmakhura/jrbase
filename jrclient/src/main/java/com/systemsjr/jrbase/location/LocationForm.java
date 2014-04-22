package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class LocationForm extends BaseItemForm<LocationVO> {
		
	RefreshableValueHolder locationTypeHolder;
	public LocationForm(LocationVO item, String formId) {
		super(item, formId);
	}
	
	public LocationForm(){
		super(new LocationVO(), "area");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm();
		locationTypeHolder = BaseUIUtils.getLocationTypeValueHolder();
		
		builder.add(sbf.createBoundComboBox("status", LocationStatus.literals().toArray()), "colSpan=1");
		builder.add(sbf.createBoundComboBox("type", new Object[]{Type.AREA, Type.FACILITY}), "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBinding("locationType", BaseUIUtils.getLocationTypeContext()), "colSpec=40dlu:grow");
		builder.row();
		builder.add("levelCode", "colSpec=20dlu");
		builder.add("uniqueCode", "colSpec=40dlu:grow");
		builder.row();
		builder.add("locationName", "colSpec=40dlu:grow");
		builder.row();
		builder.addTextArea("description", "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBinding("fallsWithinLocation", BaseUIUtils.getLocationContext()));
		
		super.endFormCreate("");
		return itemPanel;
	}
}
