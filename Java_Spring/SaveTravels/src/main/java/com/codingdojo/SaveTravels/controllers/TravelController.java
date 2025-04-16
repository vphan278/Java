package com.codingdojo.SaveTravels.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.SaveTravels.models.Travel;
import com.codingdojo.SaveTravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {

  @Autowired
  TravelService travelService;

  @RequestMapping("/")
  public String showMain(@ModelAttribute("travel") Travel travel, Model model) {
    List<Travel> travels = travelService.allTravels();
    model.addAttribute("trips", travels);
    return "index.jsp";
  }

  @PostMapping("/")
  public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
    if (result.hasErrors()) {
      List<Travel> travels = travelService.allTravels();
      model.addAttribute("trips", travels);
      return "index.jsp";
    } else {
      travelService.createTravel(travel);
      return "redirect:/";
    }
  }
  
//get a specific travel

 @GetMapping("/travel/{id}")
 public String getTravel(@PathVariable("id") Long id, Model model) {
   Travel travel = travelService.findTravel(id);
   model.addAttribute("travel", travel);
 
   return "show.jsp";
 }

 //Edit 
  @RequestMapping("/travel/{id}/edit")
  public String edit(@PathVariable("id") Long id, Model model) {
    Travel travel = travelService.findTravel(id);
    model.addAttribute("travel", travel);
    return "edit.jsp";
  }

  
  @RequestMapping(value = "/travel/{id}", method = RequestMethod.POST)
  public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
    if (result.hasErrors()) {
      model.addAttribute("travel", travel);
      return "edit.jsp";
    } else {
      travelService.updateTravel(travel);
      return "redirect:/";
    }
  }

  // deleting an entitity
  


  
//  @DeleteMapping("/travel/{id}/delete")
//  public String destroy(@PathVariable("id") Long id) {
//    travelService.deleteTravel(id);
//    return "redirect:/";
//    //return "index.jsp";
//  }
  
    @GetMapping("/travel/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
		return "redirect:/";
		
	}
  

  
}