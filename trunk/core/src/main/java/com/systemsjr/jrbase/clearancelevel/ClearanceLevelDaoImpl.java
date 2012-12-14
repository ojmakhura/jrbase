// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.clearancelevel;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelSearchCriteria;
import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;

/**
 * @see com.systemsjr.jrbase.clearancelevel.ClearanceLevel
 */
public class ClearanceLevelDaoImpl extends
		com.systemsjr.jrbase.clearancelevel.ClearanceLevelDaoBase {
	/**
	 * @see com.systemsjr.jrbase.clearancelevel.ClearanceLevelDao#toClearanceLevelVO(com.systemsjr.jrbase.clearancelevel.ClearanceLevel,
	 *      com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO)
	 */
	@Override
	public void toClearanceLevelVO(
			com.systemsjr.jrbase.clearancelevel.ClearanceLevel source,
			com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO target) {
		super.toClearanceLevelVO(source, target);
		if(source.getLowerLevel() != null){
			target.setLowerLevel(new ClearanceLevelVO());
			target.getLowerLevel().setId(source.getLowerLevel().getId());
			target.getLowerLevel().setLevelCode(source.getLowerLevel().getLevelCode());
			target.getLowerLevel().setLevelDescription(source.getLowerLevel().getLevelDescription());
		}
		
		if(source.getUpperLevel() != null){
			target.setUpperLevel(new ClearanceLevelVO());
			target.getUpperLevel().setId(source.getUpperLevel().getId());
			target.getUpperLevel().setLevelCode(source.getUpperLevel().getLevelCode());
			target.getUpperLevel().setLevelDescription(source.getUpperLevel().getLevelDescription());
		}
	}

	/**
	 * @see com.systemsjr.jrbase.clearancelevel.ClearanceLevelDao#toClearanceLevelVO(com.systemsjr.jrbase.clearancelevel.ClearanceLevel)
	 */
	@Override
	public com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO toClearanceLevelVO(
			final com.systemsjr.jrbase.clearancelevel.ClearanceLevel entity) {
		// @todo verify behavior of toClearanceLevelVO
		return super.toClearanceLevelVO(entity);
	}

	/**
	 * Retrieves the entity object that is associated with the specified value
	 * object from the object store. If no such entity object exists in the
	 * object store, a new, blank entity is created
	 */
	private com.systemsjr.jrbase.clearancelevel.ClearanceLevel loadClearanceLevelFromClearanceLevelVO(
			com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceLevelVO) {
		// A typical implementation looks like this:
		com.systemsjr.jrbase.clearancelevel.ClearanceLevel clearanceLevel;
		if (clearanceLevelVO.getId() == null) {
			clearanceLevel = com.systemsjr.jrbase.clearancelevel.ClearanceLevel.Factory
					.newInstance();
		} else{

			clearanceLevel = this.load(clearanceLevelVO.getId());
			
			if(clearanceLevelVO.getUpperLevel() != null && clearanceLevel.getUpperLevel() == null){
				clearanceLevel.setUpperLevel(this.load(clearanceLevelVO.getUpperLevel().getId()));
			}
			
			if(clearanceLevelVO.getLowerLevel() != null && clearanceLevel.getLowerLevel() == null){
				clearanceLevel.setLowerLevel(this.load(clearanceLevelVO.getLowerLevel().getId()));
			}
		}
		return clearanceLevel;
	}

	/**
	 * @see com.systemsjr.jrbase.clearancelevel.ClearanceLevelDao#clearanceLevelVOToEntity(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO)
	 */
	@Override
	public com.systemsjr.jrbase.clearancelevel.ClearanceLevel clearanceLevelVOToEntity(
			com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceLevelVO) {
		// @todo verify behavior of clearanceLevelVOToEntity
		com.systemsjr.jrbase.clearancelevel.ClearanceLevel entity = this
				.loadClearanceLevelFromClearanceLevelVO(clearanceLevelVO);
		this.clearanceLevelVOToEntity(clearanceLevelVO, entity, true);
		return entity;
	}

	/**
	 * @see com.systemsjr.jrbase.clearancelevel.ClearanceLevelDao#clearanceLevelVOToEntity(com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO,
	 *      com.systemsjr.jrbase.clearancelevel.ClearanceLevel)
	 */
	@Override
	public void clearanceLevelVOToEntity(
			com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO source,
			com.systemsjr.jrbase.clearancelevel.ClearanceLevel target,
			boolean copyIfNull) {
		// @todo verify behavior of clearanceLevelVOToEntity
		super.clearanceLevelVOToEntity(source, target, copyIfNull);
	}

	@Override
	protected List handleFindByCriteria(
			ClearanceLevelSearchCriteria searchCriteria) throws Exception {
		Criteria criteria = getSession().createCriteria(ClearanceLevel.class);
		if (searchCriteria.getLevelCode() != null) {
			criteria.add(Restrictions.ilike("levelCode",
					searchCriteria.getLevelCode()));
		}

		if (searchCriteria.getLevelDescription() != null) {
			criteria.add(Restrictions.ilike("levelDescription",
					searchCriteria.getLevelDescription()));
		}

		return null;
	}

}