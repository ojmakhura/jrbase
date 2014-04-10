package com.systemsjr.jrbase.clearancelevel;

import javax.swing.JComponent;

import org.springframework.context.ApplicationEvent;
import org.springframework.richclient.form.binding.swing.SwingBindingFactory;
import org.springframework.richclient.form.builder.TableFormBuilder;

import com.systemsjr.jrbase.clearancelevel.vo.ClearanceLevelSearchCriteria;
import com.systemsjr.jrlib.richclient.BaseItemFilterForm;

public class ClearanceLevelSearchForm extends BaseItemFilterForm{

        public ClearanceLevelSearchForm() {
                super("clearanceLevelSearchForm");
        }

        @Override
        protected JComponent createFormControl() {
                SwingBindingFactory sbf = (SwingBindingFactory) getBindingFactory();
                TableFormBuilder builder = new TableFormBuilder(sbf);
                return builder.getForm();
        }

        @Override
        public void onApplicationEvent(ApplicationEvent arg0) {
                // TODO Auto-generated method stub
               
        }

        @Override
        protected Object newFormObject() {
                // TODO Auto-generated method stub
                return new ClearanceLevelSearchCriteria();
        }
}
