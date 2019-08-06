<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/yeti/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-w6tc0TXjTUnYHwVwGgnYyV12wbRoJQo9iMlC2KdkdmVvntGgzT9jvqNEF/uKaF4m"
	crossorigin="anonymous">
</head>
<body>
	<h1 class="text-primary">Welcome to the Search Spot</h1>
	<form action="/home" method="post">
		<label>City:</label> <select name="city">
			<option value="detroit">Detroit</option>
			<option value="farmington">Farmington</option>
		</select>
		<p>
			<label>Priced Under:<input type=number name="price" /></label>
		</p>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>