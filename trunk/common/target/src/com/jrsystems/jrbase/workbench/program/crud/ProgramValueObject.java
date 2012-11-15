// license-header java merge-point
package com.jrsystems.jrbase.workbench.program.crud;

public class ProgramValueObject
    implements java.io.Serializable
{
    private java.lang.String programId;

    public java.lang.String getProgramId()
    {
        return this.programId;
    }

    public void setProgramId(java.lang.String programId)
    {
        this.programId = programId;
    }

    private java.lang.String programName;

    public java.lang.String getProgramName()
    {
        return this.programName;
    }

    public void setProgramName(java.lang.String programName)
    {
        this.programName = programName;
    }

    private java.lang.String programDescription;

    public java.lang.String getProgramDescription()
    {
        return this.programDescription;
    }

    public void setProgramDescription(java.lang.String programDescription)
    {
        this.programDescription = programDescription;
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

    private java.lang.Long menu;

    public java.lang.Long getMenu()
    {
        return this.menu;
    }

    public void setMenu(java.lang.Long menu)
    {
        this.menu = menu;
    }

}