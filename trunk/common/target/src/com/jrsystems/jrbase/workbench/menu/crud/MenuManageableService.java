// license-header java merge-point
package com.jrsystems.jrbase.workbench.menu.crud;

public interface MenuManageableService
{
    public com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject create(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
        throws Exception;

    public com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.workbench.menu.crud.MenuValueObject update(java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription, java.lang.Long id, java.lang.Long[] programs)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
