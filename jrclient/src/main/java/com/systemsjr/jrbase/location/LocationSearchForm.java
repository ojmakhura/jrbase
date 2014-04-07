package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

<<<<<<< .mine
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

=======
import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.location.vo.LocationSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

>>>>>>> .r69
public class LocationSearchForm extends BaseItemFilterForm {

	public LocationSearchForm() {
		super("locationSearchForm");
	}

<<<<<<< .mine
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("uniqueCode");
		builder.row();
		builder.add("locationName");
		builder.row();
		builder.add("description");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();

		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		return new LocationSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		LocationSearchCriteria object = (LocationSearchCriteria) getFormObject();
		LocationVO[] locations = BaseServiceUtils.getLocationService().searchLocations(object);	
		JRTableUtils.refreshTable(table, locations);
	}

=======
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		return builder.getForm();
	}
	
	@Override
	protected Object newFormObject() {
		return new LocationSearchCriteria();
	}

>>>>>>> .r69
}
