// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public interface UserLocationManageableService
{
    public com.jrsystems.jrbase.user.crud.UserLocationValueObject create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
        throws Exception;

    public com.jrsystems.jrbase.user.crud.UserLocationValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public com.jrsystems.jrbase.user.crud.UserLocationValueObject update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
