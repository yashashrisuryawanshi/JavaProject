<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="cyan">
		<h2>Create New Restaurant</h2>
		<form action="build_restaurant.jsp" method="post">
			<pre>
				Restaurant ID: <input type="text" name="restaurantId"/>
				
				Name: <input type="text" name="name"/>
				
				Cuisine: <select name="cuisine">
					<option>SELECT</option>
					<option>Indian</option>
					<option>South Indian</option>
					<option>Maharashtrian</option>
					<option>Punjabi</option>
					<option>Gujrathi</option>
				</select>
				
				Branch Count: <input type="text" name="branchCount"/>
				
				<input type="submit" value="CREATE"/>
			</pre>
		</form>
	</body>
</html>