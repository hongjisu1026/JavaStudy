<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오전 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form
    <form method="post" action="mode.jsp">
        <label for="iPwd">비밀번호</label>
        <input type="password" name="iPwd" id="iPwd">
        <input type="hidden" name="no" id="no" value="<%=request.getParameter("no")%>">
        <input type="hidden" name="password" id="password" value="<%=request.getParameter("password")%>">
        <input type="hidden" name="mode" id="mode" value="<%=request.getParameter("mode")%>">
        <input type="submit" value="확인">
    </form>
</body>
</html>
