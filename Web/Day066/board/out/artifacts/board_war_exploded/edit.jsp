<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오후 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="update.jsp">
  <table>
    <caption>수정하기</caption>
<%
      request.setCharacterEncoding("UTF-8");
      String driver = "com.mysql.cj.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
      String mysqlId = "root";
      String mysqlPwd = "1234";
      String SQL = "SELECT title, name, date, content FROM board WHERE no = " + request.getParameter("no");

      try {
        Class.forName(driver);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }

      try (Connection conn = DriverManager.getConnection(url, mysqlId, mysqlPwd);
           PreparedStatement pstmt = conn.prepareStatement(SQL);
           ResultSet rs = pstmt.executeQuery()) {
        while (rs.next()) {
%>
    <tr>
      <td>제목</td>
      <td><input type="text" id="title" name="title" value="<%=rs.getString("title")%>"></td>
    </tr>
    <tr>
      <td>이름</td>
      <td><%=rs.getString("name")%></td>
    </tr>
    <tr>
      <td>작성일</td>
      <td><%=rs.getString("date")%></td>
    </tr>
    <tr>
        <td colspan="2"><textarea><%=rs.getString("content")%></textarea></td>
    </tr>
    <tr>
      <td colspan="2">
        <button><a href="./index.jsp">목록</a></button>
        <input type="hidden" id="no" value="<%=request.getParameter("no")%>">
        <input type="submit" value="등록">

      </td>
    </tr>
<%         }
        } catch (SQLException e) {
        e.printStackTrace();
      }
    %>
  </table>
</form>
</body>
</html>
