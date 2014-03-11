package com.systemsjr.jrbase.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.richclient.selection.binding.ListSelectionDialogBinder;
import org.springframework.richclient.selection.binding.support.LabelProvider;
import org.springframework.rules.closure.Closure;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.counter.vo.CounterVO;
import com.systemsjr.jrbase.individual.Salutation;
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.organisation.vo.OrganisationTypeVO;
import com.systemsjr.jrbase.organisation.vo.OrganisationVO;
import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrbase.user.vo.UserVO;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;
import com.systemsjr.jrbase.workbench.menu.vo.MenuVO;
import com.systemsjr.jrbase.workbench.program.vo.ProgramVO;

//import edu.emory.mathcs.backport.java.util.Arrays;

public class BaseUIUtils {

	public static RefreshableValueHolder getAllSalutations() {

		return new RefreshableValueHolder(new Closure() {

			@Override
			public Object call(Object arg0) {
				List<String> salutations;
				// salutations = Salutation.values();
				return Salutation.literals();
			}
		});
	}

	private static RefreshableValueHolder clearanceLevelValueHolder;

	public static RefreshableValueHolder getClearanceLevelValueHolder() {
		if (clearanceLevelValueHolder == null) {
			clearanceLevelValueHolder = new RefreshableValueHolder(
					new Closure() {
						@Override
						public Object call(Object object) {
							return Arrays.asList(DataSourceAccessUtils
									.getAllClearanceLevels());
						}

					}, false, false);
		}

		return clearanceLevelValueHolder;
	}

	private static Map<String, Object> clearenceContext;

	public static Map<String, Object> getClearenceContext() {

		if (clearenceContext == null) {
			clearenceContext = new HashMap<String, Object>();
			clearenceContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getClearanceLevelValueHolder());
			clearenceContext
					.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
							new org.springframework.richclient.selection.binding.support.LabelProvider() {

								@Override
								public String getLabel(Object item) {
									ClearanceLevelVO level = (ClearanceLevelVO) item;
									return level == null ? "" : level
											.getLevelCode();
								}
							});

			clearenceContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			clearenceContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "levelCode" });
			clearenceContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"levels.title");
		}
		return clearenceContext;
	}

	private static RefreshableValueHolder individualValueHolder;

	public static RefreshableValueHolder getIndividualValueHolder() {
		if (individualValueHolder == null) {
			individualValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(DataSourceAccessUtils
							.getAllIndividuals());
				}

			}, false, false);
		}
		return individualValueHolder;
	}

	private static Map<String, Object> individualContext;

	public static Map<String, Object> getIndividualContext() {
		if (individualContext == null) {
			individualContext = new HashMap<String, Object>();
			individualContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getIndividualValueHolder());
			individualContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							IndividualVO individual = (IndividualVO) item;
							return individual == null ? "" : individual
									.getIdNumber()
									+ " "
									+ individual.getSurname()
									+ ", "
									+ individual.getFirstName();
						}
					});

			individualContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			individualContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "idNumber" });
			individualContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"individuals.title");
		}
		return individualContext;
	}

	private static RefreshableValueHolder counterValueHolder;

	public static RefreshableValueHolder getCounterValueHolder() {
		if (counterValueHolder == null) {
			counterValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(DataSourceAccessUtils.getAllCounters());
				}

			}, false, false);
		}
		return counterValueHolder;
	}

	private static Map<String, Object> counterContext;

	public static Map<String, Object> getCounterContext() {
		if (counterContext == null) {
			counterContext = new HashMap<String, Object>();
			counterContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getCounterValueHolder());
			counterContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							CounterVO counter = (CounterVO) item;
							return counter == null ? "" : counter
									.getCounterName();
						}
					});

			counterContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			counterContext.put(ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "counterName" });
			counterContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"counters.title");
		}
		return counterContext;
	}

	private static RefreshableValueHolder locationTypeValueHolder;

	public static RefreshableValueHolder getLocationTypeValueHolder() {
		if (locationTypeValueHolder == null) {
			locationTypeValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getLocationService()
							.getAllLocationTypes());
				}

			}, false, false);
		}

		return locationTypeValueHolder;
	}

	private static Map<String, Object> locationTypeContext;

	public static Map<String, Object> getLocationTypeContext() {
		if (locationTypeContext == null) {
			locationTypeContext = new HashMap<String, Object>();
			locationTypeContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getLocationTypeValueHolder());
			locationTypeContext.put(
					ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							LocationTypeVO type = (LocationTypeVO) item;
							return type == null ? "" : type.getLevelCode()
									+ " " + type.getName();
						}
					});

			locationTypeContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			locationTypeContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "levelCode" });
			locationTypeContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"locationTypes.title");
		}
		return locationTypeContext;
	}

	private static RefreshableValueHolder locationValueHolder;

	public static RefreshableValueHolder getLocationValueHolder() {
		if (locationValueHolder == null) {
			locationValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getLocationService()
							.getAllLocations());
				}

			}, false, false);
		}
		return locationValueHolder;
	}

	private static Map<String, Object> locationContext;

	public static Map<String, Object> getLocationContext() {
		if (locationContext == null) {
			locationContext = new HashMap<String, Object>();
			locationContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getLocationValueHolder());
			locationContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							LocationVO location = (LocationVO) item;
							return location == null ? "" : location
									.getLevelCode()
									+ " "
									+ location.getLocationName();
						}
					});

			locationContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			locationContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "levelCode" });
			locationContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"locations.title");
		}
		return locationContext;
	}

	private static RefreshableValueHolder organisationTypeValueHolder;

	public static RefreshableValueHolder getOrganisationTypeValueHolder() {
		if (organisationTypeValueHolder == null) {
			organisationTypeValueHolder = new RefreshableValueHolder(
					new Closure() {
						@Override
						public Object call(Object object) {
							return Arrays.asList(BaseServiceUtils
									.getOrgService().getAllOrganisationTypes());
						}

					}, false, false);
		}
		return organisationTypeValueHolder;
	}

	private static Map<String, Object> organisationTypeContext;

	public static Map<String, Object> getOrganisationTypeContext() {
		if (organisationTypeContext == null) {
			organisationTypeContext = new HashMap<String, Object>();
			organisationTypeContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getOrganisationTypeValueHolder());
			organisationTypeContext.put(
					ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							OrganisationTypeVO type = (OrganisationTypeVO) item;
							return type == null ? "" : type.getLevelCode()
									+ " " + type.getName();
						}
					});

			organisationTypeContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			organisationTypeContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "levelCode" });
			organisationTypeContext.put(
					ListSelectionDialogBinder.TITLE_KEY_KEY,
					"organisationTypes.title");
		}
		return organisationTypeContext;
	}

	private static RefreshableValueHolder organisationValueHolder;

	public static RefreshableValueHolder getOrganisationValueHolder() {
		if (organisationValueHolder == null) {
			organisationValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getOrgService()
							.getAllOrganisations());
				}

			}, false, false);
		}
		return organisationValueHolder;
	}

	private static Map<String, Object> organisationContext;

	public static Map<String, Object> getOrganisationContext() {
		if (organisationContext == null) {
			organisationContext = new HashMap<String, Object>();
			organisationContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getOrganisationValueHolder());
			organisationContext.put(
					ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							OrganisationVO organisation = (OrganisationVO) item;
							return organisation == null ? "" : organisation
									.getName();
						}
					});

			organisationContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			organisationContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "name" });
			organisationContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"organisations.title");
		}
		return organisationContext;
	}

	private static RefreshableValueHolder roleValueHolder;

	public static RefreshableValueHolder getRoleValueHolder() {
		if (roleValueHolder == null) {
			roleValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					RoleVO[] roles = BaseServiceUtils.getRoleService()
							.getAllRoles();
					if (roles == null) {
						roles = new RoleVO[] {};
					}
					return Arrays.asList(roles);
				}

			}, false, false);
		}
		return roleValueHolder;
	}

	private static Map<String, Object> roleContext;

	public static Map<String, Object> getRoleContext() {
		if (roleContext == null) {
			roleContext = new HashMap<String, Object>();
			roleContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getRoleValueHolder());
			roleContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							RoleVO role = (RoleVO) item;
							return role == null ? "" : role.getRole();
						}
					});

			roleContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			roleContext.put(ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "role" });
			roleContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"roles.title");
		}
		return roleContext;
	}

	private static RefreshableValueHolder userValueHolder;

	public static RefreshableValueHolder getUserValueHolder() {
		if (userValueHolder == null) {
			userValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getUserService()
							.getAllUsers());
				}

			}, false, false);
		}

		return userValueHolder;
	}

	private static Map<String, Object> userContext;

	public static Map<String, Object> getUserContext() {
		if (userContext == null) {
			userContext = new HashMap<String, Object>();
			userContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getUserValueHolder());
			userContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							UserVO user = (UserVO) item;
							return user == null ? "" : user.getUsername() + " "
									+ user.getName();
						}
					});

			userContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			userContext.put(ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "username", "name" });
			userContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"users.title");
		}
		return userContext;
	}

	private static RefreshableValueHolder countryValueHolder;

	public static RefreshableValueHolder getCountryValueHolder() {
		if (countryValueHolder == null) {
			countryValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getLocationService()
							.getAllCountries());
				}

			}, false, false);
		}
		return countryValueHolder;
	}

	private static Map<String, Object> countryContext;

	public static Map<String, Object> getCountriesContext() {
		if (countryContext == null) {
			countryContext = new HashMap<String, Object>();
			countryContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getCountryValueHolder());
			countryContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							LocationVO country = (LocationVO) item;
							return country == null ? "" : country
									.getLocationName();
						}
					});

			countryContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			countryContext.put(ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "locationName" });
			countryContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"countries.title");
		}
		return countryContext;
	}

	private static RefreshableValueHolder menuValueHolder;

	public static RefreshableValueHolder getMenuValueHolder() {
		if (menuValueHolder == null) {
			menuValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getMenuService()
							.getAllMenus());
				}

			}, false, false);
		}

		return menuValueHolder;
	}

	private static Map<String, Object> menuContext;

	public static Map<String, Object> getMenuContext() {
		if (menuContext == null) {
			menuContext = new HashMap<String, Object>();
			menuContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getMenuValueHolder());
			menuContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							MenuVO menu = (MenuVO) item;
							return menu == null ? "" : menu.getMenuName();
						}
					});

			menuContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			menuContext.put(ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "menuCode", "menuName" });
			menuContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"menus.title");
		}
		return menuContext;
	}

	private static RefreshableValueHolder programValueHolder;

	public static RefreshableValueHolder getProgramValueHolder() {
		if (programValueHolder == null) {
			programValueHolder = new RefreshableValueHolder(new Closure() {
				@Override
				public Object call(Object object) {
					return Arrays.asList(BaseServiceUtils.getProgramService()
							.getAllPrograms());
				}

			}, false, false);
		}
		return programValueHolder;
	}

	private static Map<String, Object> programContext;

	public static Map<String, Object> getProgramContext() {
		if (programContext == null) {
			programContext = new HashMap<String, Object>();
			programContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getProgramValueHolder());
			programContext.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							ProgramVO program = (ProgramVO) item;
							return program == null ? "" : program
									.getProgramName();
						}
					});

			programContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			programContext.put(ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "programId", "programName" });
			programContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"programs.title");
		}
		return programContext;
	}

	private static RefreshableValueHolder applicationValueHolder;

	public static RefreshableValueHolder getApplicationValueHolder() {
		if (applicationValueHolder == null) {
			applicationValueHolder = new RefreshableValueHolder(new Closure() {

				@Override
				public Object call(Object arg0) {

					return Arrays.asList(BaseServiceUtils
							.getApplicationService().loadAllApplications());
				}
			});
		}
		return applicationValueHolder;
	}

	private static Map<String, Object> applicationContext;

	public static Map<String, Object> getApplicationContext() {
		if (applicationContext == null) {
			applicationContext = new HashMap<String, Object>();
			applicationContext.put(
					ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY,
					getApplicationValueHolder());
			applicationContext.put(
					ListSelectionDialogBinder.LABEL_PROVIDER_KEY,
					new LabelProvider() {

						@Override
						public String getLabel(Object item) {
							ApplicationVO application = (ApplicationVO) item;
							return application == null ? "" : application
									.getName();
						}
					});

			applicationContext.put(ListSelectionDialogBinder.FILTERED_KEY,
					Boolean.TRUE);
			applicationContext.put(
					ListSelectionDialogBinder.FILTER_PROPERTIES_KEY,
					new String[] { "code", "name" });
			applicationContext.put(ListSelectionDialogBinder.TITLE_KEY_KEY,
					"applications.title");
		}
		return applicationContext;
	}
}
