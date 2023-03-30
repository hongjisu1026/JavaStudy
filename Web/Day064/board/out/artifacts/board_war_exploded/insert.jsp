<%@ page import="java.time.LocalDate" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오후 4:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<%
    request.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String name = request.getParameter("name");
    String pwd = request.getParameter("pwd");
    String content = request.getParameter("content");

    String SQL = "insert into board (title, name, content, password) values (?, ?, ?, ?)";
%>

<%
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        out.print("예기치못한 오류가 발생했습니다.");
        e.printStackTrace();
    }
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(SQL)) {
        pstmt.setString(1, title);
        pstmt.setString(2, name);
        pstmt.setString(3, content);
        pstmt.setString(4, pwd);

        pstmt.execute();
    } catch (SQLException e) {
        out.print("예기치못한 오류가 발생했습니다.");
        e.printStackTrace();
    }
%>
<h2>등록되었습니다.</h2>
<button><a href="./index.jsp">목록</a></button>
</body>
</html>
