<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-04-03
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection conn = null;
  ResultSet rs = null;
  Statement stmt = null;
  String sql = "SELECT COUNT(*) FROM BOARD";
  int total = 0;

  try{
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "1234");
    stmt = conn.createStatement();
    rs = stmt.executeQuery(sql);
    if(rs.next()){
      total = rs.getInt(1);
      //total = rs.getInt("COUNT(*)");
      System.out.println("게시물 수 " + total);
    }
  } catch(SQLException e){
    e.printStackTrace();
  }
%>
</body>
</html>
