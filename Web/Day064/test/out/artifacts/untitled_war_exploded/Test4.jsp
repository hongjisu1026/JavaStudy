<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-29
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="ResultTest4.jsp">
        <table border="1">
            <caption>회원가입</caption>
            <tr>
                <td><label for="name">이름</label></td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td><label for="id">아이디</label></td>
                <td><input type="text" name="id" id="id"></td>
            </tr>
            <tr>
                <td><label for="pwd">비밀번호</label></td>
                <td><input type="password" name="pwd" id="pwd"></td>
            </tr>
            <tr>
                <td><label for="ch_pwd">비밀번호 확인</label></td>
                <td><input type="password" name="ch_pwd" id="ch_pwd"></td>
            </tr>
            <tr>
                <td><label for="email">이메일</label></td>
                <td><input type="email" name="email" id="email"></td>
            </tr>
            <tr>
                <td>취미</td>
                <td>
                    <label><input type="checkbox" name="hobby" value="독서">독서</label>
                    <label><input type="checkbox" name="hobby" value="요리">요리</label>
                    <label><input type="checkbox" name="hobby" value="조깅">조깅</label>
                    <label><input type="checkbox" name="hobby" value="수영">수영</label>
                    <label><input type="checkbox" name="hobby" value="취침">취침</label>
                </td>
            </tr>
            <tr>
                <td>전공</td>
                <td>
                    <label><input type="radio" name="major" value="국어">국어</label>
                    <label><input type="radio" name="major" value="영어">영어</label>
                    <label><input type="radio" name="major" value="수학">수학</label>
                    <label><input type="radio" name="major" value="디자인">디자인</label>
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
            <tr><td colspan="2"><input type="submit" value="전송" onclick="checkPwd()"> <input type="reset" value="초기화"></td></tr>
        </table>
    </form>

    <script>
        function checkPwd() {
            const pwd = document.getElementById('pwd');
            const ch_pwd = document.getElementById('ch_pwd');

            if (pwd.value !== ch_pwd.value) {
                alert('비밀번호가 일치하지 않습니다.');
            }
        }
    </script>
</body>
</html>
