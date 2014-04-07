package com.systemsjr.jrbase.individual;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

<<<<<<< .mine
=======
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

>>>>>>> .r69
import com.systemsjr.jrbase.individual.vo.IndividualVO;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrbase.utils.BaseServiceUtils;
import com.systemsjr.jrlib.richclient.BaseItemDetail;
import com.systemsjr.jrlib.richclient.BaseTabbedForm;
import com.systemsjr.jrlib.richclient.table.JRTableUtils;

public class IndividualDetails extends BaseItemDetail<IndividualVO> {
	private NextOfKinTable nextOfKin;
	public IndividualDetails(IndividualVO item, String formId) {
		super(item, formId);
	}

	@Override
	protected Tab[] getTabs() {
		ArrayList<Tab> tabs = new ArrayList<Tab>();
		tabs.add(new Tab("Next Of Kin", createNextOfKinTab()));
		return tabs.toArray(new Tab[0]);
	}
	
	protected JComponent createNextOfKinTab(){
<<<<<<< .mine
		//JRTableUtils.refreshTable(nextOfKin, BaseServiceUtils.getIndividualService().se)
		return new JPanel();
=======
		//JRTableUtils.refreshTable(nextOfKin, BaseServiceUtils.getIndividualService().se)
		return super.createTabComponent(nextOfKin, "Next Of Kin");
>>>>>>> .r69
	}

<<<<<<< .mine
	@Override
	public IndividualVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}
=======
	@Override
	public IndividualVO handleGetNewItem() {
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> .r69
}
