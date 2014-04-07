package com.systemsjr.jrbase.role;

import javax.swing.JComponent;

import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.role.vo.RoleVO;
import com.systemsjr.jrlib.richclient.BaseItemForm;

public class RoleForm extends BaseItemForm<RoleVO> {

	public RoleForm(RoleVO item, String formId) {
		super(item, formId);
	}

	public RoleForm(){
		super(new RoleVO(), "roleForm");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected JComponent createFormControl() {
		super.initForm();
		
		builder = new TableFormBuilder(sbf);
		builder.setLabelAttributes("colSpec=right:pref");
		builder.row();
		builder.add("roleCode", colSpec);
		builder.add("role", colSpec);
		builder.row();
		builder.addTextArea("roleDescription", colSpec);
		
		return super.endFormCreate("");
	}
}
