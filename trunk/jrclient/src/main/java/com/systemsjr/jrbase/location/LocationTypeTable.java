package com.systemsjr.jrbase.location;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class LocationTypeTable extends BaseItemTable<LocationTypeVO>{
	public LocationTypeTable(LocationTypeVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public LocationTypeTable(){
		super(new LocationTypeVO[]{}, "locationTypes", new String[]{
				"levelCode",
				"uniqueCode",
				"name",
				"status",
				"type"
		});
		
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(10);
		tcm.getColumn(1).setPreferredWidth(20);
		tcm.getColumn(2).setPreferredWidth(100);
		tcm.getColumn(3).setPreferredWidth(30);
		tcm.getColumn(4).setPreferredWidth(30);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getLocationService().getAllLocationTypes());
		return getInitialData();
	}

	@Override
	public JTable getItemTable(){
		JTable table = getTable();
		if(table != null){
			return table;
		}
		return null;
	}
	

	@Override
	protected void setViewId(String id) {
		viewId = id;
	}

}
