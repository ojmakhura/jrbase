// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public interface UserLocationManageableDao
{
    public com.jrsystems.jrbase.user.UserLocation create(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location);

    public com.jrsystems.jrbase.user.UserLocation readById(java.lang.Long id);

    public java.util.List read(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public com.jrsystems.jrbase.user.UserLocation update(com.jrsystems.jrbase.user.UserLocationStatus status, java.sql.Timestamp fromDate, java.sql.Timestamp toDate, java.lang.Long id, java.lang.Long user, java.lang.Long location);

    public void delete(java.lang.Long[] ids);

}