package com.systemsjr.jrlib.richclient;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.richclient.command.AbstractCommand;
import org.springframework.richclient.form.AbstractForm;
import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

public abstract class BaseItemForm<T> extends AbstractForm implements ApplicationListener {
	
	protected JPanel itemPanel;
	protected SwingBindingFactory sbf;
	protected TableFormBuilder builder;
	protected BaseItemDetail<T> details;
	protected T item;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	public BaseItemForm(T item, String formId){
		super(FormModelHelper.createFormModel(item), formId);
		this.item = item;	
		sbf = new SwingBindingFactory(getFormModel());
		builder = new TableFormBuilder(sbf);
		itemPanel = new JPanel(new BorderLayout());
		details = null;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
	}

	public JPanel getItemPanel() {
		return itemPanel;
	}

	public void setItemPanel(JPanel itemPanel) {
		this.itemPanel = itemPanel;
	}
	
	
	public BaseItemDetail getDetails() {
		return details;
	}

	public void setDetails(BaseItemDetail details) {
		this.details = details;
	}

	public SwingBindingFactory getSbf() {
		
		return sbf;
	}

	public void setSbf(SwingBindingFactory sbf) {
		this.sbf = sbf;
	}

	public List<AbstractCommand> getFormCommands() {
		return null;
	}
	
	/***
	 * This method just sets the proper variabled to their respective values.
	 * @param levelDetails 
	 * @param tableBean: Passed to the method to allow for each form to determine which list is loaded into the table
	 */
	@SuppressWarnings("unchecked")
	protected void initForm(BaseItemDetail details){
		this.details = details;
		doInitForm();
	}

	@Override
	public T getFormObject() {
		return (T) super.getFormObject();
	}
	
	/***
	 * This method gets called at the end of the overriden method createControl.
	 * It just adds the builder and scrollpane to their respective location on the itempanel
	 */
	protected void endFormCreate(String separatorName){
		builder.row();
		if(details != null){
			builder.addSeparator(separatorName);
			builder.row();
			builder.getLayoutBuilder().cell(details.getControl());
		}
		itemPanel.add(builder.getForm(), BorderLayout.CENTER);
	}

	public void initForm() {
		
		doInitForm();		
	}
	
	private void doInitForm(){
		sbf = (SwingBindingFactory) getBindingFactory();	
		
		builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		builder.row();
	}
	
}
