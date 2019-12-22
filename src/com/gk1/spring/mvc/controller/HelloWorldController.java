package com.gk1.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	// Need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showHtmlForm() {
		return "helloWorld-form";
	}
	
	// Need a controller method to process the Html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloPage";
		
	}
	
//  New Controller Method to Read form data and add data to the model.
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// Step1: Read the request parameter from the model
		String theName=request.getParameter("StudentName");	
		
		//Step 2: Convert the data to all Caps
		theName=theName.toUpperCase();
		
		//Step 3: Create the Message
		String result="Yo!! "+theName;
		System.out.println(result);
		
		//Step 4: add Message to the model
		model.addAttribute("message", result);
		
		
		return "helloPage";
	}
	
	// Instead of HttpServletRequest mapping using @RequestParam
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeVersion3(@RequestParam("StudentName") String theName, Model model) {
		theName=theName.toUpperCase();
		String result="Hello from letsShoutDudeVersion3: "+theName;
		System.out.println(result);
		model.addAttribute("message", result);

		return "helloPage";
		}
}
