package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.user.vo.UserSearchCriteria;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;


public class UserSearchForm extends BaseItemFilterForm {

	public UserSearchForm() {
		super("userSearchForm");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("name");
		builder.row();
		builder.add("username");
		builder.row();
		builder.add("email");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();
		
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new UserSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		UserSearchCriteria object = (UserSearchCriteria) getFormObject();
		UserVO[] users = BaseServiceUtils.getUserService().searchUsers(object);		
		JRTableUtils.refreshTable(table, users);
	}
}
