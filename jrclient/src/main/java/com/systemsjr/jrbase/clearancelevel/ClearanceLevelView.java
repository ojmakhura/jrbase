package com.systemsjr.jrbase.clearancelevel;

import com.systemsjr.jrbase.workbench.application.WorkbenchView;

public class ClearanceLevelView extends WorkbenchView {
       
        public ClearanceLevelView(){
                super("clearenceLevelView");
        }
       
        /*@Override
        protected ClearanceLevelVO saveItem() {
                if(getItemForm().isDirty()){
                        getItemForm().commit();
                        ClearanceLevelVO levelVO = (ClearanceLevelVO) getItemForm().getFormObject();
                        getItemForm().setAction(levelVO.getId());
                        levelVO = BaseServiceUtils.getClearanceService().saveClearanceLevel(levelVO);
                        getItemForm().getValueholder().refresh();
                        return levelVO;
                }
                return null;
        }*/

        /*@Override
        protected ClearanceLevelVO handleSaveItem(ClearanceLevelVO object) {
                setAction(object.getId());
                object = BaseServiceUtils.getClearanceService().saveClearanceLevel(object);
                return object;
        }

        @Override
        protected void handleDeleteItem(ClearanceLevelVO object) {
                BaseServiceUtils.getClearanceService().removeClearanceLevel(object);
        }

        @Override
        protected ClearanceLevelVO handleNewItem() {
                return BaseServiceUtils.createDefaultLevel();
        }*/
       
       
}
