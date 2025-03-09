<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>

	<h1>Guess Number between 1-10 in the URL</h1>
	<!--<c:if test = "${number==secretNumber}">
	<p style= "color:blue"> <c:out value="You got it!"/></p>
	</c:if>
	
	<c:if test = "${number!=secretNumber}">
		<p><c:out value="Try again."/></p>
	</c:if>  --->
	
	<hr>
	
	<c:choose>
		<c:when test="${number<secretNumber}">
			<p style= "color:red"><c:out value="Your number is too low."/></p>
		</c:when>
		<c:when test="${number>secretNumber}">
			<p style= "color:green"><c:out value="Your number is too high."/></p>
		</c:when>
		<c:otherwise>
			<p style= "color:blue"><c:out value="You got it!"/></p>
		</c:otherwise>
	</c:choose>
	

</body>
</html>