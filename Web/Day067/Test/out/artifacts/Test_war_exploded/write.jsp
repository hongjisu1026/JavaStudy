<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-04-03
  Time: 오전 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="writeOK.jsp" method="post">
    <table border="1">
        <tr>
            <td><label for="title">제목</label></td>
            <td><input type="text" name="title" id="title" required></td>
        </tr>
        <tr>
            <td><label for="name">이름</label></td>
            <td><input type="text" name="name" id="name" required></td>
        </tr>
        <tr>
            <td><label for="pwd">비밀번호</label></td>
            <td><input type="password" name="pwd" id="pwd" required></td>
        </tr>
        <tr>
            <td><label for="email">E-mail</label></td>
            <td><input type="email" name="email" id="email" required></td>
        </tr>
        <tr>
            <td>취미</td>
            <td>취미 :
                <input type="checkbox" name="hobby" value="swimming">수영
                <input type="checkbox" name="hobby" value="baseball">야구
                <input type="checkbox" name="hobby" value="soccer">축구
                <input type="checkbox" name="hobby" value="basketball">농구
            </td>
        </tr>
        <tr>
            <td colspan="2"><textarea rows="20" cols="100" name="contents" required></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="등록"> <a href="#"><button>목록</button></a></td>
        </tr>
    </table>
</form>
</body>
</html>
