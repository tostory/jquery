<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>justification</title>
		<link rel="stylesheet" 
		href="${path}/a00_com/a00_com.css" >
		<style type="text/css">
		</style>
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#ename").keyup(function(){
					var sndData="ename="+$(this).val();
					$.ajax({
						type:"post",
						url:"ajax.do?method=jsonList",
						dataType:"json", // json형식으로 서버에서 데이터 넘겨올때.
						data:sndData,
						success:function(data){
							var list=data.emplist;
							//alert("가져온 데이터 갯수:"+list.length);
							// empno, ename, job, .... 
							var show="<table>";
							show+="<tr><th>사원번호</th><th>사원명</th><th>직책</th>"
									+"<th>급여</th></tr>";
							for(var idx=0; idx < list.length ; idx++){
								show+="<tr>";
								show+="<td>"+list[idx].empno+"</td>";
								show+="<td>"+list[idx].ename+"</td>";
								show+="<td>"+list[idx].job+"</td>";
								show+="<td>"+list[idx].sal+"</td>";

								show+="</tr>";	
							}
							show+="</table>";	
							$("#show").html(show);
							/*
							var list=data.emplist; // controller에 모델이름..
							var show="";
							for(var idx=0;idx<list.length;idx++){
								show+="<h3>"+list[idx].ename+"-"+list[idx].job+"</h3>";
							}
							$("#show").html(show);
							*/
						}
						
					});
				});
			})
		</script>
	</head>
	<body>
	<center>
	<h1>emp ajaxList</h1>
	이름:<input id="ename" name="ename"/><br>
	<div id="show">
	
	</div>
	
	

	</body>
</html>