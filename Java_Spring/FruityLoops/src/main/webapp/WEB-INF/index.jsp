<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/app.js"></script>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>


<body>

	<h1 class="text-primary text-center my-5">Fruit Store</h1>
	
	<table class="table w-50 mx-auto mt-5">
		<thead style= "color:green">
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Price</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items = "${fruits}" var="item">
				<tr>
					<td style= "color:red">${item.name}</td>
					<td style= "color:red">${item.price}</td>
				</tr>
			
			</c:forEach>
		</tbody>
	
	
	</table>


</body>
</html>