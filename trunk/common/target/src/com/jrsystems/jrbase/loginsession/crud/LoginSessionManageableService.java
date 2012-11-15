// license-header java merge-point
package com.jrsystems.jrbase.loginsession.crud;

public interface LoginSessionManageableService
{
    public com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject create(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
        throws Exception;

    public com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.loginsession.crud.LoginSessionValueObject update(boolean active, java.lang.Long id, java.lang.Long user, java.lang.Long area)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
