<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">

<style>

h1{
	text-align: center;
}

h4{
	margin-left: 10px;
}

.register{
	background-color: lightblue;
	padding-left: 20px;
	padding-bottom: 20px;
	padding-right: 20px;
	padding-top: 20px;
	display: flex;
	
	
}
.col{

	background-color: white;
	border: 2px solid black;
	margin-right: 20px;
	
}

.col2{
	background-color: white;
	border: 2px solid black;
}
.form-group{
	margin-left: 10px;
	margin-right: 20px;
}

.form-control{
	width: 300px;
	height: 30px;
	margin-bottom: 15px;
}

.btn-primary{
	width: 100px;
	margin-left: 10px;
	margin-bottom: 20px;
	background-color: blue;
}


input[type="password"]{
    margin-bottom: 20px;
    width: 340px;

}
input[type="email"]{
    margin-bottom: 20px;
    width: 340px;
	margin-bottom:  10px;
}

</style>

</head>
<body>
	<h1>Welcome Users</h1>
	<br>
	<div class="register">
		
		<div class="col">
			<h4>Register</h4>
			<hr>
			<form:form action="/register" method="POST" modelAttribute="user">
				<div class="form-group">
					<form:label path="firstName">FirstName</form:label>
					<form:errors path="firstName"/>
					<form:input class="form-control" path="firstName"/>
				</div>
				<div class="form-group">
					<form:label path="lastName">LastName</form:label>
					<form:errors path="lastName"/>
					<form:input class="form-control" path="lastName"/>
				</div>
				<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:errors path="email"/>
					<form:input class="form-control" path="email"/>
				</div>
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:errors path="password"/>
					<form:input class="form-control" path="password"/>
				</div>
				<div class="form-group">
					<form:label path="confirmPassword">Confirm Password</form:label>
					<form:errors path="confirmPassword"/>
					<form:input class="form-control" path="confirmPassword"/>
				</div>
				<br><br>
				<input class="btn btn-primary" type="register" value="Register"/>
				
			</form:form>
		
		</div>
		<br>
		<hr>
		<div class="col2">
			<h4>Login</h4>
			<hr>
			<!--<p>${loginError}</p>-->
			
			
			<form method="POST" action="/login">
				<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:errors path="email"/>
					<form:input class="form-control" path="email"/>
				</div>
				<br>
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:errors path="password"/>
					<form:input class="form-control" path="password"/>
				</div>
				<br>

				<button class="btn btn-primary" type="submit" value="submit">Submit</button>
			</form> 	
					
		</div>
	
	
	</div>
	
	



</body>
</html>