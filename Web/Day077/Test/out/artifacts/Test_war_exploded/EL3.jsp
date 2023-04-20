<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="com.dido.test.MemberInfo" scope="page" />
<jsp:setProperty name="member" property="name" value="지수"/>
<jsp:setProperty name="member" property="id" value="jisu"/>
<jsp:setProperty name="member" property="pw" value="jisu"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<hr />
	
	<%--이름 : <%= member.getName() %><br />
	아이디 : <%= member.getId() %><br />
	비밀번호 : <%= member.getPw() %><br />--%>
	이름 : <jsp:getProperty name="member" property="name"/><br />
	아이디 : <jsp:getProperty name="member" property="id"/><br />
	비밀번호 : <jsp:getProperty name="member" property="pw"/><br />

	이름 : ${member.name} <br>
	아이디 : ${member.id} <br>
	비밀번호 : ${member.pw}
</body>
</html>