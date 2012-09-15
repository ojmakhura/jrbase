package com.jrsystems.jrbase.utils;

import org.apache.log4j.Logger;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;

public final class DataSourceAccessUtils {
	//static Logger log = Logger.getLogger(DataSourceAccessUtils.class);
	
	public static ClearanceLevelVO[] getAllClearanceLevels(){
		return (ClearanceLevelVO[]) BaseServiceUtils.getClearanceService().getAllClearanceLevels().toArray();
		//return new ClearanceLevelVO[]{};//
	}
}
