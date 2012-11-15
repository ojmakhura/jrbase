// license-header java merge-point
package com.jrsystems.jrbase.role.crud;

public class RoleValueObject
    implements java.io.Serializable
{
    private java.lang.String roleCode;

    public java.lang.String getRoleCode()
    {
        return this.roleCode;
    }

    public void setRoleCode(java.lang.String roleCode)
    {
        this.roleCode = roleCode;
    }

    private java.lang.String role;

    public java.lang.String getRole()
    {
        return this.role;
    }

    public void setRole(java.lang.String role)
    {
        this.role = role;
    }

    private java.lang.String roleDescription;

    public java.lang.String getRoleDescription()
    {
        return this.roleDescription;
    }

    public void setRoleDescription(java.lang.String roleDescription)
    {
        this.roleDescription = roleDescription;
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

    private java.lang.Long[] users;

    public java.lang.Long[] getUsers()
    {
        return this.users;
    }

    public void setUsers(java.lang.Long[] users)
    {
        this.users = users;
    }

    private java.lang.String[] usersLabels;

    public java.lang.String[] getUsersLabels()
    {
        return this.usersLabels;
    }

    public void setUsersLabels(java.lang.String[] usersLabels)
    {
        this.usersLabels = usersLabels;
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

    private java.lang.Long[] roleClearanceLevels;

    public java.lang.Long[] getRoleClearanceLevels()
    {
        return this.roleClearanceLevels;
    }

    public void setRoleClearanceLevels(java.lang.Long[] roleClearanceLevels)
    {
        this.roleClearanceLevels = roleClearanceLevels;
    }

    private java.lang.String[] roleClearanceLevelsLabels;

    public java.lang.String[] getRoleClearanceLevelsLabels()
    {
        return this.roleClearanceLevelsLabels;
    }

    public void setRoleClearanceLevelsLabels(java.lang.String[] roleClearanceLevelsLabels)
    {
        this.roleClearanceLevelsLabels = roleClearanceLevelsLabels;
    }

}