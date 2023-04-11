<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-04-11
  Time: 오후 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="writeOK.do">
  <table border="1">
    <tr>
      <td>이름</td>
      <td><input type="text" name="name" /></td>
    </tr>
    <tr>
      <td>제목</td>
      <td><input type="text" name="title" /></td>
    </tr>
    <tr>
      <td>내용</td>
      <td><textarea name="contents" cols="100" rows="15"></textarea></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="입력">
        <a href="list.do">목록</a>
      </td>
    </tr>
  </table>
</form>
</body>
</html>
