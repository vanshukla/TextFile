<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
<title>Home Page</title>
</head>
<body>
<div class="text-center" style="padding:50px 0">
	<div class="logo"><h1><mark>ADD CUSTOMER</mark></h1></div>
</div>
	<div class="login-form-1" style="margin-left:700px; margin-right:700px; text-align:center; ">
		
		
		
		<f:form action="addCustomer.do" id="register-form" class="text-left" method="post" modelAttribute="customerForm">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="reg_id" class="sr-only">Customer ID</label>
						<f:input type="text" class="form-control" id="reg_id" name="reg_id" placeholder="Customer ID" path="id"/>
						<f:errors path="id"/>
					</div>
					<div class="form-group">
						<label for="reg_name" class="sr-only">Customer Name</label>
						<f:input type="text" class="form-control" id="reg_name" name="reg_name" placeholder="Customer Name" path="name"/>
						<f:errors path="name"/>
					</div>
								
					<div class="form-group">
						<label for="reg_email" class="sr-only">Customer Email</label>
						<f:input type="text" class="form-control" id="reg_email" name="reg_email" placeholder="Customer Email" path="email"/>
						<f:errors path="email"/>
					</div>
					<div class="form-group">
						<label for="reg_address" class="sr-only">Customer Address</label>
						<f:input type="text" class="form-control" id="reg_address" name="reg_address" placeholder="Customer Address" path="address"/>
						<f:errors path="address"/>
					</div>
				</div>
			</div><br>
				<center><button type="submit" class="btn btn-warning btn-lg">Submit</button></center>
		</f:form>
	
	
	

</div>
</body>
</html>