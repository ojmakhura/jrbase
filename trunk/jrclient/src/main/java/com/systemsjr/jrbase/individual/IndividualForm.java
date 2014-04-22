package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class IndividualForm extends BaseItemForm<IndividualVO> {
		
	public IndividualForm(IndividualVO item, String formId) {
		super(item, formId);
	}
	
	public IndividualForm(){
		super(BaseServiceUtils.createDefaultIndividual(), "individualForm");
	}

	@Override
	protected JComponent createFormControl() {
		super.initForm();
		
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
		builder.add(sbf.createBinding("countryOfBirth", BaseUIUtils.getCountriesContext()));
		builder.row();
		builder.add(sbf.createBinding("countryOfCitizenship", BaseUIUtils.getCountriesContext()));
		
		super.endFormCreate("");
		
		return itemPanel;
	}
}
