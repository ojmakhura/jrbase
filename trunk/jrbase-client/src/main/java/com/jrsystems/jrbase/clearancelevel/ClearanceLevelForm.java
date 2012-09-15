package com.jrsystems.jrbase.clearancelevel;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.utils.BaseServiceUtils;

public class ClearanceLevelForm extends BaseItemForm<ClearanceLevelVO> {
	private JTabbedPane tab;
	public ClearanceLevelForm() {
		super(BaseServiceUtils.createDefaultLevel(), "clearanceLevelForm");
		//tab = new ;
	}

	@Override
	protected JComponent createFormControl() {
		JPanel panel = new JPanel(new BorderLayout());
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		builder.row();
		builder.add("levelCode", "colSpec=40dlu");
		//builder.row();
		builder.add("levelDescription", "colSpec=40dlu:grow");
		builder.row();
		builder.add(sbf.createBoundComboBox("upperLevel", new ClearanceLevelVO[]{}));//DataSourceAccessUtils.getAllClearanceLevels()));
		builder.row();
		builder.add(sbf.createBoundComboBox("lowerLevel", new ClearanceLevelVO[]{}));//DataSourceAccessUtils.getAllClearanceLevels()));
		builder.row();
		builder.addSeparator("Clearance Level Details");
		
		panel.add(builder.getForm(), BorderLayout.NORTH);
		return panel;
	}	
}
