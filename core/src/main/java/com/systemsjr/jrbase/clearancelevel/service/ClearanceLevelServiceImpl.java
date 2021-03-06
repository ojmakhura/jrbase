// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase::clearancelevel::service::ClearanceLevelService
 * STEREOTYPE:  Service
 * STEREOTYPE:  WebService
 */
package com.systemsjr.jrbase.clearancelevel.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.clearancelevel.ClearanceLevel;
import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelSearchCriteria;
import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;

/**
 * @see com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService
 */
@Service("com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService")
public class ClearanceLevelServiceImpl
    extends ClearanceLevelServiceBase
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
    		clearanceLevel = getClearanceLevelDao().clearanceLevelVOToEntity(clearanceLevelVO);
    		getClearanceLevelDao().update(clearanceLevel);
    	}
    	
        return getClearanceLevelDao().toClearanceLevelVO(clearanceLevel);
    }

    /**
     * @see com.systemsjr.jrbase.clearancelevel.service.ClearanceLevelService#getAllClearanceLevels()
     */
    @Override
	protected  Collection<ClearanceLevelVO> handleGetAllClearanceLevels()
        throws java.lang.Exception
    {
    	Collection<ClearanceLevel> levels = getClearanceLevelDao().loadAll();
    	return getClearanceLevelDao().toClearanceLevelVOCollection(levels);
    }

	@Override
	protected void handleRemoveClearanceLevel(ClearanceLevelVO clearanceLevelVO)
			throws Exception {
		
		if(clearanceLevelVO.getId() != null){
			getClearanceLevelDao().remove(clearanceLevelVO.getId());
		}
	}

	@Override
	protected Collection<ClearanceLevelVO> handleSearchClearenceLevel(
			ClearanceLevelSearchCriteria searchCriteria) throws Exception {
				
		return getClearanceLevelDao().toClearanceLevelVOCollection(getClearanceLevelDao().findByCriteria(searchCriteria));
	}

	@Override
	protected ClearanceLevelVO handleFindById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return id == null ? null : getClearanceLevelDao().toClearanceLevelVO(getClearanceLevelDao().load(id));
	}

}