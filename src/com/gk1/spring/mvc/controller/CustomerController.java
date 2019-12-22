package com.gk1.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gk2.spring.mvc.data.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// Add an initbinder to resolve whitespaces issues. this will run as preprocessor
	// If only whitespace, then replace that with null
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor trim =new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trim);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult theBindingResult) {
		System.out.println("Log: "+"!"+customer.getLastName()+"#" );
		System.out.println("The Binding Result: "+theBindingResult);
		System.out.println("/n/n/n");
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else
			return "customer-confirmation";
	}

}
