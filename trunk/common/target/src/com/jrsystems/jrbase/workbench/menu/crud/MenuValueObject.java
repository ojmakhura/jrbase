// license-header java merge-point
package com.jrsystems.jrbase.workbench.menu.crud;

public class MenuValueObject
    implements java.io.Serializable
{
    private java.lang.String menuCode;

    public java.lang.String getMenuCode()
    {
        return this.menuCode;
    }

    public void setMenuCode(java.lang.String menuCode)
    {
        this.menuCode = menuCode;
    }

    private java.lang.String menuName;

    public java.lang.String getMenuName()
    {
        return this.menuName;
    }

    public void setMenuName(java.lang.String menuName)
    {
        this.menuName = menuName;
    }

    private java.lang.String menuDescription;

    public java.lang.String getMenuDescription()
    {
        return this.menuDescription;
    }

    public void setMenuDescription(java.lang.String menuDescription)
    {
        this.menuDescription = menuDescription;
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

}