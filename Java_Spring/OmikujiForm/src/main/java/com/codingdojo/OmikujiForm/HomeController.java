package com.codingdojo.OmikujiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@RequestMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}

	
	@RequestMapping(value ="/omikuji/form", method=RequestMethod.POST)
	public String form(@RequestParam(value = "num") int num, 
			@RequestParam(value = "city") String city, 
			@RequestParam(value = "person_name") String personName,
			@RequestParam(value = "hobby") String hobby,
			@RequestParam(value = "living_thing") String livingThing,
			@RequestParam(value = "say_something") String saySomething,
			HttpSession session) {
		
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person_name", personName);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living_thing", livingThing);
		session.setAttribute("say_something", saySomething);
		return "redirect:/omikuji/show";
		
	}
	
	@RequestMapping("/omikuji/show")
	public String showResult(HttpSession session, Model model) {
		model.addAttribute("num", session.getAttribute("num"));
		model.addAttribute("city",session.getAttribute("city"));
		model.addAttribute("person_name", session.getAttribute("person_name"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living_thing", session.getAttribute("living_thing"));
		model.addAttribute("say_something",session.getAttribute("say_something"));
		
		return "result.jsp";
	}
		
	
	
	
	
	
	
}
