package com.systemsjr.jrbase;

import java.awt.Dimension;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.richclient.application.Application;
import org.springframework.richclient.application.ApplicationWindow;
import org.springframework.richclient.application.config.ApplicationWindowConfigurer;
import org.springframework.richclient.application.config.DefaultApplicationLifecycleAdvisor;
import org.springframework.richclient.command.CommandManager;
import org.springframework.richclient.security.ApplicationSecurityManager;
import org.springframework.security.core.Authentication;

import com.systemsjr.jrbase.login.LoginDialog;


public class BaseLifecycleAdvisor extends DefaultApplicationLifecycleAdvisor {
	private final Log logger = LogFactory.getLog(getClass());

    /**
     * This method is called prior to the opening of an application window. Note
     * at this point the window control has not been created. This hook allows
     * programmatic control over the configuration of the window (by setting
     * properties on the configurer) and it provides a hook where code that
     * needs to be executed prior to the window opening can be plugged in (like
     * a startup wizard, for example).
     * 
     * @param configurer The application window configurer
     */
    @Override
    public void onPreWindowOpen( ApplicationWindowConfigurer configurer ) {

        // If you override this method, it is critical to allow the superclass
        // implementation to run as well.
        super.onPreWindowOpen(configurer);

        // Uncomment to hide the menubar, toolbar, or alter window size...
        // configurer.setShowMenuBar(false);
        // configurer.setShowToolBar(false);
        configurer.setInitialSize(new Dimension(1200, 700));
    }

    /**
     * Called just after the command context has been internalized. At this
     * point, all the commands for the window have been created and are
     * available for use. If you need to force the execution of a command prior
     * to the display of an application window (like a login command), this is
     * where you'd do it.
     * 
     * @param window The window who's commands have just been created
     */
    @Override
    public void onCommandsCreated( ApplicationWindow window ) {
    	doLogin(window);
        if( logger.isInfoEnabled() ) {
            logger.info("onCommandsCreated( windowNumber=" + window.getNumber() + " )");
        }
    }

    protected void doLogin(ApplicationWindow window) {
    	((LoginDialog)Application.instance().getApplicationContext().getBean("loginDialog")).showDialog();
    }

	/**
     * Called after the actual window control has been created.
     * 
     * @param window The window being processed
     */
    @Override
    public void onWindowCreated( ApplicationWindow window ) {
        if( logger.isInfoEnabled() ) {
            logger.info("onWindowCreated( windowNumber=" + window.getNumber() + " )");
        }
    }

    /**
     * Called immediately after making the window visible.
     * 
     * @param window The window being processed
     */
    @Override
    public void onWindowOpened( ApplicationWindow window ) {
        if( logger.isInfoEnabled() ) {
            logger.info("onWindowOpened( windowNumber=" + window.getNumber() + " )");
        }
        
        //((LoginDialog)Application.instance().getApplicationContext().getBean("loginDialog")).showDialog();
    }

    /**
     * Called when the window is being closed. This hook allows control over
     * whether the window is allowed to close. By returning false from this
     * method, the window will not be closed.
     * 
     * @return boolean indicator if window should be closed. <code>true</code>
     *         to allow the close, <code>false</code> to prevent the close.
     */
    @Override
    public boolean onPreWindowClose( ApplicationWindow window ) {
        if( logger.isInfoEnabled() ) {
            logger.info("onPreWindowClose( windowNumber=" + window.getNumber() + " )");
        }
        return true;
    }

    /**
     * Called when the application has fully started. This is after the initial
     * application window has been made visible.
     */
    @Override
    public void onPostStartup() {
        if( logger.isInfoEnabled() ) {
            logger.info("onPostStartup()");
        }
    }
}
