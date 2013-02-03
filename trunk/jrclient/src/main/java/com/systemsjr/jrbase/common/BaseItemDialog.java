package com.systemsjr.jrbase.common;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.dialog.ApplicationDialog;
import org.springframework.richclient.form.FormGuard;
import org.springframework.richclient.util.CustomizableFocusTraversalPolicy;

import com.jgoodies.forms.layout.CellConstraints;
import com.systemsjr.jrbase.utils.BaseUIUtils;

public abstract class BaseItemDialog<T> extends ApplicationDialog {

	private T item;
	private BaseItemForm<T> itemForm;
	protected CellConstraints cc = new CellConstraints();
	private String dialogId;
	
	public BaseItemDialog(String dialogId){
		this.dialogId = dialogId;
		CustomizableFocusTraversalPolicy.installCustomizableFocusTraversalPolicy();
	}
	
	@Override
	protected JComponent createDialogContentPane() {
		BaseUIUtils.addGuardedCommandsToForm(new ActionCommand[]{
				getFinishCommand()
		}, itemForm, FormGuard.ON_NOERRORS);
		//set border
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(itemForm.getControl(), BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createTitledBorder("Bordered Dialog"));
		return panel;
	}
	
	@Override
	protected void onAboutToShow(){
		if(itemExists()){
			setTitle(getMessage(dialogId+".edit.title"));
		} else {
			
			setTitle(getMessage(dialogId+".new.title"));
		}
		new FormGuard(itemForm.getFormModel(), getFinishCommand(), FormGuard.ON_NOERRORS);
	}
	
	@Override
	protected boolean onFinish() {
		itemForm.commit();
		logger.warn("item is " + itemForm.getFormObject().toString());
		return true;
	}
	public void displayItem(T item){
		setItem(item);
		itemForm.setFormObject(item);
		showDialog();
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(T item) {
		itemForm.setFormObject(item);
	}
	
	/**
	 * @return the item
	 */
	public T getItem() {
		if(!itemForm.hasErrors()){
			itemForm.commit();
		}
		return (T) itemForm.getFormObject();
	}

	/**
	 * @param itemForm the itemForm to set
	 */
	public void setItemForm(BaseItemForm<T> itemForm) {
		this.itemForm = itemForm;
	}
		
	/**
	 * @return the itemForm
	 */
	public BaseItemForm<T> getItemForm() {
		return itemForm;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.richclient.dialog.ApplicationDialog#disposeDialogContentPane()
	 */
	@Override
	protected void disposeDialogContentPane() {		
		super.disposeDialogContentPane();		
	}
	
	/**
	 * 
	 * @return
	 */
	protected abstract boolean itemExists();
}
