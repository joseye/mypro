package com.lafengmaker.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyConfig {
	private Logger logger=Logger.getLogger(getClass());
	private Properties prop=new Properties();
	private static  PropertyConfig instance=new PropertyConfig();
	public PropertyConfig() {
		init();
	}
	private void init(){
		try {
			prop.load(getClass().getResourceAsStream("/project.properties"));
		} catch (IOException e) {
			logger.error("loadconfig error", e);
		}
	}
	public static  PropertyConfig getInstance(){
		return instance;
	}
	public  String getProperty(String keyname){
		return prop.getProperty(keyname);
	}
	public static final String PROJECTNAME= "project.system.name";
}
