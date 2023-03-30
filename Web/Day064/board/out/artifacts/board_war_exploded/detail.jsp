<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오후 2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UCT";
    private final String user = "root";
    private final String password = "1234";
%>
<table border="1">
    <caption>내용보기</caption>
    <tr>
        <td>제목</td>
        <%
            int no = Integer.parseInt(request.getParameter("no"));
            String SQL = "select * from board where no = " + no;

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                out.write("데이터를 불러오지 못했습니다.");
                e.printStackTrace();
            }
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement stmt = conn.createStatement();
                 PreparedStatement pstmt = conn.prepareStatement("update board set views = ? where no = " + no);
                 ResultSet resultSet = stmt.executeQuery(SQL)) {
                while (resultSet.next()) {
                    int view = resultSet.getInt("views");
                    pstmt.setInt(1, ++view);
                    pstmt.execute();
                    String title = resultSet.getString("title");
                    out.print("<td>" + title + "</td>");
        %>
    </tr>
    <tr>
        <td>이름</td>
        <%
            String name = resultSet.getString("name");
            out.print("<td>" + name + "</td>");
        %>
    </tr>
    <tr>
        <td>작성일</td>
        <%
            String date = resultSet.getString("date");
            out.print("<td>" + date + "</td>");
        %>
    </tr>
    <tr>
        <%
            String content = resultSet.getString("content");
            out.print(" <td colspan=\"2\">" + content + "</td>");
                }
            } catch (SQLException e) {
                out.write("데이터를 불러오지 못했습니다.");
                e.printStackTrace();
            }
        %>
    </tr>
</table>
<button><a href="./index.jsp">목록</a></button>
<%
    out.print("<button><a href=\"http://localhost:8080/board/edit.jsp?no=" + no + "\">수정</a> </button>");
    out.print("<button><a href=\"http://localhost:8080/board/delete.jsp?no=" + no + "\">삭제</a> </button>");
%>
</body>
</html>
