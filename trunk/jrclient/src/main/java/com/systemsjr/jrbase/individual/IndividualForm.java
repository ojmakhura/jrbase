package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

<<<<<<< .mine
=======
import org.springframework.binding.value.support.RefreshableValueHolder;

>>>>>>> .r69
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
<<<<<<< .mine
		super.initForm();
=======
		super.initForm();
		countryHolder = BaseUIUtils.getCountryValueHolder();
>>>>>>> .r69
		
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("individualId", colSpan);
		builder.row();
		builder.add(sbf.createBoundComboBox("idType", IDType.literals().toArray()), colSpec);
		builder.add("idNumber", colSpec);
		builder.row();
		builder.add(sbf.createBoundComboBox("salutation", Salutation.literals().toArray()), colSpan);
		builder.row();
		builder.add("firstName", colSpec);
		builder.add("middleNames", colSpec);
		builder.row();
		builder.add("surname", colSpec);
		builder.add(sbf.createBoundComboBox("sex", Gender.literals().toArray()), colSpec);
		builder.row();
		builder.addTextArea("postalAddress", colSpec);
		builder.addTextArea("physicalAddress", colSpec);
		builder.row();
		builder.add ("dob", colSpec); // Month Day, Year
		builder.add("email", colSpec);
		builder.row();
		builder.add(sbf.createBinding("countryOfBirth", BaseUIUtils.getCountriesContext()));
		builder.row();
		builder.add(sbf.createBinding("countryOfCitizenship", BaseUIUtils.getCountriesContext()));
		
		return super.endFormCreate("");
		
	}
}
