package com.jrsystems.jrbase.clearancelevel;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.form.TabbedForm;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.jrsystems.jrbase.common.BaseTabbedForm;
import com.jrsystems.jrbase.role.RoleTable;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class LevelDetails extends BaseTabbedForm<ClearanceLevelVO>{
	
	private RoleTable roleTable;
	private JScrollPane scrollPane = getComponentFactory().createScrollPane();
	public LevelDetails() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevel");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		tabs.add(new Tab("Cleared Roles", getClearedRolesTab()));
		
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent getClearedRolesTab(){
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(getRoleTable().getControl());
		scrollPane.setBorder(BorderFactory.createTitledBorder("Roles With Clearance Level"));
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}

	public RoleTable getRoleTable() {
		
		if(roleTable == null){
			roleTable = new RoleTable();
		}
		
		return roleTable;
	}

	public void setRoleTable(RoleTable roleTable) {
		this.roleTable = roleTable;
	}
	
}
