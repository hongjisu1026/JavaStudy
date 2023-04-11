<%@page import="java.util.Enumeration" %>
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
<%
    request.setCharacterEncoding("UTF-8");
    Enumeration<String> names = request.getParameterNames();
    while (names.hasMoreElements()) {
        String name = names.nextElement();
        String[] values = request.getParameterValues(name);
        System.out.print(name + " : ");
        for (int i = 0; i < values.length; i++) {
%>
            <p><%=values[i] + " "%></p>
<%
        }
    }
%>
</body>
</html>