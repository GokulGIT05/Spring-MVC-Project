package com.gk1.spring.mvc.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gk2.spring.mvc.data.Student;

// Step 2: Create a student Controller

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// Using to read Country values from properties file
	/*@Value("#{countries.properties}")
	private LinkedHashMap<String,String> countryOptns;
*/
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// Create a student Object
		Student student = new Student();

		// Add this student object to the model
		theModel.addAttribute("student", student);
		// Using to read Country values from properties file
	//	theModel.addAttribute("countryOptns", countryOptns);
		return "student-form";
	}
	
	
	
	// Step 3: Create a Html Form : go to Student-form.jsp
	// Step 4: Create a form processing code
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		//log the input data
		System.out.println("Log: "+student.getFirstName()+" "+student.getLastName());
		
		return "student-confirmation";
	}
	
	//Step 5: Create a confirmation page

}
