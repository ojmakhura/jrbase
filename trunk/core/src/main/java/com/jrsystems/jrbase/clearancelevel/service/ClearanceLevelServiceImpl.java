// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.clearancelevel.service;

import com.jrsystems.jrbase.clearancelevel.ClearanceLevel;
import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO;

import java.util.Arrays;

/**
 * @see com.jrsystems.jrbase.clearancelevel.service.ClearanceLevelService
 */
public class ClearanceLevelServiceImpl
    extends com.jrsystems.jrbase.clearancelevel.service.ClearanceLevelServiceBase
{

    /**
     * @see com.jrsystems.jrbase.clearancelevel.service.ClearanceLevelService#saveClearanceLevel(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    protected  com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO handleSaveClearanceLevel(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceLevelVO)
        throws java.lang.Exception
    {
    	ClearanceLevel clearanceLevel = getClearanceLevelDao().clearanceLevelVOToEntity(clearanceLevelVO);
    	
    	if(clearanceLevel.getId() == null){
    		clearanceLevel = getClearanceLevelDao().create(clearanceLevel);
    	} else{
    		getClearanceLevelDao().update(clearanceLevel);
    	}
    	
        return getClearanceLevelDao().toClearanceLevelVO(clearanceLevel);
    }

    /**
     * @see com.jrsystems.jrbase.clearancelevel.service.ClearanceLevelService#getAllClearanceLevels()
     */
    protected  java.util.List handleGetAllClearanceLevels()
        throws java.lang.Exception
    {
    	return Arrays.asList(getClearanceLevelDao().loadAll().toArray());
    }

	@Override
	protected void handleRemoveClearanceLevel(ClearanceLevelVO clearanceLevelVO)
			throws Exception {
		
		if(clearanceLevelVO.getId() != null){
			getClearanceLevelDao().remove(getClearanceLevelDao().clearanceLevelVOToEntity(clearanceLevelVO));
		}
	}
}