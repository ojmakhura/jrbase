package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class IndividualSearchForm extends BaseItemFilterForm {

	private RefreshableValueHolder salutationsValueHolder = BaseUIUtils.getAllSalutations();
	public IndividualSearchForm() {
		super("individualSearchForm");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("idNumber", "colSpan=1");
		//builder.add(sbf.createBoundComboBox("salutation", salutationsValueHolder), "colSpan=1");
		builder.row();
		builder.add("firstName", "colSpan=1");
		builder.row();
		builder.add("middleNames", "colSpan=1");
		builder.row();
		builder.add("surname", "colSpan=2");
		
		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		return new IndividualSearchCriteria();
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
