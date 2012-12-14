package com.systemsjr.jrbase.role;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.role.vo.RoleVO;

public class RoleForm extends BaseItemForm<RoleVO> {

	public RoleForm(RoleVO item, String formId) {
		super(item, formId);
	}

	public RoleForm(){
		super(new RoleVO(), "role");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		setSbf((SwingBindingFactory) getBindingFactory());
		setItemList((BaseItemTable<RoleVO>) Application.instance().getApplicationContext().getBean("roleListTable"));
		setScrollPane(getComponentFactory().createScrollPane(itemList.getControl()));
		builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		builder.row();
		builder.add("roleCode", "colSpan=1");
		builder.add("role", "colSpan=1");
		builder.row();
		builder.addTextArea("roleDescription", "colSpan=3");
		//if(itemPanel == null){
			//itemPanel = 
		//}
		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
		itemPanel.add(scrollPane, BorderLayout.WEST);
		return itemPanel;
	}
}
