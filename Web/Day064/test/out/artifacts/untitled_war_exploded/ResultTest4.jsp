<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
  <%
    String name = request.getParameter("name");
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String email = request.getParameter("email");
    String[] hobby = request.getParameterValues("hobby");
    String major = request.getParameter("major");
    String phone = request.getParameter("phone");

    out.print("<p>이름 : " + name + "</p>");
    out.print("<p>아이디 : " + id + "</p>");
    out.print("<p>비밀번호 : " + pwd + "</p>");
    out.print("<p>이메일 : " + email + "</p>");
    out.print("<p>취미 : " + Arrays.toString(hobby) + "</p>");
    out.print("<p>전공 : " + major + "</p>");
    out.print("<p>통신사 : " + phone + "</p>");
  %>
</body>
</html>
