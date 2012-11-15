// license-header java merge-point
package com.jrsystems.jrbase.workbench.menu.crud;

public interface MenuManageableDao
{
    public com.jrsystems.jrbase.workbench.menu.Menu create(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs);

    public com.jrsystems.jrbase.workbench.menu.Menu readById(java.lang.Long id);

    public java.util.List read(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.workbench.menu.Menu update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs);

    public void delete(java.lang.Long[] ids);

}