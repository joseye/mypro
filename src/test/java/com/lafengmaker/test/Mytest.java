package com.lafengmaker.test;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceEditor;

public class Mytest {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Mytest() {
		super();
		try {
			MutablePropertyValues pvs = new MutablePropertyValues();
			//(getServletConfig(), this.requiredProperties);
			//Mytest my= new Mytest();
			BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(this);
			pvs.addPropertyValue(new PropertyValue("name", "张三"));
			//ResourceLoader resourceLoader = new ServletContextResourceLoader(getServletContext());
			//bw.registerCustomEditor(Resource.class, new ResourceEditor(resourceLoader, getEnvironment()));
			//initBeanWrapper(bw);
			bw.setPropertyValues(pvs, true);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Mytest mt= new Mytest();
		System.out.println(mt.getName());
		
	}
}
