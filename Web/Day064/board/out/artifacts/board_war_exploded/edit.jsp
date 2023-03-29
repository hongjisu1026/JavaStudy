<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오후 2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <caption>수정하기</caption>
        <tr>
            <td><label for="title">제목</label></td>
            <td><input type="text" id="title" name="title"></td>
        </tr>
        <tr>
            <td>이름</td>
            <td id="name"></td>
        </tr>
        <tr>
            <td>작성일</td>
            <td id="date"></td>
        </tr>
        <tr>
            <td colspan="2">
                <textarea id="content" rows="7" cols="50"></textarea>
            </td>
        </tr>
    </table>
    <button><a href="./index.jsp">목록</a></button>
    <form method="post" action="index.jsp">
        <input type="submit" value="등록">
    </form>
</body>
</html>
