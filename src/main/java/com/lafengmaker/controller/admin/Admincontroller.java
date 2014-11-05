package com.lafengmaker.controller.admin;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class Admincontroller {
	Logger logger=Logger.getLogger(getClass());
	@RequestMapping(value="/admin/userlist")
	public String subOne(){
		logger.info("info");
		logger.debug("debug the logger....");
		return "admin/userlist";
	}
	@RequestMapping(value="admin/two")
	public String subTwo(){
		return "/sub/two";
	}
}
