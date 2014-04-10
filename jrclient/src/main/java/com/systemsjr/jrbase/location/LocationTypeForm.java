package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import com.systemsjr.jrbase.form.ValueChangeMonitor;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class LocationTypeForm extends BaseItemForm<LocationTypeVO> {

	public LocationTypeForm(LocationTypeVO item, String formId) {
		super(item, formId);
	}

	public LocationTypeForm() {
		super(new LocationTypeVO(), "areaType");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm();

		builder.add(
				sbf.createBoundComboBox("type", new Object[] { Type.AREATYPE,
						Type.FACILITYTYPE }), "colSpan=1");
		builder.add(sbf.createBoundComboBox("status", LocationStatus.literals()
				.toArray()), "colSpan=1");
		builder.row();
		builder.add("levelCode", "colSpec=40dlu:grow");
		builder.add("uniqueCode", "colSpec=40dlu:grow");
		builder.row();
		builder.add("name", "colSpec=1:grow");
		builder.row();
		builder.addTextArea("description", "colSpec=40dlu:grow");
		builder.row();
		builder.add(
				sbf.createBinding("fallsWithinLocationType",
						BaseUIUtils.getLocationTypeContext()), "colSpan=1");

		new ValueChangeMonitor(getValueModel("fallsWithinLocationType"), true) {

			@Override
			public void onValueChange(Object newValue, Object oldValue) {
				if (newValue != null) {
					LocationTypeVO type = (LocationTypeVO) newValue;
					getValueModel("uniqueCode").setValue(
							type.getLevelCode() + "/"
									+ getValueModel("levelCode").getValue());
				}
			}
		};

		new ValueChangeMonitor(getValueModel("levelCode"), true) {

			@Override
			public void onValueChange(Object newValue, Object oldValue) {

				getValueModel("uniqueCode").setValue(newValue);
			}
		};

		super.endFormCreate("");
		return itemPanel;
	}
}
