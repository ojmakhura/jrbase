package com.systemsjr.jrbase.role;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.ActionCommandExecutor;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.common.BaseItemView;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class RoleTable extends BaseItemTable<RoleVO> {

	public RoleTable(RoleVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public RoleTable() {
		super(new RoleVO[]{}, "roles", new String[]{
				"roleCode",
				"role"
		});		
	}

	@Override
	protected void configureTable(JTable table) {
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(10);
		tcm.getColumn(1).setPreferredWidth(100);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getRoleService().getAllRoles());
		return getInitialData();
	}
	
	@Override
	protected void setViewId(String id) {
		viewId = id;
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
	protected ActionCommandExecutor getDetailsCommand() {
		if(detailsCommand == null){
			detailsCommand = new ActionCommand("detailsCommand") {				
				@Override
				protected void doExecuteCommand() {
					BaseItemView view;
					view = (BaseItemView) getApplication().getActiveWindow().getPage().getActiveComponent();
					if(view != null){
						logger.warn("view is " + view);
						view.getItemForm().setFormObject(getSelectedItem());
						logger.warn("item is " + getSelectedItem());
						view.getItemForm().commit();
						view.getItemForm().getFormModel().commit();
					} else{
						logger.warn("View is null");
					}
				}
			};
		}
		return detailsCommand;
	}

}
