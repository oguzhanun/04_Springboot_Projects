<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
        
	</head>
	<body class="container mt-4">
        
<%--         <form method="post" action="formTalebi"> --%>
<!--         	<input type="submit" class="btn btn-danger" value="FORM PAGE"> -->
<%--         </form> --%>

		<a href="formTalebi" class="btn btn-danger">FORM PAGE</a>
		<br><br>
		<a href="login" class="btn btn-warning">LOGIN PAGE</a>
		
		<p>${pageContext.request.contextPath}</p>
        
		<script src="bootstrap/jquery-3.4.1.min.js"></script>
		<script src="bootstrap/popper.min.js" ></script>
		<script src="bootstrap/bootstrap.min.js"></script>
    
    </body>
</html>