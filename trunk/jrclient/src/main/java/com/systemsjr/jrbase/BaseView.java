package com.systemsjr.jrbase;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.springframework.richclient.application.support.AbstractView;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.debug.FormDebugPanel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class BaseView extends AbstractView {
	
	private CellConstraints cc = new CellConstraints();
	@Override
	protected JComponent createControl() {
		FormLayout layout = new FormLayout("10dlu, 100dlu, 300dlu:grow, 10dlu",
		"5dlu, 30dlu,150dlu:grow, 30dlu, 160dlu, 30dlu, 5dlu");
		CellConstraints cc = new CellConstraints();
		PanelBuilder builder = new PanelBuilder(layout, new FormDebugPanel());
		//builder.add(createDailySummary(), cc.xy(2, 2));

		return builder.getPanel();
	}
	
	/**
	 * 
	 * @return
	 */
	private JComponent createButtonComponent() {
		FormLayout layout = new FormLayout("10dlu, pref:grow, 10dlu", 
				"40dlu, 5dlu, 40dlu");
		PanelBuilder builder = new PanelBuilder(layout, new JPanel());
		//CommandGroup group = new CommandGroup
		//builder.add(get  createCommandGroup(new ActionCommand[]{
				//getSettingsCommand(),
				//getLicenseSettingsCommand(),
				//getClientSettingsCommand(),
	//	}).createButtonBar(), cc.xy(2, 1));
		return builder.getPanel();
	}
	
	

}
