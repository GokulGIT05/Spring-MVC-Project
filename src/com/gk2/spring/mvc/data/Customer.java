package com.gk2.spring.mvc.data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.gk3.spring.mvc.custom.validator.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=2,message="Minimum 1 letter")
	private String lastName;
	
	/*@NotNull(message="is required") // This will applicable to String objects, not to primitives. so change int to Integer
	@Min(value=1,message="The Minumum value should be 1 or more")
	@Max(value=10,message="The Maximum value should be 10 or less")
	private int freePasses;*/
	
	@NotNull(message="is required")
	@Min(value=1,message="The Minumum value should be 1 or more")
	@Max(value=10,message="The Maximum value should be 10 or less")
	private Integer freePasses;
	
	@Pattern(regexp="^[0-9a-zA-Z]{5}", message="only 5 digits/chars")
	private String postalCode;
		
	// Our own custom validation
	@CourseCode(value="TOPS",message="Start With TOPS")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}














