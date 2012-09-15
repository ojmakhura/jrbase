package com.jrsystems.jrbase.common;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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

public abstract class BaseItemView<T> extends AbstractView {
	private T item;
	private BaseItemForm<T> itemForm;
	private BaseItemTable<T> listTable;
	private JScrollPane srollPane;

	private ActionCommandExecutor saveExecutor = new SaveExecutor();
	private ActionCommandExecutor deleteExecutor = new DeleteExecutor();
	private ActionCommandExecutor newExecutor = new NewExecutor();
	//private ActionCommandExecutor saveAsExecutor;

	public BaseItemView() {
		super();
	}

	public BaseItemView(BaseItemForm<T> form, BaseItemTable<T> table) {
		super();
		this.itemForm = form;
		this.listTable = table;
	}

	@Override
	protected JComponent createControl() {
		ValueModel selectionHolder = new ListSelectionValueModelAdapter(
				listTable.getSelectionModel());
		//new ListSingleSelectionGuard(selectionHolder, deleteExecutor);
		//new ListSingleSelectionGuard(selectionHolder, saveExecutor);
		
		JPanel view = new JPanel();
		JScrollPane scrollPane = getComponentFactory().createScrollPane(
				listTable.getControl());
		view.add(scrollPane, BorderLayout.WEST);
		view.add(listTable.getControl(), BorderLayout.CENTER);
		view.add(itemForm.getControl(), BorderLayout.EAST);

		return view;
	}

	/*
	 * private class ItemListTableFactory {
	 * 
	 * public BaseItemTable<T> createItemTable() {
	 * 
	 * BaseItemTable<T> itemTable = new BaseItemTable(getId(),
	 * columnPropertyNames);
	 * 
	 * //itemTable.setDoubleClickHandler(propertiesExecutor);
	 * 
	 * CommandGroup popup = new CommandGroup(); popup.add((ActionCommand)
	 * getWindowCommandManager().getCommand("propertiesCommand",
	 * ActionCommand.class)); itemTable.setPopupCommandGroup(popup);
	 * 
	 * ValueModel selectionHolder = new
	 * ListSelectionValueModelAdapter(itemTable.getSelectionModel()); //new
	 * ListSingleSelectionGuard(selectionHolder, propertiesExecutor); new
	 * ListSingleSelectionGuard(selectionHolder, saveExecutor); new
	 * ListSingleSelectionGuard(selectionHolder, deleteExecutor); return
	 * itemTable; }
	 * 
	 * }
	 */

	public JScrollPane getSrollPane() {
		return srollPane;
	}

	public void setSrollPane(JScrollPane srollPane) {
		this.srollPane = srollPane;
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
		//context.register(GlobalCommandIds.S, saveExecutor);
		context.register(GlobalCommandIds.DELETE, deleteExecutor);
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public BaseItemForm<T> getItemForm() {
		return itemForm;
	}

	public void setItemForm(BaseItemForm<T> itemForm) {
		this.itemForm = itemForm;
	}

	public BaseItemTable<T> getListTable() {
		return listTable;
	}

	public void setListTable(BaseItemTable<T> listTable) {
		this.listTable = listTable;
	}

	private class SaveExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			//JOptionPane.showMessageDialog(null, "save item...");
			saveItem();
			//getListTable().getDefaultInitialData();
		}
	}
	
	private class DeleteExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			deleteItem();
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
	
	/**
	 * Private inner class to create a new customer.
	 */
	/*private class SaveAsExecutor implements ActionCommandExecutor {
		@Override
		public void execute() {
			saveAs();
			//JOptionPane.showMessageDialog(null, "new item...");
		}
	}*/
	
	protected abstract T saveItem();

	//protected abstract T saveAs();

	protected abstract T newItem();
	
	protected abstract void deleteItem();
	
	private class listTableFactory{
		public BaseItemTable createListTable(){
			
			return null;
		}
	}
}
