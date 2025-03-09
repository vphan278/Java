package com.codingdojo.FormSubmission;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="email") String email, @RequestParam(value="password") String password,
			HttpSession session) {
		session.setAttribute("email", email);
		//return "welcome.jsp";
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "welcome.jsp";
	}

}
