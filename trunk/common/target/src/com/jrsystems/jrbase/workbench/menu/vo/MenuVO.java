// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package com.jrsystems.jrbase.workbench.menu.vo;

/**
 * 
 */
public class MenuVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 645146243811492807L;

    public MenuVO()
    {
    }

    public MenuVO(java.lang.Long id, java.lang.String menuCode, java.lang.String menuName)
    {
        this.id = id;
        this.menuCode = menuCode;
        this.menuName = menuName;
    }

    public MenuVO(java.lang.Long id, java.lang.String menuCode, java.lang.String menuName, java.lang.String menuDescription)
    {
        this.id = id;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuDescription = menuDescription;
    }

    /**
     * Copies constructor from other MenuVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public MenuVO(MenuVO otherBean)
    {
        this(otherBean.getId(), otherBean.getMenuCode(), otherBean.getMenuName(), otherBean.getMenuDescription());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(MenuVO otherBean)
    {
        if (otherBean != null)
        {
            this.setId(otherBean.getId());
            this.setMenuCode(otherBean.getMenuCode());
            this.setMenuName(otherBean.getMenuName());
            this.setMenuDescription(otherBean.getMenuDescription());
        }
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String menuCode;

    /**
     * 
     */
    public java.lang.String getMenuCode()
    {
        return this.menuCode;
    }

    public void setMenuCode(java.lang.String menuCode)
    {
        this.menuCode = menuCode;
    }

    private java.lang.String menuName;

    /**
     * 
     */
    public java.lang.String getMenuName()
    {
        return this.menuName;
    }

    public void setMenuName(java.lang.String menuName)
    {
        this.menuName = menuName;
    }

    private java.lang.String menuDescription;

    /**
     * 
     */
    public java.lang.String getMenuDescription()
    {
        return this.menuDescription;
    }

    public void setMenuDescription(java.lang.String menuDescription)
    {
        this.menuDescription = menuDescription;
    }

    // com.jrsystems.jrbase.workbench.menu.vo.MenuVO value-object java merge-point
}