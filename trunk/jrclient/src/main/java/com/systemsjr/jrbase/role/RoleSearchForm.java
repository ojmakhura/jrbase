package com.systemsjr.jrbase.role;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.role.vo.RoleSearchCriteria;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class RoleSearchForm extends BaseItemFilterForm {

	public RoleSearchForm() {
		super("roleSearchForm");
	}
	
	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("roleCode");
		builder.row();
		builder.add("role");
		builder.row();
		builder.add("roleDescription");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();
		
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new RoleSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		RoleSearchCriteria object = (RoleSearchCriteria) getFormObject();
		RoleVO[] roles = BaseServiceUtils.getRoleService().searchRoles(object);	
		JRTableUtils.refreshTable(table, roles);
	}

}
