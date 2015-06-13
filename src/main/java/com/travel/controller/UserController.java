package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.domain.User;
import com.travel.service.interfaces.IUserSV;

@Controller
public class UserController {
	private static Log log = LogFactory.getLog(UserController.class);
	@Autowired
	private IUserSV userSV;
	
	@RequestMapping("/register")
	public void register(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		log.info("1232132132");
		System.out.println(userSV.save(user));
	}
	
}
