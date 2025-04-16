<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>

<body>

	<h1 class="text-center mt-4 ">New Dojo</h1>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo"  class="container mx-auto w-50">
			<p>
					<form:label path="name" class="form-label">Dojo name</form:label>
					<form:errors path="name" class="text-danger"/>
					<form:input type="text" path="name" class="form-control"/>
			</p>
	  
			<input type="submit" value="Create" class="btn btn-primary"/>
	</form:form>    

	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>