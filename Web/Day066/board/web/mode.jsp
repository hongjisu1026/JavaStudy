<%--
  Created by IntelliJ IDEA.
  User: TJ
  Date: 2023-03-31
  Time: 오후 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    String pwd = request.getParameter("password");
    String iPwd = request.getParameter("iPwd");
    String mode = request.getParameter("mode");
    int result = 0;
%>
<html>
<head>
    <title>Title</title>
    <script>
        function verifyPassword(result, mode) {
            const DELETE = "1";
            const UPDATE = "2";
            const CORRECT = 1;
            const WRONG = 0;

            switch (result) {
                case CORRECT:
                    switch (mode) {
                        case DELETE:
                            location.href = "delete.jsp?no=<%=request.getParameter("no")%>";
                            break;
                        case UPDATE:
                            location.href = "edit.jsp?no=<%=request.getParameter("no")%>";
                            break;
                    }
                    break;
                case WRONG:
                    alert("비밀번호가 일치하지 않습니다.");
                    history.go(-2);
                    break;
            }
        }
    </script>
</head>
<body>
    <%
        if (pwd.matches(iPwd)) {
            result = 1;
        }
    %>
<script>
    console.log(<%=pwd%>);
    console.log(<%=iPwd%>);
    verifyPassword(<%=result%>, <%=mode%>);
</script>
</body>
</html>
