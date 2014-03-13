package com.systemsjr.jrbase.workbench.application;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;

import com.systemsjr.jrlib.richclient.BaseItemView;

public class ApplicationView extends BaseItemView {

	private ActionCommand menuCommand;
	private ActionCommand programCommand;
	private ActionCommand applicationCommand;
	
	public ApplicationView(){
		super("applicationView");
	}
	
	public ApplicationView(String id) {
		super(id);
	}

	/*@Override
	protected ApplicationVO handleSaveItem(ApplicationVO applicationVO) {
		setAction(applicationVO.getId());
		applicationVO = BaseServiceUtils.getApplicationService().saveApplication(applicationVO);
		return applicationVO;
	}

	@Override
	protected void handleDeleteItem(ApplicationVO object) {
		BaseServiceUtils.getApplicationService().removeApplication(object);
	}

	@Override
	protected ApplicationVO handleNewItem() {
		return BaseServiceUtils.createDefaultApplication();
	}*/
	
	public ActionCommand getMenuCommand() {
		if(menuCommand == null){
			return new ActionCommand("menuCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("menuView");					
				}
			};
		}
		return menuCommand;
	}
	
	public ActionCommand getProgramCommand() {
		if(programCommand == null){
			return new ActionCommand("programCommand") {
				
				@SuppressWarnings("unchecked")
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("programView");
				}
			};
		}
		return programCommand;
	}
	
	public ActionCommand getApplicationCommand() {
		if(applicationCommand == null){
			return new ActionCommand("applicationCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("applicationView");
				}
			};
		}
		return applicationCommand;
	}

	@Override
	public void addTasks() {
		CommandGroup applicationGroup = CommandGroup.createCommandGroup(new ActionCommand[]{
				getApplicationCommand(),
				getProgramCommand(),
				getMenuCommand()
		});
		taskPane.setTitle("Application Management");
		taskPane.add(applicationGroup.createButtonStack());
	}
	
}
