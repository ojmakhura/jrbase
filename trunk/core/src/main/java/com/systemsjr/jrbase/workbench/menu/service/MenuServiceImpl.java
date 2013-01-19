// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.systemsjr.jrbase.workbench.menu.service;

import java.util.Collection;

import com.systemsjr.jrbase.workbench.menu.Menu;
import com.systemsjr.jrbase.workbench.menu.MenuDao;
import com.systemsjr.jrbase.workbench.menu.vo.MenuSearchCriteria;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;

/**
 * @see com.systemsjr.jrbase.workbench.menu.service.MenuService
 */
public class MenuServiceImpl
    extends com.systemsjr.jrbase.workbench.menu.service.MenuServiceBase
{

    /**
     * @see com.systemsjr.jrbase.workbench.menu.service.MenuService#getAllMenus()
     */
    @Override
	protected  MenuVO[] handleGetAllMenus()
        throws java.lang.Exception
    {
    	Collection menus = getMenuDao().loadAll();
    	return getMenuDao().toMenuVOArray(menus);
    }

    /**
     * @see com.systemsjr.jrbase.workbench.menu.service.MenuService#getMenuBycode(java.lang.String)
     */
    @Override
	protected  MenuVO[] handleGetMenuBycode(java.lang.String code)
        throws java.lang.Exception
    {
    	MenuSearchCriteria searchCriteria = new MenuSearchCriteria();
    	
    	searchCriteria.setMenuCode(code);    	
    	
    	return getMenuDao().toMenuVOArray(getMenuDao().findByCriteria(searchCriteria));
    }

    /**
     * @see com.systemsjr.jrbase.workbench.menu.service.MenuService#getMenuByName(java.lang.String)
     */
    @Override
	protected  MenuVO[] handleGetMenuByName(java.lang.String name)
        throws java.lang.Exception
    {
    	MenuSearchCriteria searchCriteria = new MenuSearchCriteria();
    	
    	searchCriteria.setMenuCode(name);    	
    	
    	return getMenuDao().toMenuVOArray(getMenuDao().findByCriteria(searchCriteria));
    }

	@Override
	protected MenuVO handleSaveMenu(MenuVO menuVO) throws Exception {
		Menu menu;
		
		if(menuVO.getId() == null){
			menu = getMenuDao().create(getMenuDao().menuVOToEntity(menuVO));
		} else{
			menu = getMenuDao().menuVOToEntity(menuVO);
			getMenuDao().update(menu);
		}
		
		return getMenuDao().toMenuVO(menu);
	}

	@Override
	protected void handleRemoveMenu(MenuVO menuVO) throws Exception {
		
		if(menuVO.getId() != null){
			getMenuDao().remove(getMenuDao().menuVOToEntity(menuVO));
		}
		
	}

}