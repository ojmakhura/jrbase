package com.systemsjr.jrbase.location;

import javax.swing.JComponent;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelVO;
import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.location.vo.LocationTypeVO;

public class LocationTypeForm extends BaseItemForm<LocationTypeVO> {

	public LocationTypeForm(LocationTypeVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub
	}
	
	public LocationTypeForm(){
		super(new LocationTypeVO(), "areaType");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		itemList = (BaseItemTable<LocationTypeVO>) Application.instance().getApplicationContext().getBean("locationTypeTable");
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder.setLabelAttributes("colSpec=right:pref");
		
		return builder.getForm();
	}
}
