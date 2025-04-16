<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        table{
            width:1000px;
    
        }

        caption,th{
            text-align: left;
            margin-bottom: 5px;
        }

        table, th, td{
            border:1px solid black;
            border-collapse: collapse;
            padding:10px ;
        }

        th{
            background-color: lightblue;
        }
        tr:nth-child(even){
            background-color: white;
        }
        tr:nth-child(odd){
            background-color: #ddd;
        }

    </style>

</head>

<body>

	<div class="container mt-3">
  		<h1 class="text-center">All Books</h1>
  		
  		 <table>
     
     	<thead>
	        <tr>
	            <th>Id</th>
	            <th>Title</th>
	            <th>Description</th>
	            <th>Language:</th>
	            <th>Number of Pages</th>
	        </tr>
		</thead>
		
		<tbody>
		<c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td><a href="/books/${book.id}">${book.title}</a> </td>
            <td>${book.description}</td>
            <td>${book.language}</td>
            <td>${book.numberOfPages}</td>
        </tr>

       
        
        </c:forEach>
        
        </tbody>

    </table>
  		
  		
  		
	</div>
	
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>