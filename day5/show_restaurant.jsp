<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<%-- Using the pre-created bean with ID: r1 of type: Restaurant from 'session' scope --%>
	<jsp:useBean id="r1" class="day5.beans.Restaurant" scope="session"/>
	<%--Fething its properties and printing them --%>
	<h2>Printing Restaurant details:</h2>
	<h2>ID: <jsp:getProperty property="restaurantId" name="r1"/></h2>
	
	<h2>Name: <jsp:getProperty property="name" name="r1"/></h2>
	
	<h2>Cuisine: <jsp:getProperty property="cuisine" name="r1"/></h2>
	
	<h2>Branch Count: <jsp:getProperty property="branchCount" name="r1"/></h2>
	
</body>
</html>