// license-header java merge-point
package com.jrsystems.jrbase.loginsession.crud;

public interface LoginSessionManageableDao
{
    public com.jrsystems.jrbase.loginsession.LoginSession create(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area);

    public com.jrsystems.jrbase.loginsession.LoginSession readById(java.lang.Long id);

    public java.util.List read(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.loginsession.LoginSession update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area);

    public void delete(java.lang.Long[] ids);

}