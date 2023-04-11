<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-04-03
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form name="nameForm" action="SubmitTestOK.jsp" method="post">
    <label for="name">이름</label>
    <input id="name" name="name" type="text">
    <br><br>
    <input type="button" onclick="checkName()" value="전송">
  </form>

<script>
  function checkName() {
    const form = document.nameForm;

    if (form.name.value === "") {
      alert("이름을 입력하세요.");
    } else {
      form.submit();
    }
  }
</script>
</body>
</html>
