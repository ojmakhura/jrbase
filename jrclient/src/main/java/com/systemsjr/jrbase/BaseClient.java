package com.systemsjr.jrbase;

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
		String rootContextDirectoryClassPath = "/com/systemsjr/jrbase/ctx/baseclient";
		String startupContextPath = rootContextDirectoryClassPath
			+ "/startup.xml";
						
		String richclientApplicationContextPath = rootContextDirectoryClassPath	+ "/appbundle.xml";
		try {
			
			new ApplicationLauncher(startupContextPath, new String[] {
					richclientApplicationContextPath });
			System.out.println(startupContextPath);
		} catch (RuntimeException e) {
			logger.error("RuntimeException during startup", e);
		
		}		
    }
}
