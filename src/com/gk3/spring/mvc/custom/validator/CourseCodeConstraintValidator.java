package com.gk3.spring.mvc.custom.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	public String coursePrefix;
	
	@Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }
	
	@Override
	public boolean isValid(String theCode,
					ConstraintValidatorContext theConstraintValidatorContext /*Using this we can add our own custom error MSG*/) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode != null) {
			result=theCode.startsWith(coursePrefix);
		}else
			result=true;
		
		return result;
	}

}
