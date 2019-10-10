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
	<form action="updateCustomer.do" method="post" class="text-left">
		<div class="form-group row">
			<label for="" class="sr-only">Customer ID</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" name="customerId"
					value="${ c.getId() }" placeholder="Customer ID">
			</div>
		</div>
		<div class="form-group row">
			<label for="" class="sr-only">Customer Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="customerName"
					value="${ c.getName() }" placeholder="Customer Name">
			</div>
		</div>
		<div class="form-group row">
			<label for="" class="sr-only">Customer Email</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="email"
					value="${ c.getEmail() }" placeholder="Customer Email">
			</div>
		</div>
		<div class="form-group row">
			<label for="" class="sr-only">Customer Address</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="address"
					value="${ c.getAddress() }" placeholder="Customer Address">
			</div>
		</div>
		</div>
		<center><button type="submit" class="btn btn-warning btn-sm">Update</button></center>
	</form>
</body>
</html>