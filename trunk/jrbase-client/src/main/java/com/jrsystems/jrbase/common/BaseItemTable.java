package com.jrsystems.jrbase.common;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;
import org.springframework.richclient.table.support.AbstractObjectTable;

public class BaseItemTable<T> extends AbstractObjectTable {
	private T[] initialData;
	protected ActionCommand detailsCommand;
	protected ActionCommand deleteCommand;
	public BaseItemTable(T[] data, String modelId, String[] columnPropertyNames) {
		super(modelId, columnPropertyNames);
		this.initialData = data;
		//setInitialData(data);
	}
	
	public BaseItemTable(String modelId, String[] columnPropertyNames){
		super(modelId, columnPropertyNames);
	}

	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		CommandGroup popup = new CommandGroup();
		//popup.add((ActionCommand)getWi);
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
		//if (CollectionUtils.) {
			//return null;
		//}
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
			return new ArrayList<T>();
		}
		ArrayList<T> selection = new ArrayList<T>();
		for(int i = 0; i< selected.length; i++){
			//selection.add((T)getTableModel().);
			
			
			//selection.add((T)getTableModel().getElementAt(selected[i]));
		}
		return selection;
	}

}
