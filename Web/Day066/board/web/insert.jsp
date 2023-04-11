<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오전 10:41
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
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    String mysqlId = "root";
    String mysqlPwd = "1234";
    String SQL = "INSERT INTO board (title, name, content, password) VALUES (?, ?, ?, ?)";

    String title = request.getParameter("title");
    String name = request.getParameter("name");
    String pwd = request.getParameter("pwd");
    String content = request.getParameter("content");

    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try (Connection conn = DriverManager.getConnection(url, mysqlId, mysqlPwd);
         PreparedStatement pstmt = conn.prepareStatement(SQL)) {
      pstmt.setString(1, title);
      pstmt.setString(2, name);
      pstmt.setString(3, content);
      pstmt.setString(4, pwd);

      int result = pstmt.executeUpdate();

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
