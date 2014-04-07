package com.systemsjr.jrbase.individual;

import javax.swing.JComponent;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

<<<<<<< .mine
import com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
=======
import com.systemsjr.jrbase.individual.vo.IndividualSearchCriteria;
>>>>>>> .r69
import com.systemsjr.jrbase.utils.BaseUIUtils;
<<<<<<< .mine
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;
=======
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
>>>>>>> .r69

public class IndividualSearchForm extends BaseItemFilterForm {

	private RefreshableValueHolder salutationsValueHolder = BaseUIUtils.getAllSalutations();
<<<<<<< .mine
	
	public IndividualSearchForm() {
		super("individualSearchForm");
=======
	public IndividualSearchForm() {
		super("individualSearchForm");
		// TODO Auto-generated constructor stub
>>>>>>> .r69
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
<<<<<<< .mine
		builder.add("idNumber");
		//builder.add(sbf.createBoundComboBox("salutation", salutationsValueHolder), "colSpan=1");
=======
		builder.add("idNumber", "colSpan=1");
		//builder.add(sbf.createBoundComboBox("salutation", salutationsValueHolder), "colSpan=1");
>>>>>>> .r69
		builder.row();
<<<<<<< .mine
		builder.add("firstName");
=======
		builder.add("firstName", "colSpan=1");
		builder.row();
		builder.add("middleNames", "colSpan=1");
>>>>>>> .r69
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

<<<<<<< .mine
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
				
	}
=======
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

>>>>>>> .r69
}
