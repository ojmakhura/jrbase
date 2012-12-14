// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.clearancelevel.service;

import java.util.Arrays;
import java.util.Collection;

import com.systemsjr.jrbase.clearancelevel.ClearanceLevel;
import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;

/**
 * @see com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService
 */
public class ClearanceLevelServiceImpl
    extends com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelServiceBase
{

    /**
     * @see com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService#saveClearanceLevel(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    @Override
	protected  com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO handleSaveClearanceLevel(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceLevelVO)
        throws java.lang.Exception
    {
    	ClearanceLevel clearanceLevel;// = getClearanceLevelDao().clearanceLevelVOToEntity(clearanceLevelVO);
    	
    	if(clearanceLevelVO.getId() == null){
    		clearanceLevel = getClearanceLevelDao().create(getClearanceLevelDao().clearanceLevelVOToEntity(clearanceLevelVO));
    	} else{
    		System.out.println("Updating ClearanceLevel " + clearanceLevelVO);
    		clearanceLevel = getClearanceLevelDao().clearanceLevelVOToEntity(clearanceLevelVO);
    		getClearanceLevelDao().update(clearanceLevel);
    	}
    	
        return getClearanceLevelDao().toClearanceLevelVO(clearanceLevel);
    }

    /**
     * @see com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService#getAllClearanceLevels()
     */
    @Override
	protected  ClearanceLevelVO[] handleGetAllClearanceLevels()
        throws java.lang.Exception
    {
    	Collection levels = getClearanceLevelDao().loadAll();
    	return getClearanceLevelDao().toClearanceLevelVOArray(levels);
    }

	@Override
	protected void handleRemoveClearanceLevel(ClearanceLevelVO clearanceLevelVO)
			throws Exception {
		
		if(clearanceLevelVO.getId() != null){
			getClearanceLevelDao().remove(clearanceLevelVO.getId());
		}
	}

}