package com.systemsjr.jrbase.organisation;

import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class OrganisationControl extends BaseItemControl<OrganisationVO> {
	
	public OrganisationControl(){
		valueHolder = BaseUIUtils.getOrganisationValueHolder();
	}

	@Override
	public void handleDeleteItem(OrganisationVO item) {
		
		BaseServiceUtils.getOrgService().removeOrganisation(item);
		
	}

	@Override
	public OrganisationVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultOrganisation(null);
	}

	@Override
	public OrganisationVO handleSaveItem(OrganisationVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getOrgService().saveOrganisation(item);
	}
}
