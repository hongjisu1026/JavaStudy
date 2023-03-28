<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	private final String driver="com.mysql.cj.jdbc.Driver";
	private final String url="jdbc:mysql://localhost:3306/project?serverTimezone=UCT";
	private final String user="root";
	private final String psword="1234";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
<%
	String query = "select * from member";
	
	try{
		Class.forName(driver);		
	} catch(ClassNotFoundException e){
		out.write("mysql driver load fail!");
		e.printStackTrace();
	}
	try(Connection conn = DriverManager.getConnection(url,user,psword);
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(query)) {
		while(resultSet.next()){
			int num = resultSet.getInt("num");
			String id = resultSet.getString("id");
			String pw = resultSet.getString("pw");
			String name = resultSet.getString("name");
			
			out.println("번호 : "  + num +  ", 이름 : " + name +" , 아이디 : " + id + " , 비밀번호 : "  + pw + "<br>");
		}		
	}  catch (SQLException e) {
		out.write("mysql connect fail!");
		e.printStackTrace();
	}
%>	
</body>
</html>