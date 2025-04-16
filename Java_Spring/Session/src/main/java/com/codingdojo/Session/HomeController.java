package com.codingdojo.Session;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("name", "Sara");
		return "index.jsp";
	}
	
	@RequestMapping("/welcome")
	public String welcome(HttpSession session) {
		String userName = (String) session.getAttribute("name");
		System.out.println("The name is: " + userName);
		return "welcome.jsp";
	}

}
