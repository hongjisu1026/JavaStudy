<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오전 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        out.print("<table border=\"1\">");
        out.print("<caption>구구단</caption>");
        for (int i = 1; i <= 9; i++) {
            out.print("<tr>");
            for (int j = 2; j <= 9; j++) {
                out.print("<td>" + j + " * " + i + " = " + i*j + "</td>");
            }
            out.print("</tr>");
        }
        out.print("</table>");
    %>
</body>
</html>
