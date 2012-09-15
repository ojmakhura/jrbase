package com.jrsystems.jrbase.individual;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.common.BaseItemFilterForm;
import com.jrsystems.jrbase.utils.BaseUIUtils;

public class IndividualSearchForm extends BaseItemFilterForm {

	private RefreshableValueHolder salutationsValueHolder = BaseUIUtils.getAllSalutations();
	public IndividualSearchForm(String formId) {
		super(formId);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("idNumber", "colSpan=1");
		builder.add(sbf.createBoundComboBox("salutation", salutationsValueHolder), "colSpan=1");
		builder.row();
		builder.add("firstName", "colSpan=1");
		builder.add("middleNames", "colSpan=1");
		builder.row();
		builder.add("surname", "colSpan=2");
		
		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		//return new IndividualSearchCriteria();
		return new Object();
	}

}
