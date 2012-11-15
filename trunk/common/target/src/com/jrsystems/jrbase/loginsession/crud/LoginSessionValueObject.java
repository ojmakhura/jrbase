// license-header java merge-point
package com.jrsystems.jrbase.loginsession.crud;

public class LoginSessionValueObject
    implements java.io.Serializable
{
    private boolean active;

    public boolean isActive()
    {
        return this.active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
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

    private java.lang.Long area;

    public java.lang.Long getArea()
    {
        return this.area;
    }

    public void setArea(java.lang.Long area)
    {
        this.area = area;
    }

    private java.lang.String areaLabel;

    public java.lang.String getAreaLabel()
    {
        return this.areaLabel;
    }

    public void setAreaLabel(java.lang.String areaLabel)
    {
        this.areaLabel = areaLabel;
    }

}