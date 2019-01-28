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

import org.springframework.stereotype.Service;

import com.systemsjr.jrbase.workbench.application.Application;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationSearchCriteria;
import com.systemsjr.jrbase.workbench.application.vo.ApplicationVO;

/**
 * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService
 */
@Service("com.systemsjr.jrbase.workbench.application.service.ApplicationService")
public class ApplicationServiceImpl
    extends ApplicationServiceBase
{
	/**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#loadAllApplications()
     */
    protected  Collection<ApplicationVO> handleLoadAllApplications()
        throws Exception
    {
    	
    	return getApplicationDao().toApplicationVOCollection(getApplicationDao().loadAll());
    }

    /**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#saveApplication(ApplicationVO)
     */
    protected  ApplicationVO handleSaveApplication(ApplicationVO applicationVO)
        throws Exception
    {
    	Application application = getApplicationDao().applicationVOToEntity(applicationVO);
    	application = getApplicationDao().createOrUpdate(application);
    	
    	return getApplicationDao().toApplicationVO(application);
    }

    /**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#removeApplication(ApplicationVO)
     */
    protected  void handleRemoveApplication(ApplicationVO applicationVO)
        throws Exception
    {
    	if(applicationVO != null && applicationVO.getId() != null) {
    		getApplicationDao().remove(applicationVO.getId());
    	}
    }

    /**
     * @see com.systemsjr.jrbase.workbench.application.service.ApplicationService#searchApplication(ApplicationSearchCriteria)
     */
    protected  Collection<ApplicationVO> handleSearchApplication(ApplicationSearchCriteria searchCriteria)
        throws Exception
    {
    	return getApplicationDao().toApplicationVOCollection(getApplicationDao().findByCriteria(searchCriteria));
    }

	@Override
	protected ApplicationVO handleFindById(Long id) throws Exception {
		return id == null ? null : getApplicationDao().toApplicationVO(getApplicationDao().load(id));
	}
}