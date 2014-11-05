package com.lafengmaker.securety;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lafengmaker.bean.User;
import com.lafengmaker.util.SessionUtil;

public class SessionInterceptor implements HandlerInterceptor  {
	private Logger logger=Logger.getLogger(getClass());
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		User u=SessionUtil.getSessionUser(request);
		if(null==u){
			response.sendRedirect("/");
		}
		return false;
	}
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("postHandle ====");
	}
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("afterCompletion ====");
		
	}
}
