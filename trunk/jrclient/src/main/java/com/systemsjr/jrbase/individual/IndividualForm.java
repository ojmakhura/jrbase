package com.systemsjr.jrbase.individual;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class IndividualForm extends BaseItemForm<IndividualVO> {
	RefreshableValueHolder countryHolder;
	public IndividualForm(IndividualVO item, String formId) {
		super(item, formId);
	}
	
	public IndividualForm(){
		super(BaseServiceUtils.createDefaultIndividual(), "individualForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm("individualListTable");
		valueHolder = BaseUIUtils.getIndividualValueHolder();
		countryHolder = BaseUIUtils.getCountriesValueHolder();
		
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("individualId", "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("idType", IDType.literals().toArray()), "colSpan=1");
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
		builder.row();
		builder.add ("dob", "colSpan=1"); // Month Day, Year
		builder.add("email", "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("countryOfBirth", countryHolder, "locationName"), "colSpan=1");
		builder.add(sbf.createBoundComboBox("countryOfCitizenship", 
				BaseUIUtils.getLocationValueHolder(), "locationName"), "colSpan=1");
		
		super.endFormCreate();
		
		return itemPanel;
	}

}
