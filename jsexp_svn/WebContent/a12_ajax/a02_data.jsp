<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>서버 자원이 호출 되었습니다.</h1>
<h2>성공을 축하드립니다!!</h2>
<!-- name=himan&age=25 -->
<h2><%=request.getParameter("name")%>님 환영합니다!</h2>
<h1>올해 나이가? <%=request.getParameter("age")%> 이시군요!!</h1>

</body>
</html>