<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오전 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
  <caption>내용보기</caption><%
    String no = request.getParameter("no");
    int view = 0;
    String pwd = "";

    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    String mysqlId = "root";
    String mysqlPwd = "1234";
    String SQL = "SELECT title, name, date, content, password, views FROM board WHERE no = " + no;

    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try (Connection conn = DriverManager.getConnection(url, mysqlId, mysqlPwd);
         PreparedStatement pstmt = conn.prepareStatement(SQL);
         ResultSet rs = pstmt.executeQuery()) {
      while (rs.next()) {
        view = rs.getInt("views");
        pwd = rs.getString("password");
%>
  <tr>
    <td>제목</td>
    <td><%=rs.getString("title")%></td>
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
    <td colspan="2"><%=rs.getString("content")%></td>
  </tr>
<%
      }
      SQL = "UPDATE board SET views = " + ++view + " WHERE no = " + no;
      pstmt.executeUpdate(SQL);
    } catch (SQLException e) {
      e.printStackTrace();
    }
%>
</table>
<button><a href="./index.jsp">목록</a></button>
<button><a href="./chPwd.jsp?no=<%=no%>&password=<%=pwd%>">수정</a> </button>
<button><a href="./chPwd.jsp?no=<%=no%>&password=<%=pwd%>">삭제</a> </button>
</form>
</body>
</html>
