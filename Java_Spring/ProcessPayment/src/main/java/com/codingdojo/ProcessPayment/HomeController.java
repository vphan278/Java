package com.codingdojo.ProcessPayment;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//error
		@RequestMapping("/createError")
		public String flashMessage(RedirectAttributes redirectAttributes) {
			redirectAttributes.addFlashAttribute("error", "This is a test error");
			return "redirect:/";
		}
	// ...
	@RequestMapping(value="/processPayment", method=RequestMethod.POST)
	public String processPayment(
	    @RequestParam(value="creditCardNumber") Integer creditCardNumber,
	    @RequestParam(value="expDate")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  Date expDate,
	    @RequestParam(value="productID") Integer productID, HttpSession session) {
		
		session.setAttribute("creditCardNumber", creditCardNumber);
		session.setAttribute("expDate", expDate);
		
	    // Code here to get the product price,
	    // Call to payment API
	    // complete the transaction and charge CC
	    System.out.printf("Charging credit, timestamp: %s", new Date());
	        
	    //return "confirmation.jsp"; 
	    return "redirect:/dashboard";
	}
	// ...
	
	
	@RequestMapping("/dashboard")
	public String confirmation() {
		return "confirmation.jsp";
	}



}
