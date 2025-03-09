package com.codingdojo.DaikichiPathVariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome";
	}
	
	@RequestMapping("/travel/{countryId}")
	public String travel(@PathVariable("countryId") String countryId) {
		return " Congratulations! You will travel to " + countryId;
	}
	
	@RequestMapping("/lotto/{Number}")
	  public String lotto(@PathVariable("Number") int Number) {
	    if (Number % 2 == 0) {
	      return "You will take a grand journey in the near future, but be weary of tempting offers";
	    } 
	    else {
	      return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	    }

	 }
}