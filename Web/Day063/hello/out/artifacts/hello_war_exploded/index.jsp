<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-28
  Time: 오전 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    out.print("<table border=\"1\">");
    out.print("<caption>구구단</caption>");
    for (int i = 2; i <= 9; i++) {
      out.print("<tr>");
      for (int j = 1; j <= 9; j++) {
        out.print("<td>" + i + " * " + j + " = " + i*j + "</td>");
      }
      out.print("</tr>");
    }
    out.print("</table>");
  %>
  </body>
</html>
