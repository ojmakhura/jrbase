package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.individual.vo.IndividualVO;

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
		builder = new TableFormBuilder(sbf);
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("individualId", "colSpan=1");
		builder.add("idNumber", "colSpan=1");
		builder.row();
		builder.add(sbf.createBoundComboBox("salutation", new Salutation[]{
				Salutation.DR,
				Salutation.MISS,
				Salutation.MR,
				Salutation.MRS,
				Salutation.MS,
				Salutation.PROFESSOR
		}), "colSpan=1");
		builder.row();
		builder.add("firstName", "colSpan=1");
		builder.add("middleNames", "colSpan=1");
		builder.row();
		builder.add("surname", "colSpan=1");
		builder.add(sbf.createBoundComboBox("sex", new Gender[]{
				Gender.FEMALE,
				Gender.MALE
		}), "colSpan=1");
		builder.row();
		builder.addTextArea("postalAddress", "colSpan=1");
		builder.addTextArea("physicalAddress", "colSpan=1");
		
		return builder.getForm();
	}

}
