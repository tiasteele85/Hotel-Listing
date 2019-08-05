<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div class="container">
		<h1>Hotels in ${ hotels[0].city }</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Hotel</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="hotel" items="${hotels}">
				<tr>
					<td>${hotel.name}</td>
					<td>${hotel.pricePerNight}</td>					
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="redirect:/home" class="btn btn-secondary">Home</a>
	</div>
</body>
</html>