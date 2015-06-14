package com.travel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.travel.domain.User;
import com.travel.service.interfaces.IUserSV;

@Controller
public class UserController {
	private static Log log = LogFactory.getLog(UserController.class);
	@Autowired
	private IUserSV userSV;
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request, RedirectAttributes attributes){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String sex = request.getParameter("sex");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setSex(sex);
		userSV.save(user);
		log.info(">>>>>register user - "+user.toString());
		
		attributes.addAttribute("email", email);
		attributes.addAttribute("password", password);
		
		return "forward:login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email==null || password==null || email.trim().length()==0 || password.trim().length()==0){
			return "redirect:toPage?page=welcome";
		}
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		List<User> userList = userSV.getUserByCondition(user);
		if(userList.size()==1){//login success
			log.info(">>>>>login success user - "+userList.get(0).toString());
			request.getSession().setAttribute("loginUser", userList.get(0));//把登录用户放入session
			return "redirect:toPage?page=index";
		}else if(userList.size()>1){
			log.info(">>>>>系统异常 - 此类user － "+userList.get(0).toString()+" - 有"+userList.size()+"个");
		}
		log.info(">>>>>login fail user"+user.toString());
		return "redirect:toPage?page=login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		User loginUser = (User)session.getAttribute("loginUser");
		if(loginUser!=null){
			session.removeAttribute("loginUser");
			log.info(">>>>>logout user - "+loginUser.toString());
		}
		return "welcome";
	}
	
	
}
