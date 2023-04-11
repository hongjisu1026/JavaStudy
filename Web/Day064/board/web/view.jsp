<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>내용보기</title>
<style>
	form{
		display : inline;
	}
</style>
</head>
<body>
<table border="1">
	<caption>내용보기</caption>
<%
	String no = request.getParameter("no");
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	String mysqlId = "root";
	String mysqlPw = "1234";
	String sql = "SELECT title, name, wTime, contents, rCnt, password FROM board where no =" + no;
	String pw = null;	// 추가
	
	int rCnt = 0;
	try{
		Class.forName(driver);
	} catch(ClassNotFoundException e){
		System.out.println("드라이버 로드 실패");
	}
	
	try(Connection conn = DriverManager.getConnection(url, mysqlId, mysqlPw);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
		if(rs.next()){
			rCnt = rs.getInt("rCnt");
			pw = rs.getString("password");	// 추가
%>
	<tr>
		<td>제목</td><td><%=rs.getString("title") %></td>
	</tr>
	<tr>
		<td>이름</td><td><%=rs.getString("name") %></td>
	</tr>
	<tr>
		<td>작성일</td><td><%=rs.getString("wTime") %></td>
	</tr>
	<tr>
		<td colspan="2"><textarea cols="50" rows="10" style="resize: none;"><%=rs.getString("contents") %></textarea></td>
	</tr>
	
<%	
		}
		sql = "UPDATE board SET rCnt = " + (rCnt + 1) + " WHERE no = " + no;
		stmt.executeUpdate(sql);
	}  catch(SQLException e){
		e.printStackTrace();
	}		
%>		
</table>
<a href="list.jsp"><input type="button" value="목록" class="formbtn"></a> 
<form method="post" action="inputPassword.jsp">
<input type="hidden" name="no" value="<%=no%>">
<input type="hidden" name="pw" value="<%=pw%>">
<input type="hidden" name="mode" value="2">
<input type="submit" value="수정"  class="formbtn">
</form>
<form method="post" action="inputPassword.jsp">
<input type="hidden" name="no" value="<%=no%>">
<input type="hidden" name="pw" value="<%=pw%>">
<input type="hidden" name="mode" value="1">
<input type="submit" value="삭제" class="formbtn">
</form>
<%-- <a href="inputPassword.jsp?no=<%=no%>&pw=<%=pw%>&mode=1">삭제</a> --%>
</body>
</html>