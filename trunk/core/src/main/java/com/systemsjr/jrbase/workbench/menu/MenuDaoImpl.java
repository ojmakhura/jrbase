// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.jrsystems.jrbase.workbench.menu;

import java.util.List;

/**
 * @see com.jrsystems.jrbase.workbench.menu.Menu
 */
public class MenuDaoImpl
    extends com.jrsystems.jrbase.workbench.menu.MenuDaoBase
{
    /**
     * @see com.jrsystems.jrbase.workbench.menu.MenuDao#findByCriteria(com.jrsystems.jrbase.workbench.menu.vo.MenuSearchCriteria)
     */
    protected List handleFindByCriteria(com.jrsystems.jrbase.workbench.menu.vo.MenuSearchCriteria criteria)
    {
        // @todo implement public com.jrsystems.jrbase.workbench.menu.vo.MenuVO[] handleFindByCriteria(com.jrsystems.jrbase.workbench.menu.vo.MenuSearchCriteria criteria)
        return null;
}

    /**
     * @see com.jrsystems.jrbase.workbench.menu.MenuDao#toMenuVO(com.jrsystems.jrbase.workbench.menu.Menu, com.jrsystems.jrbase.workbench.menu.vo.MenuVO)
     */
    public void toMenuVO(
        com.jrsystems.jrbase.workbench.menu.Menu source,
        com.jrsystems.jrbase.workbench.menu.vo.MenuVO target)
    {
        // @todo verify behavior of toMenuVO
        super.toMenuVO(source, target);
    }


    /**
     * @see com.jrsystems.jrbase.workbench.menu.MenuDao#toMenuVO(com.jrsystems.jrbase.workbench.menu.Menu)
     */
    public com.jrsystems.jrbase.workbench.menu.vo.MenuVO toMenuVO(final com.jrsystems.jrbase.workbench.menu.Menu entity)
    {
        // @todo verify behavior of toMenuVO
        return super.toMenuVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private com.jrsystems.jrbase.workbench.menu.Menu loadMenuFromMenuVO(com.jrsystems.jrbase.workbench.menu.vo.MenuVO menuVO)
    {
        // @todo implement loadMenuFromMenuVO
        throw new java.lang.UnsupportedOperationException("com.jrsystems.jrbase.workbench.menu.loadMenuFromMenuVO(com.jrsystems.jrbase.workbench.menu.vo.MenuVO) not yet implemented.");

        /* A typical implementation looks like this:
        com.jrsystems.jrbase.workbench.menu.Menu menu = this.load(menuVO.getId());
        if (menu == null)
        {
            menu = com.jrsystems.jrbase.workbench.menu.Menu.Factory.newInstance();
        }
        return menu;
        */
    }

    
    /**
     * @see com.jrsystems.jrbase.workbench.menu.MenuDao#menuVOToEntity(com.jrsystems.jrbase.workbench.menu.vo.MenuVO)
     */
    public com.jrsystems.jrbase.workbench.menu.Menu menuVOToEntity(com.jrsystems.jrbase.workbench.menu.vo.MenuVO menuVO)
    {
        // @todo verify behavior of menuVOToEntity
        com.jrsystems.jrbase.workbench.menu.Menu entity = this.loadMenuFromMenuVO(menuVO);
        this.menuVOToEntity(menuVO, entity, true);
        return entity;
    }


    /**
     * @see com.jrsystems.jrbase.workbench.menu.MenuDao#menuVOToEntity(com.jrsystems.jrbase.workbench.menu.vo.MenuVO, com.jrsystems.jrbase.workbench.menu.Menu)
     */
    public void menuVOToEntity(
        com.jrsystems.jrbase.workbench.menu.vo.MenuVO source,
        com.jrsystems.jrbase.workbench.menu.Menu target,
        boolean copyIfNull)
    {
        // @todo verify behavior of menuVOToEntity
        super.menuVOToEntity(source, target, copyIfNull);
    }

}