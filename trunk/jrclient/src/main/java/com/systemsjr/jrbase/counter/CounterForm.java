package com.systemsjr.jrbase.counter;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.richclient.application.Application;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.common.BaseItemForm;
import com.systemsjr.jrbase.common.BaseItemTable;
import com.systemsjr.jrbase.counter.vo.CounterVO;

public class CounterForm extends BaseItemForm<CounterVO> {

	public CounterForm(CounterVO item, String formId) {
		super(item, formId);
	}
	
	public CounterForm(){
		super(new CounterVO(), "counter");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		sbf = (SwingBindingFactory) getBindingFactory();
		itemList = (BaseItemTable<CounterVO>) Application.instance().getApplicationContext().getBean("counterListTable");
		scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		builder.row();
		builder.add("counterName", "colSpan=1");
		builder.row();
		builder.add("format", "colSpan=1");
		builder.row();
		builder.add("currentCount", "colSpan=1");

		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
		itemPanel.add(scrollPane, BorderLayout.WEST);
		return itemPanel;
	}
	
	

}
