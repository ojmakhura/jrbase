// license-header java merge-point
// Generated by andromda-jsf cartridge (controllers\ControllerImpl.java.vsl)
package com.systemsjr.jrbase.role.web.details;

import com.systemsjr.jrbase.role.vo.RoleVO;
import java.util.Date;

/**
 * @see com.systemsjr.jrbase.role.web.details.RoleDetailsController
 */
public class RoleDetailsControllerImpl
    extends RoleDetailsController
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 7825942613280010001L;

    /**
     * @see com.systemsjr.jrbase.role.web.details.RoleDetailsController#doInitialiseDetailsScreen(RoleVO roleVO)
     */
    @Override
    public void doInitialiseDetailsScreen(DoInitialiseDetailsScreenForm form)
    {
        // populating value with dummy instance
        RoleVO roleVO = new RoleVO();
        roleVO.setId(new Long((long)3355));
        roleVO.setRole(null);
        roleVO.setRoleDescription(null);
        roleVO.setRoleCode(null);
        roleVO.setRoleClearanceLevels(null);
        roleVO.setUsers(null);
        roleVO.setCreatedBy(null);
        roleVO.setCreatedAt(new Date());
        roleVO.setModifiedBy(null);
        roleVO.setModifiedAt(new Date());
        form.setRoleVO(roleVO);
    }

    /**
     * @see com.systemsjr.jrbase.role.web.details.RoleDetailsController#doRoleEdit(RoleVO roleVO)
     */
    @Override
    public void doRoleEdit(DoRoleEditForm form)
    {
        // populating value with dummy instance
        RoleVO roleVO = new RoleVO();
        roleVO.setId(new Long((long)3355));
        roleVO.setRole(null);
        roleVO.setRoleDescription(null);
        roleVO.setRoleCode(null);
        roleVO.setRoleClearanceLevels(null);
        roleVO.setUsers(null);
        roleVO.setCreatedBy(null);
        roleVO.setCreatedAt(new Date());
        roleVO.setModifiedBy(null);
        roleVO.setModifiedAt(new Date());
        form.setRoleVO(roleVO);
    }

}