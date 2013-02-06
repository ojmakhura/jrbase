package com.systemsjr.jrbase.workbench.program;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

public class ProgramDetails extends BaseTabbedForm<ProgramVO> {

	public ProgramDetails(Object item, String formId) {
		super(item, formId);
	}
	
	public ProgramDetails(){
		super(BaseServiceUtils.createDefaultProgram(), "programDetails");
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		
		tabs.add(new Tab("Cleared Users", createUsersTab()));
		tabs.add(new Tab("Cleared Roles", createRolesTab()));
		
		return tabs.toArray(new Tab[0]);
	}
	
	private JComponent createUsersTab(){
		
		return super.createTabComponent("userTable", "Cleared Users");
	}
	
	private JComponent createRolesTab(){
		
		return super.createTabComponent("userTable", "Cleared Roles");
	}
}
