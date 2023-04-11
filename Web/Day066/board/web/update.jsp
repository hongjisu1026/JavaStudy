<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오후 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  request.setCharacterEncoding("UTF-8");
  String title = request.getParameter("title");
  String content = request.getParameter("content");

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
    SQL = "UPDATE board SET title = " + title + ", content = " + content + " WHERE no = " + request.getParameter("no");
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
