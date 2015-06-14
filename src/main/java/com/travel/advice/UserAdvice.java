package com.travel.advice;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import com.travel.domain.User;

public class UserAdvice {
	
	public String around(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args = pjp.getArgs();
		HttpServletRequest request = (HttpServletRequest)args[0];
		User loginUser = (User)request.getSession().getAttribute("loginUser");
		String page = request.getParameter("page");
		if(loginUser==null){
			if(!"reg".equals(page) && !"welcome".equals(page) && !"login".equals(page)){
				return "login";
			}
		}
		return pjp.proceed().toString();
	}
	
}
