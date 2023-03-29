<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오전 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>미성년자 입니다. 주류구매가 불가능합니다.</h1>
    <p>이름 : <% request.getParameter("name"); %> </p
    <p>나이 : <% request.getParameter("age"); %> </p>
</body>
</html>
