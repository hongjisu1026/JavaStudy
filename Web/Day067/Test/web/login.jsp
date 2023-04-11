<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

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
<form method="post" action="loginChk.jsp">
    <%
        String id = (String) session.getAttribute("id");
        if (id == null) {
    %>
    아이디 : <input type="text" name="id">
    비밀번호 : <input type="password" name="password">
    <input type="submit" value="로그인">
    <a href="memberRegister.jsp">회원가입</a><br>
    <%
    } else {
    %>
    <%=id %>님 환영합니다.<br>
    <a href="logout.jsp">로그아웃</a>&nbsp;<a href="#">회원정보수정</a><br>
    <%
        }
    %>
    <a href="loginTest.jsp">loginTest</a>
</form>
</body>
</html>