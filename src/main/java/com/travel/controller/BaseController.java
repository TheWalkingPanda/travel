package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping("/toPage")
	public String toPage(HttpServletRequest request){
		return request.getParameter("page");
	}
	
}
