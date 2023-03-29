<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오후 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>board</title>
</head>
<body>
<%!
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UCT";
    private final String user = "root";
    private final String password = "1234";
%>
<form method="get">
    <h1>목록</h1>
    <table border="1">
        <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회수</th>
        </tr>
        </thead>
        <tbody id="board_list">
        <%
            String SQL = "select * from board";

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                out.write("데이터를 불러오지 못했습니다.");
                e.printStackTrace();
            }
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement stmt = conn.createStatement();
                 ResultSet resultSet = stmt.executeQuery(SQL)) {
                while (resultSet.next()) {
                    int no = resultSet.getInt("no");
                    String title = resultSet.getString("title");
                    String name = resultSet.getString("name");
                    String date = resultSet.getString("date");
                    int view = resultSet.getInt("views");

                    out.write("<tr>");
                    out.write("<td>" + no + "</td>");
                    out.write("<td><a href=\"http://localhost:8080/board/detail.jsp?no=" + no + "\">" + title + "</a></td>");
                    out.write("<td><a href=\"#\">" + name + "</a></td>");
                    out.write("<td>" + date + "</td>");
                    out.write("<td>" + view + "</td>");
                    out.write("</tr>");

                }
            } catch (SQLException e) {
                out.write("데이터를 불러오지 못했습니다.");
                e.printStackTrace();
            }
        %>
        </tbody>
    </table>
</form>
<a href="./write.jsp">글쓰기</a>
</body>
</html>
