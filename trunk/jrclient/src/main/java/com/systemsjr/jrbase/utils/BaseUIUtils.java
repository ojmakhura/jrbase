package com.systemsjr.jrbase.utils;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.springframework.binding.value.support.RefreshableValueHolder;
import org.springframework.binding.value.support.ValueHolder;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.core.DefaultMessage;
import org.springframework.richclient.dialog.MessageDialog;
import org.springframework.richclient.form.AbstractForm;
import org.springframework.richclient.form.FormGuard;
import org.springframework.richclient.selection.binding.ListSelectionDialogBinder;
import org.springframework.rules.closure.Closure;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;

//import edu.emory.mathcs.backport.java.util.Arrays;

public class BaseUIUtils {

	public static RefreshableValueHolder getAllSalutations(){
			
		return new RefreshableValueHolder(new Closure() {
					
			@Override
			public Object call(Object arg0) {
				List<String> salutations;				
				//salutations = Salutation.values();
				return null;
			}
		});
	}
	
	/**
	 * 
	 * @param filter
	 * @return
	 */
	public static File showOpenSaveFileDialog(FileFilter filter){
		JFileChooser fc = new JFileChooser();
		//fc.setFileFilter(new CsvFileFilter());		
		int ret = fc.showOpenDialog(null);
		if(ret == JFileChooser.APPROVE_OPTION){ 
			return fc.getSelectedFile();
		}
		return null;
	}
	
	/**
	 * Add the specified guards to the form 
	 * @param commands
	 * @param form
	 * @param guard
	 */
	public static void addGuardedCommandsToForm(ActionCommand[] commands, AbstractForm form, int guard){
		for(ActionCommand command : commands){			
			new FormGuard(form.getFormModel(), command,	guard);
		}
	}
	
	public static Map<String, Object> createClearanceLevelContext(){
		Map<String, Object> context = new HashMap<String, Object>();
		context.put(ListSelectionDialogBinder.SELECTABLE_ITEMS_HOLDER_KEY, 
				new ValueHolder(Arrays.asList(DataSourceAccessUtils.getAllClearanceLevels()))
		);
		context.put(ListSelectionDialogBinder.LABEL_PROVIDER_KEY, new org.springframework.richclient.selection.binding.support.LabelProvider() {
			
			@Override
			public String getLabel(Object item) {
				ClearanceLevelVO level = (ClearanceLevelVO) item;
				return level == null ? "" : level.getLevelCode()+"\\"+level.getLevelDescription();
			}
		});
		return context;
	}
	
	public static RefreshableValueHolder getClearanceLevelValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return DataSourceAccessUtils.getAllClearanceLevels();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getIndividualValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return DataSourceAccessUtils.getAllIndividuals();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getCounterValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return DataSourceAccessUtils.getAllCounters();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getLocationTypeValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getLocationService().getAllLocationTypes();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getLocationValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getLocationService().getAllLocations();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getOrganisationTypeValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getOrgService().getAllOrganisationTypes();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getOrganisationValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getOrgService().getAllOrganisations();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getRoleValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getRoleService().getAllRoles();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getUserValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getUserService().getAllUsers();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getCountriesValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getLocationService().getAllCountries();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getMenusValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getMenuService().getAllMenus();
			}

		}, false, false);
	}
	
	public static RefreshableValueHolder getProgramsValueHolder(){
		return new RefreshableValueHolder(new Closure() {
			@Override
			public Object call(Object object) {
				return BaseServiceUtils.getProgramService().getAllPrograms();
			}

		}, false, false);
	}
	
	/**
     * 
     */
    public static void showMessage(String title, String message,
	    org.springframework.richclient.core.Severity severity) {
	new MessageDialog(title, new DefaultMessage(message, severity))
	.showDialog();
    }
}
