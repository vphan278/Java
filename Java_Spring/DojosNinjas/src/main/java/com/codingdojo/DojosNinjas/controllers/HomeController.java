package com.codingdojo.DojosNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.DojosNinjas.models.Dojo;
import com.codingdojo.DojosNinjas.models.Ninja;
import com.codingdojo.DojosNinjas.services.DojosNinjasService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	DojosNinjasService dojosninjasService;
	
	@RequestMapping("/dojos/new")
	public String showDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()){
			return "index.jsp";
		}
		else {
			dojosninjasService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	// get a specific dojo

	  @RequestMapping("/dojos/{id}")
	  public String getDojo(@PathVariable("id") Long id, Model model) {
	    Dojo dojo = dojosninjasService.findDojo(id);
	    model.addAttribute("dojo", dojo);
	  
	    return "show.jsp";
	  }
	
	
	
	//Ninja////////////////////////////
	 @RequestMapping("/ninjas/new")
	 public String showNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		 List<Dojo> dojos = dojosninjasService.allDojo();
		 model.addAttribute("dojos", dojos);
		 return "new.jsp";
	 }
	
	
	 @PostMapping("/ninjas/new")
	 public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja , BindingResult result) {
	      if (result.hasErrors()) {
	          return "new.jsp";
	      } 
	      else{
	    	  dojosninjasService.createNinja(ninja);
	          return "redirect:/ninjas/new";
	      }
	 }
	
	
}
