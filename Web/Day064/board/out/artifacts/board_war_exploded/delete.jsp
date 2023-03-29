<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오후 2:19
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
    int no = Integer.parseInt(request.getParameter("no"));
    String SQL = "delete from board where no = ?";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        out.print("예기치못한 오류가 발생했습니다.");
        e.printStackTrace();
    }
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(SQL)) {
        pstmt.setInt(1, no);

        int result = pstmt.executeUpdate();
        if (result > 0) {
            out.print("<h2>삭제되었습니다.</h2>");
        } else {
            out.print("<h2>오류가 발생했습니다.</h2>");
        }
    } catch (SQLException e) {
        out.print("예기치못한 오류가 발생했습니다.");
        e.printStackTrace();
    }
%>
<button><a href="./index.jsp">목록</a></button>
</body>
</html>
