package com.systemsjr.jrlib.richclient;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;

import com.jgoodies.forms.debug.FormDebugPanel;

public abstract class BaseItemDetail<T> extends BaseTabbedForm{
	
	protected ActionCommand addCommand;
	protected ActionCommand removeCommand;
	
	public BaseItemDetail(Object item, String formId) {
		super(item, formId);
	}
	
	@Override
	public JComponent createTabComponent(BaseItemTable table, String title) {
		JPanel tabPanel = new FormDebugPanel();
		tabPanel.setLayout(new BorderLayout());
		CommandGroup detailGroup = CommandGroup.createCommandGroup(
				new ActionCommand[]{
						getAddCommand(),
						getRemoveCommand()
				}
		);
		tabPanel.add(detailGroup.createButtonBar(), BorderLayout.NORTH);
		tabPanel.add(super.createTabComponent(table, title), BorderLayout.CENTER);
		return tabPanel;
	}



	public ActionCommand getAddCommand() {
		if(addCommand == null){
			addCommand = new ActionCommand() {
				
				@Override
				protected void doExecuteCommand() {
					//dis
					T item = getNewItem();
				}
			};
		}
		return addCommand;
	}

	protected T getNewItem() {
		return handleGetNewItem();
	}

	public abstract T handleGetNewItem();

	public ActionCommand getRemoveCommand() {
		if(removeCommand == null){
			removeCommand = new ActionCommand() {
				
				@Override
				protected void doExecuteCommand() {
					// TODO Auto-generated method stub
					
				}
			};
		}
		return removeCommand;
	}	
}
