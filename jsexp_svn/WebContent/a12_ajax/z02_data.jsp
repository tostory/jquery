<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script>
    
    	$(document).ready(function(){
    	
    	});
    </script>
</head>
<body>
<h1>서버에서 온 값들..</h1>
이름:<%= request.getParameter("name") %><br>
나이:<%= request.getParameter("age") %><br>
</body>
</html>