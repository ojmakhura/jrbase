package com.systemsjr.jrlib.richclient;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;
import org.springframework.richclient.table.support.AbstractObjectTable;
import org.springframework.util.CollectionUtils;

import com.systemsjr.jrlib.utils.Action;

public abstract class BaseItemTable<T> extends AbstractObjectTable {
	private T[] initialData;
	protected ActionCommand detailsCommand;
	protected ActionCommand deleteCommand;
	protected String viewId;
	public BaseItemTable(T[] data, String modelId, String[] columnPropertyNames) {
		super(modelId, columnPropertyNames);
		this.initialData = data;
	}
	private Logger logger = LoggerFactory.getLogger(getClass());
	public BaseItemTable(String modelId, String[] columnPropertyNames){
		super(modelId, columnPropertyNames);
	}
		
	@Override
	protected void init() {
		
		super.init();
	}

	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);

		setDoubleClickHandler(getDetailsCommand());
	}
	
	public JTable getItemTable(){
		JTable table = getTable();
		if(table != null){
			return table;
		}
		
		return new JTable(getTableModel());
	}

	/**
	 * 
	 * @param <T>
	 * @return
	 */
	public T getSelectedItem(){
		List<T> selected = getSelectedItems();
		if (CollectionUtils.isEmpty(selected)) {
			return null;
		}
		return selected.get(0);
	}
	
	@Override
	protected Object[] getDefaultInitialData() {
		return super.getInitialData();
	}
	
	/**
	 * 
	 * @param <T>
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> getSelectedItems(){
		int[] selected = getTable().getSelectedRows();
		if(ArrayUtils.isEmpty(selected)){
			logger.warn("getSelectedItems: no selected item");
			return new ArrayList<T>();
		}
		ArrayList<T> selection = new ArrayList<T>();
		for(int i = 0; i< selected.length; i++){	
			selection.add((T)getTableModel().getElementAt(selected[i]));
		}
		return selection;
	}
	


	protected ActionCommandExecutor getDeleteCommand() {
		
		if(deleteCommand != null){
			
		}
		
		return deleteCommand;
	}

	protected ActionCommandExecutor getDetailsCommand() {
		if(detailsCommand == null){
			detailsCommand = new ActionCommand("detailsCommand") {				
				@Override
				protected void doExecuteCommand() {
					BaseItemView view = (BaseItemView) getApplication().getActiveWindow().getPage().getActiveComponent();
					if(view != null){
						view.getItemControl().getItemForm().setFormObject(getSelectedItem());
						view.getItemControl().getItemForm().commit();
					} else{
						logger.warn("View is null");
					}
				}
			};
		}
		return detailsCommand;
	}

	protected String getViewId() {
		return viewId;
	}
	
	protected void setViewId(String id) {
		viewId = id;
	}
	
	/**
	 * This method gives public access to the protected handleNewObject and handleUpdateObject
	 * methods defined in the AbstractTable class. This allows the application to be able to reflect 
	 * the item list table on the frontend.
	 * 
	 * @param o
	 * @param action
	 */
	public void itemSaved(Object o, String action){
		if(action.equals(Action.INSERT)){
			handleNewObject(o);
		} else if(action.equals(Action.UPDATE)){
			handleUpdatedObject(o);
		}
	}
	
	/**
	 * This method gives public access to the handleDeleteObject method defined in the AbstractTable
	 * class defined inside the spring-richclient-sandbox library. This allows the application to refresh
	 * the displayed list on the frontend
	 * @param object
	 */
	public void itemDeleted(Object object){
		handleDeletedObject(object);
	}
}
