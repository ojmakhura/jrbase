package com.systemsjr.jrbase.individual;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;

public class IndividualDetails extends BaseItemDetail<IndividualVO> {
	private NextOfKinTable nextOfKin;
	public IndividualDetails(IndividualVO item, String formId) {
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("Next Of Kin", createNextOfKinTab()));
		return tabs.toArray(new Tab[0]);
	}
	
	protected JComponent createNextOfKinTab(){
		//JRTableUtils.refreshTable(nextOfKin, BaseServiceUtils.getIndividualService().se)
		return super.createTabComponent(nextOfKin, "Next Of Kin");
	}

	@Override
	public IndividualVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
