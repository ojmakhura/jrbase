package com.systemsjr.jrlib.richclient;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;
import org.springframework.richclient.form.FilterForm;

public abstract class BaseItemFilterForm<T> extends FilterForm implements ApplicationListener  {

	private ActionCommand searchCommand;
	private ActionCommand clearCommand;
	
	public BaseItemFilterForm(String formId){
		super(formId);
	}
	
	protected JComponent getCommands(){
		CommandGroup commands = CommandGroup.createCommandGroup(new ActionCommand[]{
				getSearchCommand(),
				getClearCommand()
		});
		
		return commands.createButtonBar();
	}

	public ActionCommand getSearchCommand() {
		if(searchCommand == null){
			searchCommand = new ActionCommand() {
				
				@Override
				protected void doExecuteCommand() {
					// TODO Auto-generated method stub
					
				}
			};
		}
		return searchCommand;
	}

	public ActionCommand getClearCommand() {
		if(clearCommand == null){
			clearCommand = new ActionCommand() {
				
				@Override
				protected void doExecuteCommand() {
					getFormModel().reset();
					
				}
			};
		}
		return clearCommand;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createFormControl() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}