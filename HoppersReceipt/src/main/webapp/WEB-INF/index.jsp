<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/css/style.css">

</head>


<body>


	<h1>Customer Name: <c:out value="${name}"/></h1>
	<h2>Item name:: <c:out value="${item}"/></h2>
	<h2>Price: $ <c:out value="${price}"/></h2>
	<h2>Description: <c:out value="${description}"/></h2>
	<h2>Vendor: <c:out value="${vendor}"/></h2>



</body>
</html>