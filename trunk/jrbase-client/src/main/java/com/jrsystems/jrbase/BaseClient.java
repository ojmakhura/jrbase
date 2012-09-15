package com.jrsystems.jrbase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.richclient.application.ApplicationLauncher;


/**
 * 
 *
 */
public class BaseClient 
{
	private static final Log logger = LogFactory.getLog(BaseClient.class);
    public static void main(String[] args)
    {
    	// Part of this configuration will indicate the initial page to be
		// displayed.
    	//System.out.println("starting");
		String rootContextDirectoryClassPath = "/com/jrsystems/jrbase/ctx/baseclient";
		logger.warn("rootContextDirectoryClassPath");
		// The startup context defines elements that should be available
		// quickly such as a splash screen image		
		String startupContextPath = rootContextDirectoryClassPath
			+ "/startup.xml";
		
		//System.out.println("startupContextPath");
		String richclientApplicationContextPath = rootContextDirectoryClassPath
		+ "/appbundle.xml";
		//System.out.println("richclientApplicationContextPath");
		// The ApplicationLauncher is responsible for loading the contexts,
		// presenting the splash screen, initializing the Application
		// singleton instance, creating the application window to display
		// the initial page.
		try {
			
			new ApplicationLauncher(startupContextPath, new String[] {
					richclientApplicationContextPath });
			System.out.println(startupContextPath);
		} catch (RuntimeException e) {
			logger.error("RuntimeException during startup", e);
		
		}		
    }
}
