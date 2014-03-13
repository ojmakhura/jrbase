package com.systemsjr.jrbase.workbench.application;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;

import com.systemsjr.jrlib.richclient.BaseItemView;

public class WorkbenchView extends BaseItemView{
	private ActionCommand clearanceLevelsCommand;
	private ActionCommand countersCommand;
	private ActionCommand individualsCommand;
	private ActionCommand locationTypeCommand;
	private ActionCommand locationCommand;
	private ActionCommand organisationTypesCommand;
	private ActionCommand organisationsCommand;
	private ActionCommand rolesCommand;
	private ActionCommand usersCommand;
	
	public WorkbenchView(){
		super("workbenchView");
	}
	
	public WorkbenchView(String id) {
		super(id);
	}
	
	public ActionCommand getClearanceLevelsCommand() {
		if(clearanceLevelsCommand == null){
			return new ActionCommand("clearanceLevelsCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("clearanceLevelView");					
				}
			};
		}
		return clearanceLevelsCommand;
	}

	public ActionCommand getCountersCommand() {

		if(countersCommand == null){
			return new ActionCommand("countersCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("counterView");					
				}
			};
		}
		return countersCommand;
	}

	public ActionCommand getIndividualsCommand() {
		if(individualsCommand == null){
			return new ActionCommand("individualsCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("individualView");					
				}
			};
		}
		return individualsCommand;
	}

	public ActionCommand getLocationTypeCommand() {
		if(locationTypeCommand == null){
			return new ActionCommand("locationTypeCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("locationTypeView");					
				}
			};
		}
		return locationTypeCommand;
	}

	public ActionCommand getLocationCommand() {
		if(locationCommand == null){
			return new ActionCommand("locationCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("locationView");					
				}
			};
		}
		return locationCommand;
	}

	public ActionCommand getOrganisationsTypeCommand() {
		if(organisationTypesCommand == null){
			return new ActionCommand("organisationTypesCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("organisationTypeView");					
				}
			};
		}
		return organisationTypesCommand;
	}

	public ActionCommand getOrganiationsCommand() {
		if(organisationsCommand == null){
			return new ActionCommand("organisationsCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("organisationView");					
				}
			};
		}
		return organisationsCommand;
	}

	public ActionCommand getRolesCommand() {
		if(rolesCommand == null){
			return new ActionCommand("rolesCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("roleView");					
				}
			};
		}
		return rolesCommand;
	}

	public ActionCommand getUsersCommand() {
		if(usersCommand == null){
			return new ActionCommand("usersCommand") {
				
				@Override
				protected void doExecuteCommand() {
					org.springframework.richclient.application.Application.instance().getActiveWindow().getPage().showView("userView");					
				}
			};
		}
		return usersCommand;
	}

	@Override
	public void addTasks() {
		CommandGroup applicationGroup = CommandGroup.createCommandGroup(new ActionCommand[]{
				getUsersCommand(),
				getRolesCommand(),
				getOrganiationsCommand(),
				getOrganisationsTypeCommand(),
				getLocationCommand(),
				getLocationTypeCommand(),
				getIndividualsCommand(),
				getClearanceLevelsCommand(),
				getCountersCommand()
		});
		taskPane.setTitle("Workbench");
		taskPane.add(applicationGroup.createButtonStack());
	}
	
}
