package com.systemsjr.jrbase.clearancelevel;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.TabbedForm;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.role.RoleTable;
import com.systemsjr.jrbase.user.UserTable;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class LevelDetails extends BaseTabbedForm<ClearanceLevelVO>{

	public LevelDetails() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevel");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		tabs.add(new Tab("Cleared Roles", getClearedRolesTab()));
		tabs.add(new Tab("Cleared Users", getClearedUsersTab()));
		
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent getClearedRolesTab(){
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		RoleTable table = (RoleTable) Application.instance().getApplicationContext().getBean("roleListTable");
		JScrollPane scrollPane = getComponentFactory().createScrollPane();
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(table.getControl());
		scrollPane.setBorder(BorderFactory.createTitledBorder("Cleared Roles"));
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}
	
	private JComponent getClearedUsersTab(){
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		UserTable table = (UserTable) Application.instance().getApplicationContext().getBean("userTable");
		JScrollPane scrollPane = getComponentFactory().createScrollPane();
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(table.getControl());
		scrollPane.setBorder(BorderFactory.createTitledBorder("Cleared Users"));
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}
	
}
