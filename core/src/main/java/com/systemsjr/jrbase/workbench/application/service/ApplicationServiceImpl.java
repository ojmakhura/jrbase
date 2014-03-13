// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: AndroMDAModel::jrbase::com.systemsjr.jrbase.workbench::application::service::ApplicationService
 * STEREOTYPE:  Service
 */
package com.systemsjr.jrbase.workbench.application.service;

import java.util.Collection;

import com.systemsjr.jrbase.workbench.application.Application;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationSearchCriteria;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;

/**
 * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService
 */
public class ApplicationServiceImpl
    extends ApplicationServiceBase
{

    /**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#loadAllApplications()
     */
    protected  ApplicationVO[] handleLoadAllApplications()
        throws Exception
    {
    	Collection apps = getApplicationDao().loadAll();
    	return getApplicationDao().toApplicationVOArray(apps);
    }

    /**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#saveApplication(ApplicationVO)
     */
    protected  ApplicationVO handleSaveApplication(ApplicationVO applicationVO)
        throws Exception
    {
        Application app;
        
        if(applicationVO.getId() == null){
        	app = getApplicationDao().create(getApplicationDao().applicationVOToEntity(applicationVO));
        } else{
        	getApplicationDao().update(getApplicationDao().applicationVOToEntity(applicationVO));
        	return applicationVO;
        }
        
        return getApplicationDao().toApplicationVO(app);
    }

    /**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#removeApplication(ApplicationVO)
     */
    protected  void handleRemoveApplication(ApplicationVO applicationVO)
        throws Exception
    {
    	if(applicationVO.getId() != null){
    		getApplicationDao().remove(applicationVO.getId());
    	}
    }

	@Override
	protected ApplicationVO[] handleSearchApplication(
			ApplicationSearchCriteria searchCriteria) throws Exception {
		
		if(searchCriteria == null){
			return new ApplicationVO[]{};
		}
		
		return getApplicationDao().toApplicationVOArray(getApplicationDao().findByCriteria(searchCriteria));
	}

}