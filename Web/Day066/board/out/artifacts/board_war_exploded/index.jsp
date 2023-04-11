<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오전 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>목록</h2>
<table border="1">
    <tr>
        <td>번호</td>
        <td>제목</td>
        <td>작성자</td>
        <td>작성일</td>
        <td>조회수</td>
    </tr>
    <tr>
        <%
            request.setCharacterEncoding("UTF-8");
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
            String mysqlId = "root";
            String mysqlPwd = "1234";
            String SQL = "SELECT no, title, name, date, views FROM board ORDER BY no DESC";

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
        <td><%=rs.getInt("no")%></td>
        <td><a href="detail.jsp?no=<%=rs.getInt("no")%>"><%=rs.getString("title")%></a></td>
        <td><a href="#"><%=rs.getString("name")%></a></td>
        <td><%=rs.getString("date")%></td>
        <td><%=rs.getInt("views")%></td>
    </tr>
<%
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
%>
</table>
<a href="./write.jsp">글쓰기</a>



</body>
</html>
