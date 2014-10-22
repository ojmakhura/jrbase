package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class IndividualSearchForm extends BaseItemFilterForm {

	private RefreshableValueHolder salutationsValueHolder = BaseUIUtils.getAllSalutations();
	
	public IndividualSearchForm() {
		super("individualSearchForm");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("idNumber");
		//builder.add(sbf.createBoundComboBox("salutation", salutationsValueHolder), "colSpan=1");
		builder.row();
		builder.add("firstName");
		builder.row();
		builder.add("middleNames");
		builder.row();
		builder.add("surname");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();
		
		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		return new IndividualSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		IndividualSearchCriteria object = (IndividualSearchCriteria) getFormObject();
		IndividualVO[] individuals = BaseServiceUtils.getIndividualService().searchIndividuals(object);
			
		JRTableUtils.refreshTable(table, individuals);
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
				
	}
}
