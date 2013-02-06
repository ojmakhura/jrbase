package com.systemsjr.jrbase.clearancelevel;

import org.springframework.richclient.core.Severity;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemDialog;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public class ClearanceLevelDialog extends BaseItemDialog<ClearanceLevelVO> {
	
	//private Clearance
	public ClearanceLevelDialog(){
		super("clearanceLevelDialog");
	}

	@Override
	protected boolean onFinish() {
		// TODO Auto-generated method stub
		if (getItemForm().hasErrors() ) {
			
			BaseUIUtils.showMessage("Error", "Fill in the required fields", Severity.ERROR);

		} else {
			getItemForm().commit();
			BaseServiceUtils.getClearanceService().saveClearanceLevel(getItem());
			//getItemForm().getFormObject().
		}
		
		return true;
	}

	@Override
	protected boolean itemExists() {
				
		return !(new Long(getItem().getId()) == null);
	}	
}
