package com.systemsjr.jrbase.user;

import javax.swing.JComponent;

import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

<<<<<<< .mine
public class UserDetails extends BaseItemDetail<UserDetailsVO>{
	
	private UserRolesForm userRolesForm;
	private UserClearenceForm userClearenceForm;
	private UserLocationForm userLocationForm;
	
	public UserDetails(){
		this(BaseServiceUtils.createDefaultUser(), "userDetails");
	}
=======
import com.systemsjr.jrbase.user.vo.UserDetailsVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;
>>>>>>> .r69

<<<<<<< .mine
	public UserDetails(UserDetailsVO item, String formId) {
=======
public class UserDetails extends BaseItemDetail<UserDetailsVO>{

	public UserDetails(UserDetailsVO item, String formId) {
>>>>>>> .r69
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
<<<<<<< .mine
	
		return new Tab[]{
				new Tab("User Roles", getRolesTab())
				, new Tab("User Clearence", getClearenceTab())
				//, new Tab("user Location", getLocationTab())
		};
=======
		ArrayList<Tab> tabs = new ArrayList<TabbedForm.Tab>();
		
		return tabs.toArray(new Tab[0]);
>>>>>>> .r69
	}

<<<<<<< .mine
	@Override
	public UserDetailsVO handleGetNewItem() {
		return null;
	}
	
	public JComponent getLocationTab(){
		JRTableUtils.refreshTable(userLocationForm.getListTable(), BaseServiceUtils.getLocationService().searchLocations(null));
		return userLocationForm.getControl();
	}
	
	public JComponent getClearenceTab(){
		JRTableUtils.refreshTable(userClearenceForm.getListTable(), BaseServiceUtils.getClearanceService().searchClearenceLevel(null));
		userClearenceForm.getControl().repaint();
		return userClearenceForm.getControl();
	}
	
	public JComponent getRolesTab(){
		JRTableUtils.refreshTable(userRolesForm.getListTable(), BaseServiceUtils.getRoleService().searchRoles(null));
		userRolesForm.getControl().repaint();
		return userRolesForm.getControl();
	}

	public UserRolesForm getUserRolesForm() {
		return userRolesForm;
	}

	public void setUserRolesForm(UserRolesForm userRolesForm) {
		this.userRolesForm = userRolesForm;
	}

	public UserClearenceForm getUserClearenceForm() {
		return userClearenceForm;
	}

	public void setUserClearenceForm(UserClearenceForm userClearenceForm) {
		this.userClearenceForm = userClearenceForm;
	}

	public UserLocationForm getUserLocationForm() {
		return userLocationForm;
	}

	public void setUserLocationForm(UserLocationForm userLocationForm) {
		this.userLocationForm = userLocationForm;
	}
=======
	@Override
	public UserDetailsVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> .r69
}
