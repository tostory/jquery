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
/*
 jquery에서 활용한 ajax..
 1. $.ajax( {속성: 속성값....} );
 	1) url : 자원(html, jsp)의 위치..
 	2) dataType: 비동기적으로 서버에서 받은 데이터 형식
 				html, xml, json
 	3) type : 요청값에 대한 전달 get/post
 	4) data : 요청값(querystring 서버에 전달될 값)
 				id=###&pass=@@@@
 	5) success( param )함수 : 
 		 서버에서 전달해온 값을 param으로 전달 받으면..
 		 이 데이터를 가지고  dom 객체에 할당.
 */    	
 			$("h1").click(function(){
 				$(this).css("background","yellow");
 				$.ajax({
 					 url:"z01_data.html",
 					 dataType:"html",
 					 success:function( data ){
 						 $("div").html( data );
 					 }
 					
 				});	
 			});
 			$("h2").click(function(){
 				$(this).css("background","yellow");
 				// 요청값..
 				var name=$("input[name=name]").val();
 				var age=$("input[name=age]").val();
 				var sndData = "name="+name+"&age="+age;
 				alert(sndData);
 				$.ajax({
 					 url:"z02_data.jsp",
 					 dataType:"html",
 					 type:"post",
 					 data:sndData,
 					 success:function( data ){
 						 $("div").html( data );
 					 }
 					
 				});	
 			}); 		
 			
    	});
    </script>
</head>
<body>
	<h1>서버에서 html형식으로 데이터 받기.</h1>
	<h2>서버에서 jsp형식으로 데이터 받기.</h2>
	<h3>서버에서 json형식으로 데이터 받기.</h3>
	이름:<input type="text" name="name"/><br>
	나이:<input type="text" name="age"/><br>
	<div></div>
</body>
</html>