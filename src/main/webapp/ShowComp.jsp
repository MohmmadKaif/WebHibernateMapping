
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>


<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   
    <link rel="stylesheet" type="text/css" href="">
    <title>Home</title>
  </head>
  
  <body>
         
         
         <c:forEach var="candidate" items="${ AC }" >
				
					<h2> <c:out value= "${candidate.getCand_id()}" > adhsf </c:out> </h2>
					<h2><c:out value="${candidate.getCand_name()}"></c:out></h2> 				
					<br><br>
				
				<br>
			</c:forEach>
  
  
  
  </body>