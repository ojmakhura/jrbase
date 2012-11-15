// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package com.jrsystems.jrbase.individual;

/**
 * @see com.jrsystems.jrbase.individual.Individual
 */
public interface IndividualDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public final static int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link com.lighthousepmg.plz.domain.messaging.persistence.CommunicationCategory}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param the query results.
     */
    public void toEntities(final java.util.Collection results);

    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes entities must be transformed into objects of type
     * {@link com.jrsystems.jrbase.individual.vo.IndividualVO}.
     */
    public final static int TRANSFORM_INDIVIDUALVO = 1;

    /**
     * Copies the fields of the specified entity to the target value object. This method is similar to
     * toIndividualVO(), but it does not handle any attributes in the target
     * value object that are "read-only" (as those do not have setter methods exposed).
     */
    public void toIndividualVO(
        com.jrsystems.jrbase.individual.Individual source,
        com.jrsystems.jrbase.individual.vo.IndividualVO target);


    /**
     * Converts this DAO's entity to an object of type {@link com.jrsystems.jrbase.individual.vo.IndividualVO}.
     */
    public com.jrsystems.jrbase.individual.vo.IndividualVO toIndividualVO(com.jrsystems.jrbase.individual.Individual entity);

    /**
     * Converts this DAO's entity to a Collection of instances of type {@link com.jrsystems.jrbase.individual.vo.IndividualVO}.
     */
    public void toIndividualVOCollection(java.util.Collection entities);

    /**
     * Converts this DAO's entity to an array of instances of type {@link com.jrsystems.jrbase.individual.vo.IndividualVO}.
     */
    public com.jrsystems.jrbase.individual.vo.IndividualVO[] toIndividualVOArray(java.util.Collection entities);

    /**
     * Copies the fields of {@link com.jrsystems.jrbase.individual.vo.IndividualVO} to the specified entity.
     * @param copyIfNull If FALSE, the value object's field will not be copied to the entity if the value is NULL. If TRUE,
     * it will be copied regardless of its value.
     */
    public void individualVOToEntity(
        com.jrsystems.jrbase.individual.vo.IndividualVO source,
        com.jrsystems.jrbase.individual.Individual target,
        boolean copyIfNull);

    /**
     * Converts an instance of type {@link com.jrsystems.jrbase.individual.vo.IndividualVO} to this DAO's entity.
     */
    public com.jrsystems.jrbase.individual.Individual individualVOToEntity(com.jrsystems.jrbase.individual.vo.IndividualVO individualVO);

    /**
     * Converts a Collection of instances of type {@link com.jrsystems.jrbase.individual.vo.IndividualVO} to this
     * DAO's entity.
     */
    public void individualVOToEntityCollection(java.util.Collection instances);

    /**
     * Loads an instance of com.jrsystems.jrbase.individual.Individual from the persistent store.
     */
    public com.jrsystems.jrbase.individual.Individual load(java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #load(java.lang.Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, java.lang.Long id);

    /**
     * Loads all entities of type {@link com.jrsystems.jrbase.individual.Individual}.
     *
     * @return the loaded entities.
     */
    public java.util.Collection loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of com.jrsystems.jrbase.individual.Individual and adds it to the persistent store.
     */
    public com.jrsystems.jrbase.individual.Individual create(com.jrsystems.jrbase.individual.Individual individual);

    /**
     * <p>
     * Does the same thing as {@link #create(com.jrsystems.jrbase.individual.Individual)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(int transform, com.jrsystems.jrbase.individual.Individual individual);

    /**
     * Creates a new instance of com.jrsystems.jrbase.individual.Individual and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of com.jrsystems.jrbase.individual.Individual
     * instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     * Does the same thing as {@link #create(com.jrsystems.jrbase.individual.Individual)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     * Creates a new <code>com.jrsystems.jrbase.individual.Individual</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     */
    public com.jrsystems.jrbase.individual.Individual create(
        java.lang.String individualId,
        java.lang.String idNumber,
        com.jrsystems.jrbase.individual.Salutation salutation,
        java.lang.String surname,
        java.lang.String firstName,
        java.lang.String middleNames,
        com.jrsystems.jrbase.individual.Gender sex,
        java.lang.String postalAddress,
        java.lang.String physicalAddress,
        java.lang.String email,
        java.util.Date dob);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.String, java.lang.String, com.jrsystems.jrbase.individual.Salutation, java.lang.String, java.lang.String, java.lang.String, com.jrsystems.jrbase.individual.Gender, java.lang.String, java.lang.String, java.lang.String, java.util.Date)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.String individualId,
        java.lang.String idNumber,
        com.jrsystems.jrbase.individual.Salutation salutation,
        java.lang.String surname,
        java.lang.String firstName,
        java.lang.String middleNames,
        com.jrsystems.jrbase.individual.Gender sex,
        java.lang.String postalAddress,
        java.lang.String physicalAddress,
        java.lang.String email,
        java.util.Date dob);

    /**
     * <p>
     * Creates a new <code>com.jrsystems.jrbase.individual.Individual</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     */
    public com.jrsystems.jrbase.individual.Individual create(
        com.jrsystems.jrbase.location.Location countryOfBirth,
        com.jrsystems.jrbase.location.Location countryOfCitizenship,
        java.util.Date dob,
        java.lang.String firstName,
        java.lang.String idNumber,
        java.lang.String individualId,
        java.lang.String physicalAddress,
        java.lang.String postalAddress,
        com.jrsystems.jrbase.individual.Salutation salutation,
        com.jrsystems.jrbase.individual.Gender sex,
        java.lang.String surname);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.String, java.lang.String, com.jrsystems.jrbase.individual.Salutation, java.lang.String, java.lang.String, com.jrsystems.jrbase.individual.Gender, java.lang.String, java.lang.String, java.util.Date)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        com.jrsystems.jrbase.location.Location countryOfBirth,
        com.jrsystems.jrbase.location.Location countryOfCitizenship,
        java.util.Date dob,
        java.lang.String firstName,
        java.lang.String idNumber,
        java.lang.String individualId,
        java.lang.String physicalAddress,
        java.lang.String postalAddress,
        com.jrsystems.jrbase.individual.Salutation salutation,
        com.jrsystems.jrbase.individual.Gender sex,
        java.lang.String surname);

    /**
     * Updates the <code>individual</code> instance in the persistent store.
     */
    public void update(com.jrsystems.jrbase.individual.Individual individual);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of com.jrsystems.jrbase.individual.Individual from the persistent store.
     */
    public void remove(com.jrsystems.jrbase.individual.Individual individual);

    /**
     * Removes the instance of com.jrsystems.jrbase.individual.Individual having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
     * 
     */
    public java.util.List findByCriteria(com.jrsystems.jrbase.individual.vo.IndividualSearchCriteria searchCriteria);


    /**
     * Does the same thing as {@link #search(int, com.jrsystems.jrbase.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param transform the transformation flag.
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link com.jrsystems.jrbase.PaginationResult} instance.
     */
    public com.jrsystems.jrbase.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final com.jrsystems.jrbase.Search search);

    /**
     * Does the same thing as {@link #search(com.jrsystems.jrbase.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link com.jrsystems.jrbase.PaginationResult} instance.
     */
    public com.jrsystems.jrbase.PaginationResult search(final int pageNumber, final int pageSize, final com.jrsystems.jrbase.Search search);

    /**
     * Does the same thing as {@link #search(com.jrsystems.jrbase.Search)} but with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     *
     * @param transform the transformation flag.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final int transform, final com.jrsystems.jrbase.Search search);

    /**
     * Performs a search using the parameters specified in the given <code>search</code> object.
     *
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final com.jrsystems.jrbase.Search search);

    // spring-dao merge-point
}