<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form Submission</title>

</head>

<body>

	<h1>Form-Login</h1>
	
	<form action="/login" method="POST">
		<label>Email:</label>
		<input type="text" name="email">
		
		<label>Password:</label>
		<input type="password" name="password">
		
		<input type="submit" value="Log In">

	</form>
	
	
	
</body>
</html>