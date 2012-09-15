package com.jrsystems.jrbase.role;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.common.BaseItemTable;
import com.jrsystems.jrbase.role.vo.RoleVO;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class RoleForm extends BaseItemForm<RoleVO> {

	public RoleForm(RoleVO item, String formId) {
		super(item, formId);
	}

	public RoleForm(){
		super(new RoleVO(), "role");
	}

	@Override
	protected JComponent createFormControl() {
		sbf = (SwingBindingFactory) getBindingFactory();
		itemList = (BaseItemTable<RoleVO>) Application.instance().getApplicationContext().getBean("roleListTable");
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
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
