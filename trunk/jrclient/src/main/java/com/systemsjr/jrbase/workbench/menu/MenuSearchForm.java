package com.systemsjr.jrbase.workbench.menu;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.workbench.menu.vo.MenuSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class MenuSearchForm extends BaseItemFilterForm {

	public MenuSearchForm() {
		super("menuSearchForm");
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		// TODO Auto-generated method stub
		return new MenuSearchCriteria();
	}
}
