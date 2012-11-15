// license-header java merge-point
package com.jrsystems.jrbase.user.crud;

public class UserValueObject
    implements java.io.Serializable
{
    private byte[] photo;

    public byte[] getPhoto()
    {
        return this.photo;
    }

    public void setPhoto(byte[] photo)
    {
        this.photo = photo;
    }

    private com.jrsystems.jrbase.user.UserStatus status;

    public com.jrsystems.jrbase.user.UserStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(com.jrsystems.jrbase.user.UserStatus status)
    {
        this.status = status;
    }

    private java.lang.String username;

    public java.lang.String getUsername()
    {
        return this.username;
    }

    public void setUsername(java.lang.String username)
    {
        this.username = username;
    }

    private java.lang.String password;

    public java.lang.String getPassword()
    {
        return this.password;
    }

    public void setPassword(java.lang.String password)
    {
        this.password = password;
    }

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String email;

    public java.lang.String getEmail()
    {
        return this.email;
    }

    public void setEmail(java.lang.String email)
    {
        this.email = email;
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

    private java.lang.Long individual;

    public java.lang.Long getIndividual()
    {
        return this.individual;
    }

    public void setIndividual(java.lang.Long individual)
    {
        this.individual = individual;
    }

    private java.lang.String individualLabel;

    public java.lang.String getIndividualLabel()
    {
        return this.individualLabel;
    }

    public void setIndividualLabel(java.lang.String individualLabel)
    {
        this.individualLabel = individualLabel;
    }

    private java.lang.Long[] menus;

    public java.lang.Long[] getMenus()
    {
        return this.menus;
    }

    public void setMenus(java.lang.Long[] menus)
    {
        this.menus = menus;
    }

    private java.lang.Long[] programs;

    public java.lang.Long[] getPrograms()
    {
        return this.programs;
    }

    public void setPrograms(java.lang.Long[] programs)
    {
        this.programs = programs;
    }

    private java.lang.String[] programsLabels;

    public java.lang.String[] getProgramsLabels()
    {
        return this.programsLabels;
    }

    public void setProgramsLabels(java.lang.String[] programsLabels)
    {
        this.programsLabels = programsLabels;
    }

    private java.lang.Long[] userLocations;

    public java.lang.Long[] getUserLocations()
    {
        return this.userLocations;
    }

    public void setUserLocations(java.lang.Long[] userLocations)
    {
        this.userLocations = userLocations;
    }

    private java.lang.Long[] userRoles;

    public java.lang.Long[] getUserRoles()
    {
        return this.userRoles;
    }

    public void setUserRoles(java.lang.Long[] userRoles)
    {
        this.userRoles = userRoles;
    }

    private java.lang.String[] userRolesLabels;

    public java.lang.String[] getUserRolesLabels()
    {
        return this.userRolesLabels;
    }

    public void setUserRolesLabels(java.lang.String[] userRolesLabels)
    {
        this.userRolesLabels = userRolesLabels;
    }

    private java.lang.Long[] userClearanceLevels;

    public java.lang.Long[] getUserClearanceLevels()
    {
        return this.userClearanceLevels;
    }

    public void setUserClearanceLevels(java.lang.Long[] userClearanceLevels)
    {
        this.userClearanceLevels = userClearanceLevels;
    }

    private java.lang.String[] userClearanceLevelsLabels;

    public java.lang.String[] getUserClearanceLevelsLabels()
    {
        return this.userClearanceLevelsLabels;
    }

    public void setUserClearanceLevelsLabels(java.lang.String[] userClearanceLevelsLabels)
    {
        this.userClearanceLevelsLabels = userClearanceLevelsLabels;
    }

    private java.lang.Long[] loginSessions;

    public java.lang.Long[] getLoginSessions()
    {
        return this.loginSessions;
    }

    public void setLoginSessions(java.lang.Long[] loginSessions)
    {
        this.loginSessions = loginSessions;
    }

}