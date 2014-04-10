package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.location.vo.LocationTypeSearchCriteria;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;


public class LocationTypeSearchForm extends BaseItemFilterForm {

	public LocationTypeSearchForm() {
		super("locationSearchForm");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");

		builder.row();
		builder.add("levelCode");
		builder.row();
		builder.add("name");
		builder.row();
		builder.add("description");
		builder.row();
		builder.getLayoutBuilder().cell(getCommands());
		builder.row();

		return builder.getForm();
	}

	@Override
	protected Object newFormObject() {
		return new LocationTypeSearchCriteria();
	}
	
	@Override
	protected void doSearch() {
		commit();
		LocationTypeSearchCriteria object = (LocationTypeSearchCriteria) getFormObject();
		LocationTypeVO[] locationTypes = BaseServiceUtils.getLocationService().searchLocationTypes(object);

		JRTableUtils.refreshTable(table, locationTypes);
	}
}
