<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" href="/bigdataShop/common/css/master.css"
		rel="stylesheet" media="screen,print" />
	<link type="text/css" href="/bigdataShop/common/css/print.css"
		rel="stylesheet" media="print" />
	<link type="text/css" href="/bigdataShop/common/css/mall.css"
		rel="stylesheet" media="screen,print" />
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<h1>자바나라</h1>
	<hr/>
	<form > 
			
			<table border="1" style="border-collapse: collapse">
				
				 
			 		<c:forEach var="comment" items="${commentResult}">
			 			<tr>
			 				<td>${comment.word}</td>
			 				<td>${comment.count}</td>
			 			</tr>	
			 		</c:forEach>
				 
				 
			</table>
		</form>		
</body>
</html>