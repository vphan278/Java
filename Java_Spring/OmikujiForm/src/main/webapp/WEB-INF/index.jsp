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

	 
	 <h1>Send an Omikuji!</h1>
	 
	 <div class="container">
	 
	 	<form action="/omikuji/form" method="POST">
	 		
	 		<div class="box">
	 			<label for="num">Pick any number from 5 to 25</label>
	 			<br>
				<select name="num" id="num">
            	<option value="0">0</option>
            		<option value="5">5</option>
            		<option value="6">6</option>
            		<option value="7">7</option>
            		<option value="8">8</option>
            		<option value="9">9</option>
            		<option value="10">10</option>
            		<option value="11">11</option>
            		<option value="12">12</option>
            		<option value="13">13</option>
            		<option value="14">14</option>
            		<option value="15">15</option>
            		<option value="16">16</option>
        		</select>
               
	 		</div>
	 		<br>
	 		<div class="box">
	 			<label class="form-label" for="city">Enter the name of any city.</label>
	 			<input type="text" name="city" class="form-control" id="city" />
	 		</div>
	 		<br>
	 		<div class="box">
	 			<label class="form-label" for="person_name">Enter the name of any real person.</label>
	 			<input type="text" name="person_name" class="form-control" id="person_name" />
	 		</div>
	 		<br>
	 		<div class="box">
	 			<label class="form-label" for="hobby">Enter professional endeavor or hobby.</label>
	 			<input type="text" name="hobby" class="form-control" id="hobby" />
	 		</div>
	 		<br>
	 		<div class="box">
	 			<label class="form-label" for="living_thing">Enter any type of living thing.</label>
	 			<input type="text" name="living_thing" class="form-control" id="living_thing" />
	 		</div>
	 		<br>
	 		<div class="box">
	 			<label class="form-label" for="say_something">Say something nice to someone.</label>
	 			<input type="text" name="say_something" class="form-control" id="say_something" />
	 		</div>
	 		<br>
	 		<div class="box1">
	 			<p>Send and show a friend</p>
	 			<button type="submit" class="btn btn-primary">Send</button>
	 		</div>
	 	
	 	</form>
	 	
	 	
	 	
	 	
	 </div>



















</body>
</html>