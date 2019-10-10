<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>View a Customer</title>
</head>
<body>
	<table class="table table-hover">
		<thead class="thead-light">
			<tr  class="table-warning">
				<th scope="col">Customer ID</th>
				<th scope="col">Customer Name</th>
				<th scope="col">Customer Email</th>
				<th scope="col">Customer Address</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row"><c:out value="${ c.getId() }" /></th>
				<td><c:out value="${ c.getName() }" /></td>
				<td><c:out value="${ c.getEmail() }" /></td>
				<td><c:out value="${ c.getAddress() }" /></td>
			</tr>
		</tbody>
	</table>

</body>
</html>