<%@ page import="java.util.Arrays" %>
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
<title>InputTestResult</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
	이름 : <%= request.getParameter("name") %> <br>
	아이디 : <%= request.getParameter("id") %> <br>
	비밀번호 : <%= request.getParameter("pw") %> <br>
	이메일 : <%= request.getParameter("email") %> <br>
	취미 : <%= request.getParameterValues("hobby")%> <br>
	전공 : <%= request.getParameter("major")%> <br>
	핸드폰 : <%= request.getParameter("phone")%> <br>
</body>
</html>