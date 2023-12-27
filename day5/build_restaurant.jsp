<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<%-- Using the bean: day5.beans.Restaurant and setting values for its properties --%>
		<jsp:useBean id="r1" class="day5.beans.Restaurant" scope="session"/>
		<jsp:setProperty property="*" name="r1"/>
		<h2>Restaurant built successfully</h2>
		<h2>To view its details</h2>
		<h2><a href="show_restaurant.jsp">Click Here</a></h2>
	</body>
</html>