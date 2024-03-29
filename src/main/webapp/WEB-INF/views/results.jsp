<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<div class="container">
		<h1>Hotels in ${ hotels[0].city }</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Hotel</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="hotel" items="${hotels}">
					<tr>
						<td><a href="/details?id=${hotel.id}">${hotel.name}</a></td>
						<td>${hotel.pricePerNight}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="redirect:/home" class="btn btn-primary">Home</a>
	</div>
</body>
</html>