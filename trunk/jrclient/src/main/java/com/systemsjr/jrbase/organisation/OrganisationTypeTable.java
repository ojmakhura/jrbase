package com.systemsjr.jrbase.organisation;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;

public class OrganisationTypeTable extends BaseItemTable<OrganisationTypeVO> {

	public OrganisationTypeTable(OrganisationTypeVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public OrganisationTypeTable(){
		super(new OrganisationTypeVO[]{}, "organisationTypes", new String[]{
				"levelCode",
				"name"
		});
		
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(30);
		tcm.getColumn(2).setPreferredWidth(100);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getOrgService().getAllOrganisationTypes());
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
