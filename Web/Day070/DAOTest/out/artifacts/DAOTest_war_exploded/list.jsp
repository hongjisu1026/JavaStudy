<%@page import="java.util.ArrayList"%>
<%@page import="com.dido.test.*"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="HTML Study">
    <meta name="keywords" content="HTML,CSS,XML,JavaScript">
    <meta name="author" content="Bruce">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 목록</title>
</head>
<body>
<h3>목록</h3>
<%
    BoardDAO dao = new BoardDAO();
    ArrayList<BoardDTO> list = dao.selectBoard();
    for (BoardDTO dto : list) {
        out.print("번호 " + dto.getNo() + "<br>");
        out.print("제목 " + dto.getTitle() + "<br>");
        out.print("작성자 " + dto.getName() + "<br>");
        out.print("작성일 " + dto.getDate() + "<br>");
        out.print("조회수 " + dto.getViews() + "<br><br>");
    }
%>
<a href="write.jsp">글쓰기</a>
</body>
</html>