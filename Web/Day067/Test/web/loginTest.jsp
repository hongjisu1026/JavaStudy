<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
	if(id != null)
	{
%>
		<%=id %>님 안녕하십니까?
<%
	}
	else
	{	
%>
<script>
	alert("잘못된 접근입니다.");
	location.href="login.jsp";
</script>
<%
	}
%>
</body>
</html>