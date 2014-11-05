package com.lafengmaker.util;

import javax.servlet.http.HttpServletRequest;

import com.lafengmaker.bean.User;

public class SessionUtil {
	public static final String SESSIONUSER="sessionUser";
	public static User getSessionUser(HttpServletRequest request){
		return (User)request.getSession(true).getAttribute(SESSIONUSER);
	}
	
}
