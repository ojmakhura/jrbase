package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

<<<<<<< .mine
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
=======
import org.springframework.binding.value.support.RefreshableValueHolder;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
>>>>>>> .r69
import com.systemsjr.jrbase.utils.BaseUIUtils;
import com.systemsjr.jrlib.richclient.BaseItemForm;

<<<<<<< .mine
public class UserForm extends BaseItemForm<UserDetailsVO> {
=======
public class UserForm extends BaseItemForm<UserDetailsVO> {
	RefreshableValueHolder individualHolder;
>>>>>>> .r69
	/**
	 * @wbp.parser.entryPoint
	 */
	public UserForm() {
<<<<<<< .mine
		super(new UserDetailsVO(), "userForm");
		
=======
		super(new UserDetailsVO(), "userForm");
>>>>>>> .r69
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected JComponent createFormControl() {
<<<<<<< .mine
		super.initForm();
=======
		super.initForm();
		individualHolder = BaseUIUtils.getIndividualValueHolder();
>>>>>>> .r69
		
<<<<<<< .mine
		builder.add(sbf.createBoundComboBox("status", UserStatus.literals()), colSpec + " " + colSpan);
=======
		builder.add(sbf.createBoundComboBox("status", UserStatus.literals()), "colSpan=1");
>>>>>>> .r69
		builder.row();
		builder.add(sbf.createBinding("individual", BaseUIUtils.getIndividualContext()));
		builder.row();
<<<<<<< .mine
		builder.add("username", colSpec);
		builder.add("name", colSpec);
=======
		builder.add(sbf.createBinding("individual", BaseUIUtils.getIndividualContext()), "colSpan=1");
		//builder.add(sbf.createBoundComboBox("individual", individualHolder, "idNumber"), "colSpan=1");
		builder.add("name", "colSpec=40dlu:grow");
>>>>>>> .r69
		builder.row();
		builder.addPasswordField("password1", colSpec);
		builder.addPasswordField("password2", colSpec);
		builder.row();
		//builder.add("photo", "colSpan=1");
		
		return super.endFormCreate("User Details");
	}
}
