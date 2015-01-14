<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
 
<html> 
	<head>
		<title>教师基本信息</title>
	</head>
	<body>
		<h1>教师基本信息</h1>
		<hr>
		<br>
		
		<table border = "1">
		
			<%
				String url = "jdbc:mysql://localhost/test?user=root&password=123";
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection connection = DriverManager.getConnection(url);
				Statement statement = connection.createStatement();
			
				//get student basic information
				ResultSet rsBasicInfo = statement.executeQuery("select * from teacher where WorkNum = " + session.getAttribute("RealID"));
				
				//show in table
				while (rsBasicInfo.next()) {
					out.print("<tr><td>员工号</td><td>"+rsBasicInfo.getString("WorkNum")+"</td></tr>");
					out.print("<tr><td>姓名</td><td>"+rsBasicInfo.getString("Name")+"</td></tr>");
					out.print("<tr><td>身份证号</td><td>"+rsBasicInfo.getString("IDNum")+"</td></tr>");
					out.print("<tr><td>院系名称</td><td>"+rsBasicInfo.getString("School")+"</td></tr>");
					out.print("<tr><td>邮箱</td><td>"+rsBasicInfo.getString("Email")+"</td></tr>");
					out.print("<tr><td>手机号码</td><td>"+rsBasicInfo.getString("PhoneNum")+"</td></tr>");
				}
			 %>
		</table>
		<br>
		<html:link href = "http://localhost:8080/WebHomework/form/teacherWeb.jsp">返回</html:link>
		
	</body>
</html>