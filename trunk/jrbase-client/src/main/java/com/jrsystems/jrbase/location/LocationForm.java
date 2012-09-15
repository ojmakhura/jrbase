package com.jrsystems.jrbase.location;

import javax.swing.JComponent;

import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.jrsystems.jrbase.common.BaseItemForm;
import com.jrsystems.jrbase.location.vo.LocationVO;

public class LocationForm extends BaseItemForm<LocationVO> {

	public LocationForm(LocationVO item, String formId) {
		super(item, formId);
		// TODO Auto-generated constructor stub 
	}
	
	public LocationForm(){
		super(new LocationVO(), "area");
	}

	@Override
	protected JComponent createFormControl() {
		SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
		TableFormBuilder builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		
		return builder.getForm();
	}
	
	
}
