<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오전 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%!
    int i = 1;
    String str = "ABCDE";
    public int sum(int num1, int num2){
      return num1 + num2;
    }
  %>

  <%
    out.print(i + "<br>");
    out.print(str + "<br>");
    out.print(sum(1, 2));
  %>
</body>
</html>
