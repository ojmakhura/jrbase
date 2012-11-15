// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package com.jrsystems.jrbase.organisation;

/**
 * 
 */
public abstract class OrganisationType
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 1568746520495542019L;

    private java.lang.String levelCode;

    /**
     * 
     */
    public java.lang.String getLevelCode()
    {
        return this.levelCode;
    }

    public void setLevelCode(java.lang.String levelCode)
    {
        this.levelCode = levelCode;
    }

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String description;

    /**
     * 
     */
    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
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

    private java.util.Collection organisations = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getOrganisations()
    {
        return this.organisations;
    }

    public void setOrganisations(java.util.Collection organisations)
    {
        this.organisations = organisations;
    }

    /**
     * Returns <code>true</code> if the argument is an OrganisationType instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof OrganisationType))
        {
            return false;
        }
        final OrganisationType that = (OrganisationType)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link com.jrsystems.jrbase.organisation.OrganisationType}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link com.jrsystems.jrbase.organisation.OrganisationType}.
         */
        public static com.jrsystems.jrbase.organisation.OrganisationType newInstance()
        {
            return new com.jrsystems.jrbase.organisation.OrganisationTypeImpl();
        }

        /**
         * Constructs a new instance of {@link com.jrsystems.jrbase.organisation.OrganisationType}, taking all required and/or
         * read-only properties as arguments.
         */
        public static com.jrsystems.jrbase.organisation.OrganisationType newInstance(java.lang.String levelCode, java.lang.String name)
        {
            final com.jrsystems.jrbase.organisation.OrganisationType entity = new com.jrsystems.jrbase.organisation.OrganisationTypeImpl();
            entity.setLevelCode(levelCode);
            entity.setName(name);
            return entity;
        }

        /**
         * Constructs a new instance of {@link com.jrsystems.jrbase.organisation.OrganisationType}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static com.jrsystems.jrbase.organisation.OrganisationType newInstance(java.lang.String levelCode, java.lang.String name, java.lang.String description, java.util.Collection organisations)
        {
            final com.jrsystems.jrbase.organisation.OrganisationType entity = new com.jrsystems.jrbase.organisation.OrganisationTypeImpl();
            entity.setLevelCode(levelCode);
            entity.setName(name);
            entity.setDescription(description);
            entity.setOrganisations(organisations);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}