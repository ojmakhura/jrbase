// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.clearancelevel;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelSearchCriteria;

/**
 * @see com.jrsystems.jrbase.clearancelevel.ClearanceLevel
 */
public class ClearanceLevelDaoImpl
    extends com.jrsystems.jrbase.clearancelevel.ClearanceLevelDaoBase
{
    /**
     * @see com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao#toClearanceLevelVO(com.jrsystems.jrbase.clearancelevel.ClearanceLevel, com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    public void toClearanceLevelVO(
        com.jrsystems.jrbase.clearancelevel.ClearanceLevel source,
        com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO target)
    {
        // @todo verify behavior of toClearanceLevelVO
        super.toClearanceLevelVO(source, target);
        // WARNING! No conversion for target.lowerLevel (can't convert source.getLowerLevel():com.jrsystems.jrbase.clearancelevel.ClearanceLevel to com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO
        // WARNING! No conversion for target.upperLevel (can't convert source.getUpperLevel():com.jrsystems.jrbase.clearancelevel.ClearanceLevel to com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO
    }


    /**
     * @see com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao#toClearanceLevelVO(com.jrsystems.jrbase.clearancelevel.ClearanceLevel)
     */
    public com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO toClearanceLevelVO(final com.jrsystems.jrbase.clearancelevel.ClearanceLevel entity)
    {
        // @todo verify behavior of toClearanceLevelVO
        return super.toClearanceLevelVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.clearancelevel.ClearanceLevel loadClearanceLevelFromClearanceLevelVO(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceLevelVO)
    {
        // A typical implementation looks like this:
        com.jrsystems.jrbase.clearancelevel.ClearanceLevel clearanceLevel = this.load(clearanceLevelVO.getId());
        if (clearanceLevel == null)
        {
            clearanceLevel = com.jrsystems.jrbase.clearancelevel.ClearanceLevel.Factory.newInstance();
        }
        return clearanceLevel;
    }

    
    /**
     * @see com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao#clearanceLevelVOToEntity(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO)
     */
    public com.jrsystems.jrbase.clearancelevel.ClearanceLevel clearanceLevelVOToEntity(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO clearanceLevelVO)
    {
        // @todo verify behavior of clearanceLevelVOToEntity
        com.jrsystems.jrbase.clearancelevel.ClearanceLevel entity = this.loadClearanceLevelFromClearanceLevelVO(clearanceLevelVO);
        this.clearanceLevelVOToEntity(clearanceLevelVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.clearancelevel.ClearanceLevelDao#clearanceLevelVOToEntity(com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO, com.jrsystems.jrbase.clearancelevel.ClearanceLevel)
     */
    public void clearanceLevelVOToEntity(
        com.jrsystems.jrbase.clearancelevel.vo.ClearanceLevelVO source,
        com.jrsystems.jrbase.clearancelevel.ClearanceLevel target,
        boolean copyIfNull)
    {
        // @todo verify behavior of clearanceLevelVOToEntity
        super.clearanceLevelVOToEntity(source, target, copyIfNull);
    }


	@Override
	protected List handleFindByCriteria(
			ClearanceLevelSearchCriteria searchCriteria) throws Exception {
		Criteria criteria = getSession().createCriteria(ClearanceLevel.class);
		
		if(searchCriteria.getLevelCode() != null){
			criteria.add(Restrictions.ilike("levelCode", searchCriteria.getLevelCode()));
		}
		
		if(searchCriteria.getLevelDescription() != null){
			criteria.add(Restrictions.ilike("levelDescription", searchCriteria.getLevelDescription()));
		}
		
		return null;
	}

}