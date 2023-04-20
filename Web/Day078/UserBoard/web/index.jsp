<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
<form action="" method="post">
    <table>
        <tr>
            <td><label for="id">아이디 : </label></td>
            <td><input type="text" id="id" name="id"> </td>
        </tr>
        <tr>
            <td><label for="password">비밀번호 :  </label></td>
            <td><input type="password" id="password" name="password"> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="로그인"></td>
        </tr>
    </table>
    <a href="./register.jsp">회원가입</a>
</form>
</body>
</html>