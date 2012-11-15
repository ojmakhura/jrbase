// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public class UserLocationValueObject
    implements java.io.Serializable
{
    private com.jrsystems.jrbase.user.UserLocationStatus status;

    public com.jrsystems.jrbase.user.UserLocationStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(com.jrsystems.jrbase.user.UserLocationStatus status)
    {
        this.status = status;
    }

    private java.sql.Timestamp fromDate;

    public java.sql.Timestamp getFromDate()
    {
        return this.fromDate;
    }

    public void setFromDate(java.sql.Timestamp fromDate)
    {
        this.fromDate = fromDate;
    }

    private java.sql.Timestamp toDate;

    public java.sql.Timestamp getToDate()
    {
        return this.toDate;
    }

    public void setToDate(java.sql.Timestamp toDate)
    {
        this.toDate = toDate;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long user;

    public java.lang.Long getUser()
    {
        return this.user;
    }

    public void setUser(java.lang.Long user)
    {
        this.user = user;
    }

    private java.lang.String userLabel;

    public java.lang.String getUserLabel()
    {
        return this.userLabel;
    }

    public void setUserLabel(java.lang.String userLabel)
    {
        this.userLabel = userLabel;
    }

    private java.lang.Long location;

    public java.lang.Long getLocation()
    {
        return this.location;
    }

    public void setLocation(java.lang.Long location)
    {
        this.location = location;
    }

    private java.lang.String locationLabel;

    public java.lang.String getLocationLabel()
    {
        return this.locationLabel;
    }

    public void setLocationLabel(java.lang.String locationLabel)
    {
        this.locationLabel = locationLabel;
    }

}