package com.systemsjr.jrlib.richclient;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;
import org.springframework.binding.value.ValueModel;
import org.springframework.richclient.application.PageComponentContext;
import org.springframework.richclient.application.support.AbstractView;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;
import org.springframework.richclient.command.CommandGroup;
import org.springframework.richclient.command.GuardedActionCommandExecutor;
import org.springframework.richclient.command.support.AbstractActionCommandExecutor;
import org.springframework.richclient.command.support.GlobalCommandIds;
import org.springframework.richclient.layout.TableLayoutBuilder;
import org.springframework.richclient.list.ListSelectionValueModelAdapter;
import org.springframework.richclient.list.ListSingleSelectionGuard;

public abstract class BaseItemView extends AbstractView {
	private BaseItemControl itemControl;
	private ActionCommandExecutor saveExecutor = new SaveExecutor();
	private ActionCommandExecutor deleteExecutor = new DeleteExecutor();
	private ActionCommandExecutor newExecutor = new NewExecutor();
	private GuardedActionCommandExecutor propertiesExecutor = new PropertiesExecutor();
	protected CommandGroup popup;
	private JSplitPane splitPane;

	//protected String action;
	protected TableLayoutBuilder builder;
	protected JXTaskPane taskPane;
	protected JXTaskPaneContainer paneContainer;
	
	public BaseItemView() {
		super();
	}
	
	public BaseItemView(String id) {
		super();
	}
	
	@Override
	protected JComponent createControl() {
		/*ApplicationSecurityManager asm = (ApplicationSecurityManager) getApplicationServices().getService(ApplicationSecurityManager.class);
		Authentication auth = asm.getAuthentication();
		SecurityService service = com.systemsjr.jrbase.ServiceLocator.instance().getSecurityService();
		UserDetailsVO userDetails = service.getUserDetails(auth.getName());
		*/
		//JPanel panel = new FormDebugPanel();
		//panel.setLayout(new BorderLayout());
		if(taskPane == null){
			taskPane = new JXTaskPane();
			//taskPane.setTitle("This will be my menu");
			//taskPane.
			//taskPane.set
		}
		
		if(paneContainer == null){
			paneContainer = new JXTaskPaneContainer();
			paneContainer.add(taskPane);
		}
		
		addTasks();
		//panel.add(itemControl.getControl(), BorderLayout.CENTER);
		//panel.add(paneContainer, BorderLayout.WEST);
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, paneContainer, itemControl.getControl());
		return splitPane;
	}
	
	public abstract void addTasks();

	protected void listTableFactory(BaseItemTable baseItemTable){
		if(baseItemTable != null){
			getPopup().add((ActionCommand) getWindowCommandManager().getCommand(
					GlobalCommandIds.PROPERTIES, ActionCommand.class));
			baseItemTable.setPopupCommandGroup(popup);
			ValueModel selectionHolder = new ListSelectionValueModelAdapter(baseItemTable.getSelectionModel());
			new ListSingleSelectionGuard(selectionHolder, propertiesExecutor);
		}
	}

	public ActionCommandExecutor getSaveExecutor() {
		return saveExecutor;
	}

	public void setSaveExecutor(ActionCommandExecutor saveExecutor) {
		this.saveExecutor = saveExecutor;
	}

	public ActionCommandExecutor getDeleteExecutor() {
		return deleteExecutor;
	}

	public void setDeleteExecutor(ActionCommandExecutor deleteExecutor) {
		this.deleteExecutor = deleteExecutor;
	}

	public ActionCommandExecutor getNewContactExecutor() {
		return newExecutor;
	}

	public void setNewContactExecutor(ActionCommandExecutor newExecutor) {
		this.newExecutor = newExecutor;
	}
	
	public BaseItemControl getItemControl() {
		return itemControl;
	}

	public void setItemControl(BaseItemControl itemControl) {
		this.itemControl = itemControl;
	}

	@Override
	protected void registerLocalCommandExecutors(PageComponentContext context) {
		context.register("newCommand", newExecutor);
		context.register(GlobalCommandIds.SAVE, saveExecutor);
		context.register(GlobalCommandIds.DELETE, deleteExecutor);
		context.register(GlobalCommandIds.PROPERTIES, propertiesExecutor);
	}
	
	/**
	 * This class saves the form object. it also updates the display table depending on
	 * whether the action was an insert or an update
	 * @author junior
	 *
	 */
	private class SaveExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			itemControl.saveItem();
		}
	}

	/**
	 * This class deletes a form object from the data source and also updates the 
	 * display in the form.
	 * @author junior
	 *
	 */
	private class DeleteExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			itemControl.deleteItem();
		}
	}
	
	/**
	 * Private inner class to create a new customer.
	 */
	private class NewExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			getItemControl().newItem();
		}
	}	

	public CommandGroup getPopup() {
		return popup;
	}

	public void setPopup(CommandGroup popup) {
		this.popup = popup;
	}
	
	private class PropertiesExecutor extends AbstractActionCommandExecutor {
		@Override
		public void execute() {
			JOptionPane.showMessageDialog(null,
					"Placeholder for showing TitledPageApplicationDialog...");
		}

	}
	
	
}
