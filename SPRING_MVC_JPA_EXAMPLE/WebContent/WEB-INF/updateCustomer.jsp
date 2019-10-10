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
<title>Update Customer</title>
</head>
<body>
<div class="text-center" style="padding:50px 0">
	<div class="logo"><h1><mark>UPDATE CUSTOMER</mark></h1></div>
</div>
<div style="margin-left:600px; margin-right: 700px; text-align: center">
	<form action="updateCustomerViewPage" method="post">
		<div class="form-group">
			<label for="">Customer ID</label> 
			<input type="number" class="form-control" name="customerId" placeholder="Enter Customer ID">
		</div>
		<center><button type="submit" class="btn btn-warning btn-lg">Update</button></center>
		
	</form>
	</div>
</body>
</html>