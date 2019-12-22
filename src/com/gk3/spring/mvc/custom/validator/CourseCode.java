package com.gk3.spring.mvc.custom.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// Step 1: Create a annotaion class		

@Constraint(validatedBy= CourseCodeConstraintValidator.class) // Validator Class
@Target({ElementType.METHOD,ElementType.FIELD}) // Applicable to Method and fields
@Retention(RetentionPolicy.RUNTIME) // Will be available at runtime
public @interface CourseCode {
	
	// Define default course code
	public String value() default "LUV";
	
	// Define default error message
	public String message() default "Must start with LUV";
	
	// Define default group
	public Class<?>[] groups() default {};
	
	// Define default payloads
	public Class<? extends Payload>[] payload() default{};
 	 
}






