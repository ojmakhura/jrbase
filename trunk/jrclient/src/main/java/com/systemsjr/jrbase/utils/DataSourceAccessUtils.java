package com.systemsjr.jrbase.utils;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.individual.vo.IndividualVO;

public final class DataSourceAccessUtils {
	//static Logger log = Logger.getLogger(DataSourceAccessUtils.class);
	
	public static ClearanceLevelVO[] getAllClearanceLevels(){
		return BaseServiceUtils.getClearanceService().getAllClearanceLevels();
	}
	
	public static IndividualVO[] getAllIndividuals(){
		return BaseServiceUtils.getIndividualService().getAllIndividuals();
	}
	
	public static CounterVO[] getAllCounters(){
		return BaseServiceUtils.getCounterService().getAllCounters();
	}
}
