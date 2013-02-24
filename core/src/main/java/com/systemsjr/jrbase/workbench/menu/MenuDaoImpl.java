// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.workbench.menu;

import java.util.List;

/**
 * @see com.systemsjr.jrbase.workbench.menu.Menu
 */
public class MenuDaoImpl
    extends com.systemsjr.jrbase.workbench.menu.MenuDaoBase
{
    /**
     * @see com.systemsjr.jrbase.workbench.menu.MenuDao#findByCriteria(com.systemsjr.jrbase.workbench.menu.vo.MenuSearchCriteria)
     */
    @Override
	protected List handleFindByCriteria(com.systemsjr.jrbase.workbench.menu.vo.MenuSearchCriteria criteria)
    {
        // @todo implement public com.systemsjr.jrbase.workbench.menu.vo.MenuVO[] handleFindByCriteria(com.systemsjr.jrbase.workbench.menu.vo.MenuSearchCriteria criteria)
        return null;
}

    /**
     * @see com.systemsjr.jrbase.workbench.menu.MenuDao#toMenuVO(com.systemsjr.jrbase.workbench.menu.Menu, com.systemsjr.jrbase.workbench.menu.vo.MenuVO)
     */
    @Override
	public void toMenuVO(
        com.systemsjr.jrbase.workbench.menu.Menu source,
        com.systemsjr.jrbase.workbench.menu.vo.MenuVO target)
    {
        // @todo verify behavior of toMenuVO
        super.toMenuVO(source, target);
    }


    /**
     * @see com.systemsjr.jrbase.workbench.menu.MenuDao#toMenuVO(com.systemsjr.jrbase.workbench.menu.Menu)
     */
    @Override
	public com.systemsjr.jrbase.workbench.menu.vo.MenuVO toMenuVO(final com.systemsjr.jrbase.workbench.menu.Menu entity)
    {
        // @todo verify behavior of toMenuVO
        return super.toMenuVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.systemsjr.jrbase.workbench.menu.Menu loadMenuFromMenuVO(com.systemsjr.jrbase.workbench.menu.vo.MenuVO menuVO)
    {
        // @todo implement loadMenuFromMenuVO
        throw new java.lang.UnsupportedOperationException("com.systemsjr.jrbase.workbench.menu.loadMenuFromMenuVO(com.systemsjr.jrbase.workbench.menu.vo.MenuVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.systemsjr.jrbase.workbench.menu.Menu menu = this.load(menuVO.getId());
        if (menu == null)
        {
            menu = com.systemsjr.jrbase.workbench.menu.Menu.Factory.newInstance();
        }
        return menu;
        */
    }

    
    /**
     * @see com.systemsjr.jrbase.workbench.menu.MenuDao#menuVOToEntity(com.systemsjr.jrbase.workbench.menu.vo.MenuVO)
     */
    @Override
	public com.systemsjr.jrbase.workbench.menu.Menu menuVOToEntity(com.systemsjr.jrbase.workbench.menu.vo.MenuVO menuVO)
    {
        // @todo verify behavior of menuVOToEntity
        com.systemsjr.jrbase.workbench.menu.Menu entity = this.loadMenuFromMenuVO(menuVO);
        this.menuVOToEntity(menuVO, entity, true);
        return entity;
    }


    /**
     * @see com.systemsjr.jrbase.workbench.menu.MenuDao#menuVOToEntity(com.systemsjr.jrbase.workbench.menu.vo.MenuVO, com.systemsjr.jrbase.workbench.menu.Menu)
     */
    @Override
	public void menuVOToEntity(
        com.systemsjr.jrbase.workbench.menu.vo.MenuVO source,
        com.systemsjr.jrbase.workbench.menu.Menu target,
        boolean copyIfNull)
    {
        // @todo verify behavior of menuVOToEntity
        super.menuVOToEntity(source, target, copyIfNull);
    }

}