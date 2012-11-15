// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateSearchProperties.vsl in andromda-spring-cartridge.
//
package com.jrsystems.jrbase;

/**
 * Stores the embedded values and asssociations of all entities in the system by type.  
 * Is used to determine the appropriate parameter name when an embedded value's property 
 * is referenced as the attribute to search by (as opposed to an association).
 * 
 * @author Chad Brandon
 */
 public class CriteriaSearchProperties
{
    private static final java.util.Map embeddedValuesByType = new java.util.HashMap();
    private static final java.util.Map embeddedValueNamesByType = new java.util.HashMap();
    private static final java.util.Map navigableAssociationEndsByType = new java.util.HashMap();
    
    static
    {
        initialize1();
        initialize2();
        initialize3();
        initialize4();
        initialize5();
        initialize6();
        initialize7();
        initialize8();
        initialize9();
        initialize10();
        initialize11();
        initialize12();
        initialize13();
    }
    
    private static final void initialize1()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.individual.IndividualImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.individual.IndividualImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.individual.IndividualImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("nextOfKin", com.jrsystems.jrbase.individual.IndividualImpl.class), 
                    new PropertyType("individual", com.jrsystems.jrbase.individual.IndividualImpl.class), 
                    new PropertyType("countryOfBirth", com.jrsystems.jrbase.location.LocationImpl.class), 
                    new PropertyType("countryOfCitizenship", com.jrsystems.jrbase.location.LocationImpl.class)
                }
            )
        );
    }
    
    private static final void initialize2()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.user.UserImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.user.UserImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.user.UserImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("individual", com.jrsystems.jrbase.individual.IndividualImpl.class), 
                    new PropertyType("menus", com.jrsystems.jrbase.workbench.menu.MenuImpl.class), 
                    new PropertyType("programs", com.jrsystems.jrbase.workbench.program.ProgramImpl.class), 
                    new PropertyType("userLocations", com.jrsystems.jrbase.user.UserLocationImpl.class), 
                    new PropertyType("userRoles", com.jrsystems.jrbase.role.RoleImpl.class), 
                    new PropertyType("userClearanceLevels", com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class), 
                    new PropertyType("loginSessions", com.jrsystems.jrbase.loginsession.LoginSessionImpl.class)
                }
            )
        );
    }
    
    private static final void initialize3()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.user.UserLocationImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.user.UserLocationImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.user.UserLocationImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("user", com.jrsystems.jrbase.user.UserImpl.class), 
                    new PropertyType("location", com.jrsystems.jrbase.location.LocationImpl.class)
                }
            )
        );
    }
    
    private static final void initialize4()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.organisation.OrganisationImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.organisation.OrganisationImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.organisation.OrganisationImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("organisation", com.jrsystems.jrbase.organisation.OrganisationImpl.class), 
                    new PropertyType("organisations", com.jrsystems.jrbase.organisation.OrganisationImpl.class), 
                    new PropertyType("organisationType", com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class), 
                    new PropertyType("organisationLocations", com.jrsystems.jrbase.location.LocationImpl.class)
                }
            )
        );
    }
    
    private static final void initialize5()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.organisation.OrganisationTypeImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("organisations", com.jrsystems.jrbase.organisation.OrganisationImpl.class)
                }
            )
        );
    }
    
    private static final void initialize6()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.location.LocationTypeImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.location.LocationTypeImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.location.LocationTypeImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("fallsWithinLocationType", com.jrsystems.jrbase.location.LocationTypeImpl.class), 
                    new PropertyType("locationTypes", com.jrsystems.jrbase.location.LocationTypeImpl.class), 
                    new PropertyType("locations", com.jrsystems.jrbase.location.LocationImpl.class)
                }
            )
        );
    }
    
    private static final void initialize7()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.location.LocationImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.location.LocationImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.location.LocationImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("individual", com.jrsystems.jrbase.individual.IndividualImpl.class), 
                    new PropertyType("individualOwners", com.jrsystems.jrbase.individual.IndividualImpl.class), 
                    new PropertyType("locationOrganisations", com.jrsystems.jrbase.organisation.OrganisationImpl.class), 
                    new PropertyType("locationType", com.jrsystems.jrbase.location.LocationTypeImpl.class), 
                    new PropertyType("fallsWithinArea", com.jrsystems.jrbase.location.LocationImpl.class), 
                    new PropertyType("locations", com.jrsystems.jrbase.location.LocationImpl.class), 
                    new PropertyType("loginSessions", com.jrsystems.jrbase.loginsession.LoginSessionImpl.class)
                }
            )
        );
    }
    
    private static final void initialize8()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.counter.CounterImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.counter.CounterImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.counter.CounterImpl.class,
            null);
    }
    
    private static final void initialize9()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.role.RoleImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.role.RoleImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.role.RoleImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("users", com.jrsystems.jrbase.user.UserImpl.class), 
                    new PropertyType("menus", com.jrsystems.jrbase.workbench.menu.MenuImpl.class), 
                    new PropertyType("programs", com.jrsystems.jrbase.workbench.program.ProgramImpl.class), 
                    new PropertyType("roleClearanceLevels", com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class)
                }
            )
        );
    }
    
    private static final void initialize10()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("clearedUsers", com.jrsystems.jrbase.user.UserImpl.class), 
                    new PropertyType("clearedRoles", com.jrsystems.jrbase.role.RoleImpl.class), 
                    new PropertyType("lowerLevel", com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class), 
                    new PropertyType("upperLevel", com.jrsystems.jrbase.clearancelevel.ClearanceLevelImpl.class)
                }
            )
        );
    }
    
    private static final void initialize11()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.loginsession.LoginSessionImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.loginsession.LoginSessionImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.loginsession.LoginSessionImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("user", com.jrsystems.jrbase.user.UserImpl.class), 
                    new PropertyType("area", com.jrsystems.jrbase.location.LocationImpl.class)
                }
            )
        );
    }
    
    private static final void initialize12()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.workbench.program.ProgramImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.workbench.program.ProgramImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.workbench.program.ProgramImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("menu", com.jrsystems.jrbase.workbench.menu.MenuImpl.class)
                }
            )
        );
    }
    
    private static final void initialize13()
    {
        embeddedValueNamesByType.put(
            com.jrsystems.jrbase.workbench.menu.MenuImpl.class,
            null);
        embeddedValuesByType.put(
            com.jrsystems.jrbase.workbench.menu.MenuImpl.class,
            null);
        navigableAssociationEndsByType.put(
            com.jrsystems.jrbase.workbench.menu.MenuImpl.class,
            java.util.Arrays.asList(
                new PropertyType[] 
                {
                    new PropertyType("programs", com.jrsystems.jrbase.workbench.program.ProgramImpl.class)
                }
            )
        );
    }
    
    /**
     * Attempts to get the embedded value list for the given type (or returns null
     * if one doesn't exist).
     * 
     * @param type the type of which to retrieve the value.
     * @return the collection of embedded value names.
     */
    public static java.util.Collection getEmbeddedValues(final Class type)
    {
        return (java.util.Collection)embeddedValueNamesByType.get(type);
    }
    
    /**
     * Gets the type of the navigable association end given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class getNavigableAssociationEndType(final Class ownerType, final String name)
    {
        return getPropertyType(navigableAssociationEndsByType, ownerType, name);
    }
    
    /**
     * Gets the type of the embedded value given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class getEmbeddedValueType(final Class ownerType, final String name)
    {
        return getPropertyType(embeddedValuesByType, ownerType, name);
    }
    
    /**
     * Gets the type of the embedded value given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class getPropertyType(final java.util.Map properties, final Class ownerType, final String name)
    {
        final java.util.Collection ends = (java.util.Collection)properties.get(ownerType);
        final PropertyType type = (PropertyType)org.apache.commons.collections.CollectionUtils.find(
            ends,
            new org.apache.commons.collections.Predicate()
            {
                public boolean evaluate(final Object object)
                {
                    return ((PropertyType)object).name.equals(name);
                }
            });
        return type != null ? type.type : null;
    }
    
    /**
     * Gets the type of the property given the <code>ownerType</code>
     * and <code>name</code>
     *
     * @param ownerType the owner of the association.
     * @param name the name of the association end to find.
     * @return the type of the association end.
     */
    public static Class getPropertyType(final Class ownerType, final String name)
    {
        Class type = getNavigableAssociationEndType(ownerType, name);
        if (type == null)
        {
            type = getEmbeddedValueType(ownerType, name);
        }
        return type;
    }

    /**
     * A private class storing the name and type.
     */    
    protected static final class PropertyType
    {
        protected PropertyType(final String name, final Class type)
        {
            this.name = name;
            this.type = type;
        }
        protected String name;
        protected Class type;
    }
}