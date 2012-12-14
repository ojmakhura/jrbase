package com.systemsjr.jrbase.common;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import org.springframework.binding.value.ValueModel;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.richclient.command.AbstractCommand;
import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.support.GlobalCommandIds;
import org.springframework.richclient.form.AbstractForm;
import org.springframework.richclient.form.FormModelHelper;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;
import org.springframework.richclient.list.ListSelectionValueModelAdapter;
import org.springframework.richclient.list.ListSingleSelectionGuard;

public class BaseItemForm<T> extends AbstractForm implements ApplicationListener {
	
	protected JSplitPane baseSplitPane;
	protected AbstractCommand saveCommand;
	protected AbstractCommand addCommand;
	protected AbstractCommand deleteCommand;
	protected AbstractCommand detailsCommand;
	protected BaseItemTable<T> itemList;
	protected JPanel itemPanel;
	protected SwingBindingFactory sbf;
	protected JScrollPane scrollPane;
	protected TableFormBuilder builder;
	
	public SwingBindingFactory getSbf() {
		return sbf;
	}

	public void setSbf(SwingBindingFactory sbf) {
		this.sbf = sbf;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public List<AbstractCommand> getFormCommands() {
		return null;
	}
	
	public BaseItemForm(T item, String formId){
		super(FormModelHelper.createFormModel(item), formId);
		sbf = (SwingBindingFactory) getBindingFactory();
		//scrollPane = getComponentFactory().createScrollPane(itemList.getControl());
		builder = new TableFormBuilder(sbf);
		itemPanel = new JPanel(new BorderLayout());
	}
	@Override
	protected JComponent createFormControl() {
		itemPanel = new JPanel(new BorderLayout());
		itemPanel.add(itemList.getControl(), BorderLayout.WEST);
		return itemPanel;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
	}

	protected JSplitPane getBaseSplitPane() {
		return baseSplitPane;
	}

	protected void setBaseSplitPane(JSplitPane baseSplitPane) {
		this.baseSplitPane = baseSplitPane;
	}

	protected AbstractCommand getSaveCommand() {
		return saveCommand;
	}

	protected void setSaveCommand(AbstractCommand saveCommand) {
		this.saveCommand = saveCommand;
	}

	protected AbstractCommand getAddCommand() {
		return addCommand;
	}

	protected void setAddCommand(AbstractCommand addCommand) {
		this.addCommand = addCommand;
	}

	protected AbstractCommand getDeleteCommand() {
		return deleteCommand;
	}

	protected void setDeleteCommand(AbstractCommand deleteCommand) {
		this.deleteCommand = deleteCommand;
	}

	protected AbstractCommand getDetailsCommand() {
		return detailsCommand;
	}

	protected void setDetailsCommand(AbstractCommand detailsCommand) {
		this.detailsCommand = detailsCommand;
	}

	public BaseItemTable<T> getItemList() {
		return itemList;
	}

	public void setItemList(BaseItemTable<T> itemList) {
		this.itemList = itemList;
	}

	public JPanel getItemPanel() {
		return itemPanel;
	}

	public void setItemPanel(JPanel itemPanel) {
		this.itemPanel = itemPanel;
	}	
	
}
