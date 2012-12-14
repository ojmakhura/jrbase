package com.systemsjr.jrbase.utils;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;

public final class DataSourceAccessUtils {
	//static Logger log = Logger.getLogger(DataSourceAccessUtils.class);
	
	public static ClearanceLevelVO[] getAllClearanceLevels(){
		return BaseServiceUtils.getClearanceService().getAllClearanceLevels();
	}
}
