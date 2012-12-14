package com.systemsjr.jrbase.clearancelevel;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class ClearanceLevelForm extends BaseItemForm<ClearanceLevelVO> {
	private JTabbedPane tab;
	public ClearanceLevelForm() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevelForm");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		itemList = (BaseItemTable<ClearanceLevelVO>) Application.instance().getApplicationContext().getBean("clearanceLevelTable");
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("levelCode", "colSpec=40dlu");
		//builder.row();
		builder.add("levelDescription", "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBoundComboBox("upperLevel", BaseUIUtils.getClearanceLevelValueHolder(), "levelCode"));
		builder.row();
		builder.add(sbf.createBoundComboBox("lowerLevel", BaseUIUtils.getClearanceLevelValueHolder(), "levelCode"));
		builder.row();
		builder.addSeparator("Clearance Level Details");		

		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
		itemPanel.add(scrollPane, BorderLayout.WEST);
		return itemPanel;
	}	
}
