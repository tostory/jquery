<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<fmt:requestEncoding value="UTF-8"/>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
// ajax에서 활용되는 XMLHttpRequest 객체 호출..
		var xhr;
		// 브라우저에 따라 XMLHttpRequest가 다르게 처리..
		// 웹브라우저와 웹 서버 간에 메서드가 데이터를 전송하는 객체 폼의 API
		// 인터넷 explorer (ActiveX)
		// 그외 브라우저 : XMLHttpRequest
		if(window.XMLHttpRequest){
			xhr = new XMLHttpRequest();
			
		// 인터넷 익스플로러일 때 ajax를 위해 제공하는 객체..	
		}else if( window.ActiveObject ){
			xhr = new ActiveXObject("Msxml2.XMLHTTP");
		}else{
			throw new Error("Ajax를 지원하지 않는 브라우저 입니다!!");
		}
		//alert(xhr);
		//$("h1").html(xhr);
		$("h1").click(function(){
			if(xhr!=null){
				$(this).css("background","yellow");
				xhr.onreadystatechange=function(){
					// 상태값이 4으로 
					if(xhr.readyState == 4){
						// 정상처리 200-299
						if(xhr.status >=200 && xhr.status<300 ){
							$("#container").html(xhr.responseText);
						}
					}
				}
				// 자원 호출..-서버
				xhr.open("POST","z02_data.jsp");
				xhr.send("name=himan");
				
				
			}			
		});
		
	});
</script>
</head>
<body>
  	<h1>비동기 로딩</h1>
  	<div id="container"></div>
</body>
</html>