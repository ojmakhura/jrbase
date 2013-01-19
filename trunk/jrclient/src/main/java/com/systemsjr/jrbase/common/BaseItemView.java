package com.systemsjr.jrbase.common;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.springframework.binding.value.ValueModel;
import org.springframework.richclient.application.PageComponentContext;
import org.springframework.richclient.application.support.AbstractView;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;
import org.springframework.richclient.command.CommandGroup;
import org.springframework.richclient.command.GuardedActionCommandExecutor;
import org.springframework.richclient.command.support.AbstractActionCommandExecutor;
import org.springframework.richclient.command.support.GlobalCommandIds;
import org.springframework.richclient.list.ListSelectionValueModelAdapter;
import org.springframework.richclient.list.ListSingleSelectionGuard;

import com.systemsjr.jrbase.utils.Action;

public abstract class BaseItemView<T> extends AbstractView {
	private BaseItemForm<T> itemForm;

	private ActionCommandExecutor saveExecutor = new SaveExecutor();
	private ActionCommandExecutor deleteExecutor = new DeleteExecutor();
	private ActionCommandExecutor newExecutor = new NewExecutor();
	private GuardedActionCommandExecutor propertiesExecutor = new PropertiesExecutor();
	private CommandGroup popup = new CommandGroup();
	protected String action;

	public BaseItemView() {
		super();
	}
	
	public BaseItemView(BaseItemForm<T> form){
		super();
		this.itemForm = form;
	}

	public BaseItemView(BaseItemForm<T> form, BaseItemTable<T> table) {
		super();
		this.itemForm = form;
	}
	
	public void setAction(Long id){
		if(id == null){
			setAction(Action.INSERT);
		} else {
			setAction(Action.UPDATE);
		}
	}
	
	public void setAction(String action){
		this.action = action;
	}

	@Override
	protected JComponent createControl() {
		JPanel view = new JPanel();
		view.add(itemForm.getControl(), BorderLayout.EAST);
		return view;
	}
	
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

	@Override
	protected void registerLocalCommandExecutors(PageComponentContext context) {
		context.register("newCommand", newExecutor);
		context.register(GlobalCommandIds.SAVE, saveExecutor);
		// context.register(GlobalCommandIds.S, saveExecutor);
		context.register(GlobalCommandIds.DELETE, deleteExecutor);
		context.register(GlobalCommandIds.PROPERTIES, propertiesExecutor);
	}

	public BaseItemForm<T> getItemForm() {
		return itemForm;
	}

	public void setItemForm(BaseItemForm<T> itemForm) {
		this.itemForm = itemForm;
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
			itemForm.getItemList().itemSaved(saveItem(), action);
			itemForm.getItemList().getItemTable().repaint();
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
			itemForm.getItemList().itemDeleted(deleteItem());
			itemForm.getItemList().getItemTable().repaint();
		}
	}
	
	/**
	 * Private inner class to create a new customer.
	 */
	private class NewExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			newItem();
		}
	}
	
	

	public CommandGroup getPopup() {
		return popup;
	}

	public void setPopup(CommandGroup popup) {
		this.popup = popup;
	}

	protected T saveItem(){
		if(getItemForm().isDirty()){
			getItemForm().getFormModel().commit();
			T object = (T) getItemForm().getFormObject();
			object = handleSaveItem(object);
			getItemForm().getValueholder().refresh();
			return (T) object;
		}
		return null;
	}

	protected abstract T handleSaveItem(T object);

	protected T newItem(){
		getItemForm().setFormObject(handleNewItem());
		getItemForm().getFormModel().commit();
		return (T) getItemForm().getFormObject();
	}

	protected abstract T handleNewItem() ;

	protected T deleteItem(){
		setAction(Action.DELETE);
		getItemForm().getFormModel().commit();
		T object = (T) getItemForm().getFormObject();
		handleDeleteItem(object);
		getItemForm().getFormModel().commit();
		return object;
	}

	protected abstract void handleDeleteItem(T object);


	private class PropertiesExecutor extends AbstractActionCommandExecutor {
		@Override
		public void execute() {
			JOptionPane.showMessageDialog(null,
					"Placeholder for showing TitledPageApplicationDialog...");
		}

	}
}
