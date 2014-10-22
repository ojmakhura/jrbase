package com.systemsjr.jrbase.workbench.program;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramSearchCriteria;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class ProgramSearchForm extends BaseItemFilterForm {

	public ProgramSearchForm() {
		super("programSearchForm");
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("programId");
		builder.row();
		builder.add("programName");
		builder.row();
		builder.add("programDescription");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();

		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		// TODO Auto-generated method stub
		return new ProgramSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		ProgramSearchCriteria object = (ProgramSearchCriteria) getFormObject();
		ProgramVO[] programs = BaseServiceUtils.getProgramService().searchPrograms(object);		
		ProgramControl programControl = (ProgramControl) getApplicationContext().getBean("programControl");		
		programControl.getItemList().getItemTable();
		JRTableUtils.refreshTable(programControl.getItemList(), programs);
	}

}
