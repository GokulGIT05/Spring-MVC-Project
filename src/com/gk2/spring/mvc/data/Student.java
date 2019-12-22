package com.gk2.spring.mvc.data;

import java.util.LinkedHashMap;

public class Student {
	// Text Fields : Form Tags : Step 1: Create the variables
	private String firstName;
	private String lastName;
	private String country;
	// Instead of hard coding countries in form, Will use map - DropDown
	
	// No Setter for countryOptions, this will user to choose it from options
	private LinkedHashMap<String,String> countryOptions;
	//For Radio Buttons:
	private String favoriteLanguage;
	
	//For CheckBoxes
	private String[] operatingSystems;
	
	public Student() {
		countryOptions=new LinkedHashMap<String,String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "America");
		countryOptions.put("GY", "Germany");
		countryOptions.put("CH", "China");
		
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
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

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
	
}
