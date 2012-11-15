// license-header java merge-point
package com.jrsystems.jrbase.clearancelevel.crud;

public class ClearanceLevelValueObject
    implements java.io.Serializable
{
    private java.lang.String levelCode;

    public java.lang.String getLevelCode()
    {
        return this.levelCode;
    }

    public void setLevelCode(java.lang.String levelCode)
    {
        this.levelCode = levelCode;
    }

    private java.lang.String levelDescription;

    public java.lang.String getLevelDescription()
    {
        return this.levelDescription;
    }

    public void setLevelDescription(java.lang.String levelDescription)
    {
        this.levelDescription = levelDescription;
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

    private java.lang.Long[] clearedUsers;

    public java.lang.Long[] getClearedUsers()
    {
        return this.clearedUsers;
    }

    public void setClearedUsers(java.lang.Long[] clearedUsers)
    {
        this.clearedUsers = clearedUsers;
    }

    private java.lang.String[] clearedUsersLabels;

    public java.lang.String[] getClearedUsersLabels()
    {
        return this.clearedUsersLabels;
    }

    public void setClearedUsersLabels(java.lang.String[] clearedUsersLabels)
    {
        this.clearedUsersLabels = clearedUsersLabels;
    }

    private java.lang.Long[] clearedRoles;

    public java.lang.Long[] getClearedRoles()
    {
        return this.clearedRoles;
    }

    public void setClearedRoles(java.lang.Long[] clearedRoles)
    {
        this.clearedRoles = clearedRoles;
    }

    private java.lang.String[] clearedRolesLabels;

    public java.lang.String[] getClearedRolesLabels()
    {
        return this.clearedRolesLabels;
    }

    public void setClearedRolesLabels(java.lang.String[] clearedRolesLabels)
    {
        this.clearedRolesLabels = clearedRolesLabels;
    }

    private java.lang.Long lowerLevel;

    public java.lang.Long getLowerLevel()
    {
        return this.lowerLevel;
    }

    public void setLowerLevel(java.lang.Long lowerLevel)
    {
        this.lowerLevel = lowerLevel;
    }

    private java.lang.String lowerLevelLabel;

    public java.lang.String getLowerLevelLabel()
    {
        return this.lowerLevelLabel;
    }

    public void setLowerLevelLabel(java.lang.String lowerLevelLabel)
    {
        this.lowerLevelLabel = lowerLevelLabel;
    }

    private java.lang.Long upperLevel;

    public java.lang.Long getUpperLevel()
    {
        return this.upperLevel;
    }

    public void setUpperLevel(java.lang.Long upperLevel)
    {
        this.upperLevel = upperLevel;
    }

    private java.lang.String upperLevelLabel;

    public java.lang.String getUpperLevelLabel()
    {
        return this.upperLevelLabel;
    }

    public void setUpperLevelLabel(java.lang.String upperLevelLabel)
    {
        this.upperLevelLabel = upperLevelLabel;
    }

}