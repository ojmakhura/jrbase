// license-header java merge-point
// Generated by andromda-jsf cartridge (controllers\ControllerImpl.java.vsl)
package com.systemsjr.jrbase.workbench.menu.web.edit;

import java.util.Date;
import java.util.Map;

import com.systemsjr.jrbase.JsfUtils;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrbase.workbench.menu.web.search.SearchMenusEditFormImpl;

/**
 * @see com.systemsjr.jrbase.workbench.menu.web.edit.MenuEditController
 */
public class MenuEditControllerImpl
    extends MenuEditController
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 590923081341720047L;

    /**
     * @see com.systemsjr.jrbase.workbench.menu.web.edit.MenuEditController#doInitialiseEditScreen(MenuVO menuVO)
     */
    @Override
    public void doInitialiseEditScreen(DoInitialiseEditScreenForm form)
    {
    	Map<String, Object> useCaseScope = (Map<String, Object>) JsfUtils.getFlash().get("useCaseScope");

        if(useCaseScope != null && useCaseScope.containsKey("searchMenusSearchMenusEditForm"))
        {
        	SearchMenusEditFormImpl ef = (SearchMenusEditFormImpl) useCaseScope.get("searchMenusSearchMenusEditForm");
        	form.setMenuVO(ef.getMenuVO());
        } 
    }

    /**
     * @see com.systemsjr.jrbase.workbench.menu.web.edit.MenuEditController#doNewMenu()
     */
    @Override
    public void doNewMenu(DoNewMenuForm form)
    {
    	form.setMenuVO(new MenuVO());
    }

    /**
     * @see com.systemsjr.jrbase.workbench.menu.web.edit.MenuEditController#doRemoveMenu(MenuVO menuVO)
     */
    @Override
    public void doRemoveMenu(DoRemoveMenuForm form)
    {
        getMenuService().removeMenu(form.getMenuVO());
        form.setMenuVO(new MenuVO());
    }

    /**
     * @see com.systemsjr.jrbase.workbench.menu.web.edit.MenuEditController#doSaveMenu(MenuVO menuVO)
     */
    @Override
    public void doSaveMenu(DoSaveMenuForm form)
    {
        MenuVO menu = form.getMenuVO();
        
        if(menu.getId() == null)
        {
        	menu.setCreatedAt(new Date());
        	menu.setCreatedBy("SYSTEM");
        } else {
        	menu.setModifiedAt(new Date());
        	menu.setModifiedBy("SYSTEM");
        }
        
        form.setMenuVO(getMenuService().saveMenu(menu));
    }
}