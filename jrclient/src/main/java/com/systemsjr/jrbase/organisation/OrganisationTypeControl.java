package com.systemsjr.jrbase.organisation;

import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemControl;

public class OrganisationTypeControl extends BaseItemControl<OrganisationTypeVO> {
	
	public OrganisationTypeControl(){
		valueHolder = BaseUIUtils.getOrganisationTypeValueHolder();
	}

	@Override
	public void handleDeleteItem(OrganisationTypeVO item) {
		
		BaseServiceUtils.getOrgService().removeOrganisationType(item);
	}

	@Override
	public OrganisationTypeVO handleNewItem() {
		
		return BaseServiceUtils.createDefaultOrganisationType();
	}

	@Override
	public OrganisationTypeVO handleSaveItem(OrganisationTypeVO item) {
		
		setAction(item.getId());
		return BaseServiceUtils.getOrgService().saveOrganisationType(item);
	}
}
