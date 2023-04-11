<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-04-03
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <h2>이름 : <%= request.getParameter("name") %></h2>
</body>
</html>
