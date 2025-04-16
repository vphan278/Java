package com.codingdojo.HoppersReceipt;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Grace Hopper");
		model.addAttribute("item", "Copper wire");
		model.addAttribute("price", "5.25");
		model.addAttribute("description", "Metal strips. Also an illustration on nanoseconds");
		model.addAttribute("vendor", "Little Things Corner Store");
		return "index.jsp";
	}
}