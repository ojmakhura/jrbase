package com.jrsystems.jrbase.clearancelevel;

import org.springframework.richclient.core.Severity;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.jrsystems.jrbase.common.BaseItemDialog;
import com.jrsystems.jrbase.utils.BaseServiceUtils;
import com.jrsystems.jrbase.utils.BaseUIUtils;

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
