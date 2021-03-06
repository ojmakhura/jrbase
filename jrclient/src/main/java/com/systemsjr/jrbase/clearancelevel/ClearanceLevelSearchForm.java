package com.systemsjr.jrbase.clearancelevel;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelSearchCriteria;
import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class ClearanceLevelSearchForm extends BaseItemFilterForm{

	public ClearanceLevelSearchForm() {
		super("clearanceLevelSearchForm");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("levelCode");
		builder.row();
		builder.add("levelDescription");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();
		
		return builder.getForm();
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		
	}

	@Override
	protected Object newFormObject() {
		return new ClearanceLevelSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		ClearanceLevelSearchCriteria object = (ClearanceLevelSearchCriteria) getFormObject();
		ClearanceLevelVO[] levels = BaseServiceUtils.getClearanceService().searchClearenceLevel(object);		
		JRTableUtils.refreshTable(table, levels);
	}
}
