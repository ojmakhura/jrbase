package com.systemsjr.jrlib.utils;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.springframework.richclient.command.ActionCommand;
import org.springframework.richclient.core.DefaultMessage;
import org.springframework.richclient.core.Severity;
import org.springframework.richclient.dialog.MessageDialog;
import org.springframework.richclient.form.AbstractForm;
import org.springframework.richclient.form.FormGuard;

public class JRLibUIUtils {
	/**
	 * 
	 * @param filter
	 * @return
	 */
	public static File showOpenSaveFileDialog(FileFilter filter) {
		JFileChooser fc = new JFileChooser();
		// fc.setFileFilter(new CsvFileFilter());
		int ret = fc.showOpenDialog(null);
		if (ret == JFileChooser.APPROVE_OPTION) {
			return fc.getSelectedFile();
		}
		return null;
	}

	/**
	 * Add the specified guards to the form
	 * 
	 * @param commands
	 * @param form
	 * @param guard
	 */
	public static void addGuardedCommandsToForm(ActionCommand[] commands,
			AbstractForm form, int guard) {
		for (ActionCommand command : commands) {
			new FormGuard(form.getFormModel(), command, guard);
		}
	}
	
	/**
     * 
     */
	public static void showMessage(String title, String message,
			Severity severity) {

		new MessageDialog(title, new DefaultMessage(message, severity))
				.showDialog();
	}
}
