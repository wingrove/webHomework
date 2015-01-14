<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
 
<html> 
	<head>
		<title>学生基本信息</title>
	</head>
	<body>
		<h1>学生基本信息</h1>
		<hr>
		<br>
		
		<table border = "1">
		
			<%
				//驱动程序名
				String driverName="com.mysql.jdbc.Driver";
				//数据库用户名
				String userName="root";
				//密码
				String userPasswd="";
				//数据库名
				String dbName="test";
				//连接语句
				String url = "jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd;
				//连接数据库
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection connection=DriverManager.getConnection(url);
			
				//sql statement
				Statement statement = connection.createStatement();
			
				//get student basic information
				ResultSet rsBasicInfo = statement.executeQuery("select * from student where StuNum = " + session.getAttribute("RealID"));
				
				//show in table
				while (rsBasicInfo.next()) {
					out.print("<tr><td>学号</td><td>"+rsBasicInfo.getString("StuNum")+"</td></tr>");
					out.print("<tr><td>姓名</td><td>"+rsBasicInfo.getString("Name")+"</td></tr>");
					out.print("<tr><td>身份证号</td><td>"+rsBasicInfo.getString("IDNum")+"</td></tr>");
					out.print("<tr><td>班级编号</td><td>"+rsBasicInfo.getString("ClassID")+"</td></tr>");
					out.print("<tr><td>邮箱</td><td>"+rsBasicInfo.getString("Email")+"</td></tr>");
					out.print("<tr><td>手机号码</td><td>"+rsBasicInfo.getString("PhoneNum")+"</td></tr>");
				}
			 %>
		</table>
		<br>
		<html:link href = "http://localhost:8080/WebHomework/form/studentWeb.jsp">返回</html:link>
		
	</body>
</html>