<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오전 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    String mysqlId = "root";
    String mysqlPwd = "1234";
    String SQL = null;

    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try (Connection conn = DriverManager.getConnection(url, mysqlId, mysqlPwd);
          Statement stmt = conn.createStatement()) {
      SQL = "DELETE FROM board WHERE no = " + request.getParameter("no");
      int result = stmt.executeUpdate(SQL);

      if (result > 0) {
        response.sendRedirect("index.jsp");
      } else {
        response.sendRedirect("error.jsp");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  %>
</body>
</html>
