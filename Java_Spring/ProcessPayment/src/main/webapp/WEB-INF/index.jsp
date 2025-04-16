<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<!--   ...   -->
    
    <p><c:out value="${error}"/></p>
    <h3>Pay</h3>
    <form action="/processPayment" method="POST">
        <input type="hidden" name="productID" value="128">
        <label>Credit Card Number</label>
        <input type="text" name="creditCardNumber">
        <label>Expiration Date</label>
        <input type="date" name="expDate">
        
        <input type="submit">
    </form>
    
<!--   ...   -->

	

	

</body>
</html>