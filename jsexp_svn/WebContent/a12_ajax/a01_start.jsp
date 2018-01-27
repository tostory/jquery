<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script>
    // body부분까지 로딩 후, 호출될 내용!!
    	$(document).ready(function(){
		//   jax에서 활용된느  XMLHttpRequest 객체 호출..
			var xhr;
			// 브라우저별로 XMLHttpRequest객체를 호출..
			if( window.XMLHttpRequest ){
				xhr = new XMLHttpRequest();
			//  익스플로러에서 ajax객체..	
			}else if( window.ActiveObject ){
				xhr = new ActiveObject("Msxml2.XMLHTTP");
			}else{
				throw new Error("Ajax를 지원하지 않는 브라우저 입니다!");
			}
    		//alert(xhr);
  // 특정한 서버의 자원에 해당 요청데이터를 넘기고,
  // 해당 자원에서 비동기적으로 가져오는 데이터를 현재 페이지에서 출력..
  			$("h1").click(function(){
  				if( xhr != null){
  					// 상태값 변경 이벤트가 발생하므로,
  					// 해당 이벤트에 대한 메서드 처리를 해야 한다.
  					alert("호출");
  					xhr.open("POST","a02_data.jsp",true);
  					xhr.onreadystatechange=function(){
  						//  상태값의 최종 4: 모든 데이터를 받았을 때,
  						if( xhr.readyState == 4){
  							// http의 요청 응답값..정상처리 200~299
  							if(xhr.status >=200 && xhr.status <300){
  								// xhr.responseText : 서버에서 온 자원의 내용
  								$("div").html(xhr.responseText);
  							}
  						}	
  					}
  					// 서버에 자원호출..open(get/post, "자원jsp")
  					// 
  
  					// 요청값을 넘겨서 처리..  key=value
  					xhr.send("name=himan&age=25");
  					//xhr.send({ name: 'himan' });
  					
  				}
  				
  			});
    		
    		
    		
    	});
    </script>  

</head>
<body>
	<h1>비동기적으로 서버에 자원 가져온다.</h1>
	<div></div>
</body>
</html>