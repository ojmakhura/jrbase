package com.systemsjr.jrbase.workbench.application;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationSearchCriteria;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class ApplicationSearchForm extends BaseItemFilterForm {

	public ApplicationSearchForm() {
		super("applicationSearchForm");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("code");
		builder.row();
		builder.add("name");
		builder.row();
		builder.add("description");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();
		
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new ApplicationSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		ApplicationSearchCriteria object = (ApplicationSearchCriteria) getFormObject();
		ApplicationVO[] applications = BaseServiceUtils.getApplicationService().searchApplication(object);		
		ApplicationControl applicationControl = (ApplicationControl) getApplicationContext().getBean("applicationControl");		
		applicationControl.getItemList().getItemTable();
		JRTableUtils.refreshTable(applicationControl.getItemList(), applications);
	}

}
