<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>


<html>
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <title>Main page with form</title>
    
    <style>
        table{
            width:1000px;
            margin-bottom: 30px;
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

        /* Form*/
        .form{
        background-color: lightgrey;
        border:2px solid black;
        padding-left: 20px;
        width: 300px;
        height:500px;
        margin: auto;
        margin-top: 30px;

    }   

    .form-control{
        background-color: lightgrey;
        border:1px solid black;
        padding-left: 20px;
        width: 300px;
    
    }
    form{
    	text-align:center;
    	border:2px solid black;
    	padding-bottom: 20px;
    	margin:auto;
    }
 
    
   input{
		text-align:center;
		margin:auto;
	}

	h1{
		text-align:center;
	}
    
    input{
        padding: 5px;
        font-size: inherit;
    }
    


</style>
  </head>
  <body>
    <h1 class="text">Save Travels</h1>
    <table class="table container mx-auto mt-5 w-50">
      <thead>
        <tr>
          <th>id</th>
          <th>expences</th>
          <th>vendor</th>
          <th>Amount</th>
          <th>Edit</th>
          <th>Delete</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="trip" items="${trips}">
          <tr>
            <th scope="row">${trip.id}</th>
            <td><a href="/travel/${trip.id}"> ${trip.expense}</a></td>
            <td>${trip.vendor}</td>
            <td>${trip.amount} $</td>
            <td><a href="/travel/${trip.id}/edit">Edit</a></td>
            <td><a href="/travel/${trip.id}/delete">Delete</a></td>
          </form></td>
            
          </tr>
        </c:forEach>
      </tbody>
    </table>
	<hr>
    <!-- Form to add new travel menu -->

    <h1 class="text">Add a new Expense</h1>
    <div class="Box">
    <form:form
      action="/"
      method="post"
      modelAttribute="travel"
      class="container"
    >
      <p>
        <form:label path="expense" class="form-label"
          >Expense Name :
        </form:label>
        <form:errors path="expense" class="text-danger" />
        <form:input type="text" path="expense" class="form-control" />
      </p>
      <p>
        <form:label path="vendor" class="form-label"> Vendor: </form:label>
        <form:errors path="vendor" class="text-danger" />
        <form:input type="text" path="vendor" class="form-control" />
      </p>

	  <p>
        <form:label path="amount" class="form-label"> Amount:$ </form:label>
        <form:errors path="amount" class="text-danger" />
        <form:input type="text" path="amount" class="form-control" />
      </p>
     
	 <p>
        <form:label path="description" class="form-label"> Description: </form:label>
        <form:errors path="description" class="text-danger" />
        <form:input type="text" path="description" class="form-control" />
      </p>
      

      <input type="submit" value="Submit" class="btn btn-primary" />
    </form:form>
    
    </div>

    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>