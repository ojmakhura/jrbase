package com.jrsystems.jrbase.clearancelevel;

import javax.swing.JTable;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.jrsystems.jrbase.common.BaseItemTable;

public class ClearanceLevelTable extends BaseItemTable<ClearanceLevelVO> {

	public ClearanceLevelTable(ClearanceLevelVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
		// TODO Auto-generated constructor stub
	}
	
	public ClearanceLevelTable(){
		super("clearanceLevelTable", new String[]{
				"levelCode", 
				"levelDescription", 
				"lowerLevel.levelDescription", 
				"lowerLevel.levelDescription" 
		});
	}

	@Override
	public JTable getItemTable(){
		JTable table = getTable();
		if(table != null){
			return table;
		}
		return null;
	}
}
