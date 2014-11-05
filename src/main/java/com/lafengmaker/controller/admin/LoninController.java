package com.lafengmaker.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lafengmaker.util.PropertyConfig;
@Controller
public class LoninController {
	private Logger logger=Logger.getLogger(getClass());
	@RequestMapping("/")
	public String defaultwelcome(HttpServletRequest request){
		logger.debug("debug login page");
		String title=PropertyConfig.getInstance().getProperty(PropertyConfig.PROJECTNAME);
		String copyright=PropertyConfig.getInstance().getProperty("project.system.copyright");
		
		logger.debug("title is "+title);
		logger.debug("copyright is "+copyright);
		HttpSession session=request.getSession(true);
		session.setAttribute("title", title);
		session.setAttribute("copyright", copyright);
		return "login";
	}
	@RequestMapping("welcome")
	public String welcome(){
		logger.debug("debug welcome page");
		return "index";
	}
	@RequestMapping("logout")
	public String logout(){
		logger.debug("debug logout page");
		return "redirect:/";
	}
	@RequestMapping("userlogin")
	public String userlogin(){
		logger.debug("debug userlogin page");
		return "redirect:welcome";
	}
}
