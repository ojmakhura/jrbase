package com.jrsystems.jrbase.location;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.location.vo.LocationTypeVO;

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
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		return builder.getForm();
	}
}
