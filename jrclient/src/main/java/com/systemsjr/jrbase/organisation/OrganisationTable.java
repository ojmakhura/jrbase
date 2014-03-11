package com.systemsjr.jrbase.organisation;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemTable;

public class OrganisationTable extends BaseItemTable<OrganisationVO> {

	public OrganisationTable(OrganisationVO[] data, String modelId,
			String[] columnPropertyNames) {
		super(data, modelId, columnPropertyNames);
	}
	
	public OrganisationTable(){
		super(new OrganisationVO[]{}, "organisations", new String[]{
				"registrationRef",
				"name"
		});
		
	}
	
	@Override
	protected void configureTable(JTable table) {
		super.configureTable(table);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(30);
		tcm.getColumn(1).setPreferredWidth(100);
	}

	@Override
	protected Object[] getDefaultInitialData() {
		setInitialData(BaseServiceUtils.getOrgService().getAllOrganisations());
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
