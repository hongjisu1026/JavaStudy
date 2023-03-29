<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
        int age = request.getIntHeader("age");
        RequestDispatcher good = request.getRequestDispatcher("GoodTest5.jsp");
        RequestDispatcher fail = request.getRequestDispatcher("FailTest5.jsp");

        if (age >= 20) {
            good.forward(request, response);
        } else {
            fail.forward(request, response);
        }
    %>
</body>
</html>
