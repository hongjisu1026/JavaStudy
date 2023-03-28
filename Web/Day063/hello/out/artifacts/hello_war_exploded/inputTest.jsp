<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="HTML Study">
    <meta name="keywords" content="HTML,CSS,XML,JavaScript">
    <meta name="author" content="Bruce">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Input Test</title>
</head>
<body>
<form method="post" action="inputTestResult.jsp">
    <table border="1">
        <tr>
            <td><label for="name">이름</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="id">아이디</label></td>
            <td><input type="text" name="id" id="id"></td>
        </tr>
        <tr>
            <td><label for="pw">비밀번호</label></td>
            <td><input type="password" name="pw" id="pw"></td>
        </tr>
        <tr>
            <td><label for="email">이메일</label></td>
            <td><input type="email" name="email" id="email"></td>
        </tr>
        <tr>
            <td>취미</td>
            <td>
                <label><input type="checkbox" value="read" name="hobby">독서</label>
                <label><input type="checkbox" value="cook" name="hobby">요리</label>
                <label><input type="checkbox" value="run" name="hobby">조깅</label>
                <label><input type="checkbox" value="swim" name="hobby">수영</label>
                <label><input type="checkbox" value="sleep" name="hobby">취침</label>
            </td>
        </tr>
        <tr>
            <td>전공</td>
            <td>
                <label><input type="radio" value="kor" name="major">국어</label>
                <label><input type="radio" value="eng" name="major">영어</label>
                <label><input type="radio" value="math" name="major">수학</label>
                <label><input type="radio" value="design" name="major">디자인</label>
            </td>
        </tr>
        <tr>
            <td>전화번호</td>
            <td>
                <label for="phone">
                    <select id="phone" name="phone">
                        <option value="SKT" selected>SKT</option>
                        <option value="KT">KT</option>
                        <option value="LG">LG</option>
                    </select>
                </label>
            </td>
        </tr>
    </table>
    <input type="submit" value="전송">
    <input type="reset" value="초기화">
</form>
</body>
</html>