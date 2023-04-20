<%@ page import="com.dido.test.dto.BoardDTO" %><%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-04-11
  Time: 오후 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
  BoardDTO dto = (BoardDTO) request.getAttribute("dto");
%>
<form method="post" action="modifyOK.do">
  <table border="1">
    <tr>
      <td>번호</td><td><%=dto.getNum() %></td>
    </tr>
    <tr>
      <td>조회수</td><td><%=dto.getHit() %></td>
    </tr>
    <tr>
      <td>이름</td><td><input type="text" name="name" value="<%=dto.getName() %>"/></td>
    </tr>
    <tr>
      <td>제목</td><td><input type="text" name="title" value="<%=dto.getTitle() %>"/></td>
    </tr>
    <tr>
      <td>내용</td><td><textarea name="contents" cols="100" rows="15"><%=dto.getContents() %></textarea></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="hidden" name="num" value="<%=dto.getNum() %>">
        <input type="submit" value="수정">
        <a href="list.do">목록</a>
        <a href="delete.do?num=<%=dto.getNum() %>">삭제</a>
        <a href="reply.do?num=<%=dto.getNum() %>">답변</a>
      </td>
    </tr>
  </table>
</form>
</body>
</html>
