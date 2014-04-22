package com.systemsjr.jrbase.clearancelevel;

import java.awt.BorderLayout;

import javax.swing.JComponent;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.command.CommandGroup;

import com.jgoodies.forms.debug.FormDebugPanel;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseDetailForm;

public class ClearedUsersForm extends BaseDetailForm {


	public ClearedUsersForm() {
		super(BaseServiceUtils.createDefaultUser(), "clearedUserForm", new ClearedUsersDialog());
	}

	@Override
	protected JComponent createFormControl() {
		/*panel = new FormDebugPanel();
		panel.setLayout(new BorderLayout());
		CommandGroup detailGroup = CommandGroup.createCommandGroup(
				new ActionCommand[]{
						getAddCommand(),
						getRemoveCommand()
				}
		);
		scrollPane.add(listTable.getControl());
		panel.add(detailGroup.createButtonBar(), BorderLayout.NORTH);
		panel.add(scrollPane, BorderLayout.CENTER);*/
		return null;
	}
}
