package com.systemsjr.jrlib.richclient;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;
import org.springframework.richclient.command.support.GlobalCommandIds;
import org.springframework.richclient.factory.AbstractControlFactory;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.systemsjr.jrlib.utils.Action;


public abstract class BaseItemControl<T> extends AbstractControlFactory {
	private BaseItemForm itemForm;
	private BaseItemFilterForm searchForm;
	private CommandGroup actionGroup;
	protected BaseItemTable<T> itemList;
	private JScrollPane scrollPane;
	protected RefreshableValueHolder valueHolder;
	private String action;
	
	@Override
	protected JComponent createControl() {
		JPanel panel = new FormDebugPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel searchPanel = new FormDebugPanel();
		searchPanel.setLayout(new BorderLayout());
		
		if (actionGroup == null) {
			actionGroup = CommandGroup.createCommandGroup(new ActionCommand[] {
					(ActionCommand) getActiveWindow().getCommandManager()
							.getCommand("newCommand"),
					(ActionCommand) getActiveWindow().getCommandManager()
							.getCommand(GlobalCommandIds.SAVE),
					(ActionCommand) getActiveWindow().getCommandManager()
							.getCommand(GlobalCommandIds.DELETE),
					(ActionCommand) getActiveWindow().getCommandManager()
							.getCommand(GlobalCommandIds.PROPERTIES) });
		}
		scrollPane = getComponentFactory().createScrollPane();
		
		if(itemList != null){
			scrollPane.setViewportView(itemList.getControl());
		}
		
		if(searchForm != null){
			searchPanel.add(searchForm.getControl(), BorderLayout.NORTH);
		}
		searchPanel.add(scrollPane, BorderLayout.CENTER);		
		panel.add(searchPanel, BorderLayout.WEST);
		panel.add(actionGroup.createButtonBar(), BorderLayout.NORTH);
		panel.add(itemForm.getControl(), BorderLayout.CENTER);
		
		return panel;
	}

	public BaseItemForm getItemForm() {
		return itemForm;
	}
	
	public void setItemForm(BaseItemForm form){
		this.itemForm = form;
	}
	
	public void setItemList(BaseItemTable<T> itemList) {
		this.itemList = itemList;
	}

	public BaseItemTable<T> getItemList() {
		return itemList;
	}
	
	protected void saveItem(){
		if(itemForm.isDirty()){
			itemForm.commit();
			itemForm.setFormObject(handleSaveItem((T) itemForm.getFormObject()));
			getItemList().itemSaved(itemForm.getFormObject(), getAction());
			getItemList().getItemTable().repaint();
			valueHolder.refresh();
		}
	}

	protected T newItem(){
		logger.warn("new item");
		itemForm.setFormObject(handleNewItem());
		return (T) itemForm.getFormObject();
	}	

	protected void deleteItem(){
		setAction(Action.DELETE);
		handleDeleteItem((T) itemForm.getFormObject());
		getItemList().itemDeleted(itemForm.getFormObject());
		getItemList().getItemTable().repaint();
		valueHolder.refresh();
	}
	
	public abstract void handleDeleteItem(T item);
	public abstract T handleNewItem();
	public abstract T handleSaveItem(T item);

	public RefreshableValueHolder getValueholder() {
		return valueHolder;
	}

	public void setValueholder(RefreshableValueHolder valueholder) {
		this.valueHolder = valueholder;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public RefreshableValueHolder getValueHolder() {
		return valueHolder;
	}

	public void setValueHolder(RefreshableValueHolder valueHolder) {
		this.valueHolder = valueHolder;
	}

	public BaseItemFilterForm getSearchForm() {
		return searchForm;
	}

	public void setSearchForm(BaseItemFilterForm searchForm) {
		this.searchForm = searchForm;
	}	
	
	public void setAction(String action){
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}
	
	public void setAction(Long id){
		if(id == null){
			setAction(Action.INSERT);
		} else {
			setAction(Action.UPDATE);
		}
	}
}
