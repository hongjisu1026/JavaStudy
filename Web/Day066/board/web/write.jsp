<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="insert.jsp">
    <table border="1">
        <caption>글 쓰 기</caption>
        <tr>
            <td><label for="title">제목</label></td>
            <td><input type="text" name="title" id="title"></td>
        </tr>
        <tr>
            <td><label for="name">이름</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="pwd">비밀번호</label></td>
            <td><input type="password" name="pwd" id="pwd"></td>
        </tr>
        <tr>
            <td colspan="2"><label><textarea name="content" id="content"></textarea></label></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="등록">
                <button><a href="./index.jsp">목록</a> </button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
