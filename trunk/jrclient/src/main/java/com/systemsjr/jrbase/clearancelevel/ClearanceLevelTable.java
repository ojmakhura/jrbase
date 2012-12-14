package com.systemsjr.jrbase.clearancelevel;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import org.springframework.richclient.application.PageComponent;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;
import org.springframework.richclient.command.CommandGroup;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class ClearanceLevelTable extends BaseItemTable<ClearanceLevelVO> {

	public ClearanceLevelTable(ClearanceLevelVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public ClearanceLevelTable(){
		super(new ClearanceLevelVO[]{}, "clearenceLevels", new String[]{
				"levelCode", 
				"levelDescription"
		});
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(10);
		tcm.getColumn(1).setPreferredWidth(50);
		
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
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getClearanceService().getAllClearanceLevels());
		return getInitialData();
	}
	
	@Override
	protected void setViewId(String id) {
		viewId = id;
	}
	
	
}
