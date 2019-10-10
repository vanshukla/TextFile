<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta charset="ISO-8859-1">
<title>Customer Manager</title>
</head>
<body>
 
	<table class ="table table-hover">
	<thead class="thead-light" >
		<tr class="table-warning">
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer Email</th>
			<th>Customer Address</th>
		</tr>
	</thead>
		<c:forEach items="${ customerList }" var="c" >
			<tbody >	
				<tr>
					<th scope="row">${ c.getId() }</th>
					<td>${ c.getName() }</td>
					<td>${ c.getEmail()}</td>
					<td>${ c.getAddress() }</td>
					<!-- <td>@</td> -->
				</tr>
			</tbody>
		</c:forEach>
		
	</table>


</body>
</html>