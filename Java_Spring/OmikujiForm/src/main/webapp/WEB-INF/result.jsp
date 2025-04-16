<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>



</head>
<body>

	<div class="container">
		<div class="result">
			<h1  class="line1">Here's Your Omikuji</h1>
			
		
		</div>
		
		<div class="result">
	        <div class="body">
	        	<p>
		          In <span><c:out value="${num}" /></span> years, you will live in <span><c:out value="${city}" /></span>
	              with<span><c:out value="${person_name}" /></span> as your roommate,
	              <span><c:out value="${hobby}" /></span> for a living. The next time you
	              see a <span><c:out value="${living_thing}" /></span> , you will have good
	             luck. Also, <span><c:out value="${say_something}" /></span> .
	            </p>
	      	 </div>
		</div>
		<a href="/omikuji">Go Back</a>
	</div>

</body>
</html>