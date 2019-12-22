<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<!-- Step 3: Create a Html Form -->
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	<br><br>	
	Last Name: <form:input path="lastName"/>
	<br><br>	
	<!-- DropDown Step 1: -->
	Country: 
		<!-- Spring MVC will call setCountry method-->
		<form:select path="country">
		<!-- Instead of hardcoding in JSP, we can do it in Java class also 
			<form:option value="India" label="India"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="America" label="America"></form:option>  
		-->
		  <form:options items="${student.countryOptions}" />
		</form:select>
	<br><br>
	<br><br>
	Favorite Programming Language: 
		<form:radiobutton path="favoriteLanguage" value="Core Java"/>Java
		<form:radiobutton path="favoriteLanguage" value="C#"/>C#
		<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby
		<form:radiobutton path="favoriteLanguage" value="Python"/>Python
		
	<br><br>
	Operating Systems:
		<form:checkbox path="operatingSystems" value="Linux"/> Linux
		<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
		<form:checkbox path="operatingSystems" value="Microsoft Windows"/> Microsoft Windows
	<hr>
	<br><br>	
	<input type="submit" value="Submit To Go">
	
	</form:form>


</body>


</html>


<!-- Step 4: Create a form processing code -->




