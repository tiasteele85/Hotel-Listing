<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/yeti/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-w6tc0TXjTUnYHwVwGgnYyV12wbRoJQo9iMlC2KdkdmVvntGgzT9jvqNEF/uKaF4m"
	crossorigin="anonymous">
</head>
<body>

	<h1>Hotel Name: ${ hotel.name } </h1>
	<div class="container">		
		<table class="table">
			<thead>
				<tr>
					<th>Hotel</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>				
					<tr>
						<td>${hotel.name}</td>
						<td>${hotel.pricePerNight}</td>
					</tr>
				
			</tbody>
		</table>
		<a href="redirect:/home" class="btn btn-primary">Home</a>
	</div>
	
</body>
</html>