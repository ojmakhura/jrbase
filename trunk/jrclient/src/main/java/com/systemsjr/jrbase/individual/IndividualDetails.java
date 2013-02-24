package com.systemsjr.jrbase.individual;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseTabbedForm;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.role.RoleTable;

public class IndividualDetails extends BaseTabbedForm<IndividualVO> {

	public IndividualDetails(Object item, String formId) {
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("Next Of Kin", createNextOfKinTab()));
		return tabs.toArray(new Tab[0]);
	}
	
	protected JComponent createNextOfKinTab(){
		
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		RoleTable table = (RoleTable) Application.instance().getApplicationContext().getBean("nextOfKinTable");
		JScrollPane scrollPane = getComponentFactory().createScrollPane();
		builder.setLabelAttributes("colGrId=label colSpec=right:pref");
		scrollPane.setViewportView(table.getControl());
		scrollPane.setBorder(BorderFactory.createTitledBorder("Next Of Kin"));
		builder.getLayoutBuilder().cell(scrollPane);
		
		return builder.getForm();
	}

}
