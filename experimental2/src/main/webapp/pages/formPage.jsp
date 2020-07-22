<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Form Page</title>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
        
        <style type="text/css">
			body{
				box-sizing:border-box;
				/*background-color:gray;*/ 
			}
			.errors{
				color:red;
			}
			.error {
			  color: red;
			  display : block;
			  margin-left: 5px;
			  margin-bottom:5px;
			  margin-top:5px;
			}
			 
			label.error {
			  display: inline;
			}
		</style>

	</head>
	<body class="container mt-4">
        
        <a href="index.jsp" class="btn btn-success"> HOME PAGE</a>
        
        <br><br>
        <form:form class="form-group col-6" id="form" method="post" action="formIsle" modelAttribute="sinif" >
        	<label class="mx-2">Sınıf Adı : </label>     <form:input path="sinif_adi" id="sinif" class="form-control " type="text"/>
        	<label class="mx-2">Öğrenci Sayısı :</label> <form:input path="ogrenci_sayisi" id="ogrenciSayi" class="form-control " type="text"/>
        	<label class="mx-2">Öğretmen :</label>       <form:input path="ogretmen" id="ogretmen" class="form-control " type="text"/>
        	<br>
        	<input type="submit" class="btn btn-primary ml-2" value="Submit"/>
        </form:form>
     
		<script src="bootstrap/jquery-3.4.1.min.js"></script>
		<script src="bootstrap/popper.min.js" ></script>
		<script src="bootstrap/bootstrap.min.js"></script>
    
    	<script type="text/javascript">
    		$(document).ready(function()
    		{
    			$('#form').submit(function(a)
    					{
    						$('.error').remove();
    						$('.errors').remove();
    						
		    				var sinif = $.trim($('#sinif').val());
				    		var ogretmen = $.trim($('#ogretmen').val());
				    		var ogrenciSayi = $.trim($('#ogrenciSayi').val());
				    		
				    		if(sinif.length < 1)
				    		{
				    			a.preventDefault();
				    			$('#sinif').after('<span class="error"> Bu alanın doldurulması zorunludur.</span>');
				    		}
				    		
				    		if(ogretmen.length<1)
				    		{
				    			a.preventDefault();
				    			$('#ogretmen').after('<span class="error">Bu alanın doldurulması zorunludur.</span>');
				    		}
				    		
				    		var regEx = /[0-9 -()+]+$/;
				    		var sayiMi = regEx.test(ogrenciSayi)
				    		
				    		if(!sayiMi)
				    		{
				    			a.preventDefault();
				    			$('#ogrenciSayi').after('<span class="error">Bu alana bir rakam girmeniz gerekiyor.</span>');
				    		} 
				    		else if(ogrenciSayi.length<1)
				    		{
				    			a.preventDefault();
				    			$('#ogrenciSayi').after('<span class="error">Bu alanın doldurulması zorunludur.</span>');
				    		}
				    		
    					})
    		});
    	</script>

    </body>
</html>