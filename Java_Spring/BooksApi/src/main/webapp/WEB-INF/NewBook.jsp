<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <style>


.form{
    background-color: lightgrey;
    border:2px solid black;
    padding-left: 20px;
    width: 400px;
    height:500px;

}

form{
    margin: 20px auto;
    width: 340px;
}
input{
    padding: 5px;
    font-size: inherit;
}
input[type="text"]{
    display: block;
    margin-bottom: 20px;
    width: 340px;
}
input[type="password"]{
    margin-bottom: 20px;
    width: 340px;
}
input[type="email"]{
    margin-bottom: 20px;
    width: 340px;
}
input[type="radio"]{
    margin: 0 8px 20px 18px;
}
input[type="radio"]:first-child {
    margin-left: 5px;
}
input[type="submit"]{
    width:85px;
    height: 35px;
    border: none;
    color: white;
    background-color: blue;
    
}

    </style>
</head>

<body>

    <div class="form">
    <h1>My Registration Form</h1>
    
    <form:form action="/books" method="POST">
	    <p>
	        <label for="title">Title 
	            <input type="text" name="title" id="title" placeholder="title">
	        </label>
	    </p>
	
	    <p>
	        <label for="">Description </label>
	        <br>
	        <textarea name="text" id="Information" cols="45" rows="4"></textarea>
	    </p>
	
	
	    <p>
	        <label for="language">Language
	            <input type="text" name="language" id="language">
	        </label>
	    </p>
	    <p>
	        <label for="pages">Pages
	            <input type="text" name="pages" id="pages">
	        </label>
	    </p>
	
	
	    
	    <p>
	    <input type="submit" value="Submit me">
	    <input type="hidden" name="id" value="7">
	    </p>

	</form:form>

    </div>
</body>

</html>