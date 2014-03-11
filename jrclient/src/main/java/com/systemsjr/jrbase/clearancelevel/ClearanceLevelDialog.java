package com.systemsjr.jrbase.clearancelevel;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrlib.richclient.BaseItemDialog;

public class ClearanceLevelDialog extends BaseItemDialog<ClearanceLevelVO> {
	
	//private Clearance
	public ClearanceLevelDialog(){
		super("clearanceLevelDialog");
	}

	@Override
	protected boolean itemExists() {
		// TODO Auto-generated method stub
		return false;
	}


}
